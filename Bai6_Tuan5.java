/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai6_tuan5;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai6_Tuan5 {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);

        System.out.println("Danh sach ban dau: " + numbers);

        Scanner scanner = new Scanner (System.in);
        System.out.print("Nhap vi tri can them: ");
        int viTriThem = scanner.nextInt();
        System.out.print("Nhap gia tri can them ");
        int giaTriThem = scanner.nextInt();
        numbers.add(viTriThem, giaTriThem);

        System.out.print("Nhap vi tri can xoa: ");
        int viTriXoa = scanner.nextInt();
        numbers.remove(viTriXoa);

        System.out.println("Danh sach sau khi thay doi: " + numbers);
    }
}
