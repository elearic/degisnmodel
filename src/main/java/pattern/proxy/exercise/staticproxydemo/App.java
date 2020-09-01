package pattern.proxy.exercise.staticproxydemo;


import pattern.proxy.exercise.entity.Order;
import pattern.proxy.exercise.service.impl.OrderServiceImpl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zz_huns Luna on 2020/8/28 9:27 上午
 */
public class App {

    public static void main(String[] args) {
        Order order = new Order();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        try {
            Date date = sdf.parse("2017/01/01");
            order.setCreateTime(date.getTime());

            OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy(new OrderServiceImpl());
            orderServiceStaticProxy.createOrder(order);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
