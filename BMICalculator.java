// BMICalculator class is a utility class that's used to calculate the BMI value in both Imperial and Metric systems
public class BMICalculator {

  // Please declare 4 attributes/properties to represent weight in pounds, height in inches, weight in kilos and height in meters
  private double weightInPounds;
  private double heightInInches;
  private double weightInKilos;
  private double heightInMeters;
  // Please use this default no arguments constructor to initialize the 4 properties to some initial values
  public BMICalculator() {
      this.weightInPounds = 154;
      this.heightInInches = 69;
      this.weightInKilos = 70;
      this.heightInMeters = 1.75;

  }

  // Please implement the calculateBmiImperial() method to take in weight and height to calculate and return the BMI value in the Imperial system
  public double calculateBmiImperial(double weightInPounds, double heightInInches) {
      this.weightInPounds = weightInPounds;
      this.heightInInches = heightInInches;
      return (this.weightInPounds * 703) / (this.heightInInches * this.heightInInches);
  }

  // Please implement the calculateBmiMetric() method to take in weight and height to calculate and return the BMI value in the Metric system
  public double calculateBmiMetric(double weightInKilos, double heightInMeters) {
      this.weightInKilos = weightInKilos;
      this.heightInMeters = heightInMeters;
      return this.weightInKilos / (this.heightInMeters * this.heightInMeters);
  }

  // Please implement the getBMICategory() method so that it takes the BMI value and returns the BMI category based on it
  public String getBMICategory(double bmi) {
      if (bmi < 18.5) {
          return "Underweight";
      } else if (bmi < 25) {
          return "Normal weight";
      } else if (bmi < 30) {
          return "Overweight";
      } else {
          return "Obese";
      }
  }
}