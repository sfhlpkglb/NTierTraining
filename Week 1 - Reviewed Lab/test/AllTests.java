import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/*% Good job with testing! %*/

@RunWith(Suite.class)
@SuiteClasses({ ContestantsTest.class, ContestantTest.class, DancerTest.class,
		PerformerTest.class, VocalistTest.class })
public class AllTests {

}
