// Un DVD : on peut seulement l'emprunter
class DVD(titre: String, val duree: Int, val genre: String, dateDeParution: String) :
    Media(titre, dateDeParution), Empruntable {

    private var emprunte = false

    override fun emprunter(): Boolean {
        if (emprunte) return false
        emprunte = true
        println("Le DVD '$titre' a été emprunté.")
        return true
    }

    override fun retourner(): Boolean {
        if (!emprunte) return false
        emprunte = false
        println("Le DVD '$titre' a été retourné.")
        return true
    }

    override fun afficher() {
        println(" - DVD: Titre = '$titre', Durée = '$duree' secondes, Genre = '$genre'")
    }
}