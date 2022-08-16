package nextday;

public class NextDayCalculator {

    public static final String CONCATENATION = "/";
    public static final int FIRST_DAY_OF_MONTH = 1;
    public static final int LAST_MONTH_OF_YEAR = 12;

    public static String getNextDay(int day, int month, int year) {
        String result;
        int lastDayOfMonth;
        lastDayOfMonth = getLastDayOfMonth(month, year);
        if (day == lastDayOfMonth) {
            if (month == LAST_MONTH_OF_YEAR) {
                result = FIRST_DAY_OF_MONTH + CONCATENATION + "1" + CONCATENATION + ++year;
            } else {
                result = FIRST_DAY_OF_MONTH + CONCATENATION + ++month + CONCATENATION + year;
            }
        } else {
            result = ++day + CONCATENATION + month + CONCATENATION + year;
        }
        return result;
    }

    private static int getLastDayOfMonth(int month, int year) {
        int lastDayOfMonth;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case LAST_MONTH_OF_YEAR:
                lastDayOfMonth = 31;
                break;
            case 2:
                lastDayOfMonth = getLastFebDay(year);
                break;
            default:
                lastDayOfMonth = 30;
                break;
        }
        return lastDayOfMonth;
    }

    private static int getLastFebDay(int year) {
        int lastDayOfMonth;
        if (year % 100 == 0 && year % 400 == 0) {
            lastDayOfMonth = 29;
        } else if (year % 100 != 0 && year % 4 == 0) {
            lastDayOfMonth = 29;
        } else lastDayOfMonth = 28;
        return lastDayOfMonth;
    }
}
