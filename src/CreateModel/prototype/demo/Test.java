package CreateModel.prototype.demo;

public class Test {
    public static void main(String[] args) {
        System.out.println("使用原型模式------");
        Person p = new Person("张三",45);
        Person p2 = (Person) p.clone();
        Person p3 = (Person) p.clone();
        Person p4 = (Person) p.clone();
        Person p5 = (Person) p.clone();
        System.out.println(p);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);


    }
}
