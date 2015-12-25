package com.test.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	App myApp = new App();
        System.out.println( myApp.getGreeting() );

    }

    public String getGreeting()
    {
    	return "Hello World!";
    }

    public void method2(){
        System.out.println("method2");
    }
    public void method1(){
        System.out.println("method1");
    }

    public void method3(){
        System.out.println("method3");
    }
}
