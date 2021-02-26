
public class TestBola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //variabel
        double jarijari = 7;
        
        System.out.println("Menghitung Luas Permukaan dan Volume Bola");
        System.out.println("");
        
        //objek
        Bola bola = new Bola (10);
        
        //memanggil method dari kelas Bola
        bola.showDiameter();
        bola.showLuasPermukaan();
        bola.showVolume();
        
        System.out.println("");
        
        bola.setJarijari(jarijari);
        bola.showDiameter();
        bola.showLuasPermukaan();
        bola.showVolume();
        
        
        
    }
    
}
