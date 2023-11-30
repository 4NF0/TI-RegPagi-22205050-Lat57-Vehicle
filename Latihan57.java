/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan57;

/**
 *
 * @author nm
 * Nama : Adi Naufal F
 * Nim : 22205050
 * Kelas/Semester : TI/3
 * Deskripsi Program : Program ini berisi tentang vehicle berupa bicycle dan skateboard.
 */
public class Latihan57 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Bicycle bcl = new Bicycle();
        bcl.setBrand("Trek Bike");
        bcl.setModel("7.4FX");
        bcl.setGearCount(23);
        System.out.println("Brand : "+bcl.getBrand());
        System.out.println("Model : "+bcl.getModel());
        System.out.println("Jumlah Gear : "+bcl.getGearCount());
        System.out.println("");
        
        Skateboard sktb = new Skateboard();
        sktb.setBrand("Ally Skate");
        sktb.setModel("Rocket");
        sktb.setBoardLeght(54.5);
        System.out.println("Brand : "+sktb.getBrand());
        System.out.println("Model : "+sktb.getModel());
        System.out.println("Panjangnya Board : "+sktb.getBoardLeght());
    }
    
}
