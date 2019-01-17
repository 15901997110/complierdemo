package app;

import com.itranswarp.compiler.JavaStringCompiler;

import java.io.IOException;
import java.util.Map;

/**
 * @Description:
 * @Author: luqiwei
 * @Date: 2018/10/22 19:08
 */
public class Demo1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        JavaStringCompiler compiler = new JavaStringCompiler();
        Map<String, byte[]> results = compiler.compile("C5.java", JAVA_SOURCE_CODE);
        System.out.println(results);
        Class<?> clazz = compiler.loadClass("po.C5", results);
        System.out.println(clazz.getName());
        // try instance:
    }

    static final String JAVA_SOURCE_CODE =
            "package po;\n" +
                    "public class C5 {\n" +
                    "    public static void main(String[] args) {\n" +
                    "        System.out.println(\"hello world5!\");\n" +
                    "    }\n" +
                    "}";
}
