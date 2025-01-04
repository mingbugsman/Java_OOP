package Design_Pattern.AbstractFactory.UI_User.ConcreteUI.Button;

import Design_Pattern.AbstractFactory.UI_User.AbstractUI.IButton;

public class MaOSButton implements IButton {
    @Override
    public void render() {
        System.out.println("Rendering MacOS button");
    }
}
