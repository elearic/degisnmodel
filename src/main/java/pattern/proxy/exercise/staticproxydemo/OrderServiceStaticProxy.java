package pattern.proxy.exercise.staticproxydemo;

import pattern.proxy.exercise.DynamicDataSourceEntry;
import pattern.proxy.exercise.entity.Order;
import pattern.proxy.exercise.service.OrderService;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zz_huns Luna on 2020/8/27 7:10 下午
 */
public class OrderServiceStaticProxy implements OrderService {

    private SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");

    private OrderService orderService;

    public OrderServiceStaticProxy(OrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public int createOrder(Order order) {
        before();
        Long createTime = order.getCreateTime();
        Integer dbNo = Integer.valueOf(yearFormat.format(new Date(createTime)));
        System.out.println("静态代理类自动分配到【DB_"+ dbNo + "】数据源处理数据");
        DynamicDataSourceEntry.set(dbNo);
        int row = orderService.createOrder(order);
        after();
        return row;
    }

    private void before(){
        System.out.println("Proxy before method");
    }

    private void after(){
        System.out.println("Proxy after method");
    }
}
