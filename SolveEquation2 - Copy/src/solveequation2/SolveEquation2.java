/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package solveequation2;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class SolveEquation2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("ax2+bx+c=0");
        double a,b,c;
        System.out.print("a:");
        a=scanner.nextDouble();
        System.out.print("b:");
        b=scanner.nextDouble();
        System.out.print("c:");
        c=scanner.nextDouble();
        double data = Math.pow(b,2)-(4*a*c);
        if(data>=0){
            if(data>0){
                    double x1 = ((-b)+Math.sqrt(data))/2*a;
                    double x2 = ((-b)-Math.sqrt(data))/2*a;
                    System.out.println("Result x1 :"+x1);
                    System.out.println("Result x2 :"+x2);
                    }else{
                    double x = (-b)/a;
                    System.out.println("Result x :"+x);
            }
        }
        else{
            System.out.println("Eqation not answer");
        }
    }
    
}
