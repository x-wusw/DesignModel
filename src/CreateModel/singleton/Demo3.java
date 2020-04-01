package CreateModel.singleton;

public class Demo3 {
    public static void main(String[] args) {
        Singleton3 instance = Singleton3.getInstance();
        Singleton3 instance1 = Singleton3.getInstance();
        System.out.println(instance);
        System.out.println(instance==instance1);
    }
}

//懒汉式 线程不安全
class Singleton3{
    private Singleton3(){}

    private static Singleton3 insatance;
    //提供一个静态的公共方法，当使用本方法时创建实例对象
    public static Singleton3 getInstance(){
        if(insatance==null){
              insatance = new Singleton3();
      }
        return insatance;
    }
}
