import java.util.ArrayList;
public class MyStack<T>{
    private ArrayList myArrayList;

    public MyStack()
    {
        myArrayList = new ArrayList();
    }

    public boolean isEmpty() {
        return (myArrayList.size() == 0);
    }

    public int size()
    {
        return myArrayList.size();
    }

    public T pop()
    {
        return (T) myArrayList.remove(size()-1);
    }

    public T push(T item)
    {
        myArrayList.add(item);
        return item;
    }

    public T peek()
    {
         return (T) myArrayList.get(size()-1);
    }





}