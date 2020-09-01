package principle.openclose;

/**
 *
 *  
 *  * @author zz_huns  
 *  @version Id: JavaCourse.java, v 0.1 2020/3/23 11:04 PM zz_huns Exp $$
 *
 */
public class JavaCourse implements  ICourse {

    private Long id;

    private String name;

    private Double price;

    public JavaCourse(Long id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }


}
