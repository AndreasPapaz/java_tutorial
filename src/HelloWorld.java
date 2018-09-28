public class HelloWorld {

    static String randomString = "String to print";
    static final double PINUM = 3.14;

    public static void main(String[] args) {
        byte bigByte = 127;
        short bigShort = 32767;
        int bigInt = 2100000000;
        long bigLong = 9200000000000000000L;
        float bigFlaot = 3.14F;
        double bigDouble = 3.14823787239047024702;

        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);

        boolean trueOrFalse = true;

        char randomChar = 65;
        char anotherChar = 'A';

        char escapedChars = '\\';

        String randomString = "I'm a random string";
        String antoherString = "Stuff";

        String andAnotherString = randomString + ' ' + antoherString;

        // practice convert to string using `.toString()`;
        String byteString = Byte.toString(bigByte);
        String intString = Integer.toString(bigInt);

        // casting types
        // (byte), etc...
        double aDoubleValue = 3.1454546664;
        int doubleToInt = (int) aDoubleValue;

        // parse functions
        // int -> string -> int
        int stringToInt = Integer.parseInt(intString);


    }

}
