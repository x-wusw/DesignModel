package CreateModel.factory.abstractfactory;


public class maleFactory implements AnimalFactory {
    @Override
    public Animal createDog() {
        return new maleDog();
    }

    @Override
    public Animal createCat() {
        return new maleCat();
    }
}
