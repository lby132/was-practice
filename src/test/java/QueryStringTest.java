import org.example.QueryString;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class QueryStringTest {

    @Test
    void createTest() {
        final QueryString queryString = new QueryString("operand", "11");

        assertThat(queryString).isNotNull();
    }
}
