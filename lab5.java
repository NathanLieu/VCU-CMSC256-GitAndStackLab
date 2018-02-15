                              import java.util.Arrays;
                              class lab5<T> implements StackInterface<T>
                              {
                             private T data[];         // Array holding stack
                             private static final int INITIAL_CAPACITY = 5;
                             private int topOfStack;           // Maximum size of stack
                             private boolean initialized=true;
                             private int maxsize;            
                             
                             public lab5(int size)
                             {
                             if(size<0)
                             {
                             throw new IllegalArgumentException("arguemnt is not greater than 0");
                             }
                             else if(size==0)
                             {
                             topOfStack=-1;
                             }
                             else
                             {
                             maxsize=size;
                             data = (T[])new Object[size];    
                             }
                            }
                            
                            public void expandArray()
                            {
                             data = Arrays.copyOf(data, topOfStack*2);
                            }
                              
                                 /** Adds a new entry to the top of this stack.
                                     @param newEntry  An object to be added to the stack. */
                                 public void push(T newEntry)
                                 {
                                 if (topOfStack < maxsize) 
                                 {
                                 data[topOfStack++] = newEntry;
                                 
                                 }
                                 else
                                 {
                                 expandArray();
                                 data[topOfStack++] = newEntry;
            
                                 }
                                 }
                                                   
                                
                                 /** Removes and returns this stack's top entry.
                                     @return  The object at the top of the stack. 
                                     @throws  EmptyStackException if the stack is empty before the operation. */
                                 public T pop()
                                 {
                                 if (topOfStack == 0) 
                                 {
                                 return null;
                                 }
                                 else
                                 {
                                 return data[--topOfStack];
                                 }
                                 }
                                
                                 /** Retrieves this stack's top entry.
                                     @return  The object at the top of the stack.
                                     @throws  EmptyStackException if the stack is empty. */
                                 public T peek()
                                 {
                                 if(topOfStack==0)
                                 {
                                 return null;
                                 }
                                 else 
                                 {
                                 return data[topOfStack-1];
                                 }
                                 }
                                
                                 /** Detects whether this stack is empty.
                                     @return  True if the stack is empty. */
                                 public boolean isEmpty()
                                 {
                                 if(topOfStack<0)
                                 {
                                 return true;// exception                                 
                                 }
                                 else 
                                 {
                                 return false;
                                 }
                                 }
                                
                                 /** Removes all entries from this stack. */
                                 public void clear()
                                 {
                                 topOfStack=0;
                                 }
                              
                              
                              }