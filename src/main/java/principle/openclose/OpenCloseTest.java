package principle.openclose;

/**
 *
 *  
 *  * @author zz_huns  
 *  @version Id: OpenCloseTest.java, v 0.1 2020/3/23 11:06 PM zz_huns Exp $$
 *
 */
public class OpenCloseTest {

    public static void main(String[] args) {
        ICourse javaCourse = new JavaDiscountCourse(1L,"java",199D);

        System.out.println("java课程：\n" +
                            "ID: "+javaCourse.getId() + "\n" +
                            "课程名："+javaCourse.getName() + "\n" +
                            "价格：" + javaCourse.getPrice());


        JavaDiscountCourse javaDiscountCourse = (JavaDiscountCourse)javaCourse;

        System.out.println("java折扣课程：\n" +
                "ID: "+javaDiscountCourse.getId() + "\n" +
                "课程名："+javaDiscountCourse.getName() + "\n" +
                "价格：" + javaDiscountCourse.getDisCountPrice());
    }
}
