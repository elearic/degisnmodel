package pattern.singletonpattern.lazy;

/**
 *
 *  懒汉式单例模式 - 4
 *  * @author zz_huns  
 *  @version Id: LazyInnerClassSingleton.java, v 0.1 2020/4/12 4:17 PM zz_huns Exp $$
 *
 */
public class LazyInnerClassSingleton {
    /**
     * 解决了在单例破坏问题 (是否真解决了，待验证)
     */
    private LazyInnerClassSingleton(){
        if (null == LazySingleton.LAZY_SINGLETON){
            throw new RuntimeException("非法访问");
        }
    }

    public static LazyInnerClassSingleton getInstance(){
        return LazySingleton.LAZY_SINGLETON;
    }

    /**
     * 静态内部类：只有在用到的时候才回去加载，默认不加载
     */
    private static class LazySingleton{

        public static final  LazyInnerClassSingleton LAZY_SINGLETON = new LazyInnerClassSingleton();

    }

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        Class<?> aClass = Class.forName("singletonpattern.lazy.LazyInnerClassSingleton");
        Object c1 = aClass.newInstance();
        System.out.println("====c1===="+c1.toString());
//        Object c2 = aClass.newInstance();
//        System.out.println("====c2===="+c2.toString());


    }
}
