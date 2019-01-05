import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName: RegularTest
 * @Description:  正则表达式的一些案例
 * @Author:      Administrator
 * @CreateDate: 2018/12/21 15:30
 * @UpdateUser:   Administrator
 * @Version:        1.0
 **/
public class RegularTest {
    public static void main(String[] args) {

        /*String content = "I am noob " +
                "from runoob.com.";
        //匹配的模式
        String pattern = ".*runoob.*";
//        判断是否和模式匹配
        boolean isMatch = Pattern.matches(pattern, content);
        System.out.println("字符串中是否包含了 'runoob' 子字符串? " + isMatch);*/

        // 按指定模式在字符串查找
        String line = "This order was placed for QT3000! OK?";
        String pattern = "(\\D*)(\\d+)(.*)";

        // 创建 Pattern 对象
        Pattern r = Pattern.compile(pattern);

        // 现在创建 matcher 对象
        Matcher m = r.matcher(line);

        if (m.find( )) {
            System.out.println("Found value: " + m.group(0) );
            System.out.println("Found value: " + m.group(1) );
            System.out.println("Found value: " + m.group(2) );
            System.out.println("Found value: " + m.group(3) );
        } else {
            System.out.println("NO MATCH");
        }
    }
}
