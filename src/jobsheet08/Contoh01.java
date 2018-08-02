/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet08;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Contoh01 {
    public static void main(String[] args)
    {
        //PENGULANGAN FOR
        int x;
        for(x = 1; x <= 5; x++)
        {
            System.out.println("SMK Telkom Malang");
        }
        
        //PENGULANGAN WHILE
        int i = 1;
        while(i <= 5)
        {
            System.out.println("SMK Telkom Malang");
            i++;
        }
        
        //PENGULANGAN DO WHILE
        int j = 1;
        do
        {
            System.out.println("SMK Telkom Malang");
            j++;
        }
        while(j >= 5);
    }
}
