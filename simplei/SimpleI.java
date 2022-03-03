/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplei;
import java.util.Scanner;
/**
 *
 * @author TOSMIC
 */
public class SimpleI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("choose 1 for Quadratic, choose 2 for Simple Interest ");
        int chi = input.nextInt();
        if(chi==1){
       System.out.println("Enter coefficient for a");
       double a= input.nextDouble();
        
       System.out.println("Enter coefficient for b");
       double b= input.nextDouble();
        
       System.out.println("Enter coefficient for c");
       double c= input.nextDouble();
   
Quadratic quad = new Quadratic(a,b,c);
quad.compare();
quad.getRoot();
        }
        else if(chi==2){
         double p= input.nextDouble();
        double r= input.nextDouble();
        double t= input.nextDouble();
        
        SI si = new SI(p,r,t);
        si.getSI();
        }
        else{
        System.exit(0);
        }
        
    }
    
}
