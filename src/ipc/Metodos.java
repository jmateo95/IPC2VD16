/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ipc;


import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
/**
 *
 * @author joubm
 */
public class Metodos {
    public double x1(double a, double b, double c) {
        double x1;
        
        x1= (((-1)*b)+sqrt((b*b)-4*a*c))/(2*a);
return x1;
   }
    
  public double x2(double a, double b, double c) {
        double x1;
        
        x1= (((-1)*b)-sqrt((b*b)-4*a*c))/(2*a);
return x1;
   }  
  
  public double Mayor(double a, double b, double c) {
        double x1 = 0;
        if (a>b && a>c) {
        x1=a;
        }
        if (b>a && b>c) {
        x1=b;
        }
        if (c>a &&c>b) {
        x1=c;
        }
return x1;
   }
  public double Menor(double a, double b, double c) {
        double x1 = 0;
        if (a<b && a<c) {
        x1=a;
        }
        if (b<a && b<c) {
        x1=b;
        }
        if (c<a &&c<b) {
        x1=c;
        }
return x1;
   }
}