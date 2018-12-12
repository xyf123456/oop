import java.util.Collection;
import java.util.Set;

public class Student extends Object{

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
    @Override
    public String toString() {
//        return super.toString();
        return "[姓名： " + this.name + ",年龄: " + this.age + "]";
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
    @Override
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
    }

    @Override
    public int hashCode() {
//        return super.hashCode();
        return this.name.hashCode()*this.age;
    }


}
