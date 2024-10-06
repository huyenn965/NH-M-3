/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai5_tuan3;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai5_Tuan3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Nhap a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhap b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhap c: ");
        double c = scanner.nextDouble();
        if(a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a)
        {
            if (a == b && b == c) 
                System.out.println("La tam giac deu.");
            else
            {
                if (a == b || a == c || b == c) 
                    System.out.println("La tam giac can.");  
                else 
                {
                   if (a*a + b*b == c*c || a*a + c*c == b*b || b*b + c*c == a*a) 
                   System.out.println("La tam giac vuong.");
                   else
                       System.out.println("La tam giac thuong.");
                }
                
            }
        }
        else
            System.out.println("Ba canh khong tao thanh mot tam giac.");
    }
}
