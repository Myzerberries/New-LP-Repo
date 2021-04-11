package acadamey.learnprogramming;

public class Main {

    public static void main(String[] args) {
       // long toMPH = toMilesPerHour(1.5);
        printConversion(75.114);
    }

    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour >= 0){
            double kphToMph = (kilometersPerHour / 1.609);
            long roundedMph = Math.round(kphToMph);
            return roundedMph;
        }
        else return -1;
    }

    public static void printConversion(double kilometersPerHour){
        System.out.println(toMilesPerHour(kilometersPerHour));
    }

}
