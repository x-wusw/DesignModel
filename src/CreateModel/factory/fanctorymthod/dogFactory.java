package CreateModel.factory.fanctorymthod;

public class dogFactory implements AnimalFactory {

    @Override
    public Animal caeate() {
        return new Dog();
    }
}
