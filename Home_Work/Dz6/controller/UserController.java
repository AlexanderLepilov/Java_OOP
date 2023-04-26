package Home_Work.Dz6.controller;
/*
 * Добавил контроллер, чтоб разбить связь с общей логикой
 */


import Home_Work.Dz6.model.DrinkMachine;
import Home_Work.Dz6.product.Drink;

public class UserController {

    private DrinkMachine products = new DrinkMachine();

    public void setProduct(Drink drink) {
        products.setProduct(drink);
    }

    public void allProduct() {
        products.allProduct();
    }
}