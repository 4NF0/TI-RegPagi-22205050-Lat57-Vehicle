/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan57;

/**
 *
 * @author nm
 */
public class Bicycle extends Vehicle {
    private int myGearCount;
    
    public Bicycle(){
        System.out.println("Bicycle");
    }

    public int getGearCount() {
        return myGearCount;
    }

    public void setGearCount(int myGearCount) {
        this.myGearCount = myGearCount;
    }
}
