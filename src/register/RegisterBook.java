package register;

import java.util.ArrayList;
import java.util.List;

public class RegisterBook {

    private final List<User> userList = new ArrayList<>();

    public void register(String name){
        User using = new User(name);
       userList.add(using);
    }
    public List<User> getUserList(){
        return userList;
    }
}
