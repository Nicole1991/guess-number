import java.util.Random;
import java.util.Set;
import java.util.HashSet;

import static constants.ConstantsFields.*;

public class RandomAnswerGenerator implements AnswerGenerator {
    @Override
    public String generate() {
        Random random = new Random();
        Set<String> randomAnswer = new HashSet<>();

        while (randomAnswer.size() < RANDOM_ANSWER_LENGTH) {
            randomAnswer.add(String.valueOf(random.nextInt(RANDOM_MAX_INT)));
        }
        return String.join(DELIMITER, randomAnswer);
    }
}
