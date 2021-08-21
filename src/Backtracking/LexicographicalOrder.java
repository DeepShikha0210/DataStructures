package Backtracking;

import java.util.Collections;
import java.util.Vector;

public class LexicographicalOrder {

    public static void lexicographicalOrder(int num){

        Vector<String> s = new Vector<String>();

        for (int i = 1; i <= num; i++) {
            s.add(String.valueOf(i));
        }

        Collections.sort(s);
        Vector<Integer> ans = new Vector<Integer>();
        for (int i = 0; i < num; i++)
            ans.add(Integer.valueOf(s.get(i)));

        for (int i = 0; i < num; i++)
            System.out.println(ans.get(i));
    }
}
