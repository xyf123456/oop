import pojo.Person;

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

    /**
     * @ Description:，在try中执行到return语句时，不会真正的return，
     * 即只是会计算return中的表达式（本题为执行a+b），之后将结果保存在一个临时栈中，
     * 接着执行finally中的语句，最后才会从临时栈中取出之前的结果返回。
     * 在正常情况（即程序正常执行try catch finally语句块，不会在语句中出现退出程序、线程终止等特殊情况）下，
     * 都会执行finally语句块，如果finally中有return,则程序会走finally中的return，如果没有，则先执行try或者
     * catch中的return,将其存入临时栈中，执行完finally语句后才返回临时栈中的值。
     * @params: * @Param: a
     * @Param: b
     * @return:int
     **/
    public int add(int a, int b) {

        try {
            return a + b;
        } catch (Exception e) {
            System.out.println("catch块");
            e.printStackTrace();
        } finally {
            System.out.println("finally块");
//            执行这里的代码块对结果没有影响
            a = 1;
        }
        return 0;
    }

    public static void main(String[] args) {
//        List<Map<String, Object>> mapList = new ArrayList<>();
//        Map<String, Object> map = new HashMap<>();
//        Person person1 = new Person("张三", 12);
//        Person person2 = new Person("李四", 21);
//        Person person3 = new Person("王五", 23);
    /*    map.put("map1", "值1");
        map.put("map2", "值2");
        map.put("map3", "值3");*/
//        map.put("map1", person1);
//        map.put("map2", person2);
//        map.put("map3", person3);
//        mapList.add(map);
       /* for (int i = 0; i < mapList.size(); i++) {
            System.out.println(mapList.get(i));
        }*/
//        System.out.println(person1.getName());
//        System.out.println(mapList.get(0).get("map2").toString());

//        int n =4;
//        System.out.println("4的阶乘："+index(n));

        Test test = new Test();
        System.out.println(test.add(3, 4));
    }
}
