package Tests.MyProjects.TestReports;

import Methods.MyProjects.Projects;
import Methods.MyProjects.TestReports;
import Tests.BaseTest;
import org.testng.annotations.Test;

import java.awt.*;

/**
 * Created by yanagusti on 10/5/17.
 */
public class CrashesByVersionReportTest extends BaseTest {
    @Test
    public void crashesByVersionReport() throws InterruptedException, AWTException {
        Projects projects = openProject();
        projects.goToTestActivities(driver);
        TestReports testReports = new TestReports();
        testReports.crashesByVersionReport(driver);
        logout();
    }
}
