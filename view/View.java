package dao.view;

import dao.controller.Controller;
import dao.model.ModelData;

public interface View {

    void refresh(ModelData modelData);

    void setController(Controller controller);

}
