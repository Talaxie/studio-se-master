import java.nio.file.*;
import java.io.*;
import org.eclipse.emf.codegen.jet.JETCompiler;

/** Compiles the actual JET templates before exercising their generated code. */
public class CompileTemplates {
    public static void main(String[] args) throws Exception {
        Path output = Path.of(args[0]);
        for (int i = 1; i < args.length; i++) {
            JETCompiler compiler = new JETCompiler(Path.of(args[i]).toUri().toString(), "UTF-8");
            compiler.parse();
            String name = Path.of(args[i]).getFileName().toString().replace(".javajet", "");
            compiler.getSkeleton().setClassName(name);
            try (OutputStream stream = Files.newOutputStream(output.resolve(name + ".java"))) {
                compiler.generate(stream);
            }
        }
    }
}
