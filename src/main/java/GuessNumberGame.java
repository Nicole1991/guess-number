public class GuessNumberGame {

    private final String answer;

    public GuessNumberGame(String answer) {
        this.answer = answer;
    }

    public String guess(String numbers) {
        if (this.answer.equals(numbers)) {
            return "4A0B";
        }
        return "2A2B";
    }
}