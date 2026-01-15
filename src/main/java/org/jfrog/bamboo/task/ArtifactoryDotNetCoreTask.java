package org.jfrog.bamboo.task;

import com.atlassian.bamboo.process.EnvironmentVariableAccessor;
import com.atlassian.bamboo.task.CommonTaskContext;
import com.atlassian.bamboo.task.TaskException;
import com.atlassian.bamboo.v2.build.agent.capability.CapabilityContext;
import com.atlassian.plugin.spring.scanner.annotation.imports.ComponentImport;
import org.jetbrains.annotations.NotNull;
import org.jfrog.bamboo.admin.ServerConfigManager;

import javax.inject.Inject;

/**
 * Created by Bar Belity on 13/10/2020.
 */
public class ArtifactoryDotNetCoreTask extends ArtifactoryDotNetTaskBase {
    private static final String TASK_NAME = "artifactoryDotNetCoreTask";
    private static final String EXECUTABLE_NAME = "dotnet";
    private static final String DOTNETCORE_KEY = "system.builder.dotnet.";

    @Inject
    public ArtifactoryDotNetCoreTask(@ComponentImport EnvironmentVariableAccessor environmentVariableAccessor, @ComponentImport final CapabilityContext capabilityContext, ServerConfigManager serverConfigManager) {
        super(environmentVariableAccessor, capabilityContext,serverConfigManager);
    }

    @Override
    protected void initTask(@NotNull CommonTaskContext context) throws TaskException {
        initTask(context, DOTNETCORE_KEY, EXECUTABLE_NAME, TASK_NAME, TaskType.DOTNET);
    }

    @Override
    protected String getTaskUsageName() {
        return "dotNetCore";
    }
}
