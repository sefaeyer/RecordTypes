package record3;

import java.util.ArrayList;
import java.util.List;

//DB ile ilgili islemler
public class StudentRepo {

    List<StudentDTO> students=new ArrayList<>();



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
