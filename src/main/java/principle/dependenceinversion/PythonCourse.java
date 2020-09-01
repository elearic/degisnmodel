package principle.dependenceinversion;

/**
 *
 *  
 *  * @author zz_huns  
 *  @version Id: PythonCourse.java, v 0.1 2020/3/26 12:03 AM zz_huns Exp $$
 *
 */
public class PythonCourse implements ICourse{


    @Override
    public void study() {
        System.out.println("study python course");
    }

}
