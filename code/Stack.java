
import java.util.ArrayList;

public class Stack<T> implements IStack<T> {
    private ArrayList<T> data  = new ArrayList<T>();
    
    @Override
    public void push(T item) {
        data.add(item);
    }

    //regresa el valor de la cima y lo elimina del array.
    @Override
    public T pull() {
            return data.remove(data.size()-1);
    }

    //muestra el  valor de la cima .
    @Override
    public T peek() {
         return data.remove(data.size()-1);
    }

    //true si esta vacia.
    @Override
    public boolean empty() {
        return data.isEmpty();
    }

    //regresa el tamaño del stack.
    @Override
    public int size() {
       return data.size();
    }
    
}