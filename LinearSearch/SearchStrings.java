package Java_Concept.LinearSearch;

public class SearchStrings {
    public static void main(String[] args) {
        String name = "Sameer Ansari";
        char search = 'd';
        System.out.println(search(name, search));

    }
    static boolean search(String str, char target) {
        if (str.isEmpty()){
            return false;
        }
//        for (int i = 0; i < str.length(); i++){
//            if (target == str.charAt(i)){
//                return true;
//            }
//        }
        // using for each loop: you need an array or something or collection
        for (char ch : str.toCharArray()){
            if (ch == target){
                return true;
            }
        }
        return false;
    }
}
