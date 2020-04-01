package CreateModel.singleton;

public class Demo5 {
    public static void main(String[] args) {
        Singleton5 instance  = Singleton5.getInstance();
        System.out.println(instance);
    }
}

//懒汉式 同步代码块线程安全 实际开发不能使用
class Singleton5{
    private Singleton5(){}
    private static Singleton5 instance;
    public static Singleton5 getInstance(){
        if(instance==null){
            synchronized (Singleton5.class){
                instance=new Singleton5();
            }
        }
        return instance;
    }
}
