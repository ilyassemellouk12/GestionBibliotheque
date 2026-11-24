// Interface pour les médias qu'on peut emprunter et retourner
interface Empruntable {
    fun emprunter(): Boolean
    fun retourner(): Boolean
}