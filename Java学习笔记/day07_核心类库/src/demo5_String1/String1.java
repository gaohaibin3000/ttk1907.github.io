package demo5_String1;

public class String1 {


    public static void main(String[] args) {
        StringBuilder str1 = new StringBuilder("ABCD");
        for (int i=1;i<=5;i+=2) {
            str1.insert(i, ",");
        }
        System.out.println(str1);
    }

}

/*
A B C D
0 1 2 3
1

A , B C D
0 1 2 3 4
3

A , B , C D
0 1 2 3 4 5
5

A , B , C , D
0 1 2 3 4 5 6

 */




