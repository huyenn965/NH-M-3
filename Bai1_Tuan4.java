/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai1_tuan4;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai1_Tuan4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        int S = 0;
        for (int i=1;i<=n;i++)
            S = S + i;
        System.out.println("Tong cac so tu 1 den n la: "+S);
    }
}
