public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bodyMass = service.calculate(53.0, 1.7);
        System.out.println(Math.round (bodyMass));
    }
}
