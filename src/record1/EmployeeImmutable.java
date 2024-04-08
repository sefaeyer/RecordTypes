package record1;

import java.util.Objects;

/*
    Datalari transfer etmek icin : DTO (Data Transfer Object) ve
    datalari saklamak icin basit ilkel classlar olustururuz.

    Bazi durumlarda thread guvenligi(thread safe),
                    cache te veri tutarliligi,
                    test kolayligi vs saglamak icin immutable(degistirilemez) class lar tanimlamak isteyebiliriz
 */
public class EmployeeImmutable {

    private final String firstname;
    private final String lastname;
    private final String email;

    //param const
    public EmployeeImmutable(String firstname, String lastname, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
    }

    //getter: read-only
    //setter: final oldugu icin, degistirilemesin diye setter yazmiyoruz

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    //toString

    @Override
    public String toString() {
        return "EmployeeImmutable{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        EmployeeImmutable emp = (EmployeeImmutable) obj;
        return  Objects.equals(this.firstname, emp.firstname) &&
                Objects.equals(this.lastname, emp.lastname) &&
                Objects.equals(this.email, emp.email);
    }


    //objeler icin unique kodlar uretir
    @Override
    public int hashCode() {
        return Objects.hash(firstname,lastname,email);


    }
}






