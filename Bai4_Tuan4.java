/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai4_tuan4;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai4_Tuan4 {

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        if(n<2)
            System.out.println("Khong phai la so nguyen to.");
        else {
            for (int i=2;i<=Math.sqrt(n);i++)
            {
                if(n%i==0)
                    System.out.println("Khong phai la so nguyen to.");
                else{
                    System.out.println("La so nguyen to.");
                    break;}
            }
              
                
        }
       
    }
}
