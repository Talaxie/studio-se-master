
package com.netsuite.webservices.activities.scheduling;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.netsuite.webservices.activities.scheduling package. 
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

    private final static QName _CalendarEvent_QNAME = new QName("urn:scheduling_2014_2.activities.webservices.netsuite.com", "CalendarEvent");
    private final static QName _CalendarEventSearch_QNAME = new QName("urn:scheduling_2014_2.activities.webservices.netsuite.com", "calendarEventSearch");
    private final static QName _Task_QNAME = new QName("urn:scheduling_2014_2.activities.webservices.netsuite.com", "Task");
    private final static QName _TaskSearch_QNAME = new QName("urn:scheduling_2014_2.activities.webservices.netsuite.com", "taskSearch");
    private final static QName _PhoneCall_QNAME = new QName("urn:scheduling_2014_2.activities.webservices.netsuite.com", "PhoneCall");
    private final static QName _PhoneCallSearch_QNAME = new QName("urn:scheduling_2014_2.activities.webservices.netsuite.com", "phoneCallSearch");
    private final static QName _ProjectTask_QNAME = new QName("urn:scheduling_2014_2.activities.webservices.netsuite.com", "projectTask");
    private final static QName _ProjectTaskSearch_QNAME = new QName("urn:scheduling_2014_2.activities.webservices.netsuite.com", "projectTaskSearch");
    private final static QName _ResourceAllocation_QNAME = new QName("urn:scheduling_2014_2.activities.webservices.netsuite.com", "resourceAllocation");
    private final static QName _ResourceAllocationSearch_QNAME = new QName("urn:scheduling_2014_2.activities.webservices.netsuite.com", "resourceAllocationSearch");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.netsuite.webservices.activities.scheduling
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalendarEvent }
     * 
     */
    public CalendarEvent createCalendarEvent() {
        return new CalendarEvent();
    }

    /**
     * Create an instance of {@link CalendarEventSearch }
     * 
     */
    public CalendarEventSearch createCalendarEventSearch() {
        return new CalendarEventSearch();
    }

    /**
     * Create an instance of {@link Task }
     * 
     */
    public Task createTask() {
        return new Task();
    }

    /**
     * Create an instance of {@link TaskSearch }
     * 
     */
    public TaskSearch createTaskSearch() {
        return new TaskSearch();
    }

    /**
     * Create an instance of {@link PhoneCall }
     * 
     */
    public PhoneCall createPhoneCall() {
        return new PhoneCall();
    }

    /**
     * Create an instance of {@link PhoneCallSearch }
     * 
     */
    public PhoneCallSearch createPhoneCallSearch() {
        return new PhoneCallSearch();
    }

    /**
     * Create an instance of {@link ProjectTask }
     * 
     */
    public ProjectTask createProjectTask() {
        return new ProjectTask();
    }

    /**
     * Create an instance of {@link ProjectTaskSearch }
     * 
     */
    public ProjectTaskSearch createProjectTaskSearch() {
        return new ProjectTaskSearch();
    }

    /**
     * Create an instance of {@link ResourceAllocation }
     * 
     */
    public ResourceAllocation createResourceAllocation() {
        return new ResourceAllocation();
    }

    /**
     * Create an instance of {@link ResourceAllocationSearch }
     * 
     */
    public ResourceAllocationSearch createResourceAllocationSearch() {
        return new ResourceAllocationSearch();
    }

    /**
     * Create an instance of {@link ExclusionDateList }
     * 
     */
    public ExclusionDateList createExclusionDateList() {
        return new ExclusionDateList();
    }

    /**
     * Create an instance of {@link CalendarEventAttendee }
     * 
     */
    public CalendarEventAttendee createCalendarEventAttendee() {
        return new CalendarEventAttendee();
    }

    /**
     * Create an instance of {@link CalendarEventAttendeeList }
     * 
     */
    public CalendarEventAttendeeList createCalendarEventAttendeeList() {
        return new CalendarEventAttendeeList();
    }

    /**
     * Create an instance of {@link CalendarEventResource }
     * 
     */
    public CalendarEventResource createCalendarEventResource() {
        return new CalendarEventResource();
    }

    /**
     * Create an instance of {@link CalendarEventResourceList }
     * 
     */
    public CalendarEventResourceList createCalendarEventResourceList() {
        return new CalendarEventResourceList();
    }

    /**
     * Create an instance of {@link CalendarEventSearchAdvanced }
     * 
     */
    public CalendarEventSearchAdvanced createCalendarEventSearchAdvanced() {
        return new CalendarEventSearchAdvanced();
    }

    /**
     * Create an instance of {@link CalendarEventSearchRow }
     * 
     */
    public CalendarEventSearchRow createCalendarEventSearchRow() {
        return new CalendarEventSearchRow();
    }

    /**
     * Create an instance of {@link TaskContact }
     * 
     */
    public TaskContact createTaskContact() {
        return new TaskContact();
    }

    /**
     * Create an instance of {@link TaskContactList }
     * 
     */
    public TaskContactList createTaskContactList() {
        return new TaskContactList();
    }

    /**
     * Create an instance of {@link TaskSearchAdvanced }
     * 
     */
    public TaskSearchAdvanced createTaskSearchAdvanced() {
        return new TaskSearchAdvanced();
    }

    /**
     * Create an instance of {@link TaskSearchRow }
     * 
     */
    public TaskSearchRow createTaskSearchRow() {
        return new TaskSearchRow();
    }

    /**
     * Create an instance of {@link PhoneCallContact }
     * 
     */
    public PhoneCallContact createPhoneCallContact() {
        return new PhoneCallContact();
    }

    /**
     * Create an instance of {@link PhoneCallContactList }
     * 
     */
    public PhoneCallContactList createPhoneCallContactList() {
        return new PhoneCallContactList();
    }

    /**
     * Create an instance of {@link PhoneCallSearchAdvanced }
     * 
     */
    public PhoneCallSearchAdvanced createPhoneCallSearchAdvanced() {
        return new PhoneCallSearchAdvanced();
    }

    /**
     * Create an instance of {@link PhoneCallSearchRow }
     * 
     */
    public PhoneCallSearchRow createPhoneCallSearchRow() {
        return new PhoneCallSearchRow();
    }

    /**
     * Create an instance of {@link ProjectTaskPredecessor }
     * 
     */
    public ProjectTaskPredecessor createProjectTaskPredecessor() {
        return new ProjectTaskPredecessor();
    }

    /**
     * Create an instance of {@link ProjectTaskPredecessorList }
     * 
     */
    public ProjectTaskPredecessorList createProjectTaskPredecessorList() {
        return new ProjectTaskPredecessorList();
    }

    /**
     * Create an instance of {@link ProjectTaskAssignee }
     * 
     */
    public ProjectTaskAssignee createProjectTaskAssignee() {
        return new ProjectTaskAssignee();
    }

    /**
     * Create an instance of {@link ProjectTaskAssigneeList }
     * 
     */
    public ProjectTaskAssigneeList createProjectTaskAssigneeList() {
        return new ProjectTaskAssigneeList();
    }

    /**
     * Create an instance of {@link ProjectTaskSearchAdvanced }
     * 
     */
    public ProjectTaskSearchAdvanced createProjectTaskSearchAdvanced() {
        return new ProjectTaskSearchAdvanced();
    }

    /**
     * Create an instance of {@link ProjectTaskSearchRow }
     * 
     */
    public ProjectTaskSearchRow createProjectTaskSearchRow() {
        return new ProjectTaskSearchRow();
    }

    /**
     * Create an instance of {@link PhoneCallTimeItemList }
     * 
     */
    public PhoneCallTimeItemList createPhoneCallTimeItemList() {
        return new PhoneCallTimeItemList();
    }

    /**
     * Create an instance of {@link CalendarEventTimeItemList }
     * 
     */
    public CalendarEventTimeItemList createCalendarEventTimeItemList() {
        return new CalendarEventTimeItemList();
    }

    /**
     * Create an instance of {@link TaskTimeItemList }
     * 
     */
    public TaskTimeItemList createTaskTimeItemList() {
        return new TaskTimeItemList();
    }

    /**
     * Create an instance of {@link ProjectTaskTimeItemList }
     * 
     */
    public ProjectTaskTimeItemList createProjectTaskTimeItemList() {
        return new ProjectTaskTimeItemList();
    }

    /**
     * Create an instance of {@link ResourceAllocationSearchAdvanced }
     * 
     */
    public ResourceAllocationSearchAdvanced createResourceAllocationSearchAdvanced() {
        return new ResourceAllocationSearchAdvanced();
    }

    /**
     * Create an instance of {@link ResourceAllocationSearchRow }
     * 
     */
    public ResourceAllocationSearchRow createResourceAllocationSearchRow() {
        return new ResourceAllocationSearchRow();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalendarEvent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:scheduling_2014_2.activities.webservices.netsuite.com", name = "CalendarEvent")
    public JAXBElement<CalendarEvent> createCalendarEvent(CalendarEvent value) {
        return new JAXBElement<CalendarEvent>(_CalendarEvent_QNAME, CalendarEvent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalendarEventSearch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:scheduling_2014_2.activities.webservices.netsuite.com", name = "calendarEventSearch")
    public JAXBElement<CalendarEventSearch> createCalendarEventSearch(CalendarEventSearch value) {
        return new JAXBElement<CalendarEventSearch>(_CalendarEventSearch_QNAME, CalendarEventSearch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Task }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:scheduling_2014_2.activities.webservices.netsuite.com", name = "Task")
    public JAXBElement<Task> createTask(Task value) {
        return new JAXBElement<Task>(_Task_QNAME, Task.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskSearch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:scheduling_2014_2.activities.webservices.netsuite.com", name = "taskSearch")
    public JAXBElement<TaskSearch> createTaskSearch(TaskSearch value) {
        return new JAXBElement<TaskSearch>(_TaskSearch_QNAME, TaskSearch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhoneCall }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:scheduling_2014_2.activities.webservices.netsuite.com", name = "PhoneCall")
    public JAXBElement<PhoneCall> createPhoneCall(PhoneCall value) {
        return new JAXBElement<PhoneCall>(_PhoneCall_QNAME, PhoneCall.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhoneCallSearch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:scheduling_2014_2.activities.webservices.netsuite.com", name = "phoneCallSearch")
    public JAXBElement<PhoneCallSearch> createPhoneCallSearch(PhoneCallSearch value) {
        return new JAXBElement<PhoneCallSearch>(_PhoneCallSearch_QNAME, PhoneCallSearch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProjectTask }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:scheduling_2014_2.activities.webservices.netsuite.com", name = "projectTask")
    public JAXBElement<ProjectTask> createProjectTask(ProjectTask value) {
        return new JAXBElement<ProjectTask>(_ProjectTask_QNAME, ProjectTask.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProjectTaskSearch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:scheduling_2014_2.activities.webservices.netsuite.com", name = "projectTaskSearch")
    public JAXBElement<ProjectTaskSearch> createProjectTaskSearch(ProjectTaskSearch value) {
        return new JAXBElement<ProjectTaskSearch>(_ProjectTaskSearch_QNAME, ProjectTaskSearch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceAllocation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:scheduling_2014_2.activities.webservices.netsuite.com", name = "resourceAllocation")
    public JAXBElement<ResourceAllocation> createResourceAllocation(ResourceAllocation value) {
        return new JAXBElement<ResourceAllocation>(_ResourceAllocation_QNAME, ResourceAllocation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceAllocationSearch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:scheduling_2014_2.activities.webservices.netsuite.com", name = "resourceAllocationSearch")
    public JAXBElement<ResourceAllocationSearch> createResourceAllocationSearch(ResourceAllocationSearch value) {
        return new JAXBElement<ResourceAllocationSearch>(_ResourceAllocationSearch_QNAME, ResourceAllocationSearch.class, null, value);
    }

}
