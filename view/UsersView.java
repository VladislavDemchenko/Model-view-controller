package dao.view;

import dao.bean.User;
import dao.controller.Controller;
import dao.model.ModelData;

public class UsersView implements View{

    private Controller controller = new Controller();

    @Override
    public void refresh(ModelData modelData) {
        System.out.println("All " + (modelData.isDisplayDeletedUserList() ? "deleted " : "") + "users:");
        for (User user : modelData.getUsers()) {
            System.out.println("\t" + user);
        }
        System.out.println("===================================================");
    }

    @Override
    public void setController(Controller controller) {
        this.controller = controller;
    }


    public void fireEventShowDeletedUsers() {
        controller.onShowAllDeletedUsers();
    }

    public void fireEventShowAllUsers(){
        controller.onShowAllUsers();
    }

    public void fireEventOpenUserEditForm(long userId){
        controller.onOpenUserEditForm(userId);
    }

}
