package pattern.singletonpattern.register;

/**
 *
 *  枚举式单例模式
 *
 *  底层 懒汉式静态代码块
 *
 *
 *  * @author zz_huns  
 *  @version Id: EnumSingleTon.java, v 0.1 2020/4/12 5:15 PM zz_huns Exp $$
 *
 */
public enum  EnumSingleTon {

    INSTANCE;

    private Object object;


    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public static EnumSingleTon getInstance(){
        return INSTANCE;
    }


    public static void main(String[] args) {
        EnumSingleTon enumSingleTon = EnumSingleTon.getInstance();
        enumSingleTon.setObject(new Object());
    }

}
