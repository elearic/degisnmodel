package pattern.proxy.exercise.cglibproxydemo;


import pattern.proxy.exercise.entity.Order;
import pattern.proxy.exercise.jdkproxydemo.OrderServiceJdkDynamicProxy;
import pattern.proxy.exercise.service.OrderService;
import pattern.proxy.exercise.service.impl.OrderServiceImpl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zz_huns Luna on 2020/8/28 9:27 上午
 */
public class App {

    public static void main(String[] args) {
        OrderServiceImpl instance = (OrderServiceImpl)new OrderServiceCglibDynamicProxy().getInstance(OrderServiceImpl.class);
        Order order = new Order();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date date = null;
        instance.createOrder(order);
    }
}
