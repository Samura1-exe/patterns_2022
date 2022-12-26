public class BlackTea extends AbstractShop{

    @Override
    void mainIngredient() {
        Ingredients.teaBlack();
    }

    @Override
    void secondIngredient() {
        Ingredients.water();
    }

    @Override
    void thirdIngredient() { Ingredients.sugar();}
}
