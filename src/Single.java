public class Single <K,V> {
    private K value;
    private V value2;

    public Single(K value, V value2) {
        this.value = value;
        this.value2 = value2;
    }

    public K getValue() {
        return value;
    }
    public V getValue2(){
        return value2;
    }

    @Override
    public String toString() {
        return "Single{" +
                "value=" + value +
                '}';
    }
}

