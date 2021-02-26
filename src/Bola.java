import java.lang.Math;
public class Bola {

    //variable
    private double jarijari;

    
    public Bola(double jarijari){
        this.jarijari = jarijari;
    }
    
    //method void
    public void setJarijari(double jarijari){
        this.jarijari = jarijari;
    }
    
    //method non void menghitung diameter bola
    public void showDiameter(){
        System.out.println("Diameter = "+(2*jarijari));
    }
    
    //method non void menghitung luas permukaan bola
    public void showLuasPermukaan(){
        System.out.println("Luas Permukaan = "+(4*Math.PI*(jarijari*jarijari)));
    }
    
    //method non void menghitung volume bola
    public void showVolume(){
        System.out.println("Volume = "+((4/3)*Math.PI*(jarijari*jarijari*jarijari)));
    }
   
    
}
