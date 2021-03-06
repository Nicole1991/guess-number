import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GuessNumberGameTest {
    private AnswerGenerator answerGenerator;

    @Before
    public void setup() {
        answerGenerator = Mockito.mock(AnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn("1234");
    }

    @Test
    public void should_return_4A0B_when_guess_number_correct_number_is_1234_and_guess_number_is_1234() {
        //given
        GuessNumberGame guessNumberGame = new GuessNumberGame(answerGenerator);

        //when
        String result = guessNumberGame.guess("1234");

        //then
        assertEquals("4A0B", result);
    }

    @Test
    public void should_return_2A2B_when_guess_number_correct_number_is_1234_and_guess_number_is_4231() {
        //given
        GuessNumberGame guessNumberGame = new GuessNumberGame(answerGenerator);

        //when
        String result = guessNumberGame.guess("4231");

        //then
        assertEquals("2A2B", result);
    }

    @Test
    public void should_return_0A4B_when_guess_number_correct_number_is_1234_and_guess_number_is_4321() {
        //given
        GuessNumberGame guessNumberGame = new GuessNumberGame(answerGenerator);

        //when
        String result = guessNumberGame.guess("4321");

        //then
        assertEquals("0A4B", result);
    }

    @Test
    public void should_return_1A1B_when_guess_number_correct_number_is_1234_and_guess_number_is_1378() {
        //given
        GuessNumberGame guessNumberGame = new GuessNumberGame(answerGenerator);

        //when
        String result = guessNumberGame.guess("1378");

        //then
        assertEquals("1A1B", result);
    }

    @Test
    public void should_return_0A2B_when_guess_number_correct_number_is_1234_and_guess_number_is_7382() {
        //given
        GuessNumberGame guessNumberGame = new GuessNumberGame(answerGenerator);

        //when
        String result = guessNumberGame.guess("7382");

        //then
        assertEquals("0A2B", result);
    }

    @Test
    public void should_return_0A0B_when_guess_number_correct_number_is_1234_and_guess_number_is_6789() {
        //given
        GuessNumberGame guessNumberGame = new GuessNumberGame(answerGenerator);

        //when
        String result = guessNumberGame.guess("6789");

        //then
        assertEquals("0A0B", result);
    }

    @Test
    public void should_return_you_win_when_guess_number_correct_number_is_1234_and_guess_number_is_1234() {
        //given
        GuessNumberGame guessNumberGame = new GuessNumberGame(answerGenerator);

        //when
        List<GameResult> result = guessNumberGame.gameProcess();

        //then
        assertEquals("Congratulations, you win!", result.get(0).getGuessResult());
    }
}
