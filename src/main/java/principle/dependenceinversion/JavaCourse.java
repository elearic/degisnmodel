package principle.dependenceinversion;

/**
 *
 *  
 *  * @author zz_huns  
 *  @version Id: JavaCourse.java, v 0.1 2020/3/26 12:02 AM zz_huns Exp $$
 *
 */
public class JavaCourse implements ICourse{

    @Override
    public void study() {
        System.out.println("study java course");
    }
}
