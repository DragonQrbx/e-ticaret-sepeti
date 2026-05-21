package observer;

public class EmailObserver implements OrderObserver {

    @Override
    public void update(String message) {
        System.out.println("Email bildirimi: " + message);
    }
}