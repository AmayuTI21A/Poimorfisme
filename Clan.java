abstract class ClanNinja{  
}
public class Clan {
   public static void main (String[] args) {
        Uchiha Uchiha = new Uchiha();
        Uchiha.AnggotaClan();
        Uzumaki Uzumaki = new Uzumaki();
        Uzumaki.AnggotaClan();
         System.out.println(JumNinja(1,7));
         System.out.println(JumNinja(10,20));
        
    }
     static float JumNinja(float a, float b) {
        if (a < b) {
            return a;
        }else{
            return b;
        }   
     }
    static int JumNinja(int a, int b) {   
        if (a < b){
            return a;
        }else {
            return b;
        }
    
    }
     
}
