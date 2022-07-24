public class StudentManager extends UserManager{

    public void userInfo(Student student) {
        System.out.println("The user type is student and the" +
                " user's name is: "+student.getFullName());
    }
}
