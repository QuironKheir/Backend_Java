public class Casting {
    public static void main(String[] args) {

        double monthlyDogs = 30.0 /12.0;
        System.out.println(monthlyDogs);

        //Estimación
        int estimateMonthlyDogs = (int)  monthlyDogs;
        System.out.println(estimateMonthlyDogs);

        //Exactitud
        int a = 30;
        int b = 12;
        System.out.println((double)a/b);


    }
}
