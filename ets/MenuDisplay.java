import java.util.ArrayList;

public class MenuDisplay
{   
    private ArrayList<String> menuList = new ArrayList<>();

    public MenuDisplay()
    {
        menuList.add("Snack A");
        menuList.add("Snack B");
        menuList.add("Snack C");
        menuList.add("Drink A");
    }

    public void displayAllMenu(){
        System.out.println("1. Snack A -- 7000");
        System.out.println("2. Snack B -- 9000");
        System.out.println("3. Snack C -- 11000");
        System.out.println("3. Drink A -- 4000");
    }

    public String getMenuFromIndex(int menuIndex){
        return menuList.get(menuIndex - 1).toString();
    }
}