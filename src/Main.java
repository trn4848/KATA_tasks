import java.lang.CharSequence;

public class Main {

    public static void main(String[] args) {

    }

    public static class AsciiCharSequence implements CharSequence {
         final private byte[] charArray;

        public AsciiCharSequence(byte[] ca) {
           this.charArray = ca.clone();

        }

        public int length() {
            return charArray.length;
        }

        public char charAt(int index) {
            return (char) charArray[index];
        }

        public CharSequence subSequence(int start, int end) {
            byte[] charSubArray = new byte[end-start];
            int index = start ;
            for (int j = 0; j < end-start; j++) {
                    charSubArray[j] = charArray[index];
                    index++;
            }
            return new AsciiCharSequence(charSubArray);
        }

         public String toString() {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < charArray.length; i++) {
                result.append((char) charArray[i]);
            }
            return result.toString();
        }
    }


}

