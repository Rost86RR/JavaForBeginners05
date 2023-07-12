package homework;

public class HW3 {
    public static void main(String[] args) {

        int number = 15;
        String task = "Task ";
        String afterEachTask = "_________________________________________________________";

        Integer int1 = new Integer(4);
        Integer int2 = new Integer(4);
        Integer int3 = new Integer(7);
        System.out.println(task + number);
        System.out.println("Если int1 равно  int2, то результат сравнения методом .equals() = " + int1.equals(int2));
        System.out.println("Если int1 не равно int3, то результат сравнения методом .equals() = " + int1.equals(int3));
        System.out.println(afterEachTask);


        int number1 = 5;
        int number2 = 5;
        String outPut = "Если number1 = number2, то результат сравнения методом compare = ";
        System.out.println(task + (++ number));
        System.out.println(outPut + Integer.compare(number1, number2));
        System.out.println(afterEachTask);

        System.out.println(task + (++ number));

        System.out.println(afterEachTask);



    }
}
