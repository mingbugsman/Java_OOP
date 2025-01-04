package Design_Pattern.AbstractFactory.UI_User.ConcreteFactory;

import Design_Pattern.AbstractFactory.UI_User.AbstractFactory.UIFactory;
import Design_Pattern.AbstractFactory.UI_User.AbstractUI.IButton;
import Design_Pattern.AbstractFactory.UI_User.AbstractUI.ICheckBox;
import Design_Pattern.AbstractFactory.UI_User.ConcreteUI.Button.WindowsButton;
import Design_Pattern.AbstractFactory.UI_User.ConcreteUI.CheckBox.WindowsCheckBox;

public class WindowsFactory implements UIFactory {

    @Override
    public IButton createButton() {
        return new WindowsButton();
    }

    @Override
    public ICheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}
