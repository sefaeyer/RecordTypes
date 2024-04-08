package record3;

import java.util.ArrayList;
import java.util.List;

//Repo classinda DB ile ilgili islemler yapilir
public class StudentRepo {

    List<StudentDTO> students=new ArrayList<>(); // kayitlar bu listeye eklenecek veya bu listeden cikarilacak


    //kaydetme
    public void save(StudentDTO student){
        this.students.add(student);
    }

    //silme
    public void deleteStudent(StudentDTO student){
        this.students.remove(student);
    }

    //tum kayitlari listeleme
    public void getAll( ){
        for (StudentDTO student: this.students){
            System.out.println(student);
        }
    }
}
