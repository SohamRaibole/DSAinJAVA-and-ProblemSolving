

public class GettteandSetter {
    public static void main(String[] args) {
        Getter g1=new Getter();
        g1.setcolor("black");
        System.out.println(g1.getcolour());
        g1.settip(5);
        System.out.println(g1.gettip());
    }
    
}

 class  Getter {
    private String color;
    private int tip;

    String getcolour(){
      return  this.color=color;
    }
   int gettip(){
   return this.tip=tip;

   }
   void setcolor(String newcolor){
    color=newcolor;
   }
  void settip(int tip){
    this.tip=tip;
  }
    
}