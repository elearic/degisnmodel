package pattern.singletonpattern.threadlocal;

/**
 *
 *  线程类型单例模式  
 *  * @author zz_huns  
 *  @version Id: ThreadLocalSingleton.java, v 0.1 2020/4/12 5:29 PM zz_huns Exp $$
 *
 */
public class ThreadLocalSingleton {

    private static Integer[] aa = new Integer[99999999];

    public static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance = new ThreadLocal<ThreadLocalSingleton>(){

        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    private ThreadLocalSingleton(){}

    public static ThreadLocalSingleton getInstance(){
        return threadLocalInstance.get();
    }

}
