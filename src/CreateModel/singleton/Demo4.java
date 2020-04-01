package CreateModel.singleton;

public class Demo4 {
    public static void main(String[] args) {
        Singleton4 instance = Singleton4.getInstance();
        System.out.println(instance);
    }
}

//懒汉式 线程安全但效率低 同步锁
class Singleton4{
    private Singleton4(){}

    private static Singleton4 instance;
    public static synchronized Singleton4 getInstance(){
        if(instance==null){
            instance = new Singleton4();
        }
        return instance;
    }
}