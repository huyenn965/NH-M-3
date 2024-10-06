/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai6_tuan4;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai6_Tuan4 {

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n ;

        do{
        System.out.print("Nhap n: ");
        n = sc.nextInt();
        }
        while(n<=0);
        int soTam = n, soDonVi, soDaoNguoc;
        soDaoNguoc = 0;
        while(soTam!=0)
        {
            soDonVi=soTam%10;
            soDaoNguoc=soDonVi + soDaoNguoc * 10;
            soTam=soTam/10;
        }
        if (soDaoNguoc==n)
            System.out.println("La so doi xung.");
        else
            System.out.println("Khong phai la so doi xung.");
    }
}
