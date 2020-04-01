package CreateModel.singleton;

public class Demo8 {
    public static void main(String[] args) {
        Singleton8 instance = Singleton8.INSTANCE;
        Singleton8 singleton = Singleton8.INSTANCE;
        System.out.println(instance);
        System.out.println(instance==singleton);
        Singleton8.ok();
    }
}

//枚举 线程安全 推荐使用
//避免了多线程同步问题 防止反序列化重新创建新对象
enum Singleton8{
    INSTANCE;
    public static void ok(){
        System.out.println("OK");
    }
}