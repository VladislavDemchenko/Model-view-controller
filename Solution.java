package dao;

import dao.bean.User;
import dao.controller.Controller;
import dao.model.FakeModel;
import dao.model.MainModel;
import dao.model.Model;
import dao.view.EditUserView;
import dao.view.UsersView;

public class Solution {
    public static void main(String[] args) {
        Model model = new MainModel();
        UsersView usersView = new UsersView();
        EditUserView editUserView = new EditUserView();
        Controller controller = new Controller();

        usersView.setController(controller);
        editUserView.setController(controller);

        controller.setModel(model);
        controller.setUsersView(usersView);
        controller.setEditUserView(editUserView);


        usersView.fireEventShowAllUsers();
        usersView.fireEventOpenUserEditForm(126L);
        editUserView.fireEventUserDeleted(124L);
        editUserView.fireEventUserChanged("Alex", 127L, 13);
        usersView.fireEventShowDeletedUsers();



    }
}
