package a1_BasicSyntax;

import java.sql.SQLOutput;

public class a16_Statements {

    public static void main(String[] args) {
//        logicalOperator();
//        switchOperator();
//        ternaryOperator();
        operatorPrecedence();
    }

    static void operatorPrecedence() {
        boolean b1 = true;
        boolean b2 = true;
        boolean b3 = false;
        boolean b4 = false;

        if (b3 || b2 && b1) {
            System.out.println("Check #1");
        }

        if(b1 && b2 || b3 && b4) {
            System.out.println("Check #2");
        }

        if(b1 && (b2 || b3) && b4) {
            System.out.println("Never happens");
        }

        System.out.println("Jobs done");
    }

    static void ternaryOperator() {
        int x = 10;

        if(x == 10) {
            System.out.println("X was equal to 10");
        }

        System.out.println(x == 10 ? "X was equal to 10" : "Never happens");

        if(x == 15) {
            System.out.println("Never happens");
        } else {
            System.out.println("X was not equal to 15");
        }

        System.out.println(x == 15 ? "Never happens" : "X was not equal to 15");
        acceptString(x == 15 ? "Never happens" : "X was no equal to 15");

    }

    static void acceptString(String text) {
        System.out.println(text);
    }

    static void switchOperator() {
        int x = 30;

        switch (x) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
                System.out.println("Case 10 worked");
                break;
            case 18:
            case 19:
            case 20:
                System.out.println("Case 20 worked");
                break;
            case 30:
                System.out.println("Case 30 worked");
                break;
            default:
                System.out.println("Default was executed");
        }
        System.out.println("After switch code");
    }

    static void logicalOperator() {
        int x = 10;
        int y = 10;
        int z = 15;

        if (x == y) {
            System.out.println("X was equals to Y");
        }
        if (x == y && z == 15) {
            System.out.println("AND logical worked");
        }
        if (x == y || z == 20) {
            System.out.println("OR logical worked");
        }
        if (z != 20) {
            System.out.println("NOT logical worked");
        }

        if (x == 10) {
            System.out.println("Checkpoint #1");
        }

        if (x == 11) {
            System.out.println("never happened");
        } else {
            System.out.println("Checkpoint #2");
        }

        if (x == 11) {
            System.out.println("never happened");
        } else if (y == 10) {
            System.out.println("Checkpoint #3");
        } else {
            System.out.println("never happened");
        }
    }
}
