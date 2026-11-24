// Menu dans la console pour utiliser la bibliothèque
fun menu(bibliotheque: Bibliotheque) {
    var choix: Int?
    do {
        println()
        println("===== MENU BIBLIOTHÈQUE =====")
        println("1. Afficher tous les médias")
        println("2. Afficher les médias disponibles")
        println("3. Afficher les emprunts en cours")
        println("4. Emprunter un média")
        println("5. Retourner un média")
        println("6. Consulter un média sur place")
        println("7. Rechercher un média par titre")
        println("8. Afficher les statistiques")
        println("0. Quitter")
        print("Votre choix : ")

        choix = readln().trim().toIntOrNull()

        when (choix) {
            1 -> bibliotheque.afficherMedias()
            2 -> bibliotheque.afficherDisponibles()
            3 -> bibliotheque.afficherEmprunts()
            4 -> {
                val media = demanderMedia(bibliotheque)
                if (media != null) bibliotheque.emprunter(media)
            }
            5 -> {
                val media = demanderMedia(bibliotheque)
                if (media != null) bibliotheque.retourner(media)
            }
            6 -> {
                val media = demanderMedia(bibliotheque)
                if (media != null) bibliotheque.consulter(media)
            }
            7 -> {
                val media = demanderMedia(bibliotheque)
                media?.afficher()
            }
            8 -> bibliotheque.afficherStatistiques()
            0 -> println("Au revoir !")
            else -> println("Choix invalide : entrez un nombre entre 0 et 8.")
        }
    } while (choix != 0)
}

// Demande un titre (non vide) et retourne le média trouvé, ou null s'il n'existe pas.
fun demanderMedia(bibliotheque: Bibliotheque): Media? {
    var titre: String
    do {
        print("Titre du média : ")
        titre = readln().trim()
        if (titre.isEmpty()) println("Le titre ne doit pas être vide.")
    } while (titre.isEmpty())

    val media = bibliotheque.rechercher(titre)
    if (media == null) {
        println("Aucun média trouvé avec le titre '$titre'.")
    }
    return media
}