// Gère la liste des médias et la liste des emprunts en cours
class Bibliotheque {
    private val medias: MutableList<Media> = mutableListOf()
    private val emprunts: MutableList<Media> = mutableListOf()

    fun ajouterMedia(media: Media) {
        medias.add(media)
    }

    fun emprunter(media: Media) {
        if (media !is Empruntable) {
            println("Le média '${media.titre}' ne peut pas être emprunté (consultation sur place uniquement).")
        } else if (media.emprunter()) {
            emprunts.add(media)
        } else {
            println("Le média '${media.titre}' est déjà emprunté.")
        }
    }

    fun retourner(media: Media) {
        if (media !is Empruntable) {
            println("Le média '${media.titre}' ne peut pas être emprunté, donc pas retourné.")
        } else if (media.retourner()) {
            emprunts.remove(media)
        } else {
            println("Le média '${media.titre}' n'est pas emprunté.")
        }
    }

    fun consulter(media: Media) {
        if (media is Consultable) {
            media.consulter()
        } else {
            println("Le média '${media.titre}' ne peut pas être consulté sur place.")
        }
    }

    fun afficherEmprunts() {
        println("Emprunts en cours:")
        for (media in emprunts) {
            media.afficher()
        }
    }

    fun afficherMedias() {
        println("Médias de la bibliothèque:")
        for (media in medias) {
            media.afficher()
        }
    }

    // Recherche de médias
    fun rechercher(titre: String): Media? {
        for (media in medias) {
            if (media.titre.equals(titre, ignoreCase = true)) {
                return media
            }
        }
        return null
    }

    // Disponibilité des médias
    fun afficherDisponibles() {
        println("Médias disponibles à l'emprunt:")
        for (media in medias) {
            if (media is Empruntable && media !in emprunts) {
                media.afficher()
            }
        }
    }

    // Statistiques
    fun afficherStatistiques() {
        println("Statistiques de la bibliothèque:")
        println(" - Livres : ${medias.filter { it is Livre }.size}")
        println(" - Magazines : ${medias.filter { it is Magazine }.size}")
        println(" - Journaux : ${medias.filter { it is Journal }.size}")
        println(" - Enregistrements audio : ${medias.filter { it is EnregistrementAudio }.size}")
        println(" - DVD : ${medias.filter { it is DVD }.size}")
        println(" - Total : ${medias.size}")
    }
}