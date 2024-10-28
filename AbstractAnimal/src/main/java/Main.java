public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();
        cat.makeSound();

        dog.setSound(new Meow());
        dog.makeSound();// perro: Meow

        cat.setSound(new Bark());
        cat.makeSound();// gato: Guau
    }
}