package a2_ClassObject.a22_Constructors;

public class OverloadedConstructor {
    String text;
    int number;

    public OverloadedConstructor(){}

    public OverloadedConstructor(String text1) {
     this.text = text1;
    }

    public OverloadedConstructor(String text1, int number1){
        this.text = text1;
        this.number = number1;
    }

    public void printFields(){
        System.out.println("t: " + text + ",n: " + number);
    }
}
