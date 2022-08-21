public class DataType {
    public static void main(String[] args) {

        /* --------------- Datos Enteros --------------- */
        /* 1 byte */
        byte byte_min = -128;
        byte byte_max = 127;

        /* 2 bytes */
        short short_min = -32768;
        short short_max = 32767;

        /* 4 bytes */
        int int_min = -2147483648;
        int int_max = 2147483647;

        /* 8 bytes */
        /* Muy importante poner la L al final del número */
        long long_min = -9223372036854775808L;
        long long_max = 9223372036854775807L;


        /* --------------- Datos Decimales ---------------      */
        /* 4 bytes*/
        /* Muy importante poner la F al final del número        */
        /* float float_min = 1.17549435F*(10^-45);              */
        /* float float_max = 3.402823466F*(10^+38);             */
        float float_num = 3.402823466F;

        /* 8 bytes*/
        /* double double_min = 2.2250738585072014*(10^-324);    */
        /* double double_max = 1.7976931348623158*(10^+308);    */
        double double_num = 1.7976931348623158;

        char letter = 'A';
        var str = "Hello World ";

        /* Apartir de Java10, "var" asigna automaticamente el tipo de dato*/
        var salary = 1000;              // int
        var pension = salary * 0.03;    // double
        var totalSalary = salary - pension;

        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);

        var employeeName = "Anahí Salgado";
        System.out.println("EMPLOYEE: " + employeeName + " SALARY: " + totalSalary);
    }
}
