package group8.bmi;


public class BMI {

    public static void main(String[] args) {
       double height = 1.43;
       double weight = 62;
       double BMI = weight / (height * height);
       
       if (BMI < 18.5){
           System.out.println("Underweight");} 
       else if (BMI >= 18.5 && BMI <= 25.0) {
           System.out.println("Normal");}
       else if (BMI >= 25.0 && BMI <= 30) {
           System.out.println("");}
       else if (BMI > 30);{
           System.out.println("Obese");}
       
    }
}
