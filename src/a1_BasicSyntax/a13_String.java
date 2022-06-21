package a1_BasicSyntax;

import java.sql.SQLOutput;

public class a13_String {

    public static void main(String[] args) {
//        assignString();
//        stringManipulation();
//        equalsVsHashCode();
//        printFormat();
        stingConversion();
    }

    static void stingConversion() {
        int n1 = 300;
        int n2 = 200;
        int result = n1 + n2;
        String textN1 = "300";
        String textN2 = "200";
        String text = "Hello";
        String textResult = textN1 + textN2;
        String convertNumber = String.valueOf(result);
        int revertResult = Integer.parseInt(convertNumber);
//        int tryRevertText = Integer.parseInt(text);
        String bool = "true";
        boolean b1 = Boolean.parseBoolean(bool);
        System.out.println(revertResult);
    }

    static void printFormat() {
        String s1 = "World";
        int n1 = 5;
        System.out.printf("Hello %s at age -> %d", s1, n1);
        System.out.println("Hello " + s1 + " at age -> " + n1);
    }

    //      %s – a string
    //      %d – for signed decimal integer

    //      %f – for the floating point
    //      %o – octal number
    //      %c – for a character
    //      %i – use for integer base 10
    //      %u – for unsigned decimal number
    //      %x – hexadecimal number
    //      %% – for writing % (percentage)
    //      %n – for new line = \n

    static void equalsVsHashCode() {
        String s1 = "HELLO";
        String s2 = "HELLO";
        String s3 = new String("HELLO");

        System.out.println(s1 == s2);               //true
        System.out.println(s1 == s3);               //false
        System.out.println(s1.equals(s2));          //true
        System.out.println(s1.equals(s3));          //true
    }

    static void stringManipulation() {
        String hello1 = "Hello World";
        String hello2 = "                    Hello    World     ";
        System.out.println("length 1 ->" + hello1.length());
        System.out.println("length 2 ->" + hello2.length());
        hello2 = hello2.trim();
        System.out.println("trimmed: " + hello2 + " length: " + hello2.length());

        String longString = "quick brown fox jumps over the lazy dog";
        String short1 = longString.substring(16);
        System.out.println("Short1 ->" + short1);
        String short2 = longString.substring(16, 25);
        System.out.println("Short2 ->" + short2);

        System.out.println("index j ->" + longString.indexOf("j"));
        System.out.println("index r ->" + longString.indexOf("r"));
        System.out.println("index ? ->" + longString.indexOf("?"));

        String strangeString = "quick@brown@fox@jumps@over@the@lazy@dog";
        String[] stringArray = strangeString.split("@");
        System.out.println("split array length ->" + stringArray.length);
        for (String text: stringArray) {
            System.out.println(text);
        }

        String[] stringArray2 = strangeString.split("@", 3);
        System.out.println("split array length ->" + stringArray2.length);
        for (String text: stringArray2) {
            System.out.println(text);
        }
    }

    static void assignString() {
        String string1 = "Hello";
        char[] charArray1 =  {'H', 'e', 'l', 'l', 'o', '!', ' ', 'W'};
        String stringArray [] =  {"hello", "salute", "bonjour"};
        String string2 = new String(charArray1);
//        System.out.println(charArray1);
//        System.out.println(stringArray);
//        System.out.println(string2);

        int x = 10;
        x += 15;

        String hello = "Hello";
        hello.concat(" World");

        System.out.println(hello);

        hello = hello.concat(" World");
        System.out.println(hello);

    }




}
