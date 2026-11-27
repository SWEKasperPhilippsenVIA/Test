# Opgave 2 – afgrænset agentforløb

**Værktøj brugt i denne gennemførelse:** ChatGPT med GitHub-connector, der kan hente og ændre repositoryfiler. Det var ikke en aktiv Claude Agent-session i IntelliJ. Et autentisk screenshot fra IntelliJ/Claude er derfor ikke tilgængeligt.

## Prompt
Jeg arbejder med Java på første semester. Læs `PokemonCard.java`, `CardCollection.java` og `Main.java`. Tilføj en `searchByName(String)`-metode, som finder delvise navnematches uden forskel på store og små bogstaver. Returnér en tom liste ved null/tom input, og ændr ikke samlingen. Ændr kun `CardCollection.java` og `Main.java`. Brug simple Java-konstruktioner. Vis først en kort plan med op til fem trin.

## Kort plan
1. Læs klasserne og de planlagte tests.
2. Beskyt mod null og tomt input.
3. Gennemgå kortene og saml resultater i en ny ArrayList.
4. Afprøv mindst tre relevante inputforløb.
5. Kontrollér oprindelig samlingsstørrelse og rækkefølge.

## Vurdering
Planen holder sig til en overskuelig søgemetode og det grundlæggende Java-stof. Derfor blev den gennemført uden database, grafisk brugergrænseflade eller biblioteker.

## Dokumenterede værktøjshandlinger
GitHub-forbindelsen læste de tre Java-filer, ændrede `CardCollection.java` og `Main.java` og oprettede commits:
- Søgemetode: `7385cf43313a0d2ad344930df583a3037e4f21e2`
- Testkode: `7105398ad5578f428f7149a2854419b68270ae39`

Dette er GitHub-værktøjsarbejde og ikke dokumentation for Claude Agent i IntelliJ.
