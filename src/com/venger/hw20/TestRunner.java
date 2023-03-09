package com.venger.hw20;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class TestRunner {

    public static <T> void start(Class<T> testClass) {
        T testClassObject = newInstance(testClass);
        Method[] declaredMethods = testClass.getDeclaredMethods();
        List<Method> methodsBeforeSuite = filterByAnnotation(declaredMethods, BeforeSuite.class);
        if (methodsBeforeSuite.size() > 1) {
            throw new RuntimeException(String.format("Object of type %s must contain only one BeforeSuite method.%n", testClass));
        }
        List<Method> methodsTest = filterByAnnotation(declaredMethods, Test.class);
        List<Method> methodsAfterSuite = filterByAnnotation(declaredMethods, AfterSuite.class);
        if (methodsAfterSuite.size() > 1) {
            throw new RuntimeException(String.format("Object of type %s must contain only one AfterSuite method.%n", testClass));
        }
//        int priority1 = testClass.getAnnotation(BeforeSuite.class).priority();
//        int priority = testClass.getAnnotation(Test.class).priority();
//        int priority2 = testClass.getAnnotation(AfterSuite.class).priority();

        methodsInvoke(methodsBeforeSuite, testClassObject);
        methodsInvoke(methodsTest, testClassObject);
        methodsInvoke(methodsAfterSuite, testClassObject);
    }

    private static <T extends Annotation> List<Method> filterByAnnotation(Method[] methods, Class<T> annotationType) {
        List<Method> representMethods = new ArrayList<>();
        for (Method m : methods) {
            if (m.isAnnotationPresent(annotationType)) {
                representMethods.add(m);
            }
        }
        return representMethods;
    }

    private static <T> T newInstance(Class<T> testClass) {
        try {
            return testClass.getConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new RuntimeException("SWW of creation new instance", e);
        }
    }

    private static <T> void methodsInvoke(List<Method> methodsList, T targetObject) {
        try {
            for (Method m : methodsList) {
                m.invoke(targetObject);
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
