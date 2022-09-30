package WeekAug29_Sep4_2022;

public class NilakanthaSeries {
    public static void main(String[] args) {
        double a = 2;
        double b = 3;
        double c = 4;
        double d = 4;
        double e = 5;
        double f = 6;
        double g = 3;
        while (true) {
            g += (4/(a*b*c))-(4/(d*e*f));
            a+=4;
            b+=4;
            c+=4;
            d+=4;
            e+=4;
            f+=4;
            System.out.println(g);
        }
    }
}
