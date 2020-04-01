package CreateModel.bulider;

public class Test {
    public static void main(String[] args) {
        ComputerDirector director = new ComputerDirector();
        LenovoComputer lenovoComputer = new LenovoComputer("联想","23");
        director.makeComputer(lenovoComputer);
        Computer c = lenovoComputer.getComputer();
        System.out.println("computer：  "+c.toString());

    }
}
