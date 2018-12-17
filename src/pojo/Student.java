package pojo;

public class Student extends Object implements Cloneable{

    private String name;
    private Integer age;

    public Student() {
    }

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 本身返回的是 getClass().getName() + "@" +Integer.toHexString(hashCode());
     *
     * @return
     */
    /*@Override
    public String toString() {
//        return super.toString();
        return "[姓名： " + this.name + ",年龄: " + this.age + "]";
    }*/

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;

        Student student = (Student) o;

        if (!getName().equals(student.getName())) return false;
        return getAge().equals(student.getAge());
    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getAge().hashCode();
        return result;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object object = super.clone();
        return object;
    }

    /**
     * 如果不重写equals()方法的话，返回的是false,因为Objec类中equals()方法用的是“==”比较,"=="比较的是地址值
     * <p>
     * 因此，Object里的equals()方法比较的是对象的地址值无实际意义
     * (String类型之所以能进行内容的比较是因为String类中重写了equals()方法)
     *
     * @param obj
     * @return
     */
    /*@Override
    public boolean equals(Object obj) {
//        return super.equals(obj);
        if (this == obj) {
            return true;
        } else {
            if (obj instanceof Student) {
                Student student = (Student) obj;
                if (this.name.equals(student.name) && this.age == student.age) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
    }*/


    /*@Override
    public int hashCode() {
//        return super.hashCode();
        return this.name.hashCode()*this.age;
    }*/



    public static void main(String[] args) throws CloneNotSupportedException {
        /*Student student = new Student();
        student.setAge(12);
        student.setName("飞飞");
        Student student1 = new Student();
        student1.setAge(12);
        student1.setName("飞飞");
        System.out.println(student.toString());
        System.out.println(student.equals(student1));
        System.out.println(student.hashCode());
        System.out.println(student1.hashCode());*/

       /* 如何实现对象克隆
        1、实现Cloneable接口并重写Object类中的clone()方法；
        2、实现Serializable接口，通过对象的序列化和反序列化实现克隆，可以实现真正的深度克隆*/
        Student student = new Student();
        student.setAge(12);
        student.setName("飞飞");

        Student student2  = (Student) student.clone();
        System.out.println(student2.toString());
    }
}
