public abstract class AbstractShop {
    abstract void mainIngredient();
    abstract void secondIngredient();
    abstract void thirdIngredient();

    public final void MakeBeverage(){
        mainIngredient();
        secondIngredient();
        thirdIngredient();
    }
}
