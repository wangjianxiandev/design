package moban;

import mingling.Command;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-22
 * Time: 19:24
 */
public class MainTest {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        Tea tea = new Tea();
        coffee.prepareRecipe();
        tea.prepareRecipe();
    }
}
