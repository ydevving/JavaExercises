package Day25;

enum COLOR {
    Red,
    Green,
    Blue,
    Yellow
}

enum RANK {
    One,
    Two,
    Three,
    Four,
    Five,
    Six,
    Seven,
    Eight,
    Nine,
    Ten,
    Dollar,
    Percent,
    Caret,
    Ampersand
}

public class Card {

    COLOR color = null;
    RANK rank = null;

    public Card(COLOR color, RANK rank) {
        this.color = color;
        this.rank = rank;
    }

    public String tell_rank_type() {
        String number_repr[] = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
        String symbol_repr[] = {"Dollar", "Percent", "Caret", "Ampersand"};

        for (String c : number_repr) {
            if (this.color.name().equals(c))
                return "Number";
        }

        for (String r : symbol_repr) {
            if (this.rank.name().equals(r))
                return "Symbol";
        }

        return null;
    }

    public void create_instance() {
        for (COLOR c : COLOR.values()) {
            for (RANK r : RANK.values()) {
                Card card = new Card(c, r);
                System.out.println("The " + c.name() + " " + r.name());
            }
        }
    }

    // Answer: Because we don't have to know the specific internal details like rgb only the textbook definition of the color
}
