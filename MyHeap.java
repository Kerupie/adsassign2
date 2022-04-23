import java.util.ArrayList;
public class MyHeap<T> {
private ArrayList<T> Heap;
    public MyHeap(){
        Heap = new ArrayList<>();
    }

    public boolean isEmpty() {

        return (Heap.size() == 0);
    }

    public int size() {

        return Heap.size();
    }

    private int parent(int position) {
        return (position - 1) / 2;
    }

    private int leftChild(int position) {
        return (2 * position) + 1;
    }

    private int rightChild(int position) {
        return (2 * position) + 2;
    }

}
