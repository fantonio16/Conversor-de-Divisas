import java.util.Objects;

public final class Moneda {
    private final String base_code;
    private final String target_code;
    private final double conversion_rate;

    public Moneda(String base_code, String target_code, double conversion_rate) {
        if (base_code == null || target_code == null) {
            throw new IllegalArgumentException("Base code and target code cannot be null");
        }
        this.base_code = base_code;
        this.target_code = target_code;
        this.conversion_rate = conversion_rate;
    }


    public String base_code() {
        return base_code;
    }

    public String target_code() {
        return target_code;
    }

    public double conversion_rate() {
        if (conversion_rate <= 0) {
            throw new IllegalArgumentException("Conversion rate must be positive");

        }
        return conversion_rate;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Moneda) obj;
        return Objects.equals(this.base_code, that.base_code) &&
                Objects.equals(this.target_code, that.target_code) &&
                Double.doubleToLongBits(this.conversion_rate) == Double.doubleToLongBits(that.conversion_rate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(base_code, target_code, conversion_rate);
    }

    @Override
    public String toString() {
        return "1 " + base_code + " = " + conversion_rate + " " + target_code;
    }


}
