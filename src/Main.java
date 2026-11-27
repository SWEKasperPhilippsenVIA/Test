public class Main {
    public static void main(String[] args) {
        CardCollection collection = new CardCollection();
        collection.addCard(new PokemonCard("Lugia", "Neo Genesis"));
        collection.addCard(new PokemonCard("Umbreon", "Neo Discovery"));
        collection.addCard(new PokemonCard("Shining Gyarados", "Neo Revelation"));
        collection.addCard(new PokemonCard("Shining Charizard", "Neo Destiny"));
        collection.addCard(new PokemonCard("Ho-Oh", "Neo Revelation"));
        System.out.println("Antal kort i samlingen: " + collection.getCount());
    }
}
