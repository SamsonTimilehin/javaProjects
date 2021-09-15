package register;

public class User {

    private final int id;
    private final String name;
    private static int num = 1001;

    public User(String name) {
        this.name = name;
        id = num++;

    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("id:%d  name:%s", id , name);
    }
}
