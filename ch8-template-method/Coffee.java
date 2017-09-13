/**
 * 这是我们的咖啡类,用来煮咖啡
 */
public class Coffee {
    void prepareRecipe(){
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }

    private void addSugarAndMilk() {
        System.out.println("addSugarAndMilk");
    }

    private void pourInCup() {
        System.out.println("pourInCup");
    }

    private void brewCoffeeGrinds() {
        System.out.println("brewCoffeeGrinds");
    }

    private void boilWater() {
        System.out.println("boilWater");
    }
}
