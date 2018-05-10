public class Cuboid {
    public static void main(String[] args) {
        double a = 10.50;
        double b = 15.40;
        double c = 12.20;

        System.out.println("Surface area: " + 2 * (a * b + b * c + a * c));
        System.out.println("Volume: " + a * b * c);
    }
}
