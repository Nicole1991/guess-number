import java.util.Random;
import java.util.Set;
import java.util.HashSet;

public class RandomAnswerGenerator implements AnswerGenerator {
    @Override
    public String generate() {
        Random random = new Random();
        Set<String> randomAnswer = new HashSet<>();

        while (randomAnswer.size() < 4) {
            randomAnswer.add(String.valueOf(random.nextInt(10)));
        }
        return String.join("", randomAnswer);
    }
}
