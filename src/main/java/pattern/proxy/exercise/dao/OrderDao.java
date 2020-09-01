package pattern.proxy.exercise.dao;

import pattern.proxy.exercise.entity.Order;

/**
 * Created by zz_huns Luna on 2020/8/27 5:29 下午
 */
public class OrderDao {

    public int insert(Order order){
        System.out.println("OrderDao 创建 order 成功!!!");
        return 1;
    }
}
