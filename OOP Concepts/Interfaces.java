public class Interfaces {
   public static void main(String[] args) {
    queen q = new queen();
    q.moves();
    System.out.println();

    bear b = new bear();
    b.carn();;
    b.herb();

    
   }
    
}
interface chessplayer{
    void moves();
}

class queen implements chessplayer{
    public void moves(){
        System.out.println("moves in all directions");
    }

    
}

class king implements chessplayer{
    public void moves(){
        System.out.println("moves in diagonal");
    }
}

// example of multiple inheritance
interface herbivore{
    void herb();
}

interface carnivore{
    void carn();
}

class bear implements herbivore,carnivore{
    public void herb(){
        System.out.println(" it is herbivore ");
    }
    public void carn(){
        System.out.println(" it is carnivore ");
        
    }

}