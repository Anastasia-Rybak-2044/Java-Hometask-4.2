public class Bmiservice {
    public float calculate (float weightKg, float heightM){
        float bmi = weightKg / (heightM*heightM);
        return bmi;
    }
}