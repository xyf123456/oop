import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName: RegularTest
 * @Description: 正则表达式的一些案例
 * 正则表达式(regular expression)描述了一种字符串匹配的模式（pattern），
 * 可以用来检查一个串是否含有某种子串、将匹配的子串替换或者从某个串中取
 * 出符合某个条件的子串等。
 * 正则表达式使用单个字符串来描述、匹配一系列匹配某个句法规则的字符串。
 * 正则表达式是繁琐的，但它是强大的，学会之后的应用会让你除了提高效率外，
 * 会给你带来绝对的成就感。只要认真阅读本教程，加上应用的时候进行一定的
 * 参考，掌握正则表达式不是问题。
 * @Author: Administrator
 * @CreateDate: 2018/12/21 15:30
 * @UpdateUser: Administrator
 * @Version: 1.0
 **/
public class RegularTest {
    public static void main(String[] args) {
/*+-------------------------------- 实例从字符串 str 中找出数字------------------------+*/
        /*String str = "abc123def";//字符串
        String regEx = "[^0-9]";//匹配规则
//        Pattern类的作用在于编译正则表达式后创建一个匹配模式，由于Pattern的构造函数是私有的,
// 不可以直接创建,所以通过静态方法compile(String regex)方法来创建,将给定的正则表达式编译并赋
// 予给Pattern类
        Pattern p = Pattern.compile(regEx);//通过匹配规则设置模式
//        Matcher类使用Pattern实例提供的模式信息对正则表达式进行匹配
        Matcher m = p.matcher(str);//设置
//        方法使用给定的参数 replacement 替换字符串所有匹配给定的正则表达式的子字符串
        System.out.println("从字符串中提取来了的数字：  "+m.replaceAll("").trim());*/
/*+-------------------------------- 实例从字符串 str 中找出数字，并得到每一个数字------------------------+*/
        /*String a="love23next234csdn3423javaeye";
        List<String> digitList = new ArrayList<String>();
        Pattern p = Pattern.compile("[^0-9]");
        Matcher m = p.matcher(a);
        String result = m.replaceAll("");
//        System.out.println(result);
        for (int i = 0; i < result.length(); i++) {
            System.out.println(digitList.add(result.substring(i,i+1)));
        }
        System.out.println(digitList);*/
/*+-------------------------------- 判断是否包含了某写字符串------------------------+*/
        /*String content = "I am noob from runoob.com.";
        //匹配的模式
        String pattern = ".*runoob.*";
//        判断是否和模式匹配
        boolean isMatch = Pattern.matches(pattern, content);
        System.out.println("字符串中是否包含了 'runoob' 子字符串? " + isMatch);*/
/*+-------------------------------- 从字符串中找到指定的字符串------------------------+*/
        /*String str = "123def";//字符串
        String regEx = "[^[0-9]*+def$]";//匹配规则
        Pattern p = Pattern.compile(regEx);//通过匹配规则设置模式
        Matcher m = p.matcher(str);
        System.out.println("是否能从字符中找到匹配模式:   "+m.find());//是否能从字符中找到匹配模式
        System.out.println(m.toString());//打印出匹配的模式
        System.out.println(m.replaceAll("").length());*/
/*+-------------------------------- 从字符串中找到指定的字符串------------------------+*/
        /*// 按指定模式在字符串查找
        String line = "This order was placed for QT3000! OK?";
        String pattern = "(\\D*)(\\d+)(.*)";//
        // 创建 Pattern 对象
        Pattern r = Pattern.compile(pattern);
        // 现在创建 matcher 对象
        Matcher m = r.matcher(line);
        if (m.find()) {
            System.out.println("Found value: " + m.group(0));
            System.out.println("Found value: " + m.group(1));
            System.out.println("Found value: " + m.group(2));
            System.out.println("Found value: " + m.group(3));
        } else {
            System.out.println("NO MATCH");
        }*/
    }
}
