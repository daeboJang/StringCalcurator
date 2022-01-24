import me.jangkh.utils.StringCalculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringCalculatorTest {

    @Test
    @DisplayName("공백 테스트")
    public void nullOrEmpty() {
        assertThat(StringCalculator.splitAndSum(null)).isEqualTo(0);
        assertThat(StringCalculator.splitAndSum("")).isEqualTo(0);
    }

    @Test
    @DisplayName("값 한개")
    public void oneValue() {
        assertThat(StringCalculator.splitAndSum("1")).isEqualTo(1);
    }

    @Test
    @DisplayName("쉼표 구분자")
    public void commaSeperator() {
        assertThat(StringCalculator.splitAndSum("1,5")).isEqualTo(6);
    }

    @Test
    @DisplayName("쉼표,코론,세미콜론 구분자")
    public void testSeperator() {
        assertThat(StringCalculator.splitAndSum("1,2:3;4")).isEqualTo(10);
    }
}
