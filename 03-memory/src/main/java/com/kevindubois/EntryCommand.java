package com.kevindubois;

import io.quarkus.picocli.runtime.annotations.TopCommand;
import jakarta.enterprise.context.control.ActivateRequestContext;
import jakarta.inject.Inject;
import picocli.CommandLine;

@TopCommand
@CommandLine.Command(mixinStandardHelpOptions = true, subcommands = {HelloCommand.class, ChooseYourLanguage.class})
public class EntryCommand {
}

@CommandLine.Command(name = "hello", description = "Hello World with AI!")
class HelloCommand implements Runnable {
    @Inject
    MyAiService myAiService;

    @Override
    @ActivateRequestContext
    public void run() {
        System.out.println(myAiService.chat("What is Java?"));
        System.out.println(myAiService.chat("Can you give me a Hello World example for it?"));
    }
}

@CommandLine.Command(name = "parallel", description = "Maintain parallel conversations")
class ChooseYourLanguage implements Runnable {
    @Inject
    MyAiService myAiService;

    @Override
    @ActivateRequestContext
    public void run() {
        System.out.println(myAiService.parallelChat(1,
                "You are a smart enterprise developer that chooses a robust programming language with a vast ecosystem. " +
                        "Use a framework that is Kubernetes Native, " +
                        "has blazing fast startup time and supports Native Compilation out of the box and supports LangChain4j"));
        System.out.println(myAiService.parallelChat(2,
                "You are a Python developer"));
        System.out.println(myAiService.parallelChat(1,
                "Write some code in the best programming language based on our previous conversation"));
    }
}
