
public class SecondsAndMinutesChallenge {
    private boolean isPanda;
    public String version;

    SecondsAndMinutesChallenge(){
        // constructor
    };

    SecondsAndMinutesChallenge(String version){
        // constructor
        this.version = version;
    };

    public String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || (seconds < 0 || seconds > 60)) {
            System.out.println("Invalid value");
            return "";
        }
        int hours = minutes / 60;
        int remainMinutes = minutes % 60;
        return doubleDigitFormat(hours) + "h " + doubleDigitFormat(remainMinutes) + "m " +
                doubleDigitFormat(seconds) + "s";
    }

    public boolean getDurationString(int seconds) {
        if (seconds < 0) {
            System.out.println("Invalid value");
            return false;
        }
        int minutes = seconds / 60;
        int remainSeconds = seconds % 60;
        System.out.println(getDurationString(minutes, remainSeconds));
        return true;
    }

    public static String doubleDigitFormat(int num) {
        if (num >= 0 && num <= 9) {
            return "0" + num;
        }
        return String.valueOf(num); // String concat
    }
}
