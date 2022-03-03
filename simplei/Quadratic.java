/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplei;

/**
 *
 * @author TOSMIC
 */
public class Quadratic {
      double a;
    double b;
    double c;
    public Quadratic(double a, double b, double c){
    this.a=a;
    this.b=b;
    this.c=c;
    }
    public void getRoot(){
    double x1 = (-b + Math.sqrt(Math.pow(b,2)-(4*a*c)))/(2*a);
    double x2 = (-b - Math.sqrt(Math.pow(b,2)-(4*a*c)))/(2*a);
    System.out.println("The values of the roots are");
    System.out.println(x1);
    System.out.println(x2);

    }
    public void compare(){
    double disc =Math.pow(b, 2)-(4*a*c);
    if(disc>0){
        System.out.println("--------------------It has a distinct root----------------------");
    }
    else if(disc==0){
        System.out.println("----------------It has Double roots----------------");
    }
    else{
        System.out.println("-----------------It has complex root-----------------"); 
    }
    }
}
