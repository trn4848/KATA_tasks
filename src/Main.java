import java.lang.CharSequence;

public class Main {

    public static void main(String[] args) {
        byte[] example = {72, 101, 108, 108, 111, 33};
        AsciiCharSequence answer = new AsciiCharSequence(example);
        System.out.println("Последовательность - " + answer.toString());//Hello!
        System.out.println("Размер её - " + answer.length());//6
        System.out.println("Символ под № 1 - " + answer.charAt(1));//e
        System.out.println("Подпоследовательность - " + answer.subSequence(1, 5));//ello

//проверка на нарушение инкапсуляции private поля
        System.out.println(answer.toString());//Hello!
        example[0] = 74;
        System.out.println(answer.toString());//Hello!
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

