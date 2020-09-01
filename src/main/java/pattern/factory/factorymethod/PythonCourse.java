package pattern.factory.factorymethod;


/**
 *
 *  
 *  * @author zz_huns  
 *  @version Id: PythonCourse.java, v 0.1 2020/4/5 12:08 PM zz_huns Exp $$
 *
 */
public class PythonCourse implements ICourse {

    public PythonCourse(){
        System.out.println("python 课程创建了");
    }

    @Override
    public void info() {
        System.out.println("创建了python课程");
    }
}
