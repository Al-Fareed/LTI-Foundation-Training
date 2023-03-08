public class ItemTypeBO {
    public void add(ItemType object ,ItemType[] itemTypeArray,Integer index)
    {
        itemTypeArray[index]=object;
        System.out.println("New item added successfully");
    }
    public void search(String search, ItemType[] itemTypeArray){
        boolean found=false;
        if(itemTypeArray.length!=0){
            for (ItemType itemType : itemTypeArray) {
                if(itemType.getName().equals(search))
                {
                    System.out.println("Searched Item Type is:");
                    System.out.println("Name:"+itemType.getName());
                    System.out.println("Deposit Amount:"+itemType.getDeposit());
                    System.out.println("Cost Per Day:"+itemType.getCostPerDay());
                    found=true;
                }
            }
            if(!found){
                System.out.println("Searched Item Type not found");
            }
        }
        else{
            System.out.println("Searched Item Type not found");
        }
    }
    public void display(ItemType[] itemTypeArray){
        int i=1;
        for (ItemType items : itemTypeArray) {
            System.out.println("Item Type Number "+i+":");
            System.out.println("Name:"+items.getName());
            System.out.println("Deposit Amount:"+items.getDeposit());
            System.out.println("Cost Per Day:"+items.getCostPerDay());
            i++;
        }
    }
}
