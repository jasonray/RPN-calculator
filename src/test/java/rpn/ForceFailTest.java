package rpn;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.fail;

public class ForceFailTest {

    @Test
    @Ignore
    public void forceFail() {
        fail("force fail to see issue with CI process");
    }

}
