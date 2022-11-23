package com.framework.testng.api.base;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class TestTransformer implements IAnnotationTransformer {
	
	 public void transform (ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		  annotation.setRetryAnalyzer(RetryEngine.class);
		  }

}
