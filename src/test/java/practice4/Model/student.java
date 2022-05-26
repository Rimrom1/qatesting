package practice4.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table
public class student {
    @Id
    private Integer id_student;
    private String name;
    private Date bd;
    private Integer course;

    public Integer getId_student() {
        return id_student;
    }

    public void setId_student(Integer id_student) {
        this.id_student = id_student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBd() {
        return bd;
    }

    public void setBd(Date bd) {
        this.bd = bd;
    }

    public Integer getCourse() {
        return course;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "student{" +
                "idStudent=" + id_student +
                ", name='" + name + '\'' +
                ", brithday=" + bd +
                ", course=" + course +
                '}';
    }
}
