package StructureModel.Adapter.ClassAdapter;

/**
 * 需要被适配的类、接口、对象（我们有的），简称 src（source）
 * 最终需要的输出（我们想要的），简称 dst (destination，即Target)
 * 适配器称之为 Adapter 。
 * src->Adapter->dst,
 */
//220V电源
public class Src {
    public int output220V(){
        int src = 220;
        System.out.println("---"+src+"V");
        return src;
    }
}
