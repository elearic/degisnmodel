package principle.interfacesegregation;

/**
 *
 *    
 *  * @author zz_huns  
 *  @version Id: Bird.java, v 0.1 2020/4/4 9:55 PM zz_huns Exp $$
 *
 */
public class Bird implements IAnimal {
    @Override
    public void fly() {

    }

    /**
     * 飞行类动物，实现此方法，多余
     */
    @Override
    public void swim() {

    }
}
