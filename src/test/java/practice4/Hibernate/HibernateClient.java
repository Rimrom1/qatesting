package practice4.Hibernate;

import org.hibernate.Session;
import practice4.Model.student;
import java.util.Date;


public class HibernateClient {

    public static void main(String[] args) {
        student student = new student();
        student.setId_student(4);
        student.setCourse(1);
        student.setName("Borak Roman");
        student.setBd(new Date());

        System.out.println(student);

        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        session.save(student);
        session.getTransaction().commit();


        //Read
        session.beginTransaction();
        student readStudent = (practice4.Model.student) session.get(student.class, student.getId_student());
        session.getTransaction().commit();

        System.out.println(readStudent);

        //Update
        student.setName(student.getName() + " updated");
        session.beginTransaction();
        session.update(student);
        System.out.println(session.get(student.class, 1));
        session.getTransaction().commit();

        //Delete
        session.beginTransaction();
        session.delete(student);
        System.out.println(session.get(student.class, 1));
        session.getTransaction().commit();

        session.close();
    }
}
