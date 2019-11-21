/**
 *
 * @author cd05
 */
class CarRepair {

    private double parts;
    private double hours;
    private static final double HOURS_COST = 20;
    private static final double VAT = 17.5;

    public CarRepair(double parts, double hours) {
        this.parts = parts;
        this.hours = hours;
    }

    public double calculateBill() {
        double bill = parts + hours * HOURS_COST;
        return bill * (1 + VAT / 100);
    }
}
