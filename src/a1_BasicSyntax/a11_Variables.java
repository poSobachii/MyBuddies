package a1_BasicSyntax;

public class a11_Variables {

    static int globalNumber = 777;      // field

    public static void main(String[] args) {
//        variablesTypes();
//        System.out.println(globalNumber);
//        globalNumber = 0;
//        variablesTypes();
//        globalNumber += 10;
//        variablesTypes();

//        implicitCasting();
//        explicitCasting();

        parseExamples();
    }

    //local variables
    static void variablesTypes() {
        char ch = 'c';      // comment
        String text = "any text";
        byte b = -128;
        byte b2 = 127;
        int number = 1410065409;
        Integer number2 = 420000000;
        long bigNumber = 420000000000L;
        long smallNumber = 100L;
        float smallFraction = 12.0f;
        double bigFraction = 24.0d;
        double summ =  120.34d;
        int summ2 = 12034;      //cents
        boolean bool = true; // false

//        {
//            int anotherNumber = 666;
//            System.out.println(anotherNumber);
//            System.out.println(bigNumber);
//        }

        System.out.println(globalNumber);

    }

    static void primitiveDiffToObject() {
        int primitiveInt = 100;
        Integer objectInt = 100;
        System.out.println(objectInt.intValue());
        System.out.println(objectInt.hashCode());
    }


    static void implicitCasting() {
        int intVal = 100;
        long longVal = intVal;
        System.out.println(longVal);
    }

    static void explicitCasting() {
        long longVal = 10000L;
        int intVal = (int) longVal;
        System.out.println(intVal);
    }

    static void parseExamples() {
        int number = 100;
        long longNumber = 1000L;
        String textedNumber = "666";

        String numberText = String.valueOf(number);
        String numberText2 = Integer.toString(number);

        String longText = String.valueOf(longNumber);

//        System.out.println(numberText);
//        System.out.println(numberText2);
//        System.out.println(longText);

//        long summ = textedNumber * 5;

        long parsedLong = Long.parseLong(textedNumber);
        long result = parsedLong * 5;
        System.out.println(result);

    }

}
