public class PokemonCard {
    private final String name;
    private final String setName;

    public PokemonCard(String name, String setName) {
        this.name = name;
        this.setName = setName;
    }

    public String getName() {
        return name;
    }

    public String getSetName() {
        return setName;
    }
}
