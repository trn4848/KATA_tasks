

public class Main {

    public static void main(String[] args) {

    }


    enum Label {
        SPAM, NEGATIVE_TEXT, TOO_LONG, OK
    }

    abstract class KeywordAnalyzer {

        protected abstract String[] getKeywords();
        protected abstract Label getLabel();
    }

    interface TextAnalyzer {
        Label processText(String text);
    }

    public class SpamAnalyzer extends KeywordAnalyzer implements TextAnalyzer {
        private String[] keywords;

        public SpamAnalyzer(String[] keywords) {
            this.keywords = keywords.clone();
        }

        public String[] getKeywords() {

        }

        public Label getLabel() {

        }

        public Label processText(String text) {

        }
    }

    public class NegativeTextAnalyzer extends KeywordAnalyzer implements TextAnalyzer {

        public String[] getKeywords() {

        }

        public Label getLabel() {

        }

        public Label processText(String text) {

        }
    }

    public class TooLongTextAnalyzer implements TextAnalyzer {
        private int maxLength;

        public TooLongTextAnalyzer(int maxLength) {
            this.maxLength = maxLength;
        }

        public Label processText(String text) {

        }
    }

}

