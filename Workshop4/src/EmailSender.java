public class EmailSender implements  Sender{
    @Override
    public void send(String message) {
        System.out.println("Email is sent! "+message);
    }
}
