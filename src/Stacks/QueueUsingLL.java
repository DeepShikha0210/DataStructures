package Stacks;

public class QueueUsingLL<T> {

    private Node<T> front;
    private Node<T> rear;
    int size;

    public QueueUsingLL(){
        front = null;
        rear = null;
        size = 0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    T front() throws QueueEmptyException{
        if(size() == 0){
            throw new QueueEmptyException();
        }
        return front.data;
    }

    public void enqueue(T data){

        Node<T> temp = new Node<>(data);
        if(size() == 0){
            rear = temp;
            front= temp;

        }
        else {
            rear.next = temp;
            rear = temp;
        }
        size++;
    }

    public T dequeue() throws QueueEmptyException{

        if(size() == 0){
            throw new QueueEmptyException();
        }

        T dequeued = front.data;
        front = front.next;          // will itself get null when is zero
        size--;

        if(size() == 0){
            rear = null;

        }
        return dequeued;


    }


}
