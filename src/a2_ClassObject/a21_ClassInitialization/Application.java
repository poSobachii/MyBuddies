package a2_ClassObject.a21_ClassInitialization;

public class Application {

    public static void main(String[] args) {
//        singleObjectInit();
        objectInsideObject();
    }

    private static void objectInsideObject() {
        Animal dog = new Animal();
        dog.type = "Dog";
        dog.sound ="bark";

        ZooPark zoo = new ZooPark();
        zoo.animal = dog;
        zoo.makeAnimalAction();

        Animal bird = new Animal();
        bird.type = "Bird";
        bird.sound = "whistle";
        zoo.animal = bird;
        zoo.makeAnimalAction();
    }

    private static void singleObjectInit() {
        Animal dog = new Animal();
        dog.type = "Dog";
        dog.sound = "bark";
        dog.makeSound();

        Animal cat = new Animal();
        cat.type = "Cat";
        cat.age = 12;
        cat.makeSound();
    }
}
