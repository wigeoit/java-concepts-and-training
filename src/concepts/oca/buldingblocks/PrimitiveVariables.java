package concepts.oca.buldingblocks;

/**
 * @author William
 * @version 1.0
 */
public class PrimitiveVariables {

    public static void main(String[] args){

        /*
         * Primitive variables cannot be initialized as null
         */

        // it holds 8 bits
        // from -128 to 127
        byte byteVariable = 0x7F; // Hexadecimal mode 127
        byte byteVariable2 = 127; // Decimal mode 127
        byte byteVariable3 = '~'; // Char mode 126
        byte byteVariable4 = 0177; // Octal mode 127
        byte byteVariable5 = 0b1111111; // Binary mode 127

        System.out.println("byte variables 1, 2, 3, 4 and 5 initialization: "+ " " + byteVariable + " " + byteVariable2
                + " " + byteVariable3 + " " + byteVariable4 + " " + byteVariable5);

        // it holds 16 bits
        // from -32,768 to 32,767
        short shortVariable = 0x7FFF;
        short shortVariable2 = 32767;
        short shortVariable3 = 32_767;
        short shortVariable4 = byteVariable5;

        System.out.println("short variables 1, 2, 3, 4 and 5 initialization: "+ " " + shortVariable + " " + shortVariable2
                + " " + shortVariable3 + " " + shortVariable4);

        // it holds 32 bits
        // from -2'147,483,648 to 2'147,483,647
        int intVariable =  -2147483648;
        int intVariable2 = 2_147_483_647; //for easy reading
        int intVariable3 = shortVariable4; //for easy reading

        System.out.println("int variables 1, 2 and 3 initialization: "+ " " + intVariable + " " + intVariable2
                + " " + intVariable3);

        // it holds 64 bits
        // from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        long longVariable = 9_223_372_036_854_775_807L;
        long longVariable2 = intVariable2;

        System.out.println("long variables 1 and 2 initialization: "+ " " + longVariable + " " + longVariable2);

        // it holds 32 bits floating-point values
        // from Float.MIN_VALUE to Float.MAX_VALUE
        float floatVariable = 0x23;
        float floatVariable2 = 13;
        float floatVariable3 = 13.0f;
        float floatVariable4 = intVariable2;

        System.out.println("float variables 1, 2, 3 and 4 initialization: " + " " + floatVariable + " " + floatVariable2
                + " " + floatVariable3 + " " + floatVariable4);

        // it holds 64 bits floating-point values
        // from Double.MIN_VALUE to Double.MAX_VALUE
        double doubleVariable = 0.001E9;
        double doubleVariable2 = 10000;
        double doubleVariable3 = 34f;
        double doubleVariable4 = 34d;
        double doubleVariable5 = floatVariable4;

        System.out.println("double variables 1, 2, 3, 4 and 5 initialization: " + " " + doubleVariable + " " + doubleVariable2
                + " " + doubleVariable3 + " " + doubleVariable4 + " " + doubleVariable5);

        // it holds 16 bits Unicode values
        // from Character.MIN_VALUE to Character.MAX_VALUE
        char charVariable = 'A';
        char charVariable2 = 65;
        char charVariable3 = 0x41;
        char charVariable4 = 0101;
        System.out.println("char variables 1, 2, 3 and 4 initialization: " + " " + charVariable + " " + charVariable2
                + " " + charVariable3 + " " + charVariable4);

        // true or false
        boolean booleanVariable = true;
        boolean booleanVariable2 = false;
        boolean booleanVariable3 = (doubleVariable3>charVariable3);

        System.out.println("boolean variables 1, 2, and 3 initialization: " + " " + booleanVariable + " " + booleanVariable2
                + " " + booleanVariable3);
    }

}
