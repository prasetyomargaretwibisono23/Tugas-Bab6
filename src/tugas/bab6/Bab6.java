package Inheritance;
public class Bab6 {
    public static void main(String[] args){
        System.out.println("==== Daftar Gaji Karyawan ===");
        System.out.println("=============================");    
        Manager manager = new Manager("Budi",1121,"manajer","ya",3,2000);
        manager.Tampilan();
        manager.tunjangan();
        manager.anak();
        manager.tunjanganMJ();
        manager.Tampilanmj();
        System.out.println("=============================");
        PekerjaTetap Pekerjatetap1 = new PekerjaTetap("Aji", 1442,"Security","ya",4,2001);
        Pekerjatetap1.Tampilan();
        Pekerjatetap1.Status();
        Pekerjatetap1.anak();
        Pekerjatetap1.tampilpt();
        System.out.println("=============================");
        PekerjaTetap Pekerjatetap2 = new PekerjaTetap("Anto", 1443,"Teknisi","ya",0,2002);
        Pekerjatetap2.Tampilan();
        Pekerjatetap2.Status();
        Pekerjatetap2.anak();
        Pekerjatetap2.tampilpt();
        System.out.println("=============================");
        PekerjaTetap Pekerjatetap3 = new PekerjaTetap("Salim", 1444,"Sopir","ya",1,2008);
        Pekerjatetap3.Tampilan();
        Pekerjatetap3.Status();
        Pekerjatetap3.anak();
        Pekerjatetap3.tampilpt();
        System.out.println("=============================");
        PekerjaTetap Pekerjatetap4 = new PekerjaTetap("Santi",1445,"Sekertaris","ya",2,1999);
        Pekerjatetap4.Tampilan();
        Pekerjatetap4.Status();
        Pekerjatetap4.anak();
        Pekerjatetap4.tampilpt();
 
        System.out.println("=============================");
        PekerjaTetap Pekerjatetap5 = new PekerjaTetap("Santoso",2446,"OB","tidak",0,2010);
        Pekerjatetap5.Tampilan();
        Pekerjatetap5.Status();
        Pekerjatetap5.anak();
        Pekerjatetap5.tampilpt();
        System.out.println("=============================");
        PekerjaTetap Pekerjatetap6 = new PekerjaTetap("Ayu",1447,"OB","ya",5,2001);
        Pekerjatetap6.Tampilan();
        Pekerjatetap6.Status();
        Pekerjatetap6.anak();
        Pekerjatetap6.tampilpt();
        System.out.println("=============================");
        PekerjaTetap Pekerjatetap7 = new PekerjaTetap("Jaya",1448,"Teknisi","ya",0,2006);
        Pekerjatetap7.Tampilan();
        Pekerjatetap7.Status();
        Pekerjatetap7.anak();
        Pekerjatetap7.tampilpt();
        System.out.println("=============================");
        PekerjaTetap Pekerjatetap8 = new PekerjaTetap("Sandy",1449,"Sopir","ya",1,2003);
        Pekerjatetap8.Tampilan();
        Pekerjatetap8.Status();
        Pekerjatetap8.anak();
        Pekerjatetap8.tampilpt();
        System.out.println("=============================");
        PekerjaTetap Pekerjatetap9 = new PekerjaTetap("Dewi",1450,"Sekertaris","ya",2,2007);
        Pekerjatetap9.Tampilan();
        Pekerjatetap9.Status();
        Pekerjatetap9.anak();
        Pekerjatetap9.tampilpt();
        System.out.println("=============================");
        PekerjaTetap Pekerjatetap10 = new PekerjaTetap("Sri",1451,"OB","ya",3,2000);
        Pekerjatetap10.Tampilan();
        Pekerjatetap10.Status();
        Pekerjatetap10.anak();
        Pekerjatetap10.tampilpt();
        System.out.println("=============================");
        PekerjaTidakTetap Pekerjatidaktetap = new PekerjaTidakTetap("Ahmad", 2472,"Security","tidak",0,2014);
        Pekerjatidaktetap.Tampilan();
        Pekerjatidaktetap.lembur(12);
        Pekerjatidaktetap.TampilPtt();
        System.out.println("=============================");
        PekerjaTidakTetap Pekerjatidaktetap2 = new PekerjaTidakTetap("Deny", 2478,"Teknisi","ya",3,2015);
        Pekerjatidaktetap2.Tampilan();
        Pekerjatidaktetap.lembur(9);
        Pekerjatidaktetap2.TampilPtt();
        System.out.println("=============================");
        PekerjaTidakTetap Pekerjatidaktetap3 = new PekerjaTidakTetap("Sari", 2474,"Sekertaris","ya",2,2013);
        Pekerjatidaktetap3.Tampilan();  
        Pekerjatidaktetap.lembur(14);
        Pekerjatidaktetap3.TampilPtt();
        System.out.println("=============================");
        PekerjaTidakTetap Pekerjatidaktetap4 = new PekerjaTidakTetap("Sinta",2476,"Sekertaris","tidak",0,2014);
        Pekerjatidaktetap4.Tampilan();
        Pekerjatidaktetap.lembur(8);
        Pekerjatidaktetap4.TampilPtt();
        System.out.println("=============================");
        PekerjaTidakTetap Pekerjatidaktetap5 = new PekerjaTidakTetap("Rendy",2475,"Teknisi","ya",2,2015);
        Pekerjatidaktetap5.Tampilan();
        Pekerjatidaktetap.lembur(10);
        Pekerjatidaktetap5.TampilPtt();
        System.out.println("=============================");
    }  
}