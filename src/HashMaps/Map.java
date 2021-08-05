package HashMaps;

import java.util.ArrayList;

public class Map<K, V> {

    ArrayList<MapNode<K,V>> buckets;          //Bucket Array which store the heads of the chained linked lists
    int size;                                 //Number of entries in map
    int numBuckets;                           //Number of buckets

    public Map(){
        numBuckets=20;                        //Taking a fixed size bucket array
        buckets = new ArrayList<>();
        for(int i = 0; i < 20; i++)
            buckets.add(null);
    }

    private int hashFunction(K key){      // Hash Function to obtain bucketIndex to place the key at.

        int hashCode = key.hashCode();    // Creates a hashCode
        return hashCode%numBuckets;       // Compresses the hashCode and in turn returns the bucket index to place the key at.

    }

    public int size(){
        return size;
    }

    public V remove(K key){
        int bucketIndex = hashFunction(key);   // Obtain the bucket index using hash Function
        MapNode<K,V> head = buckets.get(bucketIndex);
        MapNode<K,V> prev = null;
        while(head != null){                   //Traverse the linked list to find the key- value pair
            if(head.key.equals(key)) {
                size--;
                if(prev == null)
                    buckets.set(bucketIndex, head.next);
                else
                    prev.next= head.next;

                return head.value;
            }
            prev= head;
            head= head.next;

        }
        return null;
    }

    public V get(K key){                       // the 'GET' method of HashMap

        int bucketIndex = hashFunction(key);   // Obtain the bucket index using hash Function
        MapNode<K,V> head = buckets.get(bucketIndex);
        while(head != null){                   //Traverse the linked list to find the key- value pair
            if(head.key.equals(key))
                return head.value;
            head= head.next;
        }
        return null;
    }

    public void put(K key, V value){      // the 'PUT' method of HashMap

        int bucketIndex = hashFunction(key);   // Obtain the bucket index using hash Function
        MapNode<K,V> head = buckets.get(bucketIndex);
        while(head != null){
            if(head.key.equals(key)) {      // If the particular key already exists
                head.value = value;        // Update its value
                return;
            }
            head= head.next;
        }                                 // Reaches end of the Linked List and yet did not find the key.

        head = buckets.get(bucketIndex);
        MapNode<K, V> newNode = new MapNode<K, V>(key, value);
        size++;
        newNode.next = head;             // Replace the head with the new key-value node.
        buckets.set(bucketIndex, newNode);  //Place in the bucket array

        double loadFactor= (1.0*size)/numBuckets;
        if(loadFactor > 0.7)
            rehash();
    }

    private void rehash(){
        ArrayList<MapNode<K,V>> temp = buckets;
        buckets = new ArrayList<>();
        for(int i = 0; i < 2*numBuckets; i++)
            buckets.add(null);
        size=0;
        numBuckets*=2;

        for(int i =0; i < temp.size(); i++){

            MapNode<K, V> head = temp.get(i);
            while(head != null){
                K key = head.key;
                V value= head.value;
                put(key,value);
                head=head.next;
            }
        }
    }

    public double LoadFactor(){
        return (1.0*size)/numBuckets;
    }
    
}
