public class User {
    private int id;
    private String firstName;
    private Sender notificationMethod;

    public User(int id, String firstName, Sender notificationMethod) {
        this.id = id;
        this.firstName = firstName;
        this.notificationMethod = notificationMethod;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Sender getNotification() {
        return notificationMethod;
    }

    public void setNotification(Sender notificationMethod) {
        this.notificationMethod = notificationMethod;
    }
}
