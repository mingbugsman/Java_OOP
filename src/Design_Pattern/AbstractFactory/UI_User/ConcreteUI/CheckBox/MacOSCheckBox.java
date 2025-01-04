package Design_Pattern.AbstractFactory.UI_User.ConcreteUI.CheckBox;

import Design_Pattern.AbstractFactory.UI_User.AbstractUI.ICheckBox;

public class MacOSCheckBox implements ICheckBox {
    @Override
    public void render() {
        System.out.println("Rendering MacOS checkbox");
    }
}
