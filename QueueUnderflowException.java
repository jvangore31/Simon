/**This provides an class for the for the queue 
 * data structure that handles exceptions in case of underflows  
 *  @author     Cathy Bareiss
 *  @id         cbareiss
 *  @course     CSIS 252:  Programming II
 *  @assignment Simon
 *  @related    QueueInterface
 */
public class QueueUnderflowException extends RuntimeException {
    public QueueUnderflowException() {
        super();
    }
    public QueueUnderflowException(String message) {
        super(message);
    }
}