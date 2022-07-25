import java.util.ArrayList;
import java.util.List;

public class UserManager {

    private List<User> users;
    public UserManager(){
        this.users=new ArrayList<User>();

    }


    void register(User user,Sender notificationMethod){
        users.add(user);
        notificationMethod.send(user.getFirstName()+" kayıt oldu!");
    }
    void forgotPassword(User user){
        System.out.println(user.getFirstName()+" Forgot the password!");
        System.out.println("Your link is sent!");
    }

    List<User> getAll(){
        for(User user:users){
            System.out.println(user.getFirstName());
        }
        return users;
    }

}
