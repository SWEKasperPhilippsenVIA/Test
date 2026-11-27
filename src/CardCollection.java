import java.util.ArrayList;

public class CardCollection {
    private final ArrayList<PokemonCard> cards = new ArrayList<>();

    public void addCard(PokemonCard card) {
        cards.add(card);
    }

    public int getCount() {
        return cards.size();
    }
}
