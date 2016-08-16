/**This provides an class for the for the queue 
 * data structure that handles exceptions in case of overflows  
 *  @author     Cathy Bareiss
 *  @id         cbareiss
 *  @course     CSIS 252:  Programming II
 *  @assignment Simon
 *  @related    QueueInterface
 */
 public class QueueOverflowException extends RuntimeException {
    public QueueOverflowException() {
        super();
    }
    public QueueOverflowException(String message) {
        super(message);
    }
}