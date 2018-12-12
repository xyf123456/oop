import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, IOException, ClassNotFoundException {
//        System.out.println("Hello World!");

//        Student student1 = new Student("张三",23);
//        Student student2 = new Student("张三",23);
//        Student student1 = new Student(null,null);
//        Student student2 = new Student(null,null);
//        System.out.println(student1.toString());
//        System.out.println(student2.toString());
//        System.out.println(student1.equals(student2));
//        System.out.println("student1哈希值:"+student1.hashCode());
//        System.out.println("student2哈希值:"+student2.hashCode());
//        开启线程
       /* MyThread thread1 = new MyThread("学生线程：");
        thread1.run();*/
//        run和start
       Thread thread1 = new Thread(new MyThread("线程A"));
       Thread thread2 = new Thread(new MyThread("线程B"));
//       thread1.run();
//       thread2.run();
//       thread1.start();
//       thread2.start();

       /* Student student1 = new Student("张三", 12);
        Student student2 = new Student("李四", 13);
        Student student3 = new Student("王五", 14);
        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        String currDate = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒").format(new Date());
//        将学生信息也存入文件中，文件路径和名称也为“c:\test\final.txt”
        File file = new File("c:\\test\\final.txt");
        if (!file.exists() && file.isDirectory()) {
            System.out.println("文件夹路径不存在，创建路径c:\\test\\final.txt");
            file.mkdirs();
            file.createNewFile();
        }
        //写入内容I/O）（字节流：InputStream/OutputStream;）
        //字符流：Reader/Writer;
//        输入流：InputStream/Reader
//        输出流：OutputStream/Writer
        Writer out = new FileWriter(file);
        out.write(currDate);
        //缓冲字符输出流
        BufferedWriter bw = new BufferedWriter(out);
        for (Student stu : studentList) {
            bw.write(stu.toString());
            bw.newLine();//开启新的一行
            bw.flush();//刷新缓存
        }
        bw.close();
        System.out.println("写入完成");*/

        /*Student student1 = new Student("张三", 12);
        Student student2 = new Student("李四", 13);
        Student student3 = new Student("王五", 14);
        Map<String,Student> map = new HashMap<String,Student>();
        map.put(student1.getName(),student1);
        map.put(student2.getName(),student2);
        map.put(student3.getName(),student3);
        Properties properties = new Properties();
//        properties.put(student1.getName(),student1);
//        properties.put(student2.getName(),student2);
//        properties.put(student3.getName(),student3);
       properties.setProperty(student1.getName(),"zhangsan");
       properties.setProperty(student2.getName(),"lisi");
       properties.setProperty(student3.getName(),"wangwu");
//                将学生信息也存入文件中，文件路径和名称也为“c:\test\fina2.properties”
        File file = new File("c:\\test\\fina2.properties");
        if (!file.exists() && file.isDirectory()) {
            System.out.println("文件夹路径不存在，创建路径c:\\test\\fina2.properties");
            file.mkdirs();
            file.createNewFile();
        }
        FileOutputStream fos=new FileOutputStream(file);
        properties.store(fos,"Student Info");
        System.out.println("写入完成");

        FileInputStream fis=new FileInputStream(file);
        properties.load(fis);
        //打印到控制台
        properties.list(System.out);*/

//        Person的实例化对象
        Person person = new Person();
        // TODO Auto-generated method stub
//        Person这个类也是一个实例对象，是Class类的实例对象
        //任何一个类都是Class实例对象
        // 获取Class类对象（三种方式）
        Class<Person> cls1 = Person.class;
//        第二种方式，已知该类的对象，通过getClass()调用
        Class cls2 = person.getClass();
//        System.out.println(cls1==cls2);
//                第三种方式，（动态加载类，请大家区分编译和运行，编译时刻加载类是静态加载类，
// 运行的加载的动态加载类）
        Class cls3 = null;
        cls3 = Class.forName("Person");
//                System.out.println(cls1==cls3);
//        我们完全可以通过类的类类型创建该类的对象实例，即通过cls1/cls2/cls3来创建
        // 调用newInstance方法创建Person类对象,再通过setter和getter进行赋值
        Person p1 = cls1.newInstance();
        Person p2 = (Person) cls2.newInstance();
        Person p3 = (Person) cls3.newInstance();
        p1.setAge(23);
        p1.setName("实例化对象1");
        System.out.println(p1);
        p2.setAge(24);
        p2.setName("实例化对象2");
        System.out.println(p2);
        p3.setAge(25);
        p3.setName("实例化对象3");
        System.out.println(p3);

        // 使用构造器类创建Person类对象
        Constructor<Person> con1 = cls1.getConstructor(String.class, int.class);
        Constructor<Person> con2 = cls2.getConstructor(String.class, int.class);
        Constructor<Person> con3 = cls3.getConstructor(String.class, int.class);
        Person person1 = con1.newInstance("实例化对象1", 31);
        Person person2 = con2.newInstance("实例化对象2", 32);
        Person person3 = con3.newInstance("实例化对象3", 33);
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
    }
}
