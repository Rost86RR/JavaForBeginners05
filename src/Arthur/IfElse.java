package Arthur;

public class IfElse {

    public static void main(String[] args) {

        //task 1
        int a = 9;
        if(a>10) {
            System.out.println("a is greater than 10");
        } else {
            System.out.println("a is less than 10");
        }

        //task 2
        int b =11;
        if(b > 0 && b < 10 || b > 100 && b < 1000) {
            System.out.println(b*b);
        } else {
            System.out.println(b*2);
        }

        //task3.1
        int c = 0;
        if(c > 0) {
            System.out.println("c is a positive number");
        } else if (c == 0) {
            System.out.println("с is equal 0 ");
        } else {
            System.out.println("c is a negative number");
        }

        //task3.2
        int d = 5;
        if(d % 2 == 0) {
            System.out.println("d is an even number");
        } else {
            System.out.println("d is an odd number");
        }

        //task3.3
        int e = -110;
        if(e > 9 && e < 100 || e < -9 && e > -100) {
            System.out.println("e is a two-digit number");
        } else {
            System.out.println("e is not a two-digit number ");
        }

        //task3.4
        int f = 9999;
        if(f >= -100 && f <= 100) {
            System.out.println("f is in the range of numbers from -100 to 100");
        } else {
            System.out.println("f is not in the range of numbers from -100 to 100");
        }

        //task3.5
        int g = 15;
        if(g % 3 == 0 && g % 5 == 0) {
            System.out.println("g is divisible by 3 and by 5");
        } else {
            System.out.println("g is not divisible by 3 and by 5");
        }

        //task3.6
        int h = 18;
        if(h % 2 == 0 || h % 7 == 0) {
            System.out.println("h is divisible by 2 or by 7");
        } else {
            System.out.println("h is not divisible by 2 or by 7");
        }

        //task3.7
        int i = -9;
        if(i > 0) {
            System.out.println(i * -1);
        } else {
            System.out.println(i * -1);
        }

        //task3.8
        int j = 200;
        if(j > 1000) {
            System.out.println(j / 10);
        } else {
            System.out.println("j is less or equal than 1000");
        }

        //task3.9
        int k = 83;
        if(k % 10 == 3) {
            System.out.println((k + 1) / 2);
        } else {
            System.out.println("that number is not ended on 3");
        }

        //task3.10
        int l = 190;
        if(l > 100) {
            System.out.println();
        }
    }
}
