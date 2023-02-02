
public interface IStack<T> 
{
   public void push(T item);
   
   public T pull();
   
   public T peek();

   public boolean empty();
   
   public int size();

}