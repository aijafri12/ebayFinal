package com.common;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class javaPrac implements JvInterface,JavaInter, ITestListener, InterFace3 {

	
	@Override
	public int getCoins() {
		
		int a=5;
		int b=20;
		int c=a+b;
		System.out.println(c);
		
				return 0;
	}

	@Override
	public String getString() {
		return null;
	}
public static void main(String[] args) {
	javaPrac js=new javaPrac();
	
	js.getCoins();
	
	
	
	
}

@Override
public int getmoney() {
	return 0;
}

@Override
public void onTestStart(ITestResult result) {
		
}

@Override
public void onTestSuccess(ITestResult result) {
		
}

@Override
public void onTestFailure(ITestResult result) {
		
}

@Override
public void onTestSkipped(ITestResult result) {
		
}

@Override
public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
}

@Override
public void onStart(ITestContext context) {
	
}

@Override
public void onFinish(ITestContext context) {
		
}

@Override
public List<JvInterface> getwishList() {
	
	Map <Integer, String >map=new HashMap<Integer, String>();
	
	map.put(1, "first");
	map.put(2, "two");
	
	System.out.println(map.get(2));
	
	
		return null;
}

	

}
