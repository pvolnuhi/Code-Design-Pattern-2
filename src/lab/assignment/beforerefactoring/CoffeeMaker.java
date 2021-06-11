package lab.assignment.beforerefactoring;

public class CoffeeMaker {
//client does not change!
//make class
    public void prepareMochaCoffee(){
        boilWater();
        brewEspresso();
        addIngredients();
        finalTouch();
        System.out.println(">>Serving coffee");
    }

    public final void prepareCoffee(){
        boilWater();
        brewEspresso();
        addIngredients();
        System.out.println(">>Serving coffee");

    }

    //default implementation
    private void boilWater() {
        System.out.println("Boiling water");
    }

    //methods to be implemented by subclasses
    protected abstract void addIngredients();
    protected abstract void finalTouch();

    private void brewEspresso() {
        System.out.println("Brewing espresso");
    }

}
