public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        double price = 1590.99;
        int miles = service.calculate (price);
        System.out.println(miles);
    }
}