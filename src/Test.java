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

        /*Test test = new Test();
        System.out.println(test.add(3, 4));*/

        /*float f =1f;
        f = f+0.1;//float和double不能直接转化
        f = f+0.1f;//float和double不能直接转化
        f = f+11.1;//float和double不能直接转化*/

        /*Java常量池；产生的这种"常量"就会被放到常量池，常量池是JVM的一块特殊的内存空间。
        有一个规范叫JSL（Java Language Specification，java语言规范）
        对Integer的缓冲做了约束，规定其范围为：（-128-127）之间,
        Byte,Short,Integer,Long,Character这5种整型的包装类也只是在对应值小于
        等于127时才可使用对象池。超过了就要申请空间创建对象了
        也就是说在范围内容，地址和内容均相同，超出范围则储存的地址发生变化*/
        /*Integer i1=100,i2 = 100,i3 = -150,i4=-150;
        System.out.println(i1==i2);
        System.out.println(i3==i4);*/


    }
}
