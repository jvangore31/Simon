/** This class creates the queue data structure. This is used by Jacob Vangore
 * in the Maze Lab Project.  
 *  @author     Cathy Bareiss
 *  @id         cbareiss
 *  @course     CSIS 252:  Programming II
 *  @assignment Simon
 *  @related    BoundedQueueInterface
 */
public class ArrayBndQueue<T> implements BoundedQueueInterface<T> {
    public static final int DEFCAP = 100;
    protected T[] queue;
    protected int numElements;
    protected int front;
    protected int rear;
    
    
    public ArrayBndQueue() {
        queue = (T[]) new Object[DEFCAP];
        numElements = 0;
        rear = -1;
        front = 0;
    }
   /*Copy constructor added by Jacob Vangore*/
   public ArrayBndQueue(ArrayBndQueue in) {
        queue = (T[]) new Object[DEFCAP];
        for(int i = 0; i< in.queue.length; i++)
        {
          queue[i] = (T)in.queue[i];
        }
        numElements = in.numElements;
        rear = in.rear;
        front = in.front;
    }

    public ArrayBndQueue(int maxSize) {
        queue = (T[]) new Object[maxSize];
        numElements = 0;
        rear = -1;
        front = 0;
    }
    
    public boolean isEmpty () {
        return numElements == 0;
    }
    
    public boolean isFull() {
        return numElements == queue.length;
    }
    
    public void enqueue(T element) throws QueueOverflowException {
        if (isFull())
            throw new QueueOverflowException("Enqueue attempted on full queue");
        else {
            rear = (rear + 1) % queue.length;
            queue[rear] = element;            numElements++;
        }
    }
    
    /*returns the top element only. Added by Jacob Vangore*/
    public T getFront()
    {
      return queue[front];
    }
    public T dequeue() throws QueueUnderflowException {
        T toReturn;
        if (isEmpty())
            throw new QueueUnderflowException("Dequeue attempted on empty queue");
        else {
            toReturn = queue[front];
            queue[front] = null;
            front = (front + 1) % queue.length;
            numElements--;
   /*       toReturn = queue[0]
            for (int i=1; i <= rear; i++)
                queue[i-1]=queue[i];
            rear--;
            numElements--; -> for fixed front */
            return toReturn;
        }
    }
}
