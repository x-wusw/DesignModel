package CreateModel.factory.abstractfactory;

public abstract class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗喜欢吃骨头");
    }

}
