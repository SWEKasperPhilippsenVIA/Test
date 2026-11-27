# Opgave 3 – kodegennemgang og test

## To kodevurderinger
1. Guard condition: `query == null || query.trim().isEmpty()` forhindrer et fejlende metodekald og giver en tom resultatliste. Kortslutning i `||` betyder, at `trim()` ikke kaldes ved null.
2. Den almindelige for-løkke med `contains(searchText)` finder delvise navne og bevarer rækkefølgen. Resultatet lægges i en ny `ArrayList`, så den oprindelige samling ikke fjernes eller omsorteres.

## Dokumenterede tests (lokalt OpenJDK 21)
| Nr. | Input | Forventet | Faktisk | Resultat |
| --- | --- | --- | --- | --- |
| 1 | Lugia | Lugia | 1: Lugia | PASS |
| 2 | shining | Shining Gyarados, Shining Charizard | 2 i korrekt rækkefølge | PASS |
| 3 | "  lUG  " | Lugia | 1: Lugia | PASS |
| 4 | Pikachu | Tom | 0 | PASS |
| 5 | "   " | Tom | 0 | PASS |
| 6 | null | Tom | 0 | PASS |
| 7 | gia | Lugia | 1: Lugia | PASS |

Ved alle tests forblev samlingen på fem kort.

**Resultat:** 7/7 bestået i første version, uden fundne fejl. Koden blev verificeret ved faktisk kompilering og afvikling i et lokalt Java 21-miljø, ikke i IntelliJ.

**Adskilte commits:** søgemetoden `7385cf4` og testene `7105398`.
