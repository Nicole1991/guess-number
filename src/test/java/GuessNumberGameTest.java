import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuessNumberGameTest {

    @Test
    public void should_return_4A0B_when_guess_number_correct_number_is_1234_and_guess_number_is_1234() {
        //given
        GuessNumberGame guessNumberGame = new GuessNumberGame("1234");

        //when
        String result = guessNumberGame.guess("1234");

        //then
        assertEquals("4A0B", result);
    }

    @Test
    public void should_return_2A2B_when_guess_number_correct_number_is_1234_and_guess_number_is_4231() {
        //given
        GuessNumberGame guessNumberGame = new GuessNumberGame("1234");

        //when
        String result = guessNumberGame.guess("4231");

        //then
        assertEquals("2A2B", result);
    }

    @Test
    public void should_return_0A4B_when_guess_number_correct_number_is_1234_and_guess_number_is_4321() {
        //given
        GuessNumberGame guessNumberGame = new GuessNumberGame("1234");

        //when
        String result = guessNumberGame.guess("4321");

        //then
        assertEquals("0A4B", result);
    }

    @Test
    public void should_return_1A1B_when_guess_number_correct_number_is_1234_and_guess_number_is_1378() {
        //given
        GuessNumberGame guessNumberGame = new GuessNumberGame("1234");

        //when
        String result = guessNumberGame.guess("1378");

        //then
        assertEquals("1A1B", result);
    }

    @Test
    public void should_return_0A2B_when_guess_number_correct_number_is_1234_and_guess_number_is_7382() {
        //given
        GuessNumberGame guessNumberGame = new GuessNumberGame("1234");

        //when
        String result = guessNumberGame.guess("7382");

        //then
        assertEquals("0A2B", result);
    }
}
