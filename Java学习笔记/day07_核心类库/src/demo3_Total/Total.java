package demo3_Total;

public class Total {
    public static void main(String[] args) {
        String s = "ABCD123!@#$%ab";
        int a=0;
        int b=0;
        int c=0;
        int d=0;
        for (int i=0;i<s.length();i++){
            char e = s.charAt(i);
            if (e>=65 && e<=90) a++;
            else if (e>=48 && e<=57) b++;
            else if ((e>=33 && e<=47)||(e>=58 && e<=64)) c++;
            else if (e>=97 && e<=122) d++;
        }
        System.out.println("大写字母共有"+a+"个，数字共有"+b+"个，特殊字符共有"+c+"个，小写字母共有"+d+"个。");
    }
}
