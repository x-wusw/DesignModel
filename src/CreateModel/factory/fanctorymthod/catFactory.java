package CreateModel.factory.fanctorymthod;

public class catFactory implements AnimalFactory {


    @Override
    public Animal caeate() {
        return new Cat();
    }
}
