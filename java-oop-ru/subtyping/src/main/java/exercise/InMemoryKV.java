package exercise;

import java.util.Map;
import java.util.HashMap;

public class InMemoryKV implements KeyValueStorage {
    private Map<String, String> map;

    public InMemoryKV(Map<String, String> map) {
        Map<String, String> tmp = new HashMap<>(map);
        this.map = tmp;
    }

    @Override
    public void set(String key, String value) {
        map.put(key, value);
    }

    @Override
    public void unset(String key) {
        map.remove(key);
    }

    @Override
    public String get(String key, String defaultValue) {
        return map.getOrDefault(key, defaultValue);
    }

    @Override
    public Map<String, String> toMap() {
        Map<String, String> tmp = new HashMap<>(map);
        return tmp;
    }
}
