

public class Main {
    enum Label {
        SPAM, NEGATIVE_TEXT, TOO_LONG, OK
    }

    interface TextAnalyzer {
        Label processText(String text);
    }

    public static void main(String[] args) {

    }

    abstract class KeywordAnalyzer {
         abstract getKeywords();


    }

    public class SpamAnalyzer implements TextAnalyzer{
        private String[] keywords;

        public SpamAnalyzer(String[] keywords){
            this.keywords = keywords.clone();
        }

        Label processText(String text){

        }
    }

    public class NegativeTextAnalyzer implements TextAnalyzer{

        Label processText(String text){

        }
    }

    public class TooLongTextAnalyzer implements TextAnalyzer{
        private int maxLength;

        public TooLongTextAnalyzer(int maxLength){
            this.maxLength = maxLength;
        }

        Label processText(String text){

        }
    }

}

