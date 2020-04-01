package CreateModel.prototype.demo;

public class Person implements Cloneable{
    private String name;
    private int age;

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name= "+name+"   "+"age="+age;
    }

    //重写clone，复制(拷贝)对象

    @Override
    protected Object clone(){
        Person person = null;
        try {
            person = (Person) super.clone();
        }catch (CloneNotSupportedException e){
            System.out.println(e.getMessage());
        }
        return person;
    }
}
