package listeners;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;
import utilities.Logs;

import java.util.Optional;

public class ResultListeners implements TestWatcher {

    @Override
    public void testDisabled(ExtensionContext context, Optional<String> reason) {
        Logs.info("Test desabilitado");
    }

    @Override
    public void testSuccessful(ExtensionContext context) {
        Logs.info("Test correcto");
        Logs.info("");
    }

    @Override
    public void testAborted(ExtensionContext context, Throwable cause) {
        Logs.info("Test abortado");
    }

    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        Logs.info("Test fallido");
    }
}
