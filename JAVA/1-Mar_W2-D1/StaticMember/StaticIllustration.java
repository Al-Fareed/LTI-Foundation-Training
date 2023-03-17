package StaticMember;

public class StaticIllustration {
    private int i1;
    private static int i2;
    StaticIllustration(){
        i1=0;
        i2=0;
    }
    public void seti1(int i1){
        this.i1=i1;
    }
    public int geti1(){
        return i1;
    }
    public void seti2(int i2){
        this.i2=i2;
    }
    public int geti2(){
            return i2;
    }

    public void displayDetails(int i){
        System.out.println("Object "+i+" Details : i1 = "+i1+",i2 = "+i2);
    }
}
