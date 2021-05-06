public class Student extends User{
    private String coursesTaken;
    public String  getCoursesTaken(){
        return coursesTaken;
    }
    public void setCoursesTaken(String coursesTaken){
        this.coursesTaken=coursesTaken;
    }
}
