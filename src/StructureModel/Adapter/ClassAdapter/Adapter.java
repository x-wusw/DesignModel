package StructureModel.Adapter.ClassAdapter;

/**
 *  介绍：Adapter类：完成220V-5V的转变
 *  通过继承src类，实现 dst 类接口，完成src->dst的适配
 */
public class Adapter extends Src implements dst {
    @Override
    public int output5V() {
        int src = output220V();
        System.out.println("---适配器开始适配电压转换为电流");
        int dst = src/44;
        System.out.println("---电压为"+dst);
        return dst;
    }
}
