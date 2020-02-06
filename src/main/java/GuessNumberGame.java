public class GuessNumberGame {

    private final String answer;

    public GuessNumberGame(String answer) {
        this.answer = answer;
    }

    public String guess(String numbers) {
        int positionAndNumberCorrectCount = 0;
        int onlyNumberCorrectCount = 0;
        for (char number: numbers.toCharArray()) {
            String charToString = Character.toString(number);
            boolean isA = this.answer.contains(charToString) && this.answer.indexOf(number) == numbers.indexOf(number);
            boolean isB = this.answer.contains(charToString) && this.answer.indexOf(number) != numbers.indexOf(number);

            if (isA) {
                positionAndNumberCorrectCount++;
            }
            if (isB) {
                onlyNumberCorrectCount++;
            }
        }
        return String.format("%sA%sB", positionAndNumberCorrectCount, onlyNumberCorrectCount);
    }
}