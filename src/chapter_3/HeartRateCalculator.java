package chapter_3;

import java.time.LocalDate;



public class HeartRateCalculator {
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private int monthOfBirth;
    private int dayOfBirth;
    public HeartRateCalculator(String firstName, String lastName, int yearOfBirth, int monthOfBirth, int dayOfBirth){
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.dayOfBirth =dayOfBirth;

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

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }
    public int getAgeInYears(){
        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();
        return (currentYear) - (yearOfBirth);
    }
    public int getMaxHeartRate(){
        return 220 - (getAgeInYears());
    }

    public int targetHeartRate(){
        return (getMaxHeartRate() * 85) / 100;
    }
}
