public class Dog extends Animal {

    String perro;

    public Dog() {
        sound = new Bark();
    }

    @Override
    public void display() {
        perro = "૮₍ • ᴥ • ₎ა";
    }

    @Override
    public String toString() {
        return perro;
    }
}