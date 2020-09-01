package pattern.factory.factorymethod;


/**
 *
 *  
 *  * @author zz_huns  
 *  @version Id: JavaCourse.java, v 0.1 2020/4/5 12:08 PM zz_huns Exp $$
 *
 */
public class JavaCourse implements ICourse {

    public JavaCourse(){
        System.out.println("java 课程创建了");
    }


    @Override
    public void info() {
        System.out.println("创建了java课程");
    }
}
