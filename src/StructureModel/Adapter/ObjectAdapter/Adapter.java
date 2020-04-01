package StructureModel.Adapter.ObjectAdapter;

import StructureModel.Adapter.ClassAdapter.Src;
import StructureModel.Adapter.ClassAdapter.dst;

/**
 *基本思路和类的适配器模式相同，只是将Adapter类作修改，这次不继承src类，而是持有src类的实例，以解决兼容性的问题。
 * 即：持有 src类，实现 dst 类接口，完成src->dst的适配。
 * （根据“合成复用原则”，在系统中尽量使用关联关系来替代继承关系，因此大部分结构型模式都是对象结构型模式。）
 */
public class Adapter implements dst {
    private Src src;
    public Adapter(Src src1){
        src = src1;
    }

    @Override
    public int output5V() {
        int dst = 0;
        if(null != src){
            int t = src.output220V();
            System.out.println("对象适配器工作，开始适配电压");
            dst = t / 44;
            System.out.println("适配完成后输出电压：" + dst);
        }
        return dst;
    }
}
