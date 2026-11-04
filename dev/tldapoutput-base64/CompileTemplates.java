import java.io.OutputStream;
import java.nio.file.*;
import org.eclipse.emf.codegen.jet.JETCompiler;

public class CompileTemplates {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < args.length; i += 2) {
            JETCompiler compiler = new JETCompiler(Path.of(args[i]).toUri().toString(), "UTF-8");
            compiler.parse();
            compiler.getSkeleton().setClassName(Path.of(args[i + 1]).getFileName().toString().replace(".java", ""));
            try (OutputStream out = Files.newOutputStream(Path.of(args[i + 1]))) {
                compiler.generate(out);
            }
        }
    }
}
