package pattern.templatepattern;

import java.time.LocalTime;

/**
 *
 *  模板模式：
 *
 *   定义 ： 定义了一个算法的骨架，而将一些步骤延迟到子类中，模版方法使得子类可以在不改变算法结构的情况下，重新定义算法的步骤。
 *
 *   目的 ： 抽象封装流程，具体步骤由父类定义，子类提供实现
 *
 *   原理 ： 仅仅使用java的继承机制，(开闭原则）
 *
 *   优点 ： 封装不变部分，扩展变的部分，去除子类重复代码，提高代码的复用性；父类负责行为控制，子类负责细节实现
 *
 *   缺点 ：
 *
 *   应用 ：  java.util.AbstractList
 *           spring 拦截器 preHandle,postHandle,afterCom
 *           HttpServlet doGet,doPost,service
 *
 *   以员工上班为例子：抽象一个架子出来
 *
 *   1.员工进入公司
 *   2.员工打开电脑
 *   3.员工工作
 *   4.员工关闭电脑
 *   5.员工离开公司
 *
 *
 *
 *
 *  关键字： 抽象，多态
 *
 *  优点：
 *
 *
 *  * @author zz_huns  
 *  @version Id: Worker.java, v 0.1 2020/3/23 5:36 PM zz_huns Exp $$
 *
 */
public abstract class Worker {

    protected String name;

    public Worker(String name) {
        this.name = name;
    }


    public final void workOneDay()
    {

        System.out.println("-----------------work start ---------------");
        enterCompany();
        computerOn();
        work();
        computerOff();
        exitCompany();
        System.out.println("-----------------work end ---------------");

    }

    /**
     * 进入公司
     */
    public void enterCompany() {
        System.out.println(name + "进入公司");
    }

    /**
     * 打开电脑
     */
    private void computerOn() {
        System.out.println(name + "打开电脑");
    }

    /**
     * 工作
     */
    public abstract void work();

    /**
     * 关闭电脑
     */
    private void computerOff() {
        System.out.println(name + "关闭电脑");
    }

    /**
     * 离开公司
     */
    public void exitCompany() {
        if (isNeedPrintDate()){
            System.out.println(LocalTime.now()+"-->"+name + "离开公司");
        }else {
            System.out.println(name + "离开公司");
        }
    }

    public boolean isNeedPrintDate(){
        return false;
    }
}
