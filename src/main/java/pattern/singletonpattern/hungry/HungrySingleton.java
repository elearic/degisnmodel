package pattern.singletonpattern.hungry;

/**
 *
 *  单例模式：饿汉模式 - 1
 *
 *  优点：代码简单，执行效率高，没有锁
 *  缺点：可能会造成资源浪费
 *  
 *  * @author zz_huns  
 *  @version Id: HungrySingleton.java, v 0.1 2020/4/12 3:01 PM zz_huns Exp $$
 *
 */
public class HungrySingleton {

    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton(){

    }

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        Class<?> aClass = Class.forName("singletonpattern.hungry.HungrySingleton");

        Object c1 = aClass.newInstance();
        System.out.println("====c1===="+c1.toString());
        Object c2 = aClass.newInstance();
        System.out.println("====c2===="+c2.toString());


    }

}
