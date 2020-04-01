package CreateModel.factory.fanctorymthod;

public class Test {
    public static void main(String[] args) {
        catFactory c = new catFactory();
        Animal A = c.caeate();
        A.eat();

    }
}
