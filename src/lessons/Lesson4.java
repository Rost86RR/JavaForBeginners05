package lessons;

public class Lesson4 {
    public static void print(String print){
        System.out.println(print);
    }
    public static void printLineAndTaskNumber(){
        System.out.println(task + (++ number));
        System.out.println(afterEachTask);
    }
    static int number = 0;
    static String task = "Task ";
    static String afterEachTask = "_________________________________________________________";
    static String hi = "hello";
    static String ross = "Ross";
    public static void main(String[] args) {
        print(hi);
        print(hi + " " + ross);
        printLineAndTaskNumber();
        printLineAndTaskNumber();
        printLineAndTaskNumber();
    }
}
