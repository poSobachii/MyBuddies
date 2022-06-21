package a2_ClassObject.a23_AccessModifiers.packageOne;

import a2_ClassObject.a23_AccessModifiers.packageTwo.ExtendedClass;
import a2_ClassObject.a23_AccessModifiers.packageTwo.NoModifierClass;
import a2_ClassObject.a23_AccessModifiers.packageTwo.RegularClass;

public class Application {

    public static void main(String[] args) {
//        publicModifier();
//        privateModifier();
        protectedModifier();
    }

    private static void protectedModifier() {
        ProtectedFields protectedFields = new ProtectedFields();
        System.out.println(protectedFields.protectedText);
        System.out.println(protectedFields.noModifierText);

        ExtendedClass extendedClass = new ExtendedClass();
        System.out.println(extendedClass.protectedText);
        extendedClass.doSmth();
    }

    private static void privateModifier() {
        NonPublicClass nonPublicClass = new NonPublicClass();
        System.out.println(nonPublicClass.getText());
        nonPublicClass.setText("change text");
        System.out.println(nonPublicClass.getText());
    }

    private static void publicModifier() {
        RegularClass regularClass = new RegularClass();
        System.out.println(regularClass.anotherText);
    }
}
