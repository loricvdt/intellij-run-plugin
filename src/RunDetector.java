import com.intellij.execution.ExecutionListener;
import com.intellij.execution.ExecutionManager;
import com.intellij.execution.process.ProcessHandler;
import com.intellij.execution.runners.ExecutionEnvironment;
import com.intellij.openapi.project.Project;
import com.intellij.util.messages.MessageBusConnection;
import org.jetbrains.annotations.NotNull;

public class RunDetector {

	private MessageBusConnection connection;

	public RunDetector(Project project) {
		connection = project.getMessageBus().connect();
		connection.subscribe(ExecutionManager.EXECUTION_TOPIC, new ExecutionListener() {
			@Override
			public void processStartScheduled(@NotNull String executorId, @NotNull ExecutionEnvironment env) {
				AudioPlayer.play();
			}
		});
	}


}
