/**This provides an interface for the queue 
 * data structure  
 *  @author     Cathy Bareiss
 *  @id         cbareiss
 *  @course     CSIS 252:  Programming II
 *  @assignment Simon
 *  @related    QueueInterface
 */
public interface QueueInterface<T>{
    public boolean isEmpty();
    public T dequeue() throws QueueUnderflowException;
}