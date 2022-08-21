public class Mathematical_Operation {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;
        System.out.println(Math.PI);
        System.out.println(Math.E);

        //Returns an integer rounded up.
        System.out.println(Math.ceil(x));

        //Returns an integer rounded down.
        System.out.println(Math.floor(x));

        //Returns a number raised to another number.
        System.out.println(Math.pow(x,y));

        //Returns the largest number.
        System.out.println(Math.max(x,y));

        //Returns the square root.
        System.out.println(Math.sqrt(y));

        //Area of a Circle.
        //pi * r2
        System.out.println(Math.PI * Math.pow(y,2));

        //Area of a Sphere.
        //4 * pi * r2
        System.out.println(4 * Math.PI * Math.pow(y,2));

        //Volume of a sphere.
        // (4/3) * pi * r3
        System.out.println((4/3)* Math.PI * Math.pow(y,3));
    }
}