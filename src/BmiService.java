public class BmiService {
    public double calculate (double weight, double growth) {
        double bodyMass = weight / (growth * growth);
        return bodyMass;
    }
}
