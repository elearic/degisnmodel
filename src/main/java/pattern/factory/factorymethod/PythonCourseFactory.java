package pattern.factory.factorymethod;

/**
 *
 *  
 *  * @author zz_huns  
 *  @version Id: PythonCourseFactory.java, v 0.1 2020/4/5 12:38 PM zz_huns Exp $$
 *
 */
public class PythonCourseFactory implements CourseFactory {

    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}
