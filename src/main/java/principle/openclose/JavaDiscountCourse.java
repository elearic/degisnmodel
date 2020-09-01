package principle.openclose;

/**
 *
 *  
 *  * @author zz_huns  
 *  @version Id: JavaDiscountCourse.java, v 0.1 2020/3/23 11:12 PM zz_huns Exp $$
 *
 */
public class JavaDiscountCourse extends JavaCourse {

    public JavaDiscountCourse(Long id, String name, Double price) {
        super(id, name, price);
    }

    public Double getDisCountPrice(){
        return this.getPrice() / 10;
    }
}
