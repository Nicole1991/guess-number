import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class GameResult {
    private String guessedNumber;
    private String guessResult;
}
