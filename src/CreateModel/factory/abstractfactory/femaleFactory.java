package CreateModel.factory.abstractfactory;

public class femaleFactory implements AnimalFactory {
    @Override
    public Animal createDog() {
        return new femaleDog();
    }

    @Override
    public Animal createCat() {
       return new femaleCat();
    }
}
