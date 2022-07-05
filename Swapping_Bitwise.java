import java.lang.*;

public class Swapping_Bitwise {
      public static void main(String args[]) {
          int a=10, b=15;
          System.out.println("Before Swapping a= "+a+" b="+b);

          a=a^b;
          b=a^b;
          a=a^b;
          System.out.println("After Swapping a= "+a+" b="+b);
      }

}
