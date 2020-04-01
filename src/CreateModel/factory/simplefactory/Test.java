package CreateModel.factory.simplefactory;

import CreateModel.factory.fanctorymthod.Animal;

public class Test {
    public static void main(String[] args) {
        Animal a = AnimalFactory.create("dog");
        a.eat();
    }
}
