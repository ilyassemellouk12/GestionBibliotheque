// Classe de base pour tous les médias (date au format YYYY-MM-DD)
abstract class Media(val titre: String, val dateDeParution: String) {
    abstract fun afficher()
}