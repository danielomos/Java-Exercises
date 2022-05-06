package chapter_3;

import java.time.LocalDate;

public class HealthReacords {
    private String firstName;
    private String lastName;
    private String gender;
    private int dobYear;
    private int dobMonth;
    private int dobDay;
    private int heightInches;
    private int weightPounds;

    public HealthReacords(String firstName, String lastName, String gender, int dobYear, int dobMonth,int dobDay, int heightInches, int weightPounds) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dobYear = dobYear;
        this.dobMonth = dobMonth;
        this.dobDay = dobDay;
        this.weightPounds = weightPounds;
        this.heightInches = heightInches;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getDobYear() {
        return dobYear;
    }

    public void setDobYear(int dobYear) {
        this.dobYear = dobYear;
    }

    public void setDobDay(int dobDay) {
        this.dobDay = dobDay;
    }

    public int getDobDay() {
        return dobDay;
    }

    public void setDobMonth(int dobMonth) {
        this.dobMonth = dobMonth;
    }

    public int getDobMonth() {
        return dobMonth;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public int getHeightInches() {
        return heightInches;
    }

    public void setHeightInches(int heightInches) {
        this.heightInches = heightInches;
    }

    public void setWeightPounds(int weightPounds) {
        this.weightPounds = weightPounds;
    }

    public int getWeightPounds() {
        return weightPounds;
    }
    public int getAgeInYears(){
        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();
        return (currentYear) - (dobYear);
    }
    public int getMaxHeartRate(){
        return 220 - (getAgeInYears());
    }

    public int targetHeartRate(){
        return (getMaxHeartRate() * 85) / 100;
    }
    public double getbMi(){
        return (weightPounds * 703)/ (heightInches*heightInches);
    }
}
