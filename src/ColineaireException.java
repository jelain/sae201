public class ColineaireException extends Exception {
    public ColineaireException(String message) {
        super(message);
    }
    
    public ColineaireException() {
        super("Les points sont colineaire.");
    }
}