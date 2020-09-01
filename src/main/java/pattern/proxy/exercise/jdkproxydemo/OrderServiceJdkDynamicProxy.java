package pattern.proxy.exercise.jdkproxydemo;

import pattern.proxy.exercise.DynamicDataSourceEntry;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zz_huns Luna on 2020/8/28 9:10 上午
 */
public class OrderServiceJdkDynamicProxy implements InvocationHandler {

    private SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");

    private Object target;

    public Object getInstance(Object target){
        this.target = target;
        Class<?> clazz = target.getClass();
        Object o = Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
//        System.out.println("aaaa"+o.toString());
        return o;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before(args[0]);
        Object invoke = method.invoke(target, args);
        after();
        return invoke;
    }

    public void before(Object target){
        System.out.println("Proxy before method");
        try {
            Long createTime = (Long) target.getClass().getMethod("getCreateTime").invoke(target);
            Integer dbNo = Integer.valueOf(yearFormat.format(new Date(createTime)));
            System.out.println("静态代理类自动分配到【DB_"+ dbNo + "】数据源处理数据");
            DynamicDataSourceEntry.set(dbNo);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public void after(){
        System.out.println("Proxy after method");
    }



}
