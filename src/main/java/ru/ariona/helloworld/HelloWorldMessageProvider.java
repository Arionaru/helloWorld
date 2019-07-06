package ru.ariona.helloworld;

public class HelloWorldMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello, world!";
    }
}
