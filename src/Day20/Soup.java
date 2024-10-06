package Day20;

enum TYPE {
    SOUP,
    STEW,
    GUMBO
}

enum MAIN_INGREDIENT {
    MUSHROOMS,
    CHICKEN,
    CARROTS,
    POTATOES
}

enum SEASONING {
    SPICY,
    SALT,
    SWEET
}

public class Soup {

    public TYPE type;
    MAIN_INGREDIENT main_ingredient;
    SEASONING seasoning;

    Soup(TYPE type, MAIN_INGREDIENT main_ingredient, SEASONING seasoning) {
        this.type = type;
        this.main_ingredient = main_ingredient;
        this.seasoning = seasoning;
    }
}
