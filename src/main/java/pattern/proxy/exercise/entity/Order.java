package pattern.proxy.exercise.entity;

/**
 * Created by zz_huns Luna on 2020/8/27 5:27 下午
 */
public class Order {

    //订单信息
    private Object orderInfo;

    //创建时间
    private Long createTime;

    //订单ID
    private String id;


    public Object getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(Object orderInfo) {
        this.orderInfo = orderInfo;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
