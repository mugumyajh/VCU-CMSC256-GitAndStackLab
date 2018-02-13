import java.util.*;
public class ArrayBasedStack<T> implements StackInterface<T>{

  private T data[];
   private int topOfStack;
    private static final int INITIAL_CAPACITY = 10;
    private boolean initialized = true;
      @SuppressWarnings("unchecked")
  
  public ArrayBasedStack(int size) {
   
    topOfStack = -1;
    if (size < 0) {
    throw new IllegalArgumentException("Size cannot be less than zero");}
    else
   { data = (T[])new Object[size]; }// Create stackArray
  }
 public  ArrayBasedStack() 
 { this(INITIAL_CAPACITY); }

private void expandArray(){
data = Arrays.copyOf(data,2*data.length);
}
   /** Adds a new entry to the top of this stack.
       @param newEntry  An object to be added to the stack. */
   public void push(T newEntry){
   if (topOfStack >= data.length-1)
   {expandArray();}
   else
   {data[topOfStack++]= newEntry;}
   }
  
   /** Removes and returns this stack's top entry.
       @return  The object at the top of the stack. 
       @throws  EmptyStackException if the stack is empty before the operation. */
   public T pop()throws EmptyStackException{
  if (topOfStack== -1){
   throw new EmptyStackException();}
   else
  { return data[topOfStack];}
  }
  
   /** Retrieves this stack's top entry.
       @return  The object at the top of the stack.
       @throws  EmptyStackException if the stack is empty. */
   public T peek()throws EmptyStackException{
    if (topOfStack== -1){
   throw new EmptyStackException();}
    else
    {return data[topOfStack];}
     }
  
   /** Detects whether this stack is empty.
       @return  True if the stack is empty. */
   public boolean isEmpty(){
   if (topOfStack > 0)
   {return false;}
   else
   {return true;}
   }
  
   /** Removes all entries from this stack. */
   public void clear(){
 topOfStack = -1;
}
}