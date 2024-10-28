public class Cat extends Animal {
    String gato;

    public Cat() {
        sound = new Meow();
    }

    @Override
    public void display() {
        gato = "/ᐠ - ˕ -マ";
    }

    @Override
    public String toString() {
        return gato;
    }
}
