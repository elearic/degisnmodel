package pattern.singletonpattern.lazy;

/**
 *  单例模式 懒汉式 -1
 *
 *  先定义，只有在需要的时候才去实例化

 *  
 *  * @author zz_huns  
 *  @version Id: LazySingleton.java, v 0.1 2020/4/12 3:07 PM zz_huns Exp $$
 *
 */
public class LazySingleton {

    private static LazySingleton lazySingletone;

    private LazySingleton(){

    }

    /**
     * 优点：节约了内存资源
     * 缺点：线程不安全
     *
     *
     * @return
     */
    public static LazySingleton getInstance(){
        if (null == lazySingletone){
            lazySingletone = new LazySingleton();
        }
        return lazySingletone;
    }
}
