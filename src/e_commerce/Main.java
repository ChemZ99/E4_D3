package e_commerce;

import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
    Customer testCustomer = new Customer("001","mario","rossi", new Date());
    Cart testCart = new Cart(testCustomer.getCode());
    Article a0 = new Article("00",19.99,84);
    Article a1 = new Article("01",9.99,21);
    Article a2 = new Article("02",45.99,99);
    Article a3 = new Article("03",32.99,63);
    Article a4 = new Article("04",78.99,3);
    Article a5 = new Article("05",3.99,78);
    Article a6 = new Article("06",15.99,23);
    Article a7 = new Article("07",76.99,45);
    Article a8 = new Article("08",35.99,23);
    Article a9 = new Article("09",0.99,19);
    testCart.setArticleList(a0);
    testCart.setArticleList(a1);
    testCart.setArticleList(a2);
    testCart.setArticleList(a3);
    testCart.setArticleList(a4);
    testCart.setArticleList(a5);
    testCart.setArticleList(a6);
    testCart.setArticleList(a7);
    testCart.setArticleList(a8);
    testCart.setArticleList(a9);
    testCart.printArticleList();
    testCart.printTotal();
    }
}
