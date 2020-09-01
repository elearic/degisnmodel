package pattern.singletonpattern.lazy;

/**
 *
 *  单例模式 - 懒汉式 -2
 *
  *  @author zz_huns  
 *  @version Id: LazySyncSingleton.java, v 0.1 2020/4/12 3:38 PM zz_huns Exp $$
 *
 */
public class LazySyncSingleton {

    private static LazySyncSingleton lazySyncSingleton;

    private LazySyncSingleton(){

    }

    /**
     * 优点：节约了内存资源，线程安全
     * 缺点：性能低，多线程场景下，只有一个线程拿到锁，其他线程处理等待状态
     *
     *
     * @return
     */
    public static synchronized LazySyncSingleton getInstance(){
        if (null == lazySyncSingleton){
            lazySyncSingleton = new LazySyncSingleton();
        }
        return lazySyncSingleton;
    }

    public static LazySyncSingleton getInstance1(){
        synchronized (LazySyncSingleton.class){
            if (null == lazySyncSingleton){
                lazySyncSingleton = new LazySyncSingleton();
            }
        }
        return lazySyncSingleton;
    }

    public static LazySyncSingleton getInstance2(){
        if (null == lazySyncSingleton){
            synchronized (LazySyncSingleton.class){
                lazySyncSingleton = new LazySyncSingleton();

            }
        }
        return lazySyncSingleton;
    }

}
