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
    public int compareTo(Number other) {
        if (this.equals(other)) {
            return 0;
        }
        if (this.getValue() < other.getValue()) {
            return -1;
        }
        if (this.getValue() > other.getValue()) {
            return 1;
        }
        return 0;
    }
}