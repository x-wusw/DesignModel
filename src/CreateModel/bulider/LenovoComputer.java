package CreateModel.bulider;
//具体建造者
public class LenovoComputer extends AbstractBuilder {

    private Computer computer;
    public LenovoComputer(String name,String age){
        computer = new Computer(name,age);
    }
    @Override
    public void setCpu() {
        computer.setCpu("联想cpu");
    }

    @Override
    public void setRam() {
        computer.setRam("联想内存");
    }

    @Override
    public void setDisplay() {
        computer.setDisplay("联想显示屏");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
