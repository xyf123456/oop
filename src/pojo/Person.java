package pojo;/*
 * java 使用反射实例化一个类对象
 * Java有着一个非常突出的动态相关机制：Reflection，用在Java身上指的是我们可以于运行时加载、探知、使用编译期间完全未知的classes。
 * 换句话说，Java程序可以加载一个运行时才得知名称的class，获悉其完整构造（但不包括methods定义），并生成其对象实体、或对其fields设值、
 * 或唤起其methods。
 *     JAVA反射机制是在运行状态中，对于任意一个类，都能够知道这个类的所有属性和方法；
 *     对于任意一个对象，都能够调用它的任意一个方法；这种动态获取的以及动态调用对象的方法的
 *     功能称为Java的反射机制。
 * 第一种方式：创建类类对象，调用类类对象的newInatance方法获取要实例化的类的对象，然后调用对象的setter方法设置属性。
 * 第二种方式：使用类类对象的getConatructor方法构造Constructor类对象，然后用构造器类对象调用newIntance方法创建要实例化的类F对象。
 *
 *
 *  逆向代码 ，例如反编译
    与注解相结合的框架 例如Retrofit
    单纯的反射机制应用框架 例如EventBus 2.x
    动态生成类框架 例如Gson
    为什么需要序列化:（第一个是便于存储，第二个是便于传输。）
    1、存储对象在存储介质中，以便在下次使用的时候，可以很快捷的重建一个副本；
    2、便于数据传输，尤其是在远程调用的时候！
 */

import java.io.Serializable;

public class Person implements Serializable{

    private static final long serialVersionUID = -535241601732658375L;
    private String name;
    private int age;

    public Person() {
        super();
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
