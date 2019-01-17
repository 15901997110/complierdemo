package app;

import org.testng.ITestNGListener;
import org.testng.TestNG;
import po.C1;
import po.C2;
import po.C3;
import reporter.HryReporter;

/**
 * @Description:
 * @Author: luqiwei
 * @Date: 2018/10/23 10:21
 */
public class DemoNG {
    public static void main(String[] args) {
        Class<?> c1= C1.class;
        Class<?> c2= C2.class;
        Class<?> c3= C3.class;
        TestNG ng=new TestNG();
        Class<?>[] classes={c1,c2,c3};
        ng.setTestClasses(classes);

        ITestNGListener listener=new HryReporter("c:/myreport/","mytest.html",null);
        ng.addListener(listener);
        ng.run();
    }


}
