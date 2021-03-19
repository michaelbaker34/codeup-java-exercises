package grocerylist;
import util.Input;

import java.util.Map;

public class GroceryListApplication {

//    private final Map<> groceryListItems;
    private Input input;
    boolean userResponse = input.yesNo();


// manipulate grocery list
    private void runInteraction() {
        System.out.println("Would you like to create a grocery list: [y/n]");
    }

// start app
    public void init() {
        System.out.println("Create and view a grocery list");
        runInteraction();
    }

    public static void main(String[] args) {
//        GroceryListApplication gla = new GroceryListApplication(createList(), new Input());
//        gla.init();
    }

}
