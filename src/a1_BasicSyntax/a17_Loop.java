package a1_BasicSyntax;

public class a17_Loop {

    public static void main(String[] args) {
//        forLoop();
//        foriLoop();
//        whileDoStatement();
//        doWhileStatement();
//        breakStatement();
        continueStatement();
    }

    static void breakStatement() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Current index = " + i);
            if (i == 6) {
                break;
            }
        }
    }

    static void continueStatement() {
        for (int i = 0; i < 10; i++) {
            if(i == 5 || i == 6) {
                continue;
            }
            System.out.println("Current index = " + i);
        }
    }

    static void doWhileStatement() {
        int count = 1;
        do {
            System.out.println("Current doWhile count = " + count);
            count++;
        } while(count > 11);

    }

    static void whileDoStatement() {
        int count = 1;
        while (count > 11) {
            System.out.println("Current whileDo count = " + count);
            count++;
        }

    }

    static void foriLoop() {
        int[] marks = {56, 32, 76, 98, 10, 5, 20, 46};
        int maxMark = 0;
        for (int i = 0; i < marks.length; i++) {
            int currentMark = marks[i];
            if(maxMark < currentMark){
                maxMark = currentMark;
            }
        }


        System.out.println("Highest mark = " + maxMark);
    }

    static void forLoop() {
        int[] marks = {5, 6, 8, 10, 9, 7};
        String[] names = {"Alex", "Oleg", "Vlad"};
        for (String name: names) {
            if(name.equals("Oleg")) {
                continue;
            }
            System.out.println("Hello " + name);
        }
    }
}
