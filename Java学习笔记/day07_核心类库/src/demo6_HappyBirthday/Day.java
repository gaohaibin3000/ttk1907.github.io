package demo6_HappyBirthday;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Day {

    public static void main(String[] args) throws ParseException {
        System.out.println("请按照yyyy年xx月mm日的格式输入生日信息：");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date d1 = sdf.parse(s1);
        long i = d1.getTime();
        long d2 = (i/3600000+8)/24;
        System.out.println("您出生的日子距离1970年已经过去"+d2+"天啦");

    }

}
