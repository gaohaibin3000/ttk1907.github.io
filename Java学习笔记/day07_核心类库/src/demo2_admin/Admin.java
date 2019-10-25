package demo2_admin;

import java.util.Scanner;

public class Admin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入账户和密码:");
        for (int i=0;i<5;i++){
            String s1 = s.next();
            String s2 = s.next();
            if (s1.equals("admin") && s2.equals("123456")){
                System.out.println("登陆成功！");
                break;
            }else {
                if (i==2){
                    System.out.println("用户名或密码输入错误！账户已冻结，请联系客服人员");
                    break;
                }
                System.out.println("用户名或密码输入错误！您还有"+(2-i)+"次机会！");
            }
        }
    }
}
