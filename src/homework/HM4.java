package homework;

public class HM4 {

    static String taskWord = "Task ";
    static int numberOfTask = 2;
    static String lineAfterTask = "_______________________________________________________________________________";
    public static void putNumberTask() {
        System.out.println(taskWord + (++ numberOfTask));
    }
    public static void putLine() {
        System.out.println(lineAfterTask);
    }
    public static void printTask(String task) {
        System.out.println(task);
    }

    public static void main(String[] args) {

        putNumberTask();
        printTask("1) (2 == 2) && (7 == 7)");
        printTask("2) !(15 < 3)");
        printTask("3) (Сосна == Дуб) || (Вишня == Клён)");
        printTask("4) !(Сосна == Дуб)");
        printTask("5) (!(15 < 3)) && (10 > 20)");
        printTask("6) (Глаза даны, чтобы видеть) && (Под третьим этажом находится второй этаж)");
        printTask("7) (6/2 = 3) || (7*5 = 20)");
        putLine();

        int ageSveta = 20;
        int ageAndrey = 21;
        int ageNatasha = 22;
        putNumberTask();
        printTask(String.valueOf((ageSveta < ageAndrey) && (ageSveta < ageNatasha)));
        putLine();

        boolean statusFrind = true;
        String withFrind = "It's OK";
        String withoutFriend = "It's not OK";
        putNumberTask();
        if(statusFrind = true) {
            printTask(withFrind);
        } else {
            printTask(withoutFriend);
        }
        putLine();

        int x = 0;
        putNumberTask();
        if(x > 10) {
            printTask("X is more than 10");
        } else if (x < 0) {
            printTask("X is negative value");
        } else if (x == 5) {
            printTask("The difference between X and 5 is 0");
        } else {
            printTask("The number x is less than 11, greater than or equal to 0, but not equal to 5");
        }
        putLine();


    }
}
