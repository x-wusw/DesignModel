package CreateModel.prototype.deep;

import java.io.Serializable;

public class DeepCloneableTarget implements Cloneable, Serializable {

    private static final long serialVersionUID = 1L;
    private String cloneName;
    private int age;
    //构造器
    public DeepCloneableTarget(String cloneName,int age){
        this.cloneName=cloneName;
        this.age=age;
    }


    //因为该类的基本属性都是string，所以使用默认的clone方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "{" +
                "cloneName='" + cloneName + '\'' +
                ", age=" + age +
                '}';
    }
}
