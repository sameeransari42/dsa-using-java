package HashMap;

import java.util.HashMap;

public class Hash {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Sameer", 19);
        map.put("Neelu", 20);
        map.put("Saaru", 25);

        System.out.println(map.get("Saaru"));
        System.out.println(map.getOrDefault("Sejal", 12));
    }
}
