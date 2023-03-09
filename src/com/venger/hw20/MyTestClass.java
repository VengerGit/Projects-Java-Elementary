package com.venger.hw20;

public class MyTestClass {
    @AfterSuite(priority = 1)
    void doAfterSuite(){
        System.out.println("After Suite...");
    }
    @BeforeSuite(priority = 4)
    void doBeforeSuite(){
        System.out.println("Before Suite...");
    }

    @Test(priority = 2)
    void doTestOne(){
        System.out.println("1");
    }
    @Test
    void doTestThree(){
        System.out.println("3");
    }
    @Test
    void doTestFive(){
        System.out.println("5");
    }
}
