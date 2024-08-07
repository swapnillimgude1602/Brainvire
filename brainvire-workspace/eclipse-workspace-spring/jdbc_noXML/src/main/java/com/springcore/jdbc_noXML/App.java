package com.springcore.jdbc_noXML;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.springcore.Entity.studentModel;
import com.springcore.StudentDao.StudentDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "jdbc" );
        
        @SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(Jdbc_config_autowired.class);
        StudentDao studDao = context.getBean("studentDao",StudentDao.class);
        
        /*
        //insert
        studentModel student = new studentModel();
        student.setStudId(3);
        student.setStudentName("Devendra Shinde");
        student.setCity("Pune");
        
        int result = studDao.insert(student);
         System.out.println("Student inserted :"+result);
         
        
         //update
        studentModel student = new studentModel();
        student.setStudId(3);
        student.setStudentName("Devendra Shinde");
        student.setCity("Shikrapur");
        int result = studDao.update(student);
        System.out.println("Student updated :"+result);
      
        
        //delete studentModel student = new studentModel();
        
        int res = studDao.delete(3);
        System.out.println("Student Deleted :"+res);
           */
        
        
        //fetching single object from db
       // System.out.println(studDao.getStudent(1));
        
        //fetching multiple objects 
        List<studentModel> students = studDao.getAllStudents();
        for(studentModel stud: students) {
        	System.out.println(stud);
        }
    }
}
	