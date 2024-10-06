/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai2_tuan5;
import java.util.Arrays;

/**
 *
 * @author Admin
 */
public class Bai2_Tuan5 {
    public static void daoNguoc(int[] a) {
        int n = a.length;
        for (int i = 0; i < n / 2; i++) {
            int tg = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = tg;
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        daoNguoc(a);
        System.out.println(Arrays.toString(a));
    }
}
 