import java.io.FileNotFoundException;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            System.out.println(User.data("asdmdddddddd", "asdasd1","asdasd12"));
            System.exit(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("Finally called");
        }


    }
}
