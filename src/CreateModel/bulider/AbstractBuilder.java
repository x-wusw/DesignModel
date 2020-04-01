package CreateModel.bulider;

//抽象建造者
public abstract class AbstractBuilder {
    public abstract void setCpu();
    public abstract void setRam();
    public abstract void setDisplay();

    public abstract Computer getComputer();
}
