import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static constants.ConstantsFields.DELIMITER;
import static constants.ConstantsFields.RANDOM_ANSWER_LENGTH;
import static org.junit.Assert.*;

public class RandomAnswerGeneratorTest {
    @Test
    public void should_return_4_digits_when_generate_random_number() {
        RandomAnswerGenerator randomAnswerGenerator = new RandomAnswerGenerator();

        String answer = randomAnswerGenerator.generate();

        assertEquals(RANDOM_ANSWER_LENGTH, answer.length());
        for (char number: answer.toCharArray()) {
            assertTrue(Character.isDigit(number));
        }
    }

    @Test
    public void should_return_not_duplicated_number_when_generate_random_number() {
        RandomAnswerGenerator randomAnswerGenerator = new RandomAnswerGenerator();

        String answer = randomAnswerGenerator.generate();

        Set<String> answerToSet = new HashSet<>(Arrays.asList(answer.split(DELIMITER)));

        assertEquals(RANDOM_ANSWER_LENGTH, answerToSet.size());
    }
}