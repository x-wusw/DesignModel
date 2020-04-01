package CreateModel.factory.abstractfactory;

public class Test {
    public static void main(String[] args) {
        AnimalFactory a = new femaleFactory();
        a.createCat().gender();
        a.createDog().eat();
    }
}
