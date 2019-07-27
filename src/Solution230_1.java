import java.io.*;
import java.util.*;

public class Solution230_1 {

    public static void main(String[] args) {
        // the following only works when the input for n isn't too big for an integer
        // it creates the actual fibonacci words sequence  
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

