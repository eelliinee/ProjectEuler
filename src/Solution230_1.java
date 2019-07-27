import java.io.*;
import java.util.*;

public class Solution230_1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int q;
        String a;
        String b;
        int n;
        List<String> fab = new ArrayList<String>();
        char dab;
        Scanner scan = new Scanner(System.in);
        q = scan.nextInt();
        while (q>0) {
            fab.clear();
            scan.nextLine();
            a = scan.next();
            b = scan.next();
            n = scan.nextInt();

            // Fab sequence
            fab.add(a);
            fab.add(b);
            while (fab.get(fab.size()-1).length() < n) {
                fab.add(fab.get(fab.size()-2)+ fab.get(fab.size()-1));
            }
            q--;
            System.out.println(fab);
            dab = fab.get(fab.size()-1).charAt(n-1);
            System.out.println(dab);
        }
    }
}

