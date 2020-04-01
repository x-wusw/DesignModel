package CreateModel.prototype.deep;

/**
 * 浅拷贝只是引用了一下原对象，而深拷贝则是在拷贝对象时，重新分配了内存地址
 */
public class Test {
    public static void main(String[] args) throws Exception {
        DeepPrptoType p = new DeepPrptoType();
        p.name = "xx";
        p.deepCloneableTarget = new DeepCloneableTarget("小萨",12);
        //方式一

        DeepPrptoType p1 = (DeepPrptoType) p.clone();
        p1.name = "小五";
        System.out.println(p.name+"  "+p.deepCloneableTarget.toString()+"  "+p.deepCloneableTarget.hashCode());
        System.out.println(p1.name+"  "+p1.deepCloneableTarget.hashCode());
        //方式二
        DeepPrptoType p2 = (DeepPrptoType) p.DeepClone();
        p2.name = "xiaoliu";
        System.out.println(p.name+"  "+p.deepCloneableTarget.hashCode());
        System.out.println(p2.name+"  "+p2.deepCloneableTarget.hashCode());
    }
}
