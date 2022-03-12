package com.revature.mytests;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses({com.revature.mytests.FirstTest.class,com.revature.mytests.SecondTest.class})
public class AllTestSuites {

}
