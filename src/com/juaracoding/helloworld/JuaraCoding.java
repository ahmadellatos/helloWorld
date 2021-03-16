/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juaracoding;

import java.util.Scanner;

/**
 *
 * @author hanif
 */
public class JuaraCoding {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
//        Perserta perserta[] = new Perserta[2];
//        perserta[0] = new Perserta(1);
//        perserta[1] = new Perserta(2);
//        Scanner input = new Scanner(System.in);
//        System.out.print("Masukan Nilai N = ");
//        int n = input.nextInt();
//        Perserta perserta[] = new Perserta[n];
//        for(int i=0;i<n;i++){
//            System.out.print("Masukan Nama = ");
//            String nama=input.next();
//            System.out.print("Masukan Umur = ");
//            int umur=input.nextInt();
//            perserta[i]=new Perserta();
//            perserta[i].setNama(nama);
//            perserta[i].setUmur(umur);
//        } 
//        for(int i=0;i<n;i++){
//            perserta[i].printPerserta();
//        }
        Perserta perserta = new Perserta();
//        perserta.setName("Mantap");
        perserta.printPerserta();
    }
    
}

class Perserta{
    private String nama;
    private int umur;
    
    public void printPerserta(){
        System.out.println("Nama = "+nama);
        System.out.println("Umur = "+umur);
    }
    
    public void setName(String nama){
        this.nama=nama;
        printPerserta();
    }
    
}