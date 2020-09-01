package pattern.templatepattern;

/**
 *
 *  
 *  * @author zz_huns  
 *  @version Id: templatepattern.HRWorker.java, v 0.1 2020/3/23 5:45 PM zz_huns Exp $$
 *
 */
public class HRWorker extends Worker {

    public HRWorker(String name) {
        super(name);
    }

    /**
     * 工作
     */
    @Override
    public void work() {
        System.out.println(name + "打电话,筛简历");
    }
}
