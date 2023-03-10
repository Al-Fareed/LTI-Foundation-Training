public class ItemTypeBO {
    public void add(ItemType object, ItemType[] itemTypeArray, int index) {
        itemTypeArray[index] = object;
        System.out.println("New item added successfully");
    }
    
    public void search(String search, ItemType[] itemTypeArray) {
        boolean found = false;
        for (ItemType item : itemTypeArray) {
            if (item != null && item.getName().equals(search)) {
                System.out.println("Searched Item Type is:");
                System.out.println("Name:" + item.getName());
                System.out.println("Deposit Amount:" + item.getDeposit());
                System.out.println("Cost Per Day:" + item.getCostPerDay());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Searched Item Type not found");
        }
    }
    
    public void display(ItemType[] itemTypeArray) {
        int index = 1;
        for (ItemType item : itemTypeArray) {
            if (item != null) {
                System.out.println("Item Type Number " + index + ":");
                System.out.println("Name:" + item.getName());
                System.out.printf("Deposit Amount:%.1f", item.getDeposit());
                System.out.printf("Cost Per Day:%.1f", item.getCostPerDay());
                index++;
            }
        }
    }
}
