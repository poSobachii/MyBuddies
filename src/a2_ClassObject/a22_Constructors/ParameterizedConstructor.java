package a2_ClassObject.a22_Constructors;

public class ParameterizedConstructor {
    String text;

    public ParameterizedConstructor(String text2) {
        String text3 = text2.concat(" Bla bla bla");
        this.text = text3;
    }
}
