package generanting.abstract_factory.factories;

import generanting.abstract_factory.buttons.Button;
import generanting.abstract_factory.buttons.WindowsButton;
import generanting.abstract_factory.checkboxes.Checkbox;
import generanting.abstract_factory.checkboxes.WindowsCheckbox;

/**
 * Каждая конкретная фабрика знает и создаёт только продукты своей вариации.
 */

public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
