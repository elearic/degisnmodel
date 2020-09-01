package pattern.proxy.staticproxy;

/**
 *
 *  
 *  * @author zz_huns  
 *  @version Id: ZhangLaoSan.java, v 0.1 2020/5/11 12:02 AM zz_huns Exp $$
 *
 */
public class ZhangLaoSan implements IPerson {


    private ZhangSan zhangSan;

    public ZhangLaoSan(ZhangSan zhangSan) {
        this.zhangSan = zhangSan;
    }

    @Override
    public void findLove() {
        System.out.println("张老三开始物色");
        zhangSan.findLove();
        System.out.println("开始交往");
    }


}
