package prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhuhh 2018/8/9
 */
public class ProptypeManager {

    private static Map<String, Proptype> map = new HashMap<>();

    private ProptypeManager() {

    }

    public static synchronized void registProptype(String id, Proptype proptype) {
        map.put(id, proptype);
    }

    public static synchronized Proptype getProptype(String id) throws Exception {
        if(map.containsKey(id)) {
            return map.get(id);
        }else{
            throw new Exception("您希望获得的原型还没有注册或已被销毁");
        }
    }

    public static synchronized void unregistProptype(String id) {
        map.remove(id);
    }
}
