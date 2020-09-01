package pattern.proxy.exercise.service.impl;

import pattern.proxy.exercise.dao.OrderDao;
import pattern.proxy.exercise.entity.Order;
import pattern.proxy.exercise.service.OrderService;

/**
 * Created by zz_huns Luna on 2020/8/27 5:33 下午
 */
public class OrderServiceImpl implements OrderService {

    private OrderDao orderDao;

    public OrderServiceImpl() {
        //这里模拟自动注入
        this.orderDao = new OrderDao();
    }

    @Override
    public int createOrder(Order order) {
        return orderDao.insert(order);
    }
}
