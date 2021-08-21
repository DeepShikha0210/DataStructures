package OOP1;

public class Pair<T, V> { // both pair values can be of same type or different type

    private T first;
    private V second;

    Pair(T first, V second){
        this.first = first;
        this.second = second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(V second) {
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }
}
