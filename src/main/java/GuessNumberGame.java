public class GuessNumberGame {

    public static final String ANSWER_RESULT_PATTERN = "%sA%sB";
    private final String answer;

    public GuessNumberGame(String answer) {
        this.answer = answer;
    }

    public String guess(String numbers) {
        int positionAndNumberCorrectCount = 0;
        int onlyNumberCorrectCount = 0;
        for (char number: numbers.toCharArray()) {
            if (guessCharResultIsA(numbers, number)) {
                positionAndNumberCorrectCount++;
            }
            if (guessCharResultIsB(numbers, number)) {
                onlyNumberCorrectCount++;
            }
        }
        return String.format(ANSWER_RESULT_PATTERN, positionAndNumberCorrectCount, onlyNumberCorrectCount);
    }

    private boolean guessCharResultIsB(String numbers, char number) {
        return this.answer.contains(Character.toString(number)) && this.answer.indexOf(number) != numbers.indexOf(number);
    }

    private boolean guessCharResultIsA(String numbers, char number) {
        return this.answer.contains(Character.toString(number)) && this.answer.indexOf(number) == numbers.indexOf(number);
    }
}