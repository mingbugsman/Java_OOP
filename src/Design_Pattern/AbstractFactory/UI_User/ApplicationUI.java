package Design_Pattern.AbstractFactory.UI_User;

import Design_Pattern.AbstractFactory.UI_User.AbstractFactory.UIFactory;
import Design_Pattern.AbstractFactory.UI_User.AbstractUI.IButton;
import Design_Pattern.AbstractFactory.UI_User.AbstractUI.ICheckBox;

public class ApplicationUI {
    private final IButton button;
    private final ICheckBox checkBox;

    public ApplicationUI(UIFactory factory) {
        button = factory.createButton();
        checkBox = factory.createCheckBox();
    }
    public void renderUI() {
        button.render();
        checkBox.render();
    }
}
