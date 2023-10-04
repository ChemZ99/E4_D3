package Rectangle;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       Rectangle Rec1 = new Rectangle(10, 15);
       Rectangle Rec2 = new Rectangle(3,6);
       print2Rectangles(Rec1,Rec2);
        }
        public static void print2Rectangles(Rectangle r1, Rectangle r2) {
            System.out.println("perimetro rettangolo 1: " + r1.Perimeter());
            System.out.println("perimetro rettangolo 2: " + r2.Perimeter());
            System.out.println("area rettangolo 1: " + r1.Area());
            System.out.println("area rettangolo 2: " + r2.Area());
            System.out.println("somma dei perimetri: " + (r1.Perimeter()+r2.Perimeter()));
            System.out.println("somma delle aree: " + (r1.Area()+r2.Area()));
    }

}