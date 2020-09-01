package principle.simpleresponsibility.simple;

/**
 *
 *  ICourse类.study 承担了 "直播课" 和 "录播课" 两种课的学习逻辑，耦合较高
 *
 *  分别创建 LiveCourse 和 ReplyCourse 解耦
 *
 *
 *  * @author zz_huns  
 *  @version Id: ICourse.java, v 0.1 2020/4/4 9:33 PM zz_huns Exp $$
 *
 */
public class ICourse {

    public void study(String courseName){
        if ("直播课".equals(courseName)){
            System.out.println("直播课学习。。。不能快进");
        }else if ("录播课".equals(courseName)){
            System.out.println("录播课学习。。。。可以快进");
        }
    }
}
