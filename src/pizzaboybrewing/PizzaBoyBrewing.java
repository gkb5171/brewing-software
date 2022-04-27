/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaboybrewing;
import java.util.Scanner;
import java.util.Hashtable;

/**
 *
 * @author gpbli
 */

public class PizzaBoyBrewing {
    help help = new help();
    Scanner input = new Scanner(System.in);
    
    ingredient[] ingredArr;
    // gather the total number of ingredients and create their objects
    
    public void initIngredients(int num){
        String tempStr;         // temp store for name
        Float tempFloat;        // temp store for quant
        String tempStr2;        // temp store for measurementf
        ingredArr = new ingredient[num];        //allocate space in array
        for (int x=0; x<num; x++){
          tempStr = help.getName();
          tempFloat = help.getQuant();
          tempStr2 = help.getMeasure();        

          ingredArr[x] = new ingredient(tempFloat, tempStr, tempStr2);   //create new ingredient and add it to array
        }
    }
    /*public static void main(String[] args) {
        // TODO code application logic here
        PizzaBoyBrewing main = new PizzaBoyBrewing();   // allows use of functions in PizzaBoyBrewing Class 
        help helpper = new help();
        main.ingredNum = helpper.getIngredientQuant();        // collect data on # of ingredients
        main.initIngredients(main.ingredNum);           // create objects for ingredients
    }*/
    
}
