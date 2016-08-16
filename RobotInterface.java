/**This provides an interface for the for the queue data structure 
 *  @author     Cathy Bareiss
 *  @id         cbareiss
 *  @course     CSIS 252:  Programming II
 *  @assignment Simon
 *  @related    QueueInterface
 */
public interface RobotInterface {
    public int getButton();
    public void moveMotor(int motor) throws Exception ;
    public void displayString(String str) throws Exception ;
}