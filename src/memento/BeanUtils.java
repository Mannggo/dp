package memento;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;

/**
 * @author 谢仲东 2018-10-18 14:56
 */
public class BeanUtils {

    public static HashMap<String, Object> backupProp(Object o) {
        HashMap<String, Object> result = new HashMap<>();
        try {
            BeanInfo info = Introspector.getBeanInfo(o.getClass());
            PropertyDescriptor[] descriptors = info.getPropertyDescriptors();

            for (PropertyDescriptor descriptor : descriptors) {
                String fieldName = descriptor.getName();
                Method getter = descriptor.getReadMethod();
                Object fileValue = getter.invoke(o);
                if (!fieldName.equals("class")) {
                    result.put(fieldName, fileValue);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void restoreProp(Object o, HashMap<String, Object> props) {
        try {
            BeanInfo info = Introspector.getBeanInfo(o.getClass());
            PropertyDescriptor[] descriptors = info.getPropertyDescriptors();
            for (PropertyDescriptor descriptor : descriptors) {
                String fieldName = descriptor.getName();
                if (props.containsKey(fieldName)) {
                    Method setter = descriptor.getWriteMethod();
                    setter.invoke(o, props.get(fieldName));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
