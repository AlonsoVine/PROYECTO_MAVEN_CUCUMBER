package utilities;

import listeners.ResultListeners;
import listeners.TestListeners;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith({ResultListeners.class, TestListeners.class})
public class MainTest {
}
