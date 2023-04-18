package 5_lesson;

import java.util.List;
import lesson05.model.User;

public interface UserService {
    oid saveUser(User user);

     void removeUser(User user);

     void updateUser(int index, User user);

     List<User> getUserList();
}
