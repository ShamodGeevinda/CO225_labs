


public class GameModel {

    public static int NumberOfClick;
    public String userSymbol;
    
    public GameModel() {
        NumberOfClick = 0;
    }

    public void setChoice() {
        if (NumberOfClick % 2 == 0 ) {
            userSymbol = "X";  	
        }  
        else 
            userSymbol = "O"; 
        }

   public void ClickEvent() 
   { NumberOfClick++; }
    
    
    

}

