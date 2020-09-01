package pattern.singletonpattern.serializable;

import java.io.*;

/**
 *
 *  
 *  * @author zz_huns  
 *  @version Id: SerializeSingleton.java, v 0.1 2020/4/12 4:42 PM zz_huns Exp $$
 *
 */
public class SerializeSingleton implements Serializable{


    private static final SerializeSingleton serializeSingleton = new SerializeSingleton();

    private SerializeSingleton(){

    }

    public static SerializeSingleton getInstance(){
        return serializeSingleton;
    }


    public static void main(String[] args) {
        SerializeSingleton s1 = SerializeSingleton.getInstance();
        SerializeSingleton s2 = null;

        //1.先s1进行对象序列化
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(
                new File("/Users/zz_huns/github/demo0323/SerializeSingleton.txt")))){
            out.writeObject(s1);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //2.在将序列化后的SerializeSingleton.txt 反序列化
        try (FileInputStream fis = new FileInputStream("/Users/zz_huns/github/demo0323/SerializeSingleton.txt")){
            ObjectInputStream inputStream = new ObjectInputStream(fis);
            s2 = (SerializeSingleton) inputStream.readObject();
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("==s1=="+s1.toString());
        System.out.println("==s2=="+s2.toString());
    }

    /**
     * 增加 readResolve 方法，解决单例破坏
     * @return
     */
    private Object readResolve(){ return serializeSingleton;}

}
