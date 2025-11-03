public class ujiPolygon {
    public static void main(String[] args) {
        regularpolygon poli1 = new regularpolygon();
        regularpolygon poli2 = new regularpolygon(6, 4);
        regularpolygon poli3 = new regularpolygon(10, 4, 5.6, 7.8);

        System.out.println("--- Poligon 1 ---");
        System.out.println("Keliling: " + poli1.getPerimeter());
        System.out.println("Luas: " + poli1.getArea());

        System.out.println("--- Poligon 2 ---");
        System.out.println("Keliling: " + poli2.getPerimeter());
        System.out.println("Luas: " + poli2.getArea());

        System.out.println("--- Poligon 3 ---");
        System.out.println("Keliling: " + poli3.getPerimeter());
        System.out.println("Luas: " + poli3.getArea());
    }

}
