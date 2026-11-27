import java.util.ArrayList;
import java.util.Locale;

public class CardCollection {
    private final ArrayList<PokemonCard> cards = new ArrayList<>();

    public void addCard(PokemonCard card) {
        cards.add(card);
    }

    public int getCount() {
        return cards.size();
    }

    public ArrayList<PokemonCard> searchByName(String query) {
        ArrayList<PokemonCard> matches = new ArrayList<>();

        if (query == null || query.trim().isEmpty()) {
            return matches;
        }

        String searchText = query.trim().toLowerCase(Locale.ROOT);
        for (PokemonCard card : cards) {
            String name = card.getName().toLowerCase(Locale.ROOT);
            if (name.contains(searchText)) {
                matches.add(card);
            }
        }

        return matches;
    }

    // Ekstra funktion: vis kun de foerste maxResults resultater.
    public ArrayList<PokemonCard> searchByName(String query, int maxResults) {
        ArrayList<PokemonCard> limited = new ArrayList<>();
        if (maxResults <= 0) {
            return limited;
        }
        ArrayList<PokemonCard> matches = searchByName(query);
        for (int i = 0; i < matches.size() && i < maxResults; i++) {
            limited.add(matches.get(i));
        }
        return limited;
    }
}
