package Recursion;

import java.util.ArrayList;

public class StringRecursion {
    public static void main(String[] args) {
        String name = "abc";
//        filter("", name);

//        System.out.println(skip(name));
//        System.out.println(skipString(name));
//        sbuset("", name);
//        System.out.println(subSeq("", name));

        permutations("", name);

    }// Find the Permutation?
    static void permutations(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i);
            permutations(f + ch + s, up.substring(1));
        }
    }


    // Find the subset of the string.
    public static void subset(String p, String up){
        if (up.isEmpty()){
            System.out.print(p + "  ");
                return ;
        }

        char ch = up.charAt(0);

        subset(p+ch, up.substring(1));
        subset(p, up.substring(1));
    }
    // Return an Array in ArrayList
    public static ArrayList<String> list = new ArrayList<>();
    public static ArrayList subSeq(String p, String str){
        if (str.isEmpty()){
            list.add(p);
        }

        char ch = str.charAt(0);

        subSeq(p+ch, str.substring(1));
        subSeq(p, str.substring(1));
        return list;
    }

    // Check a parcticular String
    public static String skipString(String str){
        if (str.isEmpty()){
            return "";
        }

        char ch = str.charAt(0);

        if (str.startsWith("app")){
            return skipString(str.substring(3));
        }else {
            return ch + skipString(str.substring(1));
        }
    }

    // Second Method
    public static String skip(String str){
        if (str.isEmpty()){
            return "";
        }
        char ch = str.charAt(0);

        if (ch == 'a'){
            return skip(str.substring(1));
        }else {
            return ch + skip(str.substring(1));
        }
    }
    // First Method
    public static void filter(String ans, String str){
        if (str.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        if (ch == 'a'){
            filter(ans, str.substring(1));
        }else {
            filter(ans+ch, str.substring(1));
        }
    }
}
