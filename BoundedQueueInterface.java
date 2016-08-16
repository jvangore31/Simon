/**This provides an interface for the BoundedQueueInterface for the queue 
 * data structure  
 *  @author     Cathy Bareiss
 *  @id         cbareiss
 *  @course     CSIS 252:  Programming II
 *  @assignment Simon
 *  @related    QueueInterface
 */
public interface BoundedQueueInterface<T> extends QueueInterface<T> {
    public boolean isFull();
    public void enqueue(T element) throws QueueOverflowException;
}