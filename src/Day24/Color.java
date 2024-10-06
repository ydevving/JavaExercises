package Day24;

public class Color {
    int r;
    int g;
    int b;

    public final static Color white = new Color(255, 255, 255);
    public final static Color black = new Color(0, 0, 0);
    public final static Color red = new Color(255, 0, 0);
    public final static Color orange = new Color(255, 165, 0);
    public final static Color yellow = new Color(255, 255, 0);
    public final static Color green = new Color(0, 128, 0);
    public final static Color blue = new Color(0, 0, 255);
    public final static Color purple = new Color(128, 0, 128);

    int clamp(int value, int min, int max) {
        return Math.max(min, Math.min(max, value));
    }

    public Color(int r, int g, int b) {
        this.r = clamp(r, 0, 255);
        this.g = clamp(g, 0, 255);
        this.b = clamp(b, 0, 255);
    }
}
