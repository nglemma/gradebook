
package gradebook;


public class Gradebook 
{
 
    private String courseName;
    private String instructorName;

   
    public void setCourseName(String courseName) 
    {
        this.courseName = courseName;
    }

    public void setInstructorName(String instructorName) 
    {
        this.instructorName = instructorName;
    }
    
     public String getCourseName() 
    {
        return courseName;
    }

    public String getInstructorName() 
    {
        return instructorName;
    }

    
  public Gradebook(String course,String instructor)
  {
      courseName = course;
      instructorName = instructor;
  }
  
  public void displaymessage()
  {
      System.out.printf("The name of the course is\n%s\n ", getCourseName());
      System.out.println();
      System.out.printf("And its taught by \n%s\n" ,getInstructorName());
  }
  
  
}
