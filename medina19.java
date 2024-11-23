//171
public class medina19 {
	public static void main(String[] args) {
        int sundaysOnFirst = 0; // Counter for Sundays on the first of the month
        int dayOfWeek = 2; // Starting day of the week for 1 Jan 1901, which is Tuesday (0 = Sunday, 1 = Monday, ..., 6 = Saturday)
        
        // Loop through the years 1901 to 2000
        for (int year = 1901; year <= 2000; year++) {
            // Loop through the months January (1) to December (12)
            for (int month = 1; month <= 12; month++) {
                // If the first of the month is a Sunday, increment the counter
                if (dayOfWeek == 0) {
                    sundaysOnFirst++;
                }
                
                // Get the number of days in the current month
                int daysInMonth = getDaysInMonth(month, year);
                
                // Update the day of the week for the first of the next month
                dayOfWeek = (dayOfWeek + daysInMonth) % 7;
            }
        }
        
        // Output the result
        System.out.println("Number of Sundays on the first of the month: " + sundaysOnFirst);
    }
    
    // Function to get the number of days in a given month and year
    public static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 4: case 6: case 9: case 11:
                return 30; // April, June, September, November have 30 days
            case 2:
                return isLeapYear(year) ? 29 : 28; // February has 28 or 29 days depending on leap year
            default:
                return 31; // All other months have 31 days
        }
    }
    
    // Function to determine if a year is a leap year
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        }
        return false;
    }
}
