package pattern.factory.simplefactory;

/**
 *
 *  
 *  * @author zz_huns  
 *  @version Id: JavaCourse.java, v 0.1 2020/4/5 12:08 PM zz_huns Exp $$
 *
 */
public class JavaCourse implements ICourse {
    @Override
    public void info() {
        System.out.println("创建了java课程");
    }
}
