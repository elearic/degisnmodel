package principle.lawofdemter;

import java.util.HashMap;
import java.util.Map;

/**
 *
 *  
 *  * @author zz_huns  
 *  @version Id: Lead.java, v 0.1 2020/4/4 10:04 PM zz_huns Exp $$
 *
 */
public class Lead {

    private Employee employee = new Employee();


    /**
     *  map 对象，不应该在此方法内部，违背了迪米特原则
     * @param employee
     */
//    protected void getCurrentMonthSale(Employee employee){
//        Map<String,Integer> map = new HashMap();
//        map.put("JavaCourse",100);
//        map.put("PythonCourse",200);
//        employee.getSale(map);
//    }



    protected void getCurrentMonthSale(Employee employee){
        employee.getSale();
    }


}
