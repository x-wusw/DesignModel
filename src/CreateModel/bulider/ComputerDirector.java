package CreateModel.bulider;

//指挥者
public class ComputerDirector {
    public void makeComputer(AbstractBuilder abstractBuilder){
        abstractBuilder.setCpu();
        abstractBuilder.setRam();
        abstractBuilder.setDisplay();
    }
}
