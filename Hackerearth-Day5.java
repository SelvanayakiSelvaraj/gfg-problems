1))Read from STDIN, Write to STDOUT


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         sc.nextLine();
         String s=sc.nextLine();
         System.out.println(n*2);
         System.out.println(s);
    }
}
********************************************************************************************************************************************


2)))Split houses


  import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
         
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        if (s.contains("HH")) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            s = s.replace('.', 'B');
            System.out.println(s);
        }
    }
}
    


