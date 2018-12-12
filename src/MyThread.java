import pojo.Student;

/**
 * 　1） start：
 　　用start方法来启动线程，真正实现了多线程运行，这时无需等待run方法体代码执行完毕而
 直接继续执行下面的代码。通过调用Thread类的start()方法来启动一个线程，这时此线程处于
 就绪（可运行）状态，并没有运行，一旦得到cpu时间片，就开始执行run()方法，这里方法
 run()称为线程体，它包含了要执行的这个线程的内容，Run方法运行结束，此线程随即终止。

 2） run：
 　　run()方法只是类的一个普通方法而已，如果直接调用Run方法，程序中依然只有主线程这一个线程，
 其程序执行路径还是只有一条，还是要顺序执行，还是要等待run方法体执行完毕后才可继续执行下面的代码，
 这样就没有达到写线程的目的。

 总结：调用start方法方可启动线程，而run方法只是thread的一个普通方法调用，
 还是在主线程里执行。这两个方法应该都比较熟悉，把需要并行处理的代码放在run()方法中，start()方法启动
 线程将自动调用 run()方法，这是由jvm的内存机制规定的。并且run()方法必须是public访问权限，返回值类型为void.。
 */
public class MyThread implements Runnable{

    private String name;

    public MyThread() {
    }

    public MyThread(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            Student student = new Student();
          student.setName("学生"+(i+1));
          student.setAge((int) (Math.random() * 100));
//            System.out.println(this.name+"   学生姓名:"+student.getName()+"学生年龄:"+student.getAge());
            System.out.println(this.name+student.toString());
        }
    }
}
