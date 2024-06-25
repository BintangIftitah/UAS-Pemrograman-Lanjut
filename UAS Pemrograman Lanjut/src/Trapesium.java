public class Trapesium {
    private double base;
    private double bBase;
    private double height;
    private double sideMiring;

    public Trapesium(double base, double bBase, double height) {
        this.base = base;
        this.bBase = bBase;
        this.height = height;
        this.sideMiring = hitungSisiMiring();
    }

    public double hitungKeliling() {
        return base + bBase + 2 * sideMiring;
    }

    private double hitungSisiMiring() {
        return Math.sqrt(Math.pow((bBase - base) / 2, 2) + Math.pow(height, 2));
    }

    public double getBase() {
        return base;
    }

    public double getBBase() {
        return bBase;
    }

    public double getHeight() {
        return height;
    }

    public double getSideMiring() {
        return sideMiring;
    }
}
