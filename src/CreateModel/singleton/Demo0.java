package CreateModel.singleton;

public class Demo0 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton singleton = Singleton.getInstance();
        System.out.println(instance);
        System.out.println(instance==singleton);
    }
}


//饿汉式静态常量
class Singleton{
    /*
        1.构造器私有化，使外部不能new
        2.本内部创建对象实例
        3.提供一个公有的静态常量，返回实例
     */
    private Singleton(){}
    private final static Singleton instance = new Singleton();
    public static Singleton getInstance(){
        return instance;
    }
}
