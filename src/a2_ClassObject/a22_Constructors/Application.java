package a2_ClassObject.a22_Constructors;

public class Application {

    public static void main(String[] args) {
//        defaultConstructor();
//        parameterizedConstructor();
        overloadedConstructor();
    }

    private static void overloadedConstructor() {
        OverloadedConstructor overloadedConstructor1 = new OverloadedConstructor();
        overloadedConstructor1.text = "using DEFAULT constructor";
        overloadedConstructor1.printFields();

        OverloadedConstructor overloadedConstructor2
                = new OverloadedConstructor("using PARAM in constructor");
        overloadedConstructor2.printFields();

        OverloadedConstructor overloadedConstructor3
                = new OverloadedConstructor("using TWO parameters", 100);
        overloadedConstructor3.printFields();
    }

    private static void parameterizedConstructor() {
        ParameterizedConstructor parameterizedConstructor
                = new ParameterizedConstructor("Hello param constructor");
        System.out.println(parameterizedConstructor.text);
    }

    private static void defaultConstructor() {
        DefaultConstructor defaultConstructor = new DefaultConstructor();
        defaultConstructor.text = "Hello default constructor";
        System.out.println(defaultConstructor.text);
    }
}
