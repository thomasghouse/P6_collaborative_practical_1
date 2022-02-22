package mvcexample;
import java.util.*;  

public class Model extends Observable {

    private int dataBaseA = 0;     // A two component database
    private int dataBaseB = 0;
  
    public Model() { }             
  
    public void modifyA() {        //mutator method for A component
        
        dataBaseA++;
        setChanged();
        notifyObservers();         // Note: notifies ALL Observing views
        
    } // modifyA
  
    public int getDataA() {
        
        return dataBaseA;
        
    } // getDataA
 
    public void modifyB() {        // Mutator method for A component
        
        dataBaseB++;
        setChanged();
        notifyObservers();         // Note: notifies ALL Observing views
        
    }
    
    public int getDataB() {
        
        return dataBaseB;
        
    } // getDataB
}
