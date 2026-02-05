
public class PojoStudent 
{

    public static void main(String[] args) 
    {
        Student s = new Student(1, "Ravi");
        JavaCourse jc = new JavaCourse("Java");
        jc.joinCourse(s);
    }
    
}
