package tasks;

public class task1 {
    public static void main(String[] args) {
        System.out.println(convert(8));
        System.out.println(fitCalc(24,2));
        System.out.println(containers(5, 0, 2));
        System.out.println(triangleType(5, 4, 5));
        System.out.println(ternaryEvaluation(8, 4));
        System.out.println(howManyItems(45, 1.8, 1.9));
        System.out.println(factorial(5));
        System.out.println(qcd(52, 8));
        System.out.println(ticketSaler(70, 1500));
        System.out.println(tables(123, 58));
    }
    
    public static double convert(int gallones) {
        return (gallones*3.785);
    }

    public static int fitCalc(int minutes, int intensity) {
        return (minutes*intensity);
    }

    public static int containers(int boxes, int bags, int barrels) {
        return(boxes*20 + bags*50 + barrels*100);
    }

    public static String triangleType(int x, int y, int z) {
        if ((x+y>z)&(x+z>y)&(y+z>x)) {
            if ((x!=y)&(y!=z)&(z!=x)) {
                return("different-sided");
            } else {
                if ((x==y)&(y==z)) {
                    return("isosceles");
                } else {
                    return("equilateral");
                }
            }
        } else {
            return("not a triangle");
        }
    }

    public static int ternaryEvaluation(int a, int b) {
        return a>b ? a : b;
    }

    public static int howManyItems(double n, double w, double h) {
        return (n<w || n<h)? 0 : (int)((n*2)/(w*h*2));
    }

    public static int factorial(int x) {
        int n = 1;
        for(int i=1; i<=n; i++) {
            n = n*i ;
        }
        return n;
    }
    public static int qcd(int a, int b) {
        int d = 1;
        for (int i=1; i<=d; i++) {
            if (a%i==0 & b%i==0) {
                d = i;
            }
        }
        return d;
    }
    public static int ticketSaler(int tickets, int price) {
        // комиссия 28% цены
        return tickets*price*72/100;
    }

    public static int tables(int students, int desks) {
        double q = students/2 - desks;
        if (q > 0) {
            return (students%2 ==0)? (int)q : (int)(q + 1);
        } else {
            return 0;
        }
    }

}
