package practice4.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "adress")
public class adrress {
    @Id
    private Integer id_address;
    private String country;
    private String city;

    public Integer getId_address() {
        return id_address;
    }

    public void setId_address(Integer id_address) {
        this.id_address = id_address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    @Override
    public String toString() {
        return "adress{" +
                "idAdress=" + id_address +
                ", Country='" + country + '\'' +
                ", City=" + city +
                '}';

    }
}
