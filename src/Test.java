import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

    public static Integer index(int n) {
        int result;
        if (n < 0) {
            System.out.println("输入错误！");
            return 0;
        } else if (n == 0 || n == 1) {
            return 1; //回推墙
        } else {
            result = index(n - 1) * n;
        }
        return result;
    }

    public static void main(String[] args) {
        List<Map<String, Object>> mapList = new ArrayList<>();
        Map<String, Object> map = new HashMap<>();
        Person person1 = new Person("张三", 12);
        Person person2 = new Person("李四", 21);
        Person person3 = new Person("王五", 23);
    /*    map.put("map1", "值1");
        map.put("map2", "值2");
        map.put("map3", "值3");*/
        map.put("map1", person1);
        map.put("map2", person2);
        map.put("map3", person3);
        mapList.add(map);
       /* for (int i = 0; i < mapList.size(); i++) {
            System.out.println(mapList.get(i));
        }*/
//        System.out.println(person1.getName());
//        System.out.println(mapList.get(0).get("map2").toString());

        int n =4;
        System.out.println("4的阶乘："+index(n));
    }
}
