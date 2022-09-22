public class Word<K, V> {
    private K key;
    private V value;

    public Word(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public boolean isKeyEquals(K anotherKey){
        return (this.key.equals(anotherKey));
    }
}
