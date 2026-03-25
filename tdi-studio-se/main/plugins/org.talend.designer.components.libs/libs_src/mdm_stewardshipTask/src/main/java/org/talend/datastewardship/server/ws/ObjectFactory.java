
package org.talend.datastewardship.server.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.talend.datastewardship.server.ws package. 
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

    private final static QName _GetTgtRecord_QNAME = new QName("http://ws.server.datastewardship.talend.org/", "getTgtRecord");
    private final static QName _GetTask_QNAME = new QName("http://ws.server.datastewardship.talend.org/", "getTask");
    private final static QName _GetNumOfTasks_QNAME = new QName("http://ws.server.datastewardship.talend.org/", "getNumOfTasks");
    private final static QName _Echo_QNAME = new QName("http://ws.server.datastewardship.talend.org/", "echo");
    private final static QName _GetTgtRecordResponse_QNAME = new QName("http://ws.server.datastewardship.talend.org/", "getTgtRecordResponse");
    private final static QName _DeleteTasks_QNAME = new QName("http://ws.server.datastewardship.talend.org/", "deleteTasks");
    private final static QName _GetNumOfTasksResponse_QNAME = new QName("http://ws.server.datastewardship.talend.org/", "getNumOfTasksResponse");
    private final static QName _DeleteTask_QNAME = new QName("http://ws.server.datastewardship.talend.org/", "deleteTask");
    private final static QName _FindTask_QNAME = new QName("http://ws.server.datastewardship.talend.org/", "findTask");
    private final static QName _GetSrcRecordResponse_QNAME = new QName("http://ws.server.datastewardship.talend.org/", "getSrcRecordResponse");
    private final static QName _GetTaskModifiedAfter_QNAME = new QName("http://ws.server.datastewardship.talend.org/", "getTaskModifiedAfter");
    private final static QName _GetTaskResponse_QNAME = new QName("http://ws.server.datastewardship.talend.org/", "getTaskResponse");
    private final static QName _DeleteTaskResponse_QNAME = new QName("http://ws.server.datastewardship.talend.org/", "deleteTaskResponse");
    private final static QName _FindTaskResponse_QNAME = new QName("http://ws.server.datastewardship.talend.org/", "findTaskResponse");
    private final static QName _EchoResponse_QNAME = new QName("http://ws.server.datastewardship.talend.org/", "echoResponse");
    private final static QName _DeleteTasksResponse_QNAME = new QName("http://ws.server.datastewardship.talend.org/", "deleteTasksResponse");
    private final static QName _GetSrcRecord_QNAME = new QName("http://ws.server.datastewardship.talend.org/", "getSrcRecord");
    private final static QName _SearchTasks_QNAME = new QName("http://ws.server.datastewardship.talend.org/", "searchTasks");
    private final static QName _SearchTasksResponse_QNAME = new QName("http://ws.server.datastewardship.talend.org/", "searchTasksResponse");
    private final static QName _GetTaskModifiedAfterResponse_QNAME = new QName("http://ws.server.datastewardship.talend.org/", "getTaskModifiedAfterResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.talend.datastewardship.server.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetTask }
     * 
     */
    public GetTask createGetTask() {
        return new GetTask();
    }

    /**
     * Create an instance of {@link GetTaskModifiedAfter }
     * 
     */
    public GetTaskModifiedAfter createGetTaskModifiedAfter() {
        return new GetTaskModifiedAfter();
    }

    /**
     * Create an instance of {@link GetTaskResponse }
     * 
     */
    public GetTaskResponse createGetTaskResponse() {
        return new GetTaskResponse();
    }

    /**
     * Create an instance of {@link GetNumOfTasksResponse }
     * 
     */
    public GetNumOfTasksResponse createGetNumOfTasksResponse() {
        return new GetNumOfTasksResponse();
    }

    /**
     * Create an instance of {@link GetTgtRecordResponse }
     * 
     */
    public GetTgtRecordResponse createGetTgtRecordResponse() {
        return new GetTgtRecordResponse();
    }

    /**
     * Create an instance of {@link GetSrcRecordResponse }
     * 
     */
    public GetSrcRecordResponse createGetSrcRecordResponse() {
        return new GetSrcRecordResponse();
    }

    /**
     * Create an instance of {@link DeleteTasks }
     * 
     */
    public DeleteTasks createDeleteTasks() {
        return new DeleteTasks();
    }

    /**
     * Create an instance of {@link DeleteTaskResponse }
     * 
     */
    public DeleteTaskResponse createDeleteTaskResponse() {
        return new DeleteTaskResponse();
    }

    /**
     * Create an instance of {@link Echo }
     * 
     */
    public Echo createEcho() {
        return new Echo();
    }

    /**
     * Create an instance of {@link GetSrcRecord }
     * 
     */
    public GetSrcRecord createGetSrcRecord() {
        return new GetSrcRecord();
    }

    /**
     * Create an instance of {@link SearchTasksResponse }
     * 
     */
    public SearchTasksResponse createSearchTasksResponse() {
        return new SearchTasksResponse();
    }

    /**
     * Create an instance of {@link SearchTasks }
     * 
     */
    public SearchTasks createSearchTasks() {
        return new SearchTasks();
    }

    /**
     * Create an instance of {@link DeleteTask }
     * 
     */
    public DeleteTask createDeleteTask() {
        return new DeleteTask();
    }

    /**
     * Create an instance of {@link GetNumOfTasks }
     * 
     */
    public GetNumOfTasks createGetNumOfTasks() {
        return new GetNumOfTasks();
    }

    /**
     * Create an instance of {@link GetTgtRecord }
     * 
     */
    public GetTgtRecord createGetTgtRecord() {
        return new GetTgtRecord();
    }

    /**
     * Create an instance of {@link FindTaskResponse }
     * 
     */
    public FindTaskResponse createFindTaskResponse() {
        return new FindTaskResponse();
    }

    /**
     * Create an instance of {@link FindTask }
     * 
     */
    public FindTask createFindTask() {
        return new FindTask();
    }

    /**
     * Create an instance of {@link EchoResponse }
     * 
     */
    public EchoResponse createEchoResponse() {
        return new EchoResponse();
    }

    /**
     * Create an instance of {@link GetTaskModifiedAfterResponse }
     * 
     */
    public GetTaskModifiedAfterResponse createGetTaskModifiedAfterResponse() {
        return new GetTaskModifiedAfterResponse();
    }

    /**
     * Create an instance of {@link DeleteTasksResponse }
     * 
     */
    public DeleteTasksResponse createDeleteTasksResponse() {
        return new DeleteTasksResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTgtRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.datastewardship.talend.org/", name = "getTgtRecord")
    public JAXBElement<GetTgtRecord> createGetTgtRecord(GetTgtRecord value) {
        return new JAXBElement<GetTgtRecord>(_GetTgtRecord_QNAME, GetTgtRecord.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTask }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.datastewardship.talend.org/", name = "getTask")
    public JAXBElement<GetTask> createGetTask(GetTask value) {
        return new JAXBElement<GetTask>(_GetTask_QNAME, GetTask.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNumOfTasks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.datastewardship.talend.org/", name = "getNumOfTasks")
    public JAXBElement<GetNumOfTasks> createGetNumOfTasks(GetNumOfTasks value) {
        return new JAXBElement<GetNumOfTasks>(_GetNumOfTasks_QNAME, GetNumOfTasks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Echo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.datastewardship.talend.org/", name = "echo")
    public JAXBElement<Echo> createEcho(Echo value) {
        return new JAXBElement<Echo>(_Echo_QNAME, Echo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTgtRecordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.datastewardship.talend.org/", name = "getTgtRecordResponse")
    public JAXBElement<GetTgtRecordResponse> createGetTgtRecordResponse(GetTgtRecordResponse value) {
        return new JAXBElement<GetTgtRecordResponse>(_GetTgtRecordResponse_QNAME, GetTgtRecordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteTasks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.datastewardship.talend.org/", name = "deleteTasks")
    public JAXBElement<DeleteTasks> createDeleteTasks(DeleteTasks value) {
        return new JAXBElement<DeleteTasks>(_DeleteTasks_QNAME, DeleteTasks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNumOfTasksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.datastewardship.talend.org/", name = "getNumOfTasksResponse")
    public JAXBElement<GetNumOfTasksResponse> createGetNumOfTasksResponse(GetNumOfTasksResponse value) {
        return new JAXBElement<GetNumOfTasksResponse>(_GetNumOfTasksResponse_QNAME, GetNumOfTasksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteTask }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.datastewardship.talend.org/", name = "deleteTask")
    public JAXBElement<DeleteTask> createDeleteTask(DeleteTask value) {
        return new JAXBElement<DeleteTask>(_DeleteTask_QNAME, DeleteTask.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindTask }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.datastewardship.talend.org/", name = "findTask")
    public JAXBElement<FindTask> createFindTask(FindTask value) {
        return new JAXBElement<FindTask>(_FindTask_QNAME, FindTask.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSrcRecordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.datastewardship.talend.org/", name = "getSrcRecordResponse")
    public JAXBElement<GetSrcRecordResponse> createGetSrcRecordResponse(GetSrcRecordResponse value) {
        return new JAXBElement<GetSrcRecordResponse>(_GetSrcRecordResponse_QNAME, GetSrcRecordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTaskModifiedAfter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.datastewardship.talend.org/", name = "getTaskModifiedAfter")
    public JAXBElement<GetTaskModifiedAfter> createGetTaskModifiedAfter(GetTaskModifiedAfter value) {
        return new JAXBElement<GetTaskModifiedAfter>(_GetTaskModifiedAfter_QNAME, GetTaskModifiedAfter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTaskResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.datastewardship.talend.org/", name = "getTaskResponse")
    public JAXBElement<GetTaskResponse> createGetTaskResponse(GetTaskResponse value) {
        return new JAXBElement<GetTaskResponse>(_GetTaskResponse_QNAME, GetTaskResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteTaskResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.datastewardship.talend.org/", name = "deleteTaskResponse")
    public JAXBElement<DeleteTaskResponse> createDeleteTaskResponse(DeleteTaskResponse value) {
        return new JAXBElement<DeleteTaskResponse>(_DeleteTaskResponse_QNAME, DeleteTaskResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindTaskResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.datastewardship.talend.org/", name = "findTaskResponse")
    public JAXBElement<FindTaskResponse> createFindTaskResponse(FindTaskResponse value) {
        return new JAXBElement<FindTaskResponse>(_FindTaskResponse_QNAME, FindTaskResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EchoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.datastewardship.talend.org/", name = "echoResponse")
    public JAXBElement<EchoResponse> createEchoResponse(EchoResponse value) {
        return new JAXBElement<EchoResponse>(_EchoResponse_QNAME, EchoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteTasksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.datastewardship.talend.org/", name = "deleteTasksResponse")
    public JAXBElement<DeleteTasksResponse> createDeleteTasksResponse(DeleteTasksResponse value) {
        return new JAXBElement<DeleteTasksResponse>(_DeleteTasksResponse_QNAME, DeleteTasksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSrcRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.datastewardship.talend.org/", name = "getSrcRecord")
    public JAXBElement<GetSrcRecord> createGetSrcRecord(GetSrcRecord value) {
        return new JAXBElement<GetSrcRecord>(_GetSrcRecord_QNAME, GetSrcRecord.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchTasks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.datastewardship.talend.org/", name = "searchTasks")
    public JAXBElement<SearchTasks> createSearchTasks(SearchTasks value) {
        return new JAXBElement<SearchTasks>(_SearchTasks_QNAME, SearchTasks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchTasksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.datastewardship.talend.org/", name = "searchTasksResponse")
    public JAXBElement<SearchTasksResponse> createSearchTasksResponse(SearchTasksResponse value) {
        return new JAXBElement<SearchTasksResponse>(_SearchTasksResponse_QNAME, SearchTasksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTaskModifiedAfterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.datastewardship.talend.org/", name = "getTaskModifiedAfterResponse")
    public JAXBElement<GetTaskModifiedAfterResponse> createGetTaskModifiedAfterResponse(GetTaskModifiedAfterResponse value) {
        return new JAXBElement<GetTaskModifiedAfterResponse>(_GetTaskModifiedAfterResponse_QNAME, GetTaskModifiedAfterResponse.class, null, value);
    }

}
