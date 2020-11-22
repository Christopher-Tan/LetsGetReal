public class RealNumber {
    private double value;

    public RealNumber(double v) {
        value = v;
    }
    public double getValue() {
        return value;
    }
    public String toString() {
        return "" + getValue();
    }
    public boolean equals(RealNumber other) {
        if (other.getValue() == 0 || this.getValue() == 0) {
            if (this.getValue() == other.getValue()) {
                return true;
            }
            return false;
        }
        double error = (this.getValue() - other.getValue()) / (this.getValue());
        if (Math.abs(error) < 0.00001) {
            return true;
        }
        return false;
    }
    public RealNumber add(RealNumber other) {
        return new RealNumber(this.getValue() + other.getValue());
    }
}