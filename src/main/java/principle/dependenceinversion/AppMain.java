package principle.dependenceinversion;

/**
 *
 *  
 *  * @author zz_huns  
 *  @version Id: AppMain.java, v 0.1 2020/3/26 12:01 AM zz_huns Exp $$
 *
 */
public class AppMain {

    public static void main(String[] args) {
        Andy andy = new Andy();
//        andy.studyJavaCourse();
//        andy.studyJavaCourse();


        andy.setiCourse(new JavaCourse());
        andy.study();

        andy.setiCourse(new PythonCourse());
        andy.study();
    }
}
