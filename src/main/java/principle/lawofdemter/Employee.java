package principle.lawofdemter;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 *  
 *  * @author zz_huns  
 *  @version Id: Employee.java, v 0.1 2020/4/4 10:05 PM zz_huns Exp $$
 *
 */
public class Employee {


//    protected void getSale(Map<String,Integer> map){
//        Collection<Integer> values = map.values();
//
//        Integer reduce = values.stream().reduce(0, Integer::sum);
//
//        System.out.println("当月总共销售"+reduce+"件");
//    }


    protected void getSale(){
        Map<String,Integer> map = new HashMap();
        map.put("JavaCourse",100);
        map.put("PythonCourse",200);

        Collection<Integer> values = map.values();

        Integer reduce = values.stream().reduce(0, Integer::sum);

        System.out.println("当月总共销售"+reduce+"件");
    }



}
