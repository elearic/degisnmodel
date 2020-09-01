package pattern.proxy.exercise;

/**
 * Created by zz_huns Luna on 2020/8/27 6:22 下午
 */
public class DynamicDataSourceEntry {

    public static final String DEFAULT_SOURCE = null;

    public static final ThreadLocal<String> local = new ThreadLocal<String>();

    public DynamicDataSourceEntry() {
    }

    /**
     * 清空数据源
     */
    public static void clear(){
        local.remove();
    }

    /**
     * 获取当前正在使用的数据源
     * @return
     */
    public static String get(){
        return local.get();
    }

    /**
     * 设置已只的数据源
     * @param source
     */
    public static  void set(String source){
        local.set(source);
    }

    public static  void set(Integer source){
        local.set("db_"+source);
    }
    /**
     * 还原当前切换的数据源
     */
    public static void restore(){
        local.set(DEFAULT_SOURCE);
    }
}
