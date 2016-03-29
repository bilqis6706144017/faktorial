/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomer2;
import java.util.Scanner;
public class Nomer2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;
        
        System.out.println("Masukkan angka : ");
        angka=input.nextInt();
        long temp[] = new long[angka];
        
        temp[0]=1;
        temp[1]=1;
        
        for (int i = 2; i < angka; i++) {
           temp[i] = temp[i-1] + temp[i-2];
        }
        
        for (int i = 0; i < angka; i++) {
            System.out.print(temp[i]+" ");
        }
    }
    
}
