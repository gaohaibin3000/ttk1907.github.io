package demo2_DieDai;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DieDai {
    public static void main(String[] args) {
        Set<String> s1 = new HashSet<String>();
        s1.add("one");
        s1.add("two");
        s1.add("three");

        StringBuilder sb1 = new StringBuilder();
        Iterator<String> it = s1.iterator();

        sb1.append("集合中的元素有：[");
        while(it.hasNext())sb1.append(it.next()).append(",").append(" ");
        sb1.delete(sb1.length()-2,sb1.length()).append("]");
        System.out.println(sb1);

        it = s1.iterator();
        while(it.hasNext()){
            if (it.next().equals("two")) it.remove();
        }
        System.out.println(s1);

        for (String s:s1) System.out.println(s1);
        int[] arr = {11,22,33,44,55};
        for (int i:arr) System.out.println(i);
    }
}
