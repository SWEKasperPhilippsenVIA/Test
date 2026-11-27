# Opgave 4 – metodeforklaring og funktionel ændring

**Vigtig afgrænsning:** Nedenstående metodeforklaring og kodeændring er fremstillet med AI-hjælp. De er nyttige som eksempel og fungerer teknisk, men udgør ikke en elevs selvstændige kontrol uden AI. Hvis underviseren kræver egen udførelse, skal den del gennemføres selvstændigt og dokumenteres i eget IDE.

## A. Forklar metoden
`searchByName(String query)` modtager søgetekst og returnerer en `ArrayList<PokemonCard>` med de kort, som matcher. Den læser `cards` og `card.getName()`, men ændrer ikke selve samlingen. Hvis `query` er null eller kun mellemrum, returneres en tom liste. `Lug` matcher `Lugia`, mens `Pikachu` ikke matcher nogen af de fem testkort. `shining` finder to kort i den oprindelige rækkefølge.

## B. Separat funktionel ændring – eksempel
**Ny regel:** Søgeresultater kan nu begrænses til de første `maxResults` kort. Et maksimum på nul eller mindre giver en tom liste. Den oprindelige metode er stadig tilgængelig.

**Før:** `searchByName("shining")` returnerede to kort uden mulighed for grænse.

**Efter:** `searchByName("shining", 1)` returnerer kun `Shining Gyarados`. `searchByName("shining", 2)` returnerer begge. `searchByName("shining", 0)` returnerer ingen.

Den nye overload bruger den eksisterende søgemetode, hvorefter en almindelig for-løkke overfører højst `maxResults` kort til en ny liste. Ingen kort slettes. De oprindelige syv tests blev også kørt igen.

**Verificeret:** 10/10 tests bestod i OpenJDK 21.

**Separat commit:** `b726d3af49df9272e008f20df638746b05cb28b2` (kode) og `d94f06f43801c9abcf09864ecf347c49fb38e877` (tests).
