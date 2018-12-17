/**
 * @ Author     ：xyf
 * @ Date       ：Created in 2018/12/17 0017下午 10:52
 * @ Description：Math常用的方法
 * @ Modified By：xyf
 * @Version:
 */
public class MathDemo {
    /**
     *Math.sqrt()//计算平方根,square root
     *Math.cbrt()//计算立方根,cube root
     *Math.pow(a, b)//计算a的b次方
     *Math.max( , );//计算最大值
     *Math.min( , );//计算最小值
     */
    public static void main(String[] args) {

        /*System.out.println(Math.sqrt(16));   //4.0
        System.out.println(Math.cbrt(8));   //2.0
        System.out.println(Math.pow(3,2));     //9.0
        System.out.println(Math.max(2.3,4.5));//4.5
        System.out.println(Math.min(2.3,4.5));//2.3*/

        /**
         * abs求绝对值
         */
        /*System.out.println(Math.abs(-10.4));    //10.4
        System.out.println(Math.abs(10.1));     //10.1*/

        /**
         * ceil天花板的意思，就是返回大的值
         */
        /*System.out.println(Math.ceil(-10.1));   //-10.0
        System.out.println(Math.ceil(10.7));    //11.0
        System.out.println(Math.ceil(-0.7));    //-0.0
        System.out.println(Math.ceil(0.0));     //0.0
        System.out.println(Math.ceil(-0.0));    //-0.0
        System.out.println(Math.ceil(-1.7));    //-1.0*/

        /**
         * floor地板的意思，就是返回小的值
         */
        /*System.out.println(Math.floor(-10.1));  //-11.0
        System.out.println(Math.floor(10.7));   //10.0
        System.out.println(Math.floor(-0.7));   //-1.0
        System.out.println(Math.floor(0.0));    //0.0
        System.out.println(Math.floor(-0.0));   //-0.0*/

        /**
         * random 取得一个大于或者等于0.0小于不等于1.0的随机数 0.0 =< x <1
         */
//        System.out.println(Math.random());  //小于1大于0的double类型的数
//        System.out.println(Math.random()*2);//大于0小于2的double类型的数
//        System.out.println(Math.random()*2+1);//大于1小于3的double类型的数

        /**
         * rint 四舍五入，返回double值
         * 返回最接近参数的整数，如果有2个数同样接近，则返回偶数的那个。
         * 它有两个特殊的情况：1）如果参数本身是整数，则返回本身。
         * 2）如果不是数字或无穷大或正负0，则结果为其本身。
         * 注意.5的时候会取偶数    异常的尴尬=。=
         */
//        System.out.println(Math.rint(10.1));    //10.0
//        System.out.println(Math.rint(10.7));    //11.0
//        System.out.println(Math.rint(11.5));    //12.0
//        System.out.println(Math.rint(10.5));    //10.0
//        System.out.println(Math.rint(10.51));   //11.0
//        System.out.println(Math.rint(-10.5));   //-10.0
//        System.out.println(Math.rint(-11.5));   //-12.0
//        System.out.println(Math.rint(-10.51));  //-11.0
//        System.out.println(Math.rint(-10.6));   //-11.0
//        System.out.println(Math.rint(-10.2));   //-10.0

        /**
         * round 四舍五入，round() 方法可把一个数字舍入为最接近的整数。
         * float时返回int值，double时返回long值
         */
//        System.out.println(Math.round(10.1));   //10
//        System.out.println(Math.round(10.7));   //11
//        System.out.println(Math.round(10.5));   //11
//        System.out.println(Math.round(10.51));  //11
//        System.out.println(Math.round(-10.5));  //-10
//        System.out.println(Math.round(-10.5f));  //-10
//        System.out.println(Math.round(-10.51)); //-11
//        System.out.println(Math.round(-10.6));  //-11
//        System.out.println(Math.round(-10.2));  //-10

    }
}
