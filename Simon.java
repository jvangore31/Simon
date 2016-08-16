/** The class that contains all the components of the Simon game   
    @author     Jacob Vangore
    @id         jbvangore
    @course     CSIS 252: Programming II
    @assignment Simon
    @related    ArrayBndQueue
*/
import java.util.Random;
public class Simon{
    // MEMBER DATA, INSTANCE VARIABLES
    /*Stores main sequence*/
    ArrayBndQueue queue1;
    /*Stores secondary sequence*/
    ArrayBndQueue queue2;
    /*Stores third sequence*/
    ArrayBndQueue queue3;
    /*To create random char*/
    Random randomGenerator;
    
    /** Constructor */
    public Simon(){
    
        randomGenerator = new Random();
        queue1 = new ArrayBndQueue<Character>();
        queue2 = new ArrayBndQueue<Character>();
        queue3 = new ArrayBndQueue<Character>();
        queue1.enqueue(genNewStep());
         
    }
     
   /* Creates a random char */ 
    public char genNewStep(){
    
        int randomInt = randomGenerator.nextInt(4) + 1;
        
        if(randomInt == 4)
            return 'b';
        if(randomInt == 3)
            return 'r';
        if(randomInt == 2)
            return 'y';
        if(randomInt == 1)
            return 'w';
        return 'o';
    }
   
   /* Returns the current queue in string format */ 
   public String queueOut(){
        queue2 = new ArrayBndQueue(queue1);
        String out = "";
        while(!queue2.isEmpty())
        {
            out+=queue2.dequeue();
        }
        return "Go!: " +out;
   }
   
   /* Goes through one run throught the game 
   @param in takes in the user input to compare*/ 
   public String run(String in){
     boolean go; 
     go = true;
     
        queue3 = new ArrayBndQueue(queue1);
        
        
        for(int i=0; i< in.length(); i++)
        {
          if(in.charAt(i) != (char)queue3.getFront())
              return "Loser!";
          else
                queue3.dequeue(); 
        }
        
        queue1.enqueue(genNewStep());
            return "Nice!";    
     
    }
    
}