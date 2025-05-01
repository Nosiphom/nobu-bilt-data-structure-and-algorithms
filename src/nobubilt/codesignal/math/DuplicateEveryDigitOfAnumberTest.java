package nobubilt.codesignal.math;
import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
public class DuplicateEveryDigitOfAnumberTest {

	 private DuplicateEveryDigitOfAnumber app;

	    @BeforeEach
	    void setUp() {
	        app = new DuplicateEveryDigitOfAnumber();
	    }

	    @Test
	    @Order(1)
	    void test1() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            Assertions.assertEquals(11223344, app.solution(1234));
	            Assertions.assertEquals(11, app.solution(1));
	            Assertions.assertEquals(2222, app.solution(22));
	            Assertions.assertEquals(99887766, app.solution(9876));
	            Assertions.assertEquals(1100000000, app.solution(10000));
	            Assertions.assertEquals(0, app.solution(0));
	            Assertions.assertEquals(33333333, app.solution(3333));
	            Assertions.assertEquals(44444444, app.solution(4444));
	            Assertions.assertEquals(55555555, app.solution(5555));
	            Assertions.assertEquals(66666666, app.solution(6666));
	        });
	    }
	}
