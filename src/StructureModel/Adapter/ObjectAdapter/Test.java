package StructureModel.Adapter.ObjectAdapter;

import StructureModel.Adapter.ClassAdapter.Src;
import StructureModel.Adapter.ClassAdapter.dst;

/**
 * 对象适配器和类适配器其实算是同一种思想，只不过实现方式不同。
 * 根据合成复用原则，组合大于继承，
 * 所以它解决了类适配器必须继承src的局限性问题，也不再强求dst必须是接口。
 * 同样的它使用成本更低，更灵活。
 * （和装饰者模式初学时可能会弄混，这里要搞清，装饰者是对src的装饰，使用者毫无察觉到src已经被装饰了（使用者用法不变）。 这里对象适配以后，使用者的用法还是变的。
 * 即，装饰者用法： setSrc->setSrc，对象适配器用法：setSrc->setAdapter.)
 */
public class Test {
    //充电
    public void charg(dst d){
        if(d.output5V()==5){
            System.out.println("电压刚刚好5V，开始充电");
        }else if (d.output5V() >5){
            System.out.println("电压太高，停止充电");
        }else {
            System.out.println("电压不足，无法充电");
        }
    }
    public static void main(String[] args) {
        System.out.println("======类适配器=====");
        Adapter adapter = new Adapter(new Src());
        Test test = new Test();
        test.charg(adapter);

    }
}
