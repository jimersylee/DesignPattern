public class Tea {
    void prepareRecipe(){
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }

    private void addLemon() {
        System.out.println("addLemon");
    }

    private void pourInCup() {
        System.out.println("pourInCup");
    }

    private void steepTeaBag() {
        System.out.println("steepTeaBag");
    }

    private void boilWater() {
        System.out.println("boilWater");
    }
}
