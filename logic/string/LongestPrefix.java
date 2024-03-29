package logic.string;      //  SUBMITTED  14.  LEETCODE

import java.util.List;

public class LongestPrefix {


    public static void main(String[] args) {
        String[] strs = new String[2];
        strs = List.of("flower", "flow", "flw").toArray(new String[0]);

        System.out.println(LongestPrefix.prefix(strs));



}

    public  static String prefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];


        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);


                if (prefix.isEmpty()) return "";
            }

        return prefix;
    }
}
