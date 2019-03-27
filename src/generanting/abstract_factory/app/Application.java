package generanting.abstract_factory.app;

import generanting.abstract_factory.buttons.Button;
import generanting.abstract_factory.checkboxes.Checkbox;
import generanting.abstract_factory.factories.GUIFactory;

/**
 * Код, использующий фабрику, не волнует с какой конкретно фабрикой он работает.
 * Все получатели продуктов работают с продуктами через абстрактный интерфейс.
 */

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application (GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
