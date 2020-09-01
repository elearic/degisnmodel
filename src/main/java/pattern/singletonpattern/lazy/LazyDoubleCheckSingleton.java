package pattern.singletonpattern.lazy;

/**
 *  懒汉式单例模式 - 3
 *
 *  通过双重校验，降低同步锁带来的性能浪费
 *  
 *  * @author zz_huns  
 *  @version Id: LazyDoubleCheckSingleton.java, v 0.1 2020/4/12 4:04 PM zz_huns Exp $$
 *
 */
public class LazyDoubleCheckSingleton {

    private static LazyDoubleCheckSingleton lazyDoubleCheckSingleton;

    private LazyDoubleCheckSingleton(){

    }

    /**
     * 将同步锁迁移只方法内部，多线程情况下，只有第一个线程在拿到锁进行对象实例化的时候，其他线程处于等待状态，
     * 一旦对象实例化后，同步锁代码块不会再执行，也不存在锁竞争
     * @return
     */
    public static final LazyDoubleCheckSingleton getInstance(){
        if (null == lazyDoubleCheckSingleton){
            synchronized (LazyDoubleCheckSingleton.class){
                if (null == lazyDoubleCheckSingleton){
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
