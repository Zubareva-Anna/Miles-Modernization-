public class BonusMilesService {
    public int calculate(double price) {
        int count = 20;
        int miles = (int) (price / count);
        return miles;
    }
}
