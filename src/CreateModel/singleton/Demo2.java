package CreateModel.singleton;

public class Demo2 {
    public static void main(String[] args) {
        Singleton1 instance = Singleton1.getInstance();
        System.out.println(instance);
    }
}

//懒汉式 静态代码块 缺点：内存浪费
class Singleton1{

    private Singleton1(){}

    private final static Singleton1 instance;
    static {
        instance= new Singleton1();
    }

    public static Singleton1 getInstance(){
        return instance;
    }
}
