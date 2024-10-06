/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai2_tuan4;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai2_Tuan4 {

    public static void main(String[] args) {
        for (int i = 1; i<=10;i++)
        {
            System.out.println("Bang nhan"+i);

            for (int j = 1; j<=10;j++)
                System.out.println(i+"x"+j+"="+(i*j));
        }
        System.out.println();
    }
}
