package CreateModel.prototype.deep;

import java.io.*;

public class DeepPrptoType implements Serializable,Cloneable {

    public String name;//基本数据类型
    public DeepCloneableTarget deepCloneableTarget;//引用类型
    public DeepPrptoType(){
        super();
    }


    //深拷贝  方式一 使用clone方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        //先完成对基本数据类型（属性）和String的clone
        deep = super.clone();
        //对引用类型的单独进行处理
        DeepPrptoType deepPrptoType = (DeepPrptoType) deep;
        deepPrptoType.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();
        return deep;
    }


    //方式二 通过对象的序列化（推荐）

    public Object DeepClone(){

        //创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            //对象通过以对象流的方式输出
            oos.writeObject(this);

            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepPrptoType d = (DeepPrptoType) ois.readObject();
            return d;

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }finally {
            try {
                bos.close();
                bis.close();
                oos.close();
                ois.close();
            } catch (Exception e2) {
                System.out.println(e2.getMessage());
            }

        }
    }
}
