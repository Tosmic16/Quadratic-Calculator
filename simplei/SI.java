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
public class SI {
    double p;
    double r;
    double t;
    public SI(double p,double r, double t){
    this.p= p;
    this.r=r;
    this.t=t;
    }
    public void getSI(){
    double si = (p*r*t)/100;
    System.out.printf("The interest given is %.2f \n",si);
    System.out.println("The total Amount is "+(si+p));
    }
}
