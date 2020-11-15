/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_IF2_10116414_Latihan57_Vehicle;

/**
 *
 * @author sweenutt
 * Nama       : Fael Antoni Wijaya 
 * Kelas      : PBO2/IF 2 
 * Nim        : 10116414
 * Deskripsi  : Program vehicle yaitu bicycle dan skateboard
 */
public class PBO_IF2_10116414_Vehicle {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        bicycle.setMyBrand("Trek Bike");
        bicycle.setMyModel("7.4FX");
        
        bicycle.setMyGearCount(23);
        
        System.out.println("Brand : " + bicycle.getMyBrand());
        System.out.println("Model : " + bicycle.getMyModel());
        System.out.println("Jumlah Gear : " + bicycle.getMyGearCount());
      
        Skateboard skateboard = new Skateboard();
        skateboard.setMyBrand("Ally Skate");
        skateboard.setMyModel("Rocket");
        
        skateboard.setMyBoardLength(54.5);
        
        System.out.println("Brand : " + skateboard.getMyBrand());
        System.out.println("Model : " + skateboard.getMyModel());
        System.out.println("Panjangnya Board : " + skateboard.getMyBoardLength());
    }
}
