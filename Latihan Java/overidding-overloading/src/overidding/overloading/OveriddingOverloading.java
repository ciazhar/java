
package overidding.overloading;

public class OveriddingOverloading {

    public static void main(String[] args) {
        Bapak joko = new Bapak();
        joko.berlari();
        
        AnakPertama mawar = new AnakPertama();
        mawar.berlari();
        
        AnakKedua melati = new AnakKedua();
        melati.berlari();
        
        AnakJalanan boy = new AnakJalanan();
        boy.berlari();
        
        displayObject(joko);
        displayObject(mawar);
        displayObject(melati);
//        displayObject(boy);
    }
    
    public static void displayObject(Bapak bapak){
        System.out.println("wowo");
    }
    
}
