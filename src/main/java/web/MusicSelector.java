
package web;

/**
 *
 * @author adam.hraban
 */
public class MusicSelector {
    

    // arrays holding music references
    String[] stoner = {"https://www.youtube.com/watch?v=hgsDGaEJeJM","https://www.youtube.com/watch?v=WujUI2DPDQk&t=" ,"https://www.youtube.com/watch?v=gKqWV2cmH3Y","https://www.youtube.com/watch?v=VHsLQ3Dzb_k"};
    String[] jazz = {"https://www.youtube.com/watch?v=6L5y3yXNbeA","https://www.youtube.com/watch?v=bAe8z6Jgwso","https://www.youtube.com/watch?v=K6s7Et1X0C4&t=","https://www.youtube.com/watch?v=jhicDUgXyNg"};
    String[] chill = {"https://www.youtube.com/watch?v=JATZS5_Qi80","https://www.youtube.com/watch?v=Z57u28MSQSA","https://www.youtube.com/watch?v=05Jv5p9lI9s","https://www.youtube.com/watch?v=JQhM-f69WAg"};
    String[] rock = {"https://www.youtube.com/watch?v=HuiCebFD23I","https://www.youtube.com/watch?v=Q20yMvPEJns&list=OLAK5uy_nDzPnIACcyQr3naeBKVGoE-gtDLpCnh4I","https://www.youtube.com/watch?v=IQPjxFDDGcg","https://www.youtube.com/watch?v=M0ZO5w29lQg"};
    
    //constructor
    MusicSelector()
    {
    }
    
    // method - randomly selects music from arrays for user-defined genre 
    public String musicSelection(String input)
    {   
        int index;
        index = (int) (Math.random()*4);
        switch (input)
            {
            case "stoner":
                return stoner[index];
            
            case "jazz":
                return jazz[index];
            
            case "chill":
                return chill[index];
            
            case "rock":
                return rock[index];
            
            }
        return "Error";
    }
    
    
    
}
