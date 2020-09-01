package principle.simpleresponsibility.interfaced;

/**
 *
 *  
 *  * @author zz_huns  
 *  @version Id: PythonCourse.java, v 0.1 2020/3/26 12:03 AM zz_huns Exp $$
 *
 */
public class PythonCourse implements ICourse {


    /**
     * 获取课程名称
     *
     * @return
     */
    @Override
    public String getCourseName() {
        return null;
    }

    @Override
    public void study() {
        System.out.println("study python course");
    }

}
