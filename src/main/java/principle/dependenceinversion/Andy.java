package principle.dependenceinversion;

/**
 *
 *  
 *  * @author zz_huns  
 *  @version Id: Andy.java, v 0.1 2020/3/26 12:00 AM zz_huns Exp $$
 *
 */
public class Andy {


//    public void studyJavaCourse(){
//        System.out.println("andy study java course");
//    }
//
//
//    public void studyPythonCourse(){
//        System.out.println("andy study python course");
//    }

    private ICourse iCourse;

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void study(){
        iCourse.study();
    }

}
