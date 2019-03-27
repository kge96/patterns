package generanting.abstract_factory.factories;

import generanting.abstract_factory.buttons.Button;
import generanting.abstract_factory.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
