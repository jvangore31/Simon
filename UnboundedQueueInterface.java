/**This provides an interface for the queue data structure
 * This is for unboundedQueues
 *  @author     Cathy Bareiss
 *  @id         cbareiss
 *  @course     CSIS 252:  Programming II
 *  @assignment Simon
 *  @related    QueueInterface
 */
public interface UnboundedQueueInterface<T> extends QueueInterface<T> {
    public void enqueue(T element);
}