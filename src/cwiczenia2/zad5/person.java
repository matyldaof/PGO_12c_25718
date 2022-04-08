package cwiczenia2.zad5;

import java.time.LocalDate;
import java.time.Duration;

public class person {
    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private Address address;


    public String getName() {return name;}
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname(){return surname;}
    public void setSurname(String surname){
        this.surname = surname;
    }
    public LocalDate getDateOfBirth() {return dateOfBirth;}
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public long getAge(){
        return Duration.between(LocalDate.now(), dateOfBirth).toDays();
    }

}
