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

        checkLimited(collection, "shining", 1, "Shining Gyarados");
        checkLimited(collection, "shining", 2, "Shining Gyarados", "Shining Charizard");
        checkLimited(collection, "shining", 0);

        System.out.println("RESULTAT: " + testsPassed + "/10 test bestaaet");
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

    private static void checkLimited(CardCollection collection, String query, int limit, String... expected) {
        ArrayList<PokemonCard> results = collection.searchByName(query, limit);
        if (results.size() != expected.length) {
            throw new AssertionError("Forkert antal resultater med graense: " + limit);
        }
        for (int i = 0; i < expected.length; i++) {
            if (!results.get(i).getName().equals(expected[i])) {
                throw new AssertionError("Forkert resultat med graense: " + limit);
            }
        }
        if (collection.getCount() != 5) {
            throw new AssertionError("Samlingen blev aendret");
        }
        testsPassed++;
        System.out.println("PASS " + testsPassed + " | graense: " + limit
                + " | fundet: " + results.size() + " | samling: " + collection.getCount());
    }
}
