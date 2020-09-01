package pattern.factory.simplefactory;

/**
 *
 *  
 *  * @author zz_huns  
 *  @version Id: CourseFactory.java, v 0.1 2020/4/5 12:07 PM zz_huns Exp $$
 *
 */
public class CourseFactory {


    public static ICourse createCourse(Class<? extends ICourse> clazz){
        try {
            return clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
