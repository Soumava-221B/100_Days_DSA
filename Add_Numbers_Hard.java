//Add_Numbers_Hard 
import java.util.*;

class Add_Numbers_Hard {

    static int add(int a, int b) {
        for (int i = 1; i <= b; i++)
            a++;
        return a;
    }

    public static void main(String[] args) {
        int a = add(10, 32);
        System.out.print(a);
    }
}