/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author Prasetyo
 */
public class PekerjaTidakTetap extends Employee {
    private double bonus;
    public PekerjaTidakTetap(String name,int Idkerja,String Jabatan,String Status,int anak,int Tahun){
        super (name, Idkerja, Jabatan, Status, anak, Tahun);//harus ada paling atas
        bonus = 0.1 ;
        System.out.println(name + Idkerja + Jabatan + Status + anak + Tahun);
    }
    
}
