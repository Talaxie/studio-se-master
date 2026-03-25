
package com.netsuite.webservices.documents.filecabinet;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.netsuite.webservices.documents.filecabinet package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FileSearch_QNAME = new QName("urn:filecabinet_2014_2.documents.webservices.netsuite.com", "fileSearch");
    private final static QName _FolderSearch_QNAME = new QName("urn:filecabinet_2014_2.documents.webservices.netsuite.com", "folderSearch");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.netsuite.webservices.documents.filecabinet
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FileSearch }
     * 
     */
    public FileSearch createFileSearch() {
        return new FileSearch();
    }

    /**
     * Create an instance of {@link FolderSearch }
     * 
     */
    public FolderSearch createFolderSearch() {
        return new FolderSearch();
    }

    /**
     * Create an instance of {@link File }
     * 
     */
    public File createFile() {
        return new File();
    }

    /**
     * Create an instance of {@link FileSiteCategory }
     * 
     */
    public FileSiteCategory createFileSiteCategory() {
        return new FileSiteCategory();
    }

    /**
     * Create an instance of {@link FileSiteCategoryList }
     * 
     */
    public FileSiteCategoryList createFileSiteCategoryList() {
        return new FileSiteCategoryList();
    }

    /**
     * Create an instance of {@link FileSearchAdvanced }
     * 
     */
    public FileSearchAdvanced createFileSearchAdvanced() {
        return new FileSearchAdvanced();
    }

    /**
     * Create an instance of {@link FileSearchRow }
     * 
     */
    public FileSearchRow createFileSearchRow() {
        return new FileSearchRow();
    }

    /**
     * Create an instance of {@link Folder }
     * 
     */
    public Folder createFolder() {
        return new Folder();
    }

    /**
     * Create an instance of {@link FolderSearchAdvanced }
     * 
     */
    public FolderSearchAdvanced createFolderSearchAdvanced() {
        return new FolderSearchAdvanced();
    }

    /**
     * Create an instance of {@link FolderSearchRow }
     * 
     */
    public FolderSearchRow createFolderSearchRow() {
        return new FolderSearchRow();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileSearch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:filecabinet_2014_2.documents.webservices.netsuite.com", name = "fileSearch")
    public JAXBElement<FileSearch> createFileSearch(FileSearch value) {
        return new JAXBElement<FileSearch>(_FileSearch_QNAME, FileSearch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FolderSearch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:filecabinet_2014_2.documents.webservices.netsuite.com", name = "folderSearch")
    public JAXBElement<FolderSearch> createFolderSearch(FolderSearch value) {
        return new JAXBElement<FolderSearch>(_FolderSearch_QNAME, FolderSearch.class, null, value);
    }

}
