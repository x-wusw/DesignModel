package CreateModel.factory.simplefactory;

import CreateModel.factory.fanctorymthod.Animal;
import CreateModel.factory.fanctorymthod.Cat;
import CreateModel.factory.fanctorymthod.Dog;

/*
    简单工厂
 */
public class AnimalFactory {
    public static Dog createDog(){
        return new Dog();
    }

    public static Cat createCat(){
        return new Cat();
    }

    public static Animal create(String type){
        if("dog".equals(type)){
            return new Dog();
        }else if("cat".equals(type)){
            return new Cat();
        }else{
            return null;
        }
    }


}
