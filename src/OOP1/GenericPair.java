package OOP1;

public class GenericPair<T> { // both pair values should be of same type

    private T first;
    private T second;

    GenericPair(T first, T second){
        this.first= first;
        this.second= second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(T second) {
        this.second = second;
    }
}
