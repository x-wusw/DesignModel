package CreateModel.bulider;

//产品类
public class Computer {

    private String name;
    private String age;

    private String cpu;
    private String ram;
    private String display;
    public Computer(String name,String age){
        this.name = name;
        this.age = age;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", display='" + display + '\'' +
                '}';
    }
}
