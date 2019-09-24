
import gradebook.Gradebook;
import java.util.Scanner;


public class gradeTest 
{
 
   public static void main(String args[])
   {
       Scanner enter = new Scanner(System.in);
       Gradebook Cname = new Gradebook("Java 101","prof.Austin");
       
       System.out.println("Please Enter the name of your course");
       System.out.println();
       String cousername = enter.nextLine();
       System.out.println("Please Enter the name of your Instructor");
       String instructorName = enter.nextLine();
       
       Cname.setCourseName(cousername);
       Cname.setInstructorName(instructorName);
       
       Cname.displaymessage();
       
   }
}
