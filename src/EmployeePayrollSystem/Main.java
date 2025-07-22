public class Main {
    public static void main(String[] args) {
        String[] types = {"FULL_TIME", "PART_TIME", "CONTRACTOR", "INTERN",
                "FULL_TIME"};
        double[] hours = {45, 20, -35, 15, 50};
        double[] rates = {25.0, -18.0, 40.0, 12.0, 30.0};
        String[] names = {"Alice", "Bob", "Charlie", "Diana", "Eve"};

        PayrollCalculator.processPayroll(types, hours, rates, names);
    }
}
