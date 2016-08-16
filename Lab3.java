/** The class that contains the main method used to run the program    
    @author     Jacob Vangore
    @id         jbvangore
    @course     CSIS 252: Programming II
    @assignment Simon
    @related    Simon, RobotCommandLine
*/
import java.io.*;
public class Lab3{
    /* The main method used to run the program */ 
    public static void main(String[] args){
        
        RobotCommandLine myRobot;
        Simon mySimon;
        boolean go;
        
        try{
            myRobot = new RobotCommandLine(args);}
        catch(IOException e)
        {
            System.err.println("Error(s) with file(s) or input "+e.toString());
                return;
        }
        mySimon = new Simon();
        go = true;
        String in = "";
        String out= ""; 
        while(go)
        {  
            try{
                myRobot.displayString(mySimon.queueOut());  
                in = myRobot.getLine();}
            catch(Exception e)
            {
                System.err.println("Error(s) with file(s) "+e.toString());
                    return;
            }

         out = mySimon.run(in);
         if(out.equals("Loser!"))
            go = false;       
        }
        try{
            myRobot.displayString(out);}
        catch(Exception e)
        {
            System.err.println("Error(s) with file(s) "+e.toString());
                 return;

        }
    }
}