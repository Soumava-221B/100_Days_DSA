//Roots_equation 

// Find the roots of the quadratic equation

// Initial Template for Java

import java.io.*;
import java.util.*;

class Roots_equation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int a, b, c;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            Solution obj = new Solution();
            ArrayList<Integer> ans = obj.quadraticRoots(a, b, c);
            if (ans.size() == 1 && ans.get(0) == -1)
                System.out.print("Imaginary");
            else
                for (Integer val : ans)
                    System.out.print(val + " ");
            System.out.println();
        }
    }
}// } Driver Code Ends

// User function Template for Java

class Solution {
    public ArrayList<Integer> quadraticRoots(int a, int b, int c) {

        ArrayList<Integer> r = new ArrayList<>();

        double det = b * b - 4 * a * c;
        if (det < 0)
            r.add(-1);
        else {
            double dR = Math.sqrt(det);
            double r1 = (-b + dR) / (2 * a);
            double r2 = (-b - dR) / (2 * a);
            r.add((int) Math.floor(Math.max(r1, r2)));
            r.add((int) Math.floor(Math.min(r1, r2)));
        }
        return r;
    }
}