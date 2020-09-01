package pattern.factory.factorymethod;


/**
 *  
 *  * @author zz_huns  
 *  @version Id: AppMain.java, v 0.1 2020/4/5 12:08 PM zz_huns Exp $$
 */
public class AppMain {

    public static void main(String[] args) {
        CourseFactory javaCourseFactory = new JavaCourseFactory();
        javaCourseFactory.create();

        CourseFactory pythonCourseFactory = new PythonCourseFactory();
        pythonCourseFactory.create();



    }
}
