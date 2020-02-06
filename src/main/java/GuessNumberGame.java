public class GuessNumberGame {

    private static final String ANSWER_RESULT_PATTERN = "%sA%sB";
    private final String answer;

    public GuessNumberGame(AnswerGenerator answerGenerator) {
        this.answer = answerGenerator.generate();
    }

    public String guess(String numbers) {
        int positionAndNumberCorrectCount = 0;
        int onlyNumberCorrectCount = 0;
        for (char number: numbers.toCharArray()) {
            if (guessCharResultIsCorrectNumberAndIndex(numbers, number)) {
                positionAndNumberCorrectCount++;
            }
            if (guessCharResultIsCorrectNumberAndWrongIndex(numbers, number)) {
                onlyNumberCorrectCount++;
            }
        }
        return String.format(ANSWER_RESULT_PATTERN, positionAndNumberCorrectCount, onlyNumberCorrectCount);
    }

    private boolean guessCharResultIsCorrectNumberAndWrongIndex(String numbers, char number) {
        return this.answer.contains(Character.toString(number)) && this.answer.indexOf(number) != numbers.indexOf(number);
    }

    private boolean guessCharResultIsCorrectNumberAndIndex(String numbers, char number) {
        return this.answer.contains(Character.toString(number)) && this.answer.indexOf(number) == numbers.indexOf(number);
    }
}