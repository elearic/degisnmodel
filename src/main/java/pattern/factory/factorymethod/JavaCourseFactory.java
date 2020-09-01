package pattern.factory.factorymethod;

/**
 *
 *  
 *  * @author zz_huns  
 *  @version Id: JavaCourseFactory.java, v 0.1 2020/4/5 12:38 PM zz_huns Exp $$
 *
 */
public class JavaCourseFactory implements CourseFactory {

    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
