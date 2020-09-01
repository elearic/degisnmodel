package pattern.templatepattern;

/**
 *
 *  
 *  * @author zz_huns  
 *  @version Id: templatepattern.ITWorker.java, v 0.1 2020/3/23 5:45 PM zz_huns Exp $$
 *
 */
public class ITWorker extends Worker {



    public ITWorker(String name) {
        super(name);
    }

    /**
     * 工作
     */
    @Override
    public void work() {
        System.out.println(name + "写代码，fix-bug,看视频，抽烟，打游戏");
    }


    @Override
    public boolean isNeedPrintDate() {
        return true;
    }

}
