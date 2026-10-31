import java.io.*;
import org.talend.utils.security.StudioEncryption;
import org.talend.designer.core.model.utils.emf.talendfile.TalendFileFactory;
public class EncryptContextPassword {
    public static void main(String[] args) throws Exception {
        String plain=new BufferedReader(new InputStreamReader(System.in,java.nio.charset.StandardCharsets.UTF_8)).readLine();
        String encrypted=StudioEncryption.getStudioEncryption(StudioEncryption.EncryptionKeyName.SYSTEM).encrypt(plain);
        if(encrypted==null || !encrypted.startsWith("enc:"))throw new IllegalStateException("Context encryption failed");
        var context=TalendFileFactory.eINSTANCE.createContextParameterType();context.setType("id_Password");context.setValue(encrypted);
        if(!plain.equals(context.getRawValue()))throw new IllegalStateException("Studio context roundtrip failed");
        System.out.print(encrypted);
    }
}
