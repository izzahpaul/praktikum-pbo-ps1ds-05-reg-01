package com.mycompany.project_modul_5;
import guided.agregasi.*;

public class Project_Modul_5 {
    public static void main(String[] args) {
       runGuided2();
    }
    
    public static void runGuided2(){
        Mahasiswa m1 = new Mahasiswa("103132430024","Ijah");
        Mahasiswa m2 = new Mahasiswa("103132430025", "ronaldo");
        
        Jurusan prodi = new Jurusan("SD", "Sains Data");
        
        prodi.addMahasiswa(m1);
        prodi.addMahasiswa(m2);
        
        prodi.displayMahasiswa();

    }
}
