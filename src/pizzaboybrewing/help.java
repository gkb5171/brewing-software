/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaboybrewing;
import java.util.Scanner;
import java.lang.*;
/**
 *
 * @author gpbli
 */
public class help {
    Scanner input = new Scanner(System.in);
    PizzaBoyBrewing main = new PizzaBoyBrewing();
    public String getName(){
        String tempStr; 
        System.out.println("Ingredient name: ");  
        tempStr = input.nextLine();
        return tempStr;
    }
    public Float getQuant(){
        Float tempFloat;
        System.out.println("Quantity of ingrediant: ");
        tempFloat = Float.parseFloat(input.nextLine()); //parse fixes input skip
        return tempFloat;
    }
    public String getMeasure(){
        String tempStr2;
        System.out.println("Unit of measurement: ");
        tempStr2 = input.nextLine();
        return tempStr2; 
    }
    
    public int getIngredientQuant(){           // collect data on ingredients
        System.out.println("How many ingredients:");
        int num1 = input.nextInt();
        return num1;
    }
    public float StrikeWaterTemp(float grainWaterRatio, float targetTemp, float initTemp){
        // Tw = (0.2/R)(T2-T1)+T2
        // Tw = Strike Temp water   [output]
        // R = ratio of grain to water  [grainWaterRatio]
        // T2 = target water temp       [targetTemp]
        // T1 initial mash temp. (temp of dry grain for initil infusion)  [initTemp]
        float cons =(float) 0.2;
        float pt1 = (cons/grainWaterRatio);
        float pt2 = (targetTemp-initTemp);
        float swt = (pt1*pt2)+targetTemp;
        return swt;
      
     }
    
    public float MashInfusionEq(float totalWater, float strikeWaterTemp, float totalGrain, float targetTemp, float initTemp){
        // Wa = (T2-T1)(0.2G + Wm)/(Tw-T2)
        // T2 = target water temp   [targetTemp]
        // T1 = initial mash temp. (temp of dry grain for initial infusion) [initTemp]
        // G = amount of grain in mash          [totalGrain]
        // Wm = total amount of water in mash   [totalWater]
        // Tw = Strike water temp               [strikeWaterTemp]
        float cons = (float)0.2;
        float pt1 = targetTemp - initTemp;
        float pt2 = cons+totalWater;
        float pt3 = strikeWaterTemp-targetTemp;
        float mie = (pt1*pt2)/pt3;
        
        return mie;
    }
    
    
   /* public int getIngred(String name){
        int idx = 0;
        for (int x=0; x<main.ingredNum; x++){
            if (main.ingredArr[x].itemName == name){
                idx = x;
            }
        }
        return idx;
    }*/
}
