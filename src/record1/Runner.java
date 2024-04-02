package record1;

public class Runner {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Jack","Sparrow","jack@mail.com");
        System.out.println(employee1);


        //uygulamanin herhangi bir yerinde email bilgisini degistirmek istersem
        employee1.setEmail("jack@gmail.com");
        System.out.println("emaili degisen calisan: "+employee1);

        //bazi durumlarda objenin bir kere degerlerini belirledikten sonra fieldlari
        //degistirilmeyen objelere ihtiyac duyabiliriz.

        //Immutable Class: read-only
        EmployeeImmutable emp=new EmployeeImmutable("Harry","Potter","harry@mail.com");
        System.out.println(emp);

        //uygulamanin herhangi bir yerinde email bilgisini degistirmek istersem
        //set methodu yok
        //emp.setEmail();
        System.out.println(emp.getFirstname());


        EmployeeImmutable emp2=new EmployeeImmutable("Harry","Potter","harry@mail.com");

        System.out.println("double equal ile : "+(emp==emp2));
        System.out.println("equal ile : "+(emp.equals(emp2)));

        //-- ????????? -- NEDEN ??

    }
}
