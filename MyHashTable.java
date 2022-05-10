public class MyHashTable <K, V>{
    private class HashNode <K, V> {
        private K key;
        private V value;
        private HashNode<K, V> next;

        public HashNode(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString()
        {
            return "{" + key + " " + value  + "}";
        }
    }

    private HashNode<K, V>[] chainArray;
    private int M = 11;
    private int size;

    public MyHashTable() {
        chainArray = new HashNode[M];
    }

    public MyHashTable(int M){
    this.M = M;
    chainArray = new HashNode[M];
    }

    private int hash(K key){

        return (key.hashCode() & 0x7fffffff) % M;
    }

    public void put(K key, V value) {
        int index = hash(key);
        HashNode <K, V> currentNode = new HashNode<>(key, value);
        if (chainArray[index] != null){
            currentNode.next = chainArray[index];
        }
        chainArray[index] = currentNode;
    }

    public V get(K key){
        int index = hash(key);
        HashNode<K, V> newNode = chainArray[index];
        while (newNode!= null)
        {
            if(newNode.key.equals(key)) return newNode.value;
            else newNode = newNode.next;
        }
        System.out.println("There's no such key in HashTable");
        return null;
    }

    private V remove(K key){

        return null;
    }

    public boolean contains(V value){
        HashNode<K, V> currentNode;
        for (int i=0; i<M; i++)
        {
            currentNode = chainArray[i];
            while (currentNode!=null)
            {
                if(currentNode.value.equals(value)) return true;
                else currentNode = currentNode.next;
            }
        }
        return false;
    }

    public K getKey(V value){
        HashNode<K, V> currentNode;
        for (int i=0; i<M; i++)
        {
            currentNode = chainArray[i];
            while (currentNode!=null)
            {
                if(currentNode.value.equals(value)) return currentNode.key;
                else currentNode = currentNode.next;
            }
        }
        System.out.println("There's no such key in HashTable");
        return null;
    }

}
