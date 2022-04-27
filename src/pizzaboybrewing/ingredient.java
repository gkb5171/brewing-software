/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaboybrewing;

/**
 *
 * @author gpbli
 */
public class ingredient {
    protected float quant;        // quantity of ingredient
    protected String itemName;
    protected String measurement;
    
    public ingredient(float num, String name, String measurement){
        this.quant = num;
        this.itemName = name;
        this.measurement = measurement;
    }
    
    
    @Override
    public String toString(){
        return this.itemName+ ": "+this.quant+" "+this.measurement;
    }
}
