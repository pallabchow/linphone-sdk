package org.linphone.tester;

import junit.framework.TestSuite;

import org.junit.runner.RunWith;

@RunWith(org.junit.runners.AllTests.class)
public class LogCollectionTests {
    public static TestSuite suite() {
        TestSuite testSuites = new TestSuite();
        testSuites.setName("LogCollection");

        LinphoneTestSuite testsList = new LinphoneTestSuite();
        testsList.run(new String[]{"tester", "--list-tests", "LogCollection"});
        for (String testName: testsList.getList()) {
            LinphoneTest test = new LinphoneTest("LogCollection", testName);
            testSuites.addTest(test);
        }

        return testSuites;
    }
}

