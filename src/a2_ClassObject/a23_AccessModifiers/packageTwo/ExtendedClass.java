package a2_ClassObject.a23_AccessModifiers.packageTwo;

import a2_ClassObject.a23_AccessModifiers.packageOne.ProtectedFields;

public class ExtendedClass extends ProtectedFields {

    NoModifierClass noModifierClass = new NoModifierClass();

    public void doSmth(){
        System.out.println(noModifierClass.noModifierString);
    }

}
