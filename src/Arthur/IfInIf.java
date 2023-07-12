package Arthur;

public class IfInIf {
    public static void main(String[] args) {

        //task1
        int a = 10;
        int b = 20;
        if(a == b) {
            if(b % 2 == 0) {
                System.out.println("b is an even number");
            } else {
                System.out.println("b is an odd number");
            }
        } else {
            if(b % 7 == 0) {
                System.out.println("");
            }
        }
    }
}
