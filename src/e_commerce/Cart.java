package e_commerce;

public class Cart {
    private final String owner;
    private Article[] articleList;
    private  int total;
    public Cart(String owner) {
        this.owner = owner;
        this.articleList = new Article[10];
        this.total = 0;
    }

    public String getOwner() {
        return owner;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal() {

        this.total = total;
    }
}
