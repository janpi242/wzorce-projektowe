// Przykładowe użycie
public class SingletonDemo {
    public static void main(String[] args) {
        // Pobieranie instancji Singletona
        Singleton singleton = Singleton.getInstance();

        // Wywołanie metody na Singletonie
        singleton.showMessage();

        // Sprawdzenie czy faktycznie nie generowana jest nowa instancja
        Singleton singleton2 = Singleton.getInstance();
        singleton.showMessage();
    }
}
