package CreateModel.singleton;

public class Demo7 {
    public static void main(String[] args) {
        Singleton7 instance = Singleton7.getInstance();
        System.out.println(instance);
    }
}

//类加载机制保证线程安全  静态内部类实现了延迟加载 推荐使用
class Singleton7{
    /*
        类加载时不会实例化，只有需要实例化的时候才会装载SingletonInstance类，从而完成Singleton8的实例化
     */
    private Singleton7(){}
    private static class SingletonInstance{
        private static final Singleton7 INSTANCE = new Singleton7();
    }
    public static Singleton7 getInstance(){
        return SingletonInstance.INSTANCE;
    }
}


