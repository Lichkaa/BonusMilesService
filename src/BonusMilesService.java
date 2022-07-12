public class BonusMilesService {
    public int calculate(int cost) {
        int miles;
        int readout = 20;
        if (cost < 20) {
                miles = 0;
        } else {
            miles = cost / readout;
        }
        return miles;
    }
}
