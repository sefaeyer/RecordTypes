package record3;

import java.util.List;

public class Runner {
    public static void main(String[] args) {


        StudentDTO student1=new StudentDTO("Victor","Hugo","123456");
        StudentDTO student2=new StudentDTO("Lev","Tolstoy","123478");

        StudentRepo repo=new StudentRepo();

        repo.save(student1);
        repo.save(student2);


        //tum kayitlari listeleyelim
        System.out.println("Tum ogrenciler : ");
        repo.getAll();

        System.out.println("=========================================");


        //listedeki 1. indexteki ogrencinin numarasi yanlis
        //degistirmek istiyoruz
        List<StudentDTO> list=repo.students;

        //cozum: yeni bir tane student objesi olusturalim
        StudentDTO  newStudent2=new StudentDTO(list.get(1).firstname(),list.get(1).lastname(),"123457");

        //eski student2 yi listeden silelim
        repo.deleteStudent(student2);

        //yeni student2 yi kaydedelim
        repo.save(newStudent2);

        //listenin son halini goruntuleyelim
        System.out.println("Guncel Ogrenci Listesi : ");
        repo.getAll();






    }
}
