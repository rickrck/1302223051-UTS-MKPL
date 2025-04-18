package lib;

import java.time.LocalDate;

public class DataEmployee {
    private String employeeId;
    private String firstName;
    private String lastName;
    private String idNumber;
    private String address;

    private int yearJoined;
    private int monthJoined;
    private int dayJoined;
    private int monthWorkingInYear;

    private boolean isForeigner;
    private boolean gender; //true = Laki-laki, false = Perempuan

    private Family family;

    public DataEmployee(String employeeId, String firstName, String lastName, String idNumber, String address, int yearJoined, int monthJoined, int dayJoined, int monthWorkingInYear, boolean isForeigner, boolean gender, Family family) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.address = address;
        this.yearJoined = yearJoined;
        this.monthJoined = monthJoined;
        this.dayJoined = dayJoined;
        this.monthWorkingInYear = monthWorkingInYear;
        this.isForeigner = isForeigner;
        this.gender = gender;
        this.family = family;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getAddress() {
        return address;
    }

    public int getYearJoined() {
        return yearJoined;
    }

    public int getMonthJoined() {
        return monthJoined;
    }

    public int getDayJoined() {
        return dayJoined;
    }

    public int getMonthWorkingInYear() {
        LocalDate date = LocalDate.now();
        if (date.getYear() == yearJoined) {
            monthWorkingInYear = date.getMonthValue() - monthJoined;
        } else {
            monthWorkingInYear = 12;
        }
        return monthWorkingInYear;
    }

    public boolean isForeigner() {
        return isForeigner;
    }

    public boolean isGender() {
        return isGender();
    }

}