public class Logical_Operation {
    public static void main(String[] args) {
        int A = 8;
        int B = 5;

        // Operators Assignment
        System.out.println("¿A es igual a B?" + (A == B));
        System.out.println("¿A es diferente a B?" + (A != B));

        // Relational Operators
        System.out.println("¿A es mayor a B?" + (A > B));
        System.out.println("¿A es menor a B?" + (A < B));
        System.out.println("¿A es mayor o igual a B?" + (A >= B));
        System.out.println("¿A es menor o igual a B?" + (A <= B));

        if (A == B){
            System.out.println("A es igual a B");
        }else if(A != B){
            System.out.println("A es distinto a B");
        }else if(A < B){
            System.out.println("A es menor que B");
        }else if(A > B){
            System.out.println("A es mayor que B");
        }
    }
}
