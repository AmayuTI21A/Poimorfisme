abstract class Ninja{  
    protected void NamaClan() {
        System.out.println("_____________________");
    }
}
public class PolimorfismeAnggaTI21A {
    public static void main (String[] args) {
        System.out.println("Nilai Ujian Ninja");
        System.out.println(NilaiUjianNinja(true,false));//untuk mengatur lulus atau tidak jika "true,false"maka akan lulus jika false,true maka tidak lulus
        System.out.println(NilaiUjianNinja(100,50));// untuk mengatur hasil nilai ujian ninja
        Ninja Uzumaki = new Uzumaki();
        Uzumaki.NamaClan();
        Ninja Uchiha = new Uchiha();
        Uchiha.NamaClan();
        
}
   
    static boolean NilaiUjianNinja (boolean a,boolean b) {//overloading
        if (a) {
            System.out.println("Lulus");
            return a;
        }else{
            System.out.println("tidak lulus");
            return b;  
        } 
    }

    static int NilaiUjianNinja(int a, int b) {   //overloading
        if (a > b){
            return a;
        }else {
            return b;
        }       
    }       
    
public void info() {
        System.out.println("------------------------------------------------");
        System.out.println(NilaiUjianNinja(true,false));
        System.out.println(NilaiUjianNinja(100,20));
        Ninja Uzumaki = new Uzumaki();
        Uzumaki.NamaClan();
        Ninja Uchiha = new Uchiha();
        Uchiha.NamaClan();
}
}