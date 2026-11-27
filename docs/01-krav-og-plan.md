# Opgave 1 – krav og forventet adfærd

## Formål
Til semesterprojektets Pokémon-kortsamling vil jeg afprøve en enkel navnesøgning i en lille samling. Øvelsen holdes adskilt fra hele appen og kan derfor testes i konsollen uden brugergrænseflade eller database.

**Klasser:** `PokemonCard`, `CardCollection` og `Main`.

## Krav
1. `searchByName(String)` finder kort, når navnet indeholder søgeteksten, uden forskel på store og små bogstaver.
2. `null`, tom tekst eller tekst med kun mellemrum giver en tom resultatliste. Søgeteksten trimmes.
3. Metoden ændrer ikke den oprindelige samling og bevarer rækkefølgen af matchende kort.

Agenten må kun ændre `CardCollection.java` og `Main.java`. Ingen database, GUI eller eksterne biblioteker.

## Forventede afprøvninger før implementering
- Søgeord `Lugia` giver præcis `Lugia`.
- Søgeord `shining` giver `Shining Gyarados` og `Shining Charizard` i den rækkefølge.
- Søgeord `  lUG  ` giver `Lugia` (trim og ikke forskel på store/små bogstaver).
- `null`, `   ` og `Pikachu` giver hver nul resultater.
- Antal kort skal fortsat være 5 efter alle søgninger.

## Opgave 2 – prompt til agenten
Jeg går på første semester og arbejder i Java. Du må læse projektets tre Java-klasser.
Implementér en afgrænset søgning i `CardCollection` efter kravene ovenfor.
Brug for-løkke, if-sætning, ArrayList og almindelige strengmetoder.
Skriv først en plan på højst fem punkter. Vent med at ændre filer, indtil planen er vurderet.
Undlad database, GUI, stream-API, tredjepartsbiblioteker og andre projektændringer.

## Plan og vurdering
1. Læs de tre nuværende Java-filer.
2. Tilføj en søgemetode, som håndterer ugyldigt input.
3. Gennemgå kortene i samlingen og opbyg en ny liste med matchende kort.
4. Afprøv normal søgning, ugyldigt input og flere resultater i `Main`.
5. Kør programmet og kontroller, at samlingen ikke er ændret.

Planen er lille og holder sig til det, der er relevant på første semester.
