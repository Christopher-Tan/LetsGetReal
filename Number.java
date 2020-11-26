public abstract class Number {
    public abstract double getValue();
    public boolean equals(Number other) {
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
}