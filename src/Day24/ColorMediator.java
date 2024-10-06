package Day24;

import Day24.Color;

public class ColorMediator {

    public void body() {
        // Serves as main method
        Color new_color = new Color(42, 24, 1);
        Color purple = Color.purple;

        System.out.println("new_color values = R: " + new_color.r + ", G: " + new_color.g + ", B: " + new_color.b);
        System.out.println("purple values = R: " + purple.r + ", G: " + purple.g + ", B: " + purple.b);
    }
}
