package dao.model;

import dao.bean.User;
import dao.controller.Controller;
import dao.model.serviec.UserService;
import dao.model.serviec.UserServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class FakeModel implements Model{

    private ModelData modelData = new ModelData();
    private Controller controller = new Controller();
    private UserService userService = new UserServiceImpl();

    @Override
    public ModelData getModelData() {
        return modelData;
    }

    public void loadDeletedUsers(){
        modelData.setDisplayDeletedUserList(true);
        throw new UnsupportedOperationException();
    }

    @Override
    public void loadUsers() {
        modelData.setDisplayDeletedUserList(false);
        List<User> users = new ArrayList<>();
        users.add(new User("A", 1l, 1));
        users.add(new User("B", 2l, 1));
        modelData.setUsers(users);
    }

    public void loadUserById(long userId){
        throw new UnsupportedOperationException();
    }

    public void deleteUserById(long id){
        throw new UnsupportedOperationException();
    }

    public void changeUserData(String name, long id, int level){
        throw new UnsupportedOperationException();
    }
}
