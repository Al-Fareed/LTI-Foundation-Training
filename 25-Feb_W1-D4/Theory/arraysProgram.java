/**
 * arraysProgram
 */
public class arraysProgram {
 public static void main(String[] args) {
    String [][] arr={
        {"Alfa","Beta","Gama"},
        {"Al-Fareed","Armaan","Toiiba"}
    };
    for (String[] x : arr) {
        for (String y : x) {
            System.out.println(y);
        }
        System.out.println();
    }
 }
}