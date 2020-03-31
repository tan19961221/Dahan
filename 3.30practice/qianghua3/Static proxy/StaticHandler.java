package daili;

public class StaticHandler implements Dog {

    private Dog dog;

    public StaticHandler(Dog dog){
        this.dog = dog;
    }
    @Override
    public void eat() {
        dog.eat();
    }
}
