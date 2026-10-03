package HashMap;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashMapOfLinkedList {
    ArrayList<LinkedList<Entity>> list;

    private int size = 0;
    private float loadFactor = 0.5f;

    public HashMapOfLinkedList() {
        list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new LinkedList<>());
        }
    }

    public void put(String key, String value) {
        int hash = Math.abs(key.hashCode() % list.size());

        LinkedList<Entity> entities = list.get(hash);

        for (Entity entity: entities) {
            if (entity.key.equals(key)) {
                entity.value = value;
                return;
            }
        }

        if ((float) (size) / list.size() > loadFactor) {
            reHash();
        }

        entities.add(new Entity(key, value));
        size++;
    }

    private void reHash() {
        System.out.println("We are now rehashing");
        ArrayList<LinkedList<Entity>> old = list;

        list = new ArrayList<>();

        for (int i = 0; i < old.size() * 2; i++) {
            list.add(new LinkedList<>());
        }

        for (LinkedList<Entity> entities : old) {
            for (Entity entity : entities) {
                put(entity.key, entity.value);
            }
        }
    }

    public String get(String key) {
        int hash = Math.abs(key.hashCode() % list.size());

        LinkedList<Entity> entities = list.get(hash);

        for (Entity entity : entities) {
            if (entity.key.equals(key)) {
                return entity.value;
            }
        }

        return null;
    }

    public void remove(String key) {
        int hash = Math.abs(key.hashCode() % list.size());

        LinkedList<Entity> entities = list.get(hash);

        Entity target = null;

        for (Entity entity : entities) {
            if (entity.key.equals(key)) {
                target = entity;
            }
        }

        entities.remove(target);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String s;
        sb.append("{");
        for (LinkedList<Entity> entities : list) {
            for (Entity entity : entities) {
                sb.append(entity.key);
                sb.append(" : ");
                sb.append(entity.value);
                sb.append(", ");
            }
        }
        sb.append("}");
        s = String.valueOf(sb);

        return s;
    }

    private class Entity {
        String key;
        String value;

        public Entity(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }
}
