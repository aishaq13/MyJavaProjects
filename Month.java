// This program create a Month class that encapsulates the concept of month, assuming that a month has a month number attribute.
//Aisha Qureshi 03/26/2023 JDK 17.0.1


package Chapter8Assingment;

public class Month {
    private int monthNumber;
    private final String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    public Month(int m) {
        if (m >= 1 && m <= 12) {
            monthNumber = m;
        } else {
            monthNumber = 1;
        }
    }

    public void setMonthNumber(int m) {
        if (m >= 1 && m <= 12) {
            monthNumber = m;
        } else {
            monthNumber = 1;
        }
    }

    public int getMonthNumber() {
        return monthNumber;
    }

    public String getMonthName() {
        return monthNames[monthNumber - 1];
    }

    public String getSeason() {
        if (monthNumber == 12 || monthNumber == 1 || monthNumber == 2) {
            return "Winter";
        } else if (monthNumber >= 3 && monthNumber <= 5) {
            return "Spring";
        } else if (monthNumber >= 6 && monthNumber <= 8) {
            return "Summer";
        } else {
            return "Fall";
        }
    }

    public String toString() {
        return "Month Number: " + monthNumber + "\nMonth Name: " + getMonthName() + "\nSeason: " + getSeason();
    }

    public boolean equals(Month month2) {
        return monthNumber == month2.getMonthNumber();
    }
}
