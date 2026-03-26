package datalistener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTestNG implements ITestListener {

	public void OnStart(ITestContext context) {
		System.out.println("OnStart method started");
	}

	public void OnFinish(ITestContext context) {
		System.out.println("OnFinish method started");
	}

	public void OnTestStart(ITestResult result) {
		System.out.println("New Test Started" + result.getName());
	}

	public void OnTestSuccess(ITestResult result) {
		System.out.println("OnTestSuccess Method" + result.getName());
	}

	public void OnTestFailure(ITestResult result) {
		System.out.println("OnTestFailure Method" + result.getName());
	}

	public void OnTestSkipped(ITestResult result) {
		System.out.println("OnTestSkipped Method" + result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("onTestFailedButWithinSuccessPercentage" + result.getName());
	}

}
