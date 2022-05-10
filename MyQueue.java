import java.util.ArrayList;
public class MyQueue<T>{
    private ArrayList<T> myArrayList;

    public MyQueue()
    {
        myArrayList = new ArrayList<>();
    }

    public boolean isEmpty() {
        return (myArrayList.size() == 0);
    }

    public int size()
    {
        return myArrayList.size();
    }

    public T dequeue()
    {
        return myArrayList.remove(0);
    }

    public T enqueue(T item)
    {
        myArrayList.add(item);
        return item;
    }

    public T peek()
    {
        return myArrayList.get(size()-1);
    }





}
