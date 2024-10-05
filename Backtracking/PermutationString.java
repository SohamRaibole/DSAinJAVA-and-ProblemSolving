public class PermutationString {
    public static void Permutation(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);

            
        }
      for(int i=0;i<str.length();i++){  
       
            char curr= str.charAt(i);
        //new string is (0,1)it exclude 1;
        String newstr=str.substring(0, i)+str.substring(i+1);
        Permutation(newstr, ans+curr);}}
    
    public static void main(String[] args) {
        Permutation("ABC", "");
    }
}
