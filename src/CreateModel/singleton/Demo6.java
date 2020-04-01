package CreateModel.singleton;

public class Demo6 {
    public static void main(String[] args) {
        Singleton6 instance = Singleton6.getInstance();
        System.out.println(instance);
    }
}

//双重检查 线程安全 解决了懒加载问题 效率较高 实际开发推荐使用
// volatile 立即更新到内存，使变量可见
class Singleton6{
    private Singleton6(){}
    private static volatile Singleton6 instance;
    public static Singleton6 getInstance(){
        if(instance==null){
            synchronized (Singleton6.class){
                if(instance==null){
                    instance = new Singleton6();
                }
            }
        }
        return instance;
    }

}
