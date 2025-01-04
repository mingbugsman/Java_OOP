package Design_Pattern.AbstractFactory.UI_User.ConcreteUI.Button;

import Design_Pattern.AbstractFactory.UI_User.AbstractUI.IButton;

public class WindowsButton implements IButton {

    @Override
    public void render() {
        System.out.println("Rendering windows button");
    }
}
