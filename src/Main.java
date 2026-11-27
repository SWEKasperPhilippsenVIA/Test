import java.util.ArrayList;

public class Main {
    private static int testsPassed = 0;

    public static void main(String[] args) {
        CardCollection collection = new CardCollection();
        collection.addCard(new PokemonCard("Lugia", "Neo Genesis"));
        collection.addCard(new PokemonCard("Umbreon", "Neo Discovery"));
        collection.addCard(new PokemonCard("Shining Gyarados", "Neo Revelation"));
        collection.addCard(new PokemonCard("Shining Charizard", "Neo Destiny"));
        collection.addCard(new PokemonCard("Ho-Oh", "Neo Revelation"));

        checkSearch(collection, "Lugia", "Lugia");
        checkSearch(collection, "shining", "Shining Gyarados", "Shining Charizard");
        checkSearch(collection, "  lUG  ", "Lugia");
        checkSearch(collection, "Pikachu");
        checkSearch(collection, "   ");
        checkSearch(collection, null);
        checkSearch(collection, "gia", "Lugia");

        System.out.println("RESULTAT: " + testsPassed + "/7 test bestaaet");
    }

    private static void checkSearch(CardCollection collection, String query, String... expected) {
        ArrayList<PokemonCard> results = collection.searchByName(query);
        if (results.size() != expected.length) {
            throw new AssertionError("Forkert antal resultater for: " + query);
        }

        for (int i = 0; i < expected.length; i++) {
            if (!results.get(i).getName().equals(expected[i])) {
                throw new AssertionError("Forkert kort eller raekkefoelge for: " + query);
            }
        }

        if (collection.getCount() != 5) {
            throw new AssertionError("Soegning maa ikke aendre samlingen");
        }

        testsPassed++;
        System.out.println("PASS " + testsPassed + " | soegning: " + String.valueOf(query)
                + " | fundet: " + results.size() + " | samling: " + collection.getCount());
    }
}
