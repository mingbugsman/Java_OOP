package Design_Pattern.AbstractFactory.UI_User.ConcreteFactory;

import Design_Pattern.AbstractFactory.UI_User.AbstractFactory.UIFactory;
import Design_Pattern.AbstractFactory.UI_User.AbstractUI.IButton;
import Design_Pattern.AbstractFactory.UI_User.AbstractUI.ICheckBox;
import Design_Pattern.AbstractFactory.UI_User.ConcreteUI.Button.MaOSButton;
import Design_Pattern.AbstractFactory.UI_User.ConcreteUI.CheckBox.WindowsCheckBox;

public class MaOSFactory implements UIFactory {
    @Override
    public IButton createButton() {
        return new MaOSButton();
    }

    @Override
    public ICheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}
