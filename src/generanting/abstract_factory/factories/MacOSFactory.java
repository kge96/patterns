package generanting.abstract_factory.factories;

import generanting.abstract_factory.buttons.Button;
import generanting.abstract_factory.buttons.MacOSButton;
import generanting.abstract_factory.checkboxes.Checkbox;
import generanting.abstract_factory.checkboxes.MacOSCheckbox;

/**
 * Каждая конкретная фабрика знает и создаёт только продукты своей вариации.
 */

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
