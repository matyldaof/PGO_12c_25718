package cwiczenia6.zad3;

public interface Fun {
    double f(double x);

    static double minimum(Fun func, double a, double b, double alpha) {
        if (a > b) {
            System.out.println("A musi być mniejsze od B");
            return 0;
        } else if (alpha > b - a) {
            System.out.println("Alpha musi być mniejsza od przedziału <a,b>");
            return 0;
        }

        Double min = null;

        for (; a <= b; a += alpha) {
            double value = func.f(a);
            if (min == null || value < min) {
                min = value;
            }
        }

        return min;
    }
}

