// Un enregistrement audio : on peut seulement l'emprunter
class EnregistrementAudio(titre: String, val duree: Int, val genre: String, dateDeParution: String) :
    Media(titre, dateDeParution), Empruntable {

    private var emprunte = false

    override fun emprunter(): Boolean {
        if (emprunte) return false
        emprunte = true
        println("L'enregistrement audio '$titre' a été emprunté.")
        return true
    }

    override fun retourner(): Boolean {
        if (!emprunte) return false
        emprunte = false
        println("L'enregistrement audio '$titre' a été retourné.")
        return true
    }

    override fun afficher() {
        println(" - Enregistrement Audio: Titre = '$titre', Durée = '$duree' secondes, Genre = '$genre'")
    }
}