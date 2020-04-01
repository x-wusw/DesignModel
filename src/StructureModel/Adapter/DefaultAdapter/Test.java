package StructureModel.Adapter.DefaultAdapter;

/**
 * 当不需要全部实现接口提供的方法时，可以设计一个适配器抽象类实现接口，并为接口中的每个方法提供默认方法，
 * 抽象类的子类就可以有选择的覆盖父类的某些方法实现需求，它适用于一个接口不想使用所有的方法的情况。
 * 在java8后，接口中可以有default方法，就不需要这种缺省适配器模式了。接口中方法都设置为default，实现为空，
 * 这样同样同样可以达到缺省适配器模式同样的效果。
 */
public class Test {
    public static void main(String[] args) {
        Operateor o = new Operateor();
        Operateor o1 = new Operateor();
        o.add(new Adpater() {
            @Override
            public void method1() {
                System.out.println("要实现所有操作类的操作");
            }
            @Override
            public void method2() {
            }
            @Override
            public void method3() {
            }
            @Override
            public void method4() {
            }
            @Override
            public void method5() {
            }
            @Override
            public void method6() {
            }
            @Override
            public void method7() {
            }
        });
        System.out.println("不使用接口适配器------------------------");
        o.method1();
        o1.add(new DefaultAdapter(){
            @Override
            public void method1() {
                System.out.println("使用接口适配器只需要实现自己需要的方法");
            }
        });
        System.out.println("使用接口适配器------------------------");
        o1.method1();
    }
}
