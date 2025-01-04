package Design_Pattern.AbstractFactory.UI_User.AbstractFactory;

import Design_Pattern.AbstractFactory.UI_User.AbstractUI.IButton;
import Design_Pattern.AbstractFactory.UI_User.AbstractUI.ICheckBox;

public interface UIFactory {
    IButton createButton();
    ICheckBox createCheckBox();
}
