package pattern.factory.simplefactory;

/**
 *
 *  
 *  * @author zz_huns  
 *  @version Id: AppMain.java, v 0.1 2020/4/5 12:08 PM zz_huns Exp $$
 *
 */
public class AppMain {

    public static void main(String[] args) {
        ICourse javaCourse = CourseFactory.createCourse(JavaCourse.class);
        javaCourse.info();
        ICourse pythonCourse = CourseFactory.createCourse(PythonCourse.class);
        pythonCourse.info();

    }
}
