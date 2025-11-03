/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latukl4java;

/**
 *
 * @author ZHAFIR AKBAR ABQARY
 */
import java.util.Scanner;

public class LatUKL4Java {

    // Fungsi untuk menghitung volume tabung
    public static double hitungVolume(double jariJari, double tinggi) {
        double volume = Math.PI * jariJari * jariJari * tinggi;
        return volume;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari tabung (cm): ");
        double r = input.nextDouble();

        System.out.print("Masukkan tinggi tabung (cm): ");
        double t = input.nextDouble();

        double volume = hitungVolume(r, t); // pemanggilan fungsi dengan parameter

        System.out.println("\n=== Hasil Perhitungan ===");
        System.out.println("Jari-jari : " + r + " cm");
        System.out.println("Tinggi    : " + t + " cm");
        System.out.println("Volume    : " + volume + " cm³");

        input.close();
    }
}