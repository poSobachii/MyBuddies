package a1_BasicSyntax;

public class a12_Functions {

    public static void main(String[] args) {
//        voidMethod();
//        anotherVoidMethod();
//        methodWithReturnValue();
        methodWithParameters();
    }

    static void methodWithParameters() {
        String answer = null;
        String request1 = "Hello";
        String request2 = "World";
        answer = concatStrings(request1, request2);
        System.out.println(answer);
        System.out.println("Sum = " + calculateSum(100, 3));
    }

    static int calculateSum(int number1, int number2) {
        return number1 * number2;
    }

    static String concatStrings(String string1, String string2){
        String result = string1 + " XXX " + string2;
        return result;
    }

    static void methodWithReturnValue() {

        int summ = 1000;
        int coef = getCurrentTaxRate();

        String answer = getAnswer();
        int result = 0;

        System.out.println("returned value -> " + answer + " " + result);
        result = summ * coef;
        System.out.println("returned value -> " + answer + " " + result);
        System.out.println("returned value -> " + getAnswer() + " " + summ * coef);

    }

    static int getCurrentTaxRate() {
        return 5;
    }

    static String getAnswer() {
        return "Hello Return";
    }

    static void anotherVoidMethod() {
        System.out.println("Bye hell");
        voidMethod();
    }

    static void voidMethod() {
        System.out.println("hello world");
    }
}
