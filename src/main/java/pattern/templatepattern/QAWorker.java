package pattern.templatepattern;

/**
 *
 *  
 *  * @author zz_huns  
 *  @version Id: templatepattern.QAWorker.java, v 0.1 2020/3/23 5:46 PM zz_huns Exp $$
 *
 */
public class QAWorker extends Worker{

    public QAWorker(String name) {
        super(name);
    }

    /**
     * 工作
     */
    @Override
    public void work() {
        System.out.println(name + "写测试用例-提交bug-写测试用例");
    }
}
