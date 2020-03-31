package daili;

public class Test {
    public static void main(String[] args) {
        BlackDog blackDog = new BlackDog();
        Dog dog = new StaticHandler(blackDog);
        dog.eat();
    }
}
