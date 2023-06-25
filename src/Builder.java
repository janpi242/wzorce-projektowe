// Produkt
class Burger {
    private String bun;
    private String patty;
    private String cheese;
    private String sauce;

    public void setBun(String bun) {
        this.bun = bun;
    }

    public void setPatty(String patty) {
        this.patty = patty;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    @Override
    public String toString() {
        return "Burger: " + bun + " + " + patty + " + " + cheese + " + " + sauce;
    }
}

// Budowniczy
interface BurgerBuilder {
    void buildBun();
    void buildPatty();
    void buildCheese();
    void buildSauce();
    Burger getBurger();
}

// Konkretny budowniczy
class CheeseburgerBuilder implements BurgerBuilder {
    private Burger burger;

    public CheeseburgerBuilder() {
        this.burger = new Burger();
    }

    @Override
    public void buildBun() {
        burger.setBun("Sezamowa bułka");
    }

    @Override
    public void buildPatty() {
        burger.setPatty("Wołowina");
    }

    @Override
    public void buildCheese() {
        burger.setCheese("Ser cheddar");
    }

    @Override
    public void buildSauce() {
        burger.setSauce("Majonez");
    }

    @Override
    public Burger getBurger() {
        return burger;
    }
}

// Kierownik
class BurgerDirector {
    private BurgerBuilder builder;

    public void setBuilder(BurgerBuilder builder) {
        this.builder = builder;
    }

    public Burger getBurger() {
        return builder.getBurger();
    }

    public void constructBurger() {
        builder.buildBun();
        builder.buildPatty();
        builder.buildCheese();
        builder.buildSauce();
    }
}

// Przykładowe użycie
public class Builder {
    public static void main(String[] args) {
        BurgerDirector director = new BurgerDirector();
        CheeseburgerBuilder builder = new CheeseburgerBuilder();

        director.setBuilder(builder);
        director.constructBurger();
        Burger burger = director.getBurger();

        System.out.println(burger);
    }
}

