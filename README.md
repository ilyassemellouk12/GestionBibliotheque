# Gestion de Bibliothèque en Kotlin

Mini projet Kotlin : gestion d'une bibliothèque avec emprunt, retour et consultation de médias (livres, magazines, journaux, enregistrements audio et DVD).

## Exécution

1. Ouvrir le projet dans IntelliJ IDEA.
2. Ouvrir le fichier `src/Main.kt`.
3. Cliquer sur le bouton ▶ à côté de `fun main()`.

Le programme lance d'abord les tests, puis ouvre un menu interactif dans la console (taper `0` pour quitter).

## Structure du projet

| Fichier | Rôle |
|---|---|
| `Media.kt` | Classe abstraite de base (titre, date de parution) |
| `Empruntable.kt` | Interface des médias empruntables |
| `Consultable.kt` | Interface des médias consultables sur place |
| `Livre.kt` | Empruntable et consultable |
| `EnregistrementAudio.kt`, `DVD.kt` | Empruntables uniquement |
| `Magazine.kt`, `Journal.kt` | Consultables sur place uniquement |
| `Bibliotheque.kt` | Gestion des médias et des emprunts en cours |
| `Menu.kt` | Menu interactif dans la console |
| `Main.kt` | Tests et lancement du programme |

## Format des dates

Les dates sont des `String` au format ISO 8601 : `YYYY-MM-DD` (ex : `2010-01-01`).

## Validation et exceptions

- Un média déjà emprunté ne peut pas être emprunté une deuxième fois.
- Un média non emprunté ne peut pas être retourné.
- Les magazines et journaux ne peuvent pas être empruntés.
- Les DVD et enregistrements audio ne peuvent pas être consultés sur place.
