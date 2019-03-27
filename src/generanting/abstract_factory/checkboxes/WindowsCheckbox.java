package generanting.abstract_factory.checkboxes;

/**
 * Все семейства продуктов имеют одинаковые вариации (MacOS/Windows).
 *
 * Вариация чекбокса под Windows.
 */

public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Creating windows checkbox");
    }
}
