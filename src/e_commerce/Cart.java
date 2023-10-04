package e_commerce;

import Sim.Call;

public class Cart {
    private final String owner;
    private Article[] articleList;
    private  double total;
    public Cart(String owner) {
        this.owner = owner;
        this.articleList = new Article[10];
        this.total = 0;
    }

    public String getOwner() {
        return owner;
    }

    public double getTotal() {
        setTotal();
        return total;
    }

    public void setTotal() {
        double subTotal = 0;
        for (int i=0; i< articleList.length; i++) {
            double price = articleList[i].getPrice();
                   subTotal+=price;
        }
        this.total = subTotal;
    }
    public void setArticleList(Article a1) {
        for (int i=articleList.length-2; i >= 0; i--) {
            articleList[i+1] = articleList[i];
        }
        articleList[0] = a1;
    }
    public void printArticleList() {
        for (int i=0; i < articleList.length; i++) {
            System.out.println("articolo " + i);
            System.out.println("codice: " + articleList[i].getCode());
            System.out.println("prezzo: " + articleList[i].getPrice());
            System.out.println("quantita': " + articleList[i].getQuantity());
        }
    }
    public void printTotal() {
        System.out.println("totale articoli nel carrello: " + getTotal());
    }
}
