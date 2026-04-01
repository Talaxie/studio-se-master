
package com.netsuite.webservices.transactions.inventory;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.netsuite.webservices.transactions.inventory package. 
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

    private final static QName _InventoryAdjustment_QNAME = new QName("urn:inventory_2014_2.transactions.webservices.netsuite.com", "InventoryAdjustment");
    private final static QName _AssemblyBuild_QNAME = new QName("urn:inventory_2014_2.transactions.webservices.netsuite.com", "assemblyBuild");
    private final static QName _AssemblyUnbuild_QNAME = new QName("urn:inventory_2014_2.transactions.webservices.netsuite.com", "assemblyUnbuild");
    private final static QName _TransferOrder_QNAME = new QName("urn:inventory_2014_2.transactions.webservices.netsuite.com", "transferOrder");
    private final static QName _InterCompanyTransferOrder_QNAME = new QName("urn:inventory_2014_2.transactions.webservices.netsuite.com", "interCompanyTransferOrder");
    private final static QName _WorkOrder_QNAME = new QName("urn:inventory_2014_2.transactions.webservices.netsuite.com", "workOrder");
    private final static QName _InventoryTransfer_QNAME = new QName("urn:inventory_2014_2.transactions.webservices.netsuite.com", "inventoryTransfer");
    private final static QName _BinTransfer_QNAME = new QName("urn:inventory_2014_2.transactions.webservices.netsuite.com", "binTransfer");
    private final static QName _BinWorksheet_QNAME = new QName("urn:inventory_2014_2.transactions.webservices.netsuite.com", "binWorksheet");
    private final static QName _WorkOrderIssue_QNAME = new QName("urn:inventory_2014_2.transactions.webservices.netsuite.com", "workOrderIssue");
    private final static QName _WorkOrderCompletion_QNAME = new QName("urn:inventory_2014_2.transactions.webservices.netsuite.com", "workOrderCompletion");
    private final static QName _WorkOrderClose_QNAME = new QName("urn:inventory_2014_2.transactions.webservices.netsuite.com", "workOrderClose");
    private final static QName _InventoryCostRevaluation_QNAME = new QName("urn:inventory_2014_2.transactions.webservices.netsuite.com", "inventoryCostRevaluation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.netsuite.webservices.transactions.inventory
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InventoryAdjustment }
     * 
     */
    public InventoryAdjustment createInventoryAdjustment() {
        return new InventoryAdjustment();
    }

    /**
     * Create an instance of {@link AssemblyBuild }
     * 
     */
    public AssemblyBuild createAssemblyBuild() {
        return new AssemblyBuild();
    }

    /**
     * Create an instance of {@link AssemblyUnbuild }
     * 
     */
    public AssemblyUnbuild createAssemblyUnbuild() {
        return new AssemblyUnbuild();
    }

    /**
     * Create an instance of {@link TransferOrder }
     * 
     */
    public TransferOrder createTransferOrder() {
        return new TransferOrder();
    }

    /**
     * Create an instance of {@link InterCompanyTransferOrder }
     * 
     */
    public InterCompanyTransferOrder createInterCompanyTransferOrder() {
        return new InterCompanyTransferOrder();
    }

    /**
     * Create an instance of {@link WorkOrder }
     * 
     */
    public WorkOrder createWorkOrder() {
        return new WorkOrder();
    }

    /**
     * Create an instance of {@link InventoryTransfer }
     * 
     */
    public InventoryTransfer createInventoryTransfer() {
        return new InventoryTransfer();
    }

    /**
     * Create an instance of {@link BinTransfer }
     * 
     */
    public BinTransfer createBinTransfer() {
        return new BinTransfer();
    }

    /**
     * Create an instance of {@link BinWorksheet }
     * 
     */
    public BinWorksheet createBinWorksheet() {
        return new BinWorksheet();
    }

    /**
     * Create an instance of {@link WorkOrderIssue }
     * 
     */
    public WorkOrderIssue createWorkOrderIssue() {
        return new WorkOrderIssue();
    }

    /**
     * Create an instance of {@link WorkOrderCompletion }
     * 
     */
    public WorkOrderCompletion createWorkOrderCompletion() {
        return new WorkOrderCompletion();
    }

    /**
     * Create an instance of {@link WorkOrderClose }
     * 
     */
    public WorkOrderClose createWorkOrderClose() {
        return new WorkOrderClose();
    }

    /**
     * Create an instance of {@link InventoryCostRevaluation }
     * 
     */
    public InventoryCostRevaluation createInventoryCostRevaluation() {
        return new InventoryCostRevaluation();
    }

    /**
     * Create an instance of {@link InventoryAdjustmentInventory }
     * 
     */
    public InventoryAdjustmentInventory createInventoryAdjustmentInventory() {
        return new InventoryAdjustmentInventory();
    }

    /**
     * Create an instance of {@link InventoryAdjustmentInventoryList }
     * 
     */
    public InventoryAdjustmentInventoryList createInventoryAdjustmentInventoryList() {
        return new InventoryAdjustmentInventoryList();
    }

    /**
     * Create an instance of {@link AssemblyComponent }
     * 
     */
    public AssemblyComponent createAssemblyComponent() {
        return new AssemblyComponent();
    }

    /**
     * Create an instance of {@link AssemblyComponentList }
     * 
     */
    public AssemblyComponentList createAssemblyComponentList() {
        return new AssemblyComponentList();
    }

    /**
     * Create an instance of {@link TransferOrderItem }
     * 
     */
    public TransferOrderItem createTransferOrderItem() {
        return new TransferOrderItem();
    }

    /**
     * Create an instance of {@link TransferOrderItemList }
     * 
     */
    public TransferOrderItemList createTransferOrderItemList() {
        return new TransferOrderItemList();
    }

    /**
     * Create an instance of {@link InterCompanyTransferOrderItem }
     * 
     */
    public InterCompanyTransferOrderItem createInterCompanyTransferOrderItem() {
        return new InterCompanyTransferOrderItem();
    }

    /**
     * Create an instance of {@link InterCompanyTransferOrderItemList }
     * 
     */
    public InterCompanyTransferOrderItemList createInterCompanyTransferOrderItemList() {
        return new InterCompanyTransferOrderItemList();
    }

    /**
     * Create an instance of {@link WorkOrderItem }
     * 
     */
    public WorkOrderItem createWorkOrderItem() {
        return new WorkOrderItem();
    }

    /**
     * Create an instance of {@link WorkOrderItemList }
     * 
     */
    public WorkOrderItemList createWorkOrderItemList() {
        return new WorkOrderItemList();
    }

    /**
     * Create an instance of {@link SalesTeamList }
     * 
     */
    public SalesTeamList createSalesTeamList() {
        return new SalesTeamList();
    }

    /**
     * Create an instance of {@link PartnersList }
     * 
     */
    public PartnersList createPartnersList() {
        return new PartnersList();
    }

    /**
     * Create an instance of {@link InventoryTransferInventory }
     * 
     */
    public InventoryTransferInventory createInventoryTransferInventory() {
        return new InventoryTransferInventory();
    }

    /**
     * Create an instance of {@link InventoryTransferInventoryList }
     * 
     */
    public InventoryTransferInventoryList createInventoryTransferInventoryList() {
        return new InventoryTransferInventoryList();
    }

    /**
     * Create an instance of {@link BinTransferInventory }
     * 
     */
    public BinTransferInventory createBinTransferInventory() {
        return new BinTransferInventory();
    }

    /**
     * Create an instance of {@link BinTransferInventoryList }
     * 
     */
    public BinTransferInventoryList createBinTransferInventoryList() {
        return new BinTransferInventoryList();
    }

    /**
     * Create an instance of {@link BinWorksheetItem }
     * 
     */
    public BinWorksheetItem createBinWorksheetItem() {
        return new BinWorksheetItem();
    }

    /**
     * Create an instance of {@link BinWorksheetItemList }
     * 
     */
    public BinWorksheetItemList createBinWorksheetItemList() {
        return new BinWorksheetItemList();
    }

    /**
     * Create an instance of {@link WorkOrderIssueComponent }
     * 
     */
    public WorkOrderIssueComponent createWorkOrderIssueComponent() {
        return new WorkOrderIssueComponent();
    }

    /**
     * Create an instance of {@link WorkOrderIssueComponentList }
     * 
     */
    public WorkOrderIssueComponentList createWorkOrderIssueComponentList() {
        return new WorkOrderIssueComponentList();
    }

    /**
     * Create an instance of {@link WorkOrderCompletionComponent }
     * 
     */
    public WorkOrderCompletionComponent createWorkOrderCompletionComponent() {
        return new WorkOrderCompletionComponent();
    }

    /**
     * Create an instance of {@link WorkOrderCompletionComponentList }
     * 
     */
    public WorkOrderCompletionComponentList createWorkOrderCompletionComponentList() {
        return new WorkOrderCompletionComponentList();
    }

    /**
     * Create an instance of {@link WorkOrderCompletionOperation }
     * 
     */
    public WorkOrderCompletionOperation createWorkOrderCompletionOperation() {
        return new WorkOrderCompletionOperation();
    }

    /**
     * Create an instance of {@link WorkOrderCompletionOperationList }
     * 
     */
    public WorkOrderCompletionOperationList createWorkOrderCompletionOperationList() {
        return new WorkOrderCompletionOperationList();
    }

    /**
     * Create an instance of {@link InventoryCostRevaluationCostComponent }
     * 
     */
    public InventoryCostRevaluationCostComponent createInventoryCostRevaluationCostComponent() {
        return new InventoryCostRevaluationCostComponent();
    }

    /**
     * Create an instance of {@link InventoryCostRevaluationCostComponentList }
     * 
     */
    public InventoryCostRevaluationCostComponentList createInventoryCostRevaluationCostComponentList() {
        return new InventoryCostRevaluationCostComponentList();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InventoryAdjustment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:inventory_2014_2.transactions.webservices.netsuite.com", name = "InventoryAdjustment")
    public JAXBElement<InventoryAdjustment> createInventoryAdjustment(InventoryAdjustment value) {
        return new JAXBElement<InventoryAdjustment>(_InventoryAdjustment_QNAME, InventoryAdjustment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssemblyBuild }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:inventory_2014_2.transactions.webservices.netsuite.com", name = "assemblyBuild")
    public JAXBElement<AssemblyBuild> createAssemblyBuild(AssemblyBuild value) {
        return new JAXBElement<AssemblyBuild>(_AssemblyBuild_QNAME, AssemblyBuild.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssemblyUnbuild }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:inventory_2014_2.transactions.webservices.netsuite.com", name = "assemblyUnbuild")
    public JAXBElement<AssemblyUnbuild> createAssemblyUnbuild(AssemblyUnbuild value) {
        return new JAXBElement<AssemblyUnbuild>(_AssemblyUnbuild_QNAME, AssemblyUnbuild.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransferOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:inventory_2014_2.transactions.webservices.netsuite.com", name = "transferOrder")
    public JAXBElement<TransferOrder> createTransferOrder(TransferOrder value) {
        return new JAXBElement<TransferOrder>(_TransferOrder_QNAME, TransferOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterCompanyTransferOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:inventory_2014_2.transactions.webservices.netsuite.com", name = "interCompanyTransferOrder")
    public JAXBElement<InterCompanyTransferOrder> createInterCompanyTransferOrder(InterCompanyTransferOrder value) {
        return new JAXBElement<InterCompanyTransferOrder>(_InterCompanyTransferOrder_QNAME, InterCompanyTransferOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:inventory_2014_2.transactions.webservices.netsuite.com", name = "workOrder")
    public JAXBElement<WorkOrder> createWorkOrder(WorkOrder value) {
        return new JAXBElement<WorkOrder>(_WorkOrder_QNAME, WorkOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InventoryTransfer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:inventory_2014_2.transactions.webservices.netsuite.com", name = "inventoryTransfer")
    public JAXBElement<InventoryTransfer> createInventoryTransfer(InventoryTransfer value) {
        return new JAXBElement<InventoryTransfer>(_InventoryTransfer_QNAME, InventoryTransfer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BinTransfer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:inventory_2014_2.transactions.webservices.netsuite.com", name = "binTransfer")
    public JAXBElement<BinTransfer> createBinTransfer(BinTransfer value) {
        return new JAXBElement<BinTransfer>(_BinTransfer_QNAME, BinTransfer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BinWorksheet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:inventory_2014_2.transactions.webservices.netsuite.com", name = "binWorksheet")
    public JAXBElement<BinWorksheet> createBinWorksheet(BinWorksheet value) {
        return new JAXBElement<BinWorksheet>(_BinWorksheet_QNAME, BinWorksheet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkOrderIssue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:inventory_2014_2.transactions.webservices.netsuite.com", name = "workOrderIssue")
    public JAXBElement<WorkOrderIssue> createWorkOrderIssue(WorkOrderIssue value) {
        return new JAXBElement<WorkOrderIssue>(_WorkOrderIssue_QNAME, WorkOrderIssue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkOrderCompletion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:inventory_2014_2.transactions.webservices.netsuite.com", name = "workOrderCompletion")
    public JAXBElement<WorkOrderCompletion> createWorkOrderCompletion(WorkOrderCompletion value) {
        return new JAXBElement<WorkOrderCompletion>(_WorkOrderCompletion_QNAME, WorkOrderCompletion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkOrderClose }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:inventory_2014_2.transactions.webservices.netsuite.com", name = "workOrderClose")
    public JAXBElement<WorkOrderClose> createWorkOrderClose(WorkOrderClose value) {
        return new JAXBElement<WorkOrderClose>(_WorkOrderClose_QNAME, WorkOrderClose.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InventoryCostRevaluation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:inventory_2014_2.transactions.webservices.netsuite.com", name = "inventoryCostRevaluation")
    public JAXBElement<InventoryCostRevaluation> createInventoryCostRevaluation(InventoryCostRevaluation value) {
        return new JAXBElement<InventoryCostRevaluation>(_InventoryCostRevaluation_QNAME, InventoryCostRevaluation.class, null, value);
    }

}
