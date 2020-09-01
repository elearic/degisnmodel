package pattern.singletonpattern.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 *  容器式单例模式
 *  * @author zz_huns  
 *  @version Id: ContainerSingleton.java, v 0.1 2020/4/12 5:23 PM zz_huns Exp $$
 *
 */
public class ContainerSingleton {

    private ContainerSingleton(){

    }

    private static final Map<String,Object> container = new ConcurrentHashMap<>();

    public static Object getInstance(String className){
        Object instance = null;
        if (container.containsKey(className)){
            return container.get(className);
        }
        try {
             instance = Class.forName(className).newInstance();
             container.put(className,instance);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return instance;
    }

}
