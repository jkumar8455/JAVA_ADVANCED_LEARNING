import java.io.*;


class User implements Serializable{
    private String username;
    private transient String password; // will NOT be serialized

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "username='" + username + '\'' +
                ", password='" + password + '\'';
    }
}
public class TransientExample {
    public static void main(String[] args) throws Exception {

        User user = new User("john", "secret123");

        // Serialize the object
        ObjectOutputStream oos =
                new ObjectOutputStream(new FileOutputStream("user.txt"));
        oos.writeObject(user);
        oos.close();

        // Deserialize the object
        ObjectInputStream ois =
                new ObjectInputStream(new FileInputStream("user.txt"));
        User deserialized = (User) ois.readObject();

        ois.close();
        System.out.println(deserialized);
    }
}
