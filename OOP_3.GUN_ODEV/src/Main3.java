public class Main3 {

    public static void main(String[] args) {
        Student student=new Student();
        StudentManager studentManager=new StudentManager();
        student.setFullName("Doğukan Bingöl");

        Insturctor insturctor=new Insturctor();
        InsturctorManager insturctorManager=new InsturctorManager();
        insturctor.setFullName("Engin Demiroğ");

        studentManager.userInfo(student);
        insturctorManager.userInfo(insturctor);



    }

}