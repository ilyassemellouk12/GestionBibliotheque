fun main() {
    val bibliotheque = Bibliotheque()
    val magazine = Magazine("National Geographic", "2026-10-28", "10")
    val journal = Journal("Le Monde", "2026-10-28")
    val enregistrementAudio = EnregistrementAudio("Beethoven - Symphonie No.9", 960, "Classical", "1967-01-01")
    val dvd = DVD("Inception", 8880, "Action", "2010-01-01")
    val livre = Livre("1984", "George Orwell", "Gallimard", "1972-01-01")

    bibliotheque.ajouterMedia(magazine)
    bibliotheque.ajouterMedia(journal)
    bibliotheque.ajouterMedia(enregistrementAudio)
    bibliotheque.ajouterMedia(dvd)
    bibliotheque.ajouterMedia(livre)

    bibliotheque.emprunter(dvd)
    bibliotheque.emprunter(livre)
    bibliotheque.consulter(magazine)
    bibliotheque.consulter(journal)
    bibliotheque.emprunter(enregistrementAudio)
    bibliotheque.afficherEmprunts()
    bibliotheque.retourner(dvd)
    bibliotheque.retourner(livre)
    bibliotheque.afficherEmprunts()

    // Vérification des actions non valides
    println()
    bibliotheque.emprunter(enregistrementAudio)
    bibliotheque.emprunter(magazine)
    bibliotheque.retourner(livre)
    bibliotheque.consulter(dvd)

    println()
    println(bibliotheque.rechercher("1984")?.titre ?: "Aucun média trouvé.")
    println(bibliotheque.rechercher("Harry Potter")?.titre ?: "Aucun média trouvé.")

    println()
    bibliotheque.afficherDisponibles()

    println()
    bibliotheque.afficherStatistiques()

    menu(bibliotheque)
}