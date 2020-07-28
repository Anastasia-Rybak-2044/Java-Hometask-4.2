public class Main {
    public static void main(String[] args) {
        Bmiservice bmiservice = new Bmiservice();
        float weightKg = (float) 70.5;
        float heightM = (float) 1.80;
        float bmi = (float) bmiservice.calculate(weightKg, heightM);
        System.out.println(bmi);
    }
}