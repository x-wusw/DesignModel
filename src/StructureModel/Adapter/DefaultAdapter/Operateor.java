package StructureModel.Adapter.DefaultAdapter;

public class Operateor {
    private Adpater adpater;
    public void add(Adpater adpater){
        this.adpater = adpater;
    }
    public void method1() {
        adpater.method1();
    }
    public void method2() {
        adpater.method2();
    }

    public void method3() {
        adpater.method3();
    }

    public void method4() {
        adpater.method4();
    }
    public void method5() {
        adpater.method5();
    }

}
