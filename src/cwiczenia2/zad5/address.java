package cwiczenia2.zad5;

public class address {

    private String country;
    private String city;
    private String street;
    private Integer house;
    private Integer flat;

    public String getCountry() {return country;}
    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {return city;}
    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {return street;}
    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouse() {return house;}
    public void setHouse(int house) {
        this.house = house;
    }

    public int getFlat() {return flat;}
    public void setFlat(int flat) {
        this.flat = flat;
    }
}