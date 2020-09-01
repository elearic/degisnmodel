package pattern.singletonpattern.hungry;

/**
 *  单例模式：饿汉模式 - 2
 *
 *
 *  * @author zz_huns  
 *  @version Id: HungryStaticSingleton.java, v 0.1 2020/4/12 3:04 PM zz_huns Exp $$
 *
 */
public class HungryStaticSingleton {

    private static final HungryStaticSingleton hungryStaticSingleton;

    static {
        hungryStaticSingleton = new HungryStaticSingleton();
    }

    public static HungryStaticSingleton getInstance(){
        return hungryStaticSingleton;
    }
}
