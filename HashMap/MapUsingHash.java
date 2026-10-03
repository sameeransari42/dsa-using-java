package HashMap;

public class MapUsingHash {
    private final Entity[] entities;

    public MapUsingHash() {
        entities = new Entity[100];
    }

    public void remove(String key) {
        int hash = Math.abs(key.hashCode() % entities.length);
        if (entities[hash] != null && entities[hash].key.equals(key)) {
            entities[hash]= null;
        } else {
            System.out.println("Key is not in HashMap");
        }
    }

    public String get(String key) {
        int hash = Math.abs(key.hashCode() % entities.length);
        if (entities[hash] != null && entities[hash].key.equals(key)) {
            return entities[hash].value;
        }
        return null;
    }

    public void put(String key, String value) {
        int hash = Math.abs(key.hashCode() % entities.length);
        entities[hash] = new Entity(key, value);
    }

    private static class Entity {
        String key;
        String value;

        public Entity(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    public static void main(String[] args) {
        HashMapOfLinkedList map = new HashMapOfLinkedList();

        map.put("Litchi", "A red small fruit");
        map.put("WaterMelon", "Summer Fruit");
        map.put("Cocunut", "Good for health");

        System.out.println(map);

    }
}
