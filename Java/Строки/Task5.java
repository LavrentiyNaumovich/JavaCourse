public class Task5 {
    public static void main(String[] args) {
        // Исходная строка
        String str = "The US";

        // String в StringBuffer
        StringBuffer stringBuffer = new StringBuffer(str);
        System.out.println("String to StringBuffer: " + stringBuffer);

        // String в StringBuilder
        StringBuilder stringBuilder = new StringBuilder(str);
        System.out.println("String to StringBuilder: " + stringBuilder);

        // StringBuffer в String
        String strFromBuffer = stringBuffer.toString();
        System.out.println("StringBuffer to String: " + strFromBuffer);

        // StringBuilder в String
        String strFromBuilder = stringBuilder.toString();
        System.out.println("StringBuilder to String: " + strFromBuilder);

        // StringBuffer в StringBuilder
        StringBuilder stringBuilderFromBuffer = new StringBuilder(stringBuffer);
        System.out.println("StringBuffer to StringBuilder: " + stringBuilderFromBuffer);

        // StringBuilder в StringBuffer
        StringBuffer stringBufferFromBuilder = new StringBuffer(stringBuilder);
        System.out.println("StringBuilder to StringBuffer: " + stringBufferFromBuilder);
    }
}
