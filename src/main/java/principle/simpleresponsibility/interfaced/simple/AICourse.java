package principle.simpleresponsibility.interfaced.simple;

/**
 *
 *  通过实现接口的方式实现单一原则
 *  ICourseInfo 负责管理课程的基本信息
 *  ICourseManage 负责管理课程的学习动作
 *
 *  * @author zz_huns  
 *  @version Id: AICourse.java, v 0.1 2020/4/4 9:43 PM zz_huns Exp $$
 *
 */
public class AICourse implements ICourseInfo,ICourseManage{

    /**
     * 获取课程名称
     */
    @Override
    public void getCourseName() {

    }

    /**
     * 课程学习
     */
    @Override
    public void study() {

    }
}
