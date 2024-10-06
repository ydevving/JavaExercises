package Day20;

import java.util.Scanner;
import Day20.*;

public class SimulasSoup {

    public static void body() {
        Scanner sc = new Scanner(System.in);

        String menu = String.join("\n"
                , "Type:"
                , "Soup"
                , "Stew"
                , "Gumbo"
                , ""
                , "Main ingredient:"
                , "Mushrooms"
                , "Chicken"
                , "Carrots"
                , "Potatoes"
                , ""
                , "Seasoning:"
                , "Spicy"
                , "Salt"
                , "Sweet"
                , ""
        );

        System.out.println(menu);
        System.out.println("What type you would prefer?");
        String i_type = sc.nextLine().toUpperCase();

        System.out.println("What main ingredient?");
        String i_main_ingredient = sc.nextLine().toUpperCase();

        System.out.println("What seasoning?");
        String i_seasoning = sc.nextLine().toUpperCase();

        TYPE type = null;
        MAIN_INGREDIENT main_ingredient = null;
        SEASONING seasoning = null;

        for (TYPE t : TYPE.values()) {
            if (t.name().equals(i_type)) {
                type = t;
            }
        }

        for (MAIN_INGREDIENT m : MAIN_INGREDIENT.values()) {
            if (m.name().equals(i_main_ingredient)) {
                main_ingredient = m;
            }
        }

        for (SEASONING s : SEASONING.values()) {
            if (s.name().equals(i_seasoning)) {
                seasoning = s;
            }
        }

        Soup soup = new Soup(type, main_ingredient, seasoning);

        System.out.println(soup.type);
        System.out.println(soup.main_ingredient);
        System.out.println(soup.seasoning);
    }
}
