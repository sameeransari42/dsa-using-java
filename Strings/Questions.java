package Java_Concept.Strings;

public class Questions {
    public static void main(String[] args) {
        /*
        Check whether tha string is palindrome or not.
         */

        String str = "abcdcba";
        System.out.println(Palindrome(str));

    }
    static boolean Palindrome(String str){
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == str.charAt(str.length()-1-i)){
                i++;
            }else {
                return false;
            }
        }
        return true;
    }

}
