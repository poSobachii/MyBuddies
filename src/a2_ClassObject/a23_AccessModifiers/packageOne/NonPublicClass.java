package a2_ClassObject.a23_AccessModifiers.packageOne;

public class NonPublicClass {
    private String text = "some private text";

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
