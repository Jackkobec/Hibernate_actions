package console_tests;

import dao.StudentDAO;
import model.Student;

import javax.persistence.EntityManagerFactory;

import static factory.LazySingletonEntityManagerFactory.getEntityMangerFactory;

/**
 * Created by serhii on 23.01.16.
 */
public class TesDao {


    public static void main(String[] args) {

        EntityManagerFactory factory = getEntityMangerFactory();

        StudentDAO studentDAO = new StudentDAO(factory);

        Student student = new Student();
        Student student2 = new Student("Vasa", 1);
        Student student3 = new Student("Peta", 1);

        studentDAO.create(student);
        studentDAO.create(student2);
        studentDAO.create(student3);

//        System.out.println(studentDAO.findById(1));
//        System.out.println(studentDAO.findById(2));

        //System.out.println(studentDAO.getByGroupId(1));


    }
}
