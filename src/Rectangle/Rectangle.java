package Rectangle;

public class Rectangle {
    private int height;
    private int width;

    public Rectangle(int height, int width){
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if ( height > 0 ) {
            this.height = height;
        }else {
            System.err.println("error");
        }
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if ( width > 0) {
            this.width = width;
        } else {
            System.err.println("error");
        }
    }

    public int Perimeter() {
        int width = getWidth();
        int height = getHeight();
        return ((width*2)+(height*2));
    }

    public int Area() {
        int width = getWidth();
        int height = getHeight();
        return (width*height);
    }
    public void printRectangle() {
        int width = getWidth();
        int height = getHeight();
        System.out.println("perimetro del rettangolo" + ((width*2)+(height*2)));
        System.out.println("area del rettangolo" + (width*height));
    }

}
