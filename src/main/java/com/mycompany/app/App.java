package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{
    /**
        Test 1123232
    */
         private final String message = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        String apptest = "AppTest!";
        System.out.println(apptest);
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
