public class Singleton {
    private static Singleton instance;

    // Prywatny konstruktor, aby zapobiec bezpośredniemu tworzeniu instancji
    private Singleton() {
    }

    // Metoda statyczna zwracająca instancję Singletona
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                // Sprawdzamy ponownie warunek, aby uniknąć wielokrotnego utworzenia instancji w przypadku równoczesnych wywołań
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    // Metoda używana do prezentacji Singletona
    public void showMessage() {
        System.out.println("Jestem Singletonem!");
        System.out.println(instance);
    }
}
