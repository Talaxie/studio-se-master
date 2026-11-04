import javax.naming.*;
import javax.naming.directory.*;
import javax.naming.ldap.InitialLdapContext;

/** In-memory LDAP boundary: never opens a server connection. */
public class RecordingContext extends InitialLdapContext {
    public int writes;
    public Attribute manager;
    public RecordingContext() throws NamingException { super(); }
    @Override public Attributes getAttributes(String dn) { return new BasicAttributes(); }
    @Override public DirContext createSubcontext(String dn, Attributes attrs) throws NamingException {
        writes++; manager = attrs.get("manager"); return null;
    }
    @Override public void modifyAttributes(String dn, int operation, Attributes attrs) throws NamingException {
        writes++; manager = attrs.get("manager");
    }
    @Override public void modifyAttributes(String dn, ModificationItem[] items) throws NamingException {
        writes++; manager = items[0].getAttribute();
    }
}
