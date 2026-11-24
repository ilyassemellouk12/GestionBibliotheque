// Un livre : on peut l'emprunter et le consulter sur place
class Livre(titre: String, val auteur: String, val editeur: String, dateDeParution: String) :
    Media(titre, dateDeParution), Empruntable, Consultable {

    private var emprunte = false

    override fun emprunter(): Boolean {
        if (emprunte) return false
        emprunte = true
        println("Le livre '$titre' de '$auteur' a été emprunté.")
        return true
    }

    override fun retourner(): Boolean {
        if (!emprunte) return false
        emprunte = false
        println("Le livre '$titre' de '$auteur' a été retourné.")
        return true
    }

    override fun consulter() {
        println("Le livre '$titre' de '$auteur' est consulté sur place.")
    }

    override fun afficher() {
        println(" - Livre: Titre = '$titre', Auteur = '$auteur', Éditeur = '$editeur', Date de parution = '$dateDeParution'")
    }
}