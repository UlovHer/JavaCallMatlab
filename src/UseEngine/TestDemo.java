package UseEngine;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;

import com.mathworks.engine.*;

// implementation files("lib/engine.jar");
// 将 Matlab 的 Java 驱动包以本地包的形式引入项目中
public class TestDemo {
    public static void main(String[] args) throws IllegalArgumentException, IllegalStateException, InterruptedException,
            RejectedExecutionException, ExecutionException {
        MatlabEngine engine = MatlabEngine.startMatlab();
        System.out.println("Call Matlab gcd Function");
        Object[] results = engine.feval(3, "gcd", 40, 60);
        Integer G = (Integer) results[0];
        Integer U = (Integer) results[1];
        Integer V = (Integer) results[2];

        engine.close();
        System.out.println("G is: " + G);
        System.out.println("U is: " + U);
        System.out.println("V is: " + V);
        System.out.println("40*" + U + "+60*" + V + " = " + G);
    }
    // public static void main(String[] args)
    // throws IllegalArgumentException, IllegalStateException, InterruptedException,
    // RejectedExecutionException, ExecutionException {
    // MatlabEngine engine = MatlabEngine.startMatlab();
    // double[] a = { 2.0, 4.0, 6.0 };
    // double[] roots = engine.feval("sqrt", a);
    // for (double e : roots) {
    // System.out.println(e);
    // }
    // engine.close();
    // }
}