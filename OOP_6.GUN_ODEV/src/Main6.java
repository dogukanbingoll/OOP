public class Main6 {
    public static void main(String[] args) {

          ///  User user =new User(1,"dasda",(new EmailSender()));

            User user1=new User(1,"Mehmet",(new SmsSender()));
            User user2=new User(2,"Ahmet",(new EmailSender()));

            UserManager userManager=new UserManager();
            userManager.register(user1,user1.getNotification());
            userManager.register(user2,user2.getNotification());
            userManager.forgotPassword(user1);
            userManager.getAll();

    }
}

