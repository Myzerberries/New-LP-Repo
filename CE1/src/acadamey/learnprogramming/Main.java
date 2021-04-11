package acadamey.learnprogramming;

public class Main {

    public static void main(String[] args) {
        printConversion(1.5);
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
        if(kilometersPerHour >=0){
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        }
        else System.out.println("Invalid Value");
    }

}
