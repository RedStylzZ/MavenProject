
public class Main {

    /**
     * Calculates Square
     *
     * @param x double
     * @return square of x
     */
    public static double square(double x) {
        return x * x;
    }

    public static boolean greaterHundred(double x) {
        return x > 100;
    }

    public static double addition(double x, double y) {
        return x + y;
    }

    public static String checkPersonCount(int pCount, String alarmstufe) {
        int count = 0;

        switch(alarmstufe) {
            case "rot":
                count = 0;
                break;
            case "gelb":
                count = 30;
                break;
            case "grün":
                count = 60;
                break;
        }

        if (pCount > count) {
            return "Zu viele Personen";
        } else {
            return "Maximale Personenzahl nicht überschritten";
        }
    }

    /*
    0! = 1 = 1
    1! = 1 * 1 = 1
    2! = 1 * 1 * 2 = 2
    3! = 1 * 1 * 2 * 3 = 6
     */


    public static int calcFacultyFor(int num) {
        int faculty = 1;

        for ( int x = num ; x >= 1; x--) {
            faculty *= x;
        }
        return faculty;
    }

    public static int calcFacultyWhile(int num) {
        int faculty = 1;
        while(num > 0) {
            faculty *= num;
            num--;
        }
        return faculty;
    }

    public static int calcFacultyRecursive(int num) {
        if(num <= 1) {
            return 1;
        } else {
            return num * calcFacultyRecursive(num -1);
        }
    }

    public static void main(String[] args) {
        System.out.println("🐢");
    }
}
