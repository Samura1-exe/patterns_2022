public class Latte extends AbstractShop{
    @Override
    void mainIngredient(){
        Ingredients.coffee();
    }

    @Override
    void secondIngredient() {
        Ingredients.water();
    }

    @Override
    void thirdIngredient() { Ingredients.milk();}
}
