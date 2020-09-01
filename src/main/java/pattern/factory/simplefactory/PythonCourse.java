package pattern.factory.simplefactory;

/**
 *
 *  
 *  * @author zz_huns  
 *  @version Id: PythonCourse.java, v 0.1 2020/4/5 12:08 PM zz_huns Exp $$
 *
 */
public class PythonCourse implements ICourse {
    @Override
    public void info() {
        System.out.println("创建了python课程");
    }
}
