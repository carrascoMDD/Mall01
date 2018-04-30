package com.dosmil_e.mall.meta;

// WholeReplicationConfig Dynamic

import com.dosmil_e.modelbase.support.EAIMMCtxtIfc;
import com.dosmil_e.modelbase.support.EAIMMName;
import com.dosmil_e.modelbase.support.EAIMMNameIfc;
import com.dosmil_e.modelbase.support.EAIException;

import com.dosmil_e.modelbase.flattrx.*;

import com.dosmil_e.modelbase.ifc.*;

import com.dosmil_e.m3.traversal.ifc.*;
import com.dosmil_e.m3.replication.ifc.*;


import java.util.Hashtable;


public class MallReplicationConfig extends com.dosmil_e.m3.traversal.impl.M3TraversalConfigImpl {


  /*******************************************************
   *  Static members holding Configs and Managers
   *******************************************************/

  /*******************************************************
   *  Root node configs declarations
   *******************************************************/
	public M3RootTypeNodeConfigIfc aAddressRTNC;
	public M3RootTypeNodeConfigIfc aContactRTNC;
	public M3RootTypeNodeConfigIfc aDeliveryServiceRTNC;
	public M3RootTypeNodeConfigIfc aShippingRTNC;
	public M3RootTypeNodeConfigIfc aMallRTNC;
	public M3RootTypeNodeConfigIfc aPartyRTNC;
	public M3RootTypeNodeConfigIfc aPaymentRTNC;
	public M3RootTypeNodeConfigIfc aInvoiceLineRTNC;
	public M3RootTypeNodeConfigIfc aPurchaseOrderLineRTNC;
	public M3RootTypeNodeConfigIfc aInvoiceRTNC;
	public M3RootTypeNodeConfigIfc aPurchaseOrderRTNC;
	public M3RootTypeNodeConfigIfc aProductRTNC;
	public M3RootTypeNodeConfigIfc aCustomerRTNC;
	public M3RootTypeNodeConfigIfc aVendorRTNC;


  /*******************************************************
   *  Node configs declarations
   *******************************************************/
	public M3NodeConfigIfc aAddressNC, aAddressNCTerm;
	public M3NodeConfigIfc aContactNC, aContactNCTerm;
	public M3NodeConfigIfc aDeliveryServiceNC, aDeliveryServiceNCTerm;
	public M3NodeConfigIfc aShippingNC, aShippingNCTerm;
	public M3NodeConfigIfc aMallNC, aMallNCTerm;
	public M3NodeConfigIfc aPartyNC, aPartyNCTerm;
	public M3NodeConfigIfc aPaymentNC, aPaymentNCTerm;
	public M3NodeConfigIfc aInvoiceLineNC, aInvoiceLineNCTerm;
	public M3NodeConfigIfc aPurchaseOrderLineNC, aPurchaseOrderLineNCTerm;
	public M3NodeConfigIfc aInvoiceNC, aInvoiceNCTerm;
	public M3NodeConfigIfc aPurchaseOrderNC, aPurchaseOrderNCTerm;
	public M3NodeConfigIfc aProductNC, aProductNCTerm;
	public M3NodeConfigIfc aCustomerNC, aCustomerNCTerm;
	public M3NodeConfigIfc aVendorNC, aVendorNCTerm;


  /*******************************************************
   *  Node mgrs declarations
   *******************************************************/
	public M3ReplicateNodeMgrIfc aAddressNMgr;
	public M3ReplicateNodeMgrIfc aContactNMgr;
	public M3ReplicateNodeMgrIfc aDeliveryServiceNMgr;
	public M3ReplicateNodeMgrIfc aShippingNMgr;
	public M3ReplicateNodeMgrIfc aMallNMgr;
	public M3ReplicateNodeMgrIfc aPartyNMgr;
	public M3ReplicateNodeMgrIfc aPaymentNMgr;
	public M3ReplicateNodeMgrIfc aInvoiceLineNMgr;
	public M3ReplicateNodeMgrIfc aPurchaseOrderLineNMgr;
	public M3ReplicateNodeMgrIfc aInvoiceNMgr;
	public M3ReplicateNodeMgrIfc aPurchaseOrderNMgr;
	public M3ReplicateNodeMgrIfc aProductNMgr;
	public M3ReplicateNodeMgrIfc aCustomerNMgr;
	public M3ReplicateNodeMgrIfc aVendorNMgr;


  /*******************************************************
   *  Branch configs declarations
   *******************************************************/
	public M3BranchConfigIfc aAddress_shippingsBC;
	public M3BranchConfigIfc aContact_shippingsBC;
	public M3BranchConfigIfc aDeliveryService_shippingsBC;
	public M3BranchConfigIfc aShipping_deliveryServiceBC;
	public M3BranchConfigIfc aShipping_contactBC;
	public M3BranchConfigIfc aShipping_addressBC;
	public M3BranchConfigIfc aMall_vendorsBC;
	public M3BranchConfigIfc aMall_deliveryServicesBC;
	public M3BranchConfigIfc aMall_partiesBC;
	public M3BranchConfigIfc aParty_customersBC;
	public M3BranchConfigIfc aParty_contactsBC;
	public M3BranchConfigIfc aParty_addressesBC;
	public M3BranchConfigIfc aInvoiceLine_purchaseOrderLineBC;
	public M3BranchConfigIfc aPurchaseOrderLine_productBC;
	public M3BranchConfigIfc aPurchaseOrderLine_invoiceLineBC;
	public M3BranchConfigIfc aInvoice_invoiceLinesBC;
	public M3BranchConfigIfc aInvoice_purchaseOrderBC;
	public M3BranchConfigIfc aInvoice_paymentBC;
	public M3BranchConfigIfc aInvoice_shippingBC;
	public M3BranchConfigIfc aPurchaseOrder_purchaseOrderLinesBC;
	public M3BranchConfigIfc aPurchaseOrder_invoicesBC;
	public M3BranchConfigIfc aProduct_purchaseOrderLinesBC;
	public M3BranchConfigIfc aCustomer_purchaseOrdersBC;
	public M3BranchConfigIfc aCustomer_partyBC;
	public M3BranchConfigIfc aCustomer_invoicesBC;
	public M3BranchConfigIfc aVendor_productsBC;
	public M3BranchConfigIfc aVendor_customersBC;


  /*******************************************************
   *  Branch mgrs declarations
   *******************************************************/
	public M3ReplicateBranchMgrIfc aAddress_shippingsBMgr;
	public M3ReplicateBranchMgrIfc aContact_shippingsBMgr;
	public M3ReplicateBranchMgrIfc aDeliveryService_shippingsBMgr;
	public M3ReplicateBranchMgrIfc aShipping_deliveryServiceBMgr;
	public M3ReplicateBranchMgrIfc aShipping_contactBMgr;
	public M3ReplicateBranchMgrIfc aShipping_addressBMgr;
	public M3ReplicateBranchMgrIfc aMall_vendorsBMgr;
	public M3ReplicateBranchMgrIfc aMall_deliveryServicesBMgr;
	public M3ReplicateBranchMgrIfc aMall_partiesBMgr;
	public M3ReplicateBranchMgrIfc aParty_customersBMgr;
	public M3ReplicateBranchMgrIfc aParty_contactsBMgr;
	public M3ReplicateBranchMgrIfc aParty_addressesBMgr;
	public M3ReplicateBranchMgrIfc aInvoiceLine_purchaseOrderLineBMgr;
	public M3ReplicateBranchMgrIfc aPurchaseOrderLine_productBMgr;
	public M3ReplicateBranchMgrIfc aPurchaseOrderLine_invoiceLineBMgr;
	public M3ReplicateBranchMgrIfc aInvoice_invoiceLinesBMgr;
	public M3ReplicateBranchMgrIfc aInvoice_purchaseOrderBMgr;
	public M3ReplicateBranchMgrIfc aInvoice_paymentBMgr;
	public M3ReplicateBranchMgrIfc aInvoice_shippingBMgr;
	public M3ReplicateBranchMgrIfc aPurchaseOrder_purchaseOrderLinesBMgr;
	public M3ReplicateBranchMgrIfc aPurchaseOrder_invoicesBMgr;
	public M3ReplicateBranchMgrIfc aProduct_purchaseOrderLinesBMgr;
	public M3ReplicateBranchMgrIfc aCustomer_purchaseOrdersBMgr;
	public M3ReplicateBranchMgrIfc aCustomer_partyBMgr;
	public M3ReplicateBranchMgrIfc aCustomer_invoicesBMgr;
	public M3ReplicateBranchMgrIfc aVendor_productsBMgr;
	public M3ReplicateBranchMgrIfc aVendor_customersBMgr;


  /*******************************************************
   *  Related type node configs declarations
   *******************************************************/
	public M3RelatedTypeNodeConfigIfc aAddress_shippings_ShippingRelTNC;
	public M3RelatedTypeNodeConfigIfc aContact_shippings_ShippingRelTNC;
	public M3RelatedTypeNodeConfigIfc aDeliveryService_shippings_ShippingRelTNC;
	public M3RelatedTypeNodeConfigIfc aShipping_deliveryService_DeliveryServiceRelTNC;
	public M3RelatedTypeNodeConfigIfc aShipping_contact_ContactRelTNC;
	public M3RelatedTypeNodeConfigIfc aShipping_address_AddressRelTNC;
	public M3RelatedTypeNodeConfigIfc aMall_vendors_VendorRelTNC;
	public M3RelatedTypeNodeConfigIfc aMall_deliveryServices_DeliveryServiceRelTNC;
	public M3RelatedTypeNodeConfigIfc aMall_parties_PartyRelTNC;
	public M3RelatedTypeNodeConfigIfc aParty_customers_CustomerRelTNC;
	public M3RelatedTypeNodeConfigIfc aParty_contacts_ContactRelTNC;
	public M3RelatedTypeNodeConfigIfc aParty_addresses_AddressRelTNC;
	public M3RelatedTypeNodeConfigIfc aInvoiceLine_purchaseOrderLine_PurchaseOrderLineRelTNC;
	public M3RelatedTypeNodeConfigIfc aPurchaseOrderLine_product_ProductRelTNC;
	public M3RelatedTypeNodeConfigIfc aPurchaseOrderLine_invoiceLine_InvoiceLineRelTNC;
	public M3RelatedTypeNodeConfigIfc aInvoice_invoiceLines_InvoiceLineRelTNC;
	public M3RelatedTypeNodeConfigIfc aInvoice_purchaseOrder_PurchaseOrderRelTNC;
	public M3RelatedTypeNodeConfigIfc aInvoice_payment_PaymentRelTNC;
	public M3RelatedTypeNodeConfigIfc aInvoice_shipping_ShippingRelTNC;
	public M3RelatedTypeNodeConfigIfc aPurchaseOrder_purchaseOrderLines_PurchaseOrderLineRelTNC;
	public M3RelatedTypeNodeConfigIfc aPurchaseOrder_invoices_InvoiceRelTNC;
	public M3RelatedTypeNodeConfigIfc aProduct_purchaseOrderLines_PurchaseOrderLineRelTNC;
	public M3RelatedTypeNodeConfigIfc aCustomer_purchaseOrders_PurchaseOrderRelTNC;
	public M3RelatedTypeNodeConfigIfc aCustomer_party_PartyRelTNC;
	public M3RelatedTypeNodeConfigIfc aCustomer_invoices_InvoiceRelTNC;
	public M3RelatedTypeNodeConfigIfc aVendor_products_ProductRelTNC;
	public M3RelatedTypeNodeConfigIfc aVendor_customers_CustomerRelTNC;


  /*******************************************************
   *  Attribute configs declarations
   *******************************************************/


  /*******************************************************
   *  Field mgrs declarations
   *******************************************************/



  /*******************************************************
   *  Static singleton config accessor
   *******************************************************/

  public static String gTraversalConfigName = new String("MallReplicationConfig");


  public static com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc getConfig( EAIMMCtxtIfc theCtxt,
    com.dosmil_e.m3.core.ifc.M3ModelIfc theM3Model) {

    if( theCtxt == null) { return null;}

    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc aConfig = null;
    try { aConfig = theM3Model.findTraversalConfigsNamed( theCtxt, new EAIMMName( gTraversalConfigName));} catch( EAIException anEx) {}
    return aConfig;
  }



  /*******************************************************
   *  Constructor for M3ReplicationConfig
   *******************************************************/

  public MallReplicationConfig(
    EAIMMCtxtIfc                        theCtxt,
    EAIMMNameIfc                        theName,
    com.dosmil_e.m3.core.ifc.M3ModelIfc theM3Model) {

    super( theCtxt, theName);
    initConfig( theCtxt, theM3Model);
  }






/****************************************************************************
 *  Initialization of traversal configuration
 ****************************************************************************/
  public void initConfig(  EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModelIfc theM3Model) {
   try {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        theCtxt.getFlatTrxMgr().setMustPropagateChanges( false);
        initConfigInternal( theCtxt, theM3Model);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }
   } catch( EAIException anEx) {}
  }




  protected void initConfigInternal( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModelIfc theM3Model) {
    if( theCtxt == null) { return;}


    try {

  /*******************************************************
   *  Root node configs instantiations
   *******************************************************/
    initRootTypeNodeCfgsInstantiations( theCtxt, theM3Model);

  /*******************************************************
   *  Node configs  instantiations
   *******************************************************/
    initNodeCfgsInstantiations( theCtxt, theM3Model);

  /*******************************************************
   *  Node mgrs  instantiations
   *******************************************************/
    initNodeMgrsInstantiations( theCtxt, theM3Model);

  /*******************************************************
   *  Branch configs  instantiations
   *******************************************************/
    initBranchCfgsInstantiations( theCtxt, theM3Model);

  /*******************************************************
   *  Branch mgrs  instantiations
   *******************************************************/
    initBranchMgrsInstantiations( theCtxt, theM3Model);

  /*******************************************************
   *  Related type node configs  instantiations
   *******************************************************/
    initRelatedTypeNodeCfgsInstantiations( theCtxt, theM3Model);

  /*******************************************************
   *  Attribute configs  instantiations
   *******************************************************/
    initAttributeCfgsInstantiations( theCtxt, theM3Model);

  /*******************************************************
   *  Field mgrs  instantiations
   *******************************************************/
    initFieldMgrsInstantiations( theCtxt, theM3Model);


  /*******************************************************
   *  Root node configs
$TraversalRootTypeNodeCfgsStaticInitializations$
   *******************************************************/

  /*******************************************************
   *  Node configs
   *******************************************************/
    initNodeCfgsInitializations( theCtxt, theM3Model);

  /*******************************************************
   *  Node mgrs
$TraversalNodeMgrsStaticInitializations$
   *******************************************************/

  /*******************************************************
   *  Branch configs
   *******************************************************/
    initBranchCfgsInitializations( theCtxt, theM3Model);

  /*******************************************************
   *  Branch mgrs
$TraversalBranchMgrsStaticInitializations$
   *******************************************************/

  /*******************************************************
   *  Related type node configs
$TraversalRelatedTypeNodeCfgsStaticInitializations$
   *******************************************************/

  /*******************************************************
   *  Attribute configs
$TraversalAttributeCfgsStaticInitializations$
   *******************************************************/

  /*******************************************************
   *  Field mgrs
$TraversalFieldMgrsStaticInitializations$
    *******************************************************/


  /*******************************************************
   *  Init Replicated NodeMgrs and BranchMgrs with M3 replicated types and rels
    *******************************************************/

    postProcess( theCtxt, theM3Model);


    }
    catch( EAIException anEx) {}
  }



  /*******************************************************
   *  Init Replicated NodeMgrs and BranchMgrs with M3 replicated types and rels
    *******************************************************/
  protected void postProcess( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModelIfc theM3Model) {

    if( theCtxt == null) { return;}


    try {

  /*******************************************************
   *  Init ReplicatedMetaType of NodeMgrs
    *******************************************************/

    M3NodeConfigIfc[] someNodeConfigs = getNodeConfigs(theCtxt);
    if( someNodeConfigs != null) {
      int aNumNodeConfigs = someNodeConfigs.length;
      for( int anIndex = 0; anIndex < aNumNodeConfigs; anIndex++) {
        M3NodeConfigIfc aNodeConfig = someNodeConfigs[ anIndex];
        if( aNodeConfig != null) {
          com.dosmil_e.m3.core.ifc.M3TypeIfc aType = aNodeConfig.getMetaType( theCtxt);
          if( aType != null) {
            M3NodeMgrIfc aNodeMgr = aNodeConfig.getMetaNodeMgr( theCtxt);
            if( aNodeMgr != null) {
              com.dosmil_e.m3.replication.ifc.M3ReplicateNodeMgrIfc aReplicateNodeMgr = null;
              try { aReplicateNodeMgr = (com.dosmil_e.m3.replication.ifc.M3ReplicateNodeMgrIfc) aNodeMgr;} catch( ClassCastException anEx) {}
              if( aReplicateNodeMgr != null) {
                aReplicateNodeMgr.setReplicatedMetaType( theCtxt, aType);
              }
            }
          }
        }
      }
    }


  /*******************************************************
   *  Init ReplicatedMetaRelationship of BranchMgrs
    *******************************************************/


    M3BranchConfigIfc[] someBranchConfigs = getBranchConfigs( theCtxt);
    if( someBranchConfigs != null) {
      int aNumBranchConfigs = someBranchConfigs.length;
      for( int anIndex = 0; anIndex < aNumBranchConfigs; anIndex++) {
        M3BranchConfigIfc aBranchConfig = someBranchConfigs[ anIndex];
        if( aBranchConfig != null) {
          com.dosmil_e.m3.core.ifc.M3RelationshipIfc aRelationship = aBranchConfig.getMetaRelationship( theCtxt);
          if( aRelationship != null) {
            M3BranchMgrIfc aBranchMgr = aBranchConfig.getMetaBranchMgr( theCtxt);
            if( aBranchMgr != null) {
              com.dosmil_e.m3.replication.ifc.M3ReplicateBranchMgrIfc aReplicateBranchMgr = null;
              try { aReplicateBranchMgr = (com.dosmil_e.m3.replication.ifc.M3ReplicateBranchMgrIfc) aBranchMgr;} catch( ClassCastException anEx) {}
              if( aReplicateBranchMgr != null) {
                aReplicateBranchMgr.setReplicatedMetaRelationship( theCtxt, aRelationship);
              }
            }
          }
        }
      }
    }

    } catch( EAIException anEx) {}
  }






  protected void initRootTypeNodeCfgsInstantiations( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModelIfc theM3Model) throws EAIException {
    if( theCtxt == null) { return;}
  /*******************************************************
   *  Root node configs instantiations
   *******************************************************/
		aAddressRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("AddressRTNC"));
		aAddressRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Address", "core"));
		addRootTypeNodeConfigs( theCtxt, aAddressRTNC);

		aContactRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("ContactRTNC"));
		aContactRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Contact", "core"));
		addRootTypeNodeConfigs( theCtxt, aContactRTNC);

		aDeliveryServiceRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("DeliveryServiceRTNC"));
		aDeliveryServiceRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "DeliveryService", "core"));
		addRootTypeNodeConfigs( theCtxt, aDeliveryServiceRTNC);

		aShippingRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("ShippingRTNC"));
		aShippingRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Shipping", "core"));
		addRootTypeNodeConfigs( theCtxt, aShippingRTNC);

		aMallRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("MallRTNC"));
		aMallRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Mall", "core"));
		addRootTypeNodeConfigs( theCtxt, aMallRTNC);

		aPartyRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("PartyRTNC"));
		aPartyRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Party", "core"));
		addRootTypeNodeConfigs( theCtxt, aPartyRTNC);

		aPaymentRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("PaymentRTNC"));
		aPaymentRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Payment", "core"));
		addRootTypeNodeConfigs( theCtxt, aPaymentRTNC);

		aInvoiceLineRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("InvoiceLineRTNC"));
		aInvoiceLineRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "InvoiceLine", "core"));
		addRootTypeNodeConfigs( theCtxt, aInvoiceLineRTNC);

		aPurchaseOrderLineRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("PurchaseOrderLineRTNC"));
		aPurchaseOrderLineRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "PurchaseOrderLine", "core"));
		addRootTypeNodeConfigs( theCtxt, aPurchaseOrderLineRTNC);

		aInvoiceRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("InvoiceRTNC"));
		aInvoiceRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Invoice", "core"));
		addRootTypeNodeConfigs( theCtxt, aInvoiceRTNC);

		aPurchaseOrderRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("PurchaseOrderRTNC"));
		aPurchaseOrderRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "PurchaseOrder", "core"));
		addRootTypeNodeConfigs( theCtxt, aPurchaseOrderRTNC);

		aProductRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("ProductRTNC"));
		aProductRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Product", "core"));
		addRootTypeNodeConfigs( theCtxt, aProductRTNC);

		aCustomerRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("CustomerRTNC"));
		aCustomerRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Customer", "core"));
		addRootTypeNodeConfigs( theCtxt, aCustomerRTNC);

		aVendorRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("VendorRTNC"));
		aVendorRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Vendor", "core"));
		addRootTypeNodeConfigs( theCtxt, aVendorRTNC);


  }


  protected void initNodeCfgsInstantiations( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModelIfc theM3Model) throws EAIException {
    if( theCtxt == null) { return;}
  /*******************************************************
   *  Node configs  instantiations
   *******************************************************/
		aAddressNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("AddressNC"));
		aAddressNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Address", "core"));
		addNodeConfigs( theCtxt, aAddressNC);
		aAddressRTNC.setNodeConfig( theCtxt, aAddressNC);

		aAddressNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("AddressNCTerm"));
		aAddressNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Address", "core"));
		addNodeConfigs( theCtxt, aAddressNCTerm);
		aAddressNCTerm.setIsTerminal( theCtxt, true);

		aContactNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("ContactNC"));
		aContactNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Contact", "core"));
		addNodeConfigs( theCtxt, aContactNC);
		aContactRTNC.setNodeConfig( theCtxt, aContactNC);

		aContactNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("ContactNCTerm"));
		aContactNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Contact", "core"));
		addNodeConfigs( theCtxt, aContactNCTerm);
		aContactNCTerm.setIsTerminal( theCtxt, true);

		aDeliveryServiceNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("DeliveryServiceNC"));
		aDeliveryServiceNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "DeliveryService", "core"));
		addNodeConfigs( theCtxt, aDeliveryServiceNC);
		aDeliveryServiceRTNC.setNodeConfig( theCtxt, aDeliveryServiceNC);

		aDeliveryServiceNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("DeliveryServiceNCTerm"));
		aDeliveryServiceNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "DeliveryService", "core"));
		addNodeConfigs( theCtxt, aDeliveryServiceNCTerm);
		aDeliveryServiceNCTerm.setIsTerminal( theCtxt, true);

		aShippingNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("ShippingNC"));
		aShippingNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Shipping", "core"));
		addNodeConfigs( theCtxt, aShippingNC);
		aShippingRTNC.setNodeConfig( theCtxt, aShippingNC);

		aShippingNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("ShippingNCTerm"));
		aShippingNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Shipping", "core"));
		addNodeConfigs( theCtxt, aShippingNCTerm);
		aShippingNCTerm.setIsTerminal( theCtxt, true);

		aMallNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("MallNC"));
		aMallNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Mall", "core"));
		addNodeConfigs( theCtxt, aMallNC);
		aMallRTNC.setNodeConfig( theCtxt, aMallNC);

		aMallNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("MallNCTerm"));
		aMallNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Mall", "core"));
		addNodeConfigs( theCtxt, aMallNCTerm);
		aMallNCTerm.setIsTerminal( theCtxt, true);

		aPartyNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("PartyNC"));
		aPartyNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Party", "core"));
		addNodeConfigs( theCtxt, aPartyNC);
		aPartyRTNC.setNodeConfig( theCtxt, aPartyNC);

		aPartyNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("PartyNCTerm"));
		aPartyNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Party", "core"));
		addNodeConfigs( theCtxt, aPartyNCTerm);
		aPartyNCTerm.setIsTerminal( theCtxt, true);

		aPaymentNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("PaymentNC"));
		aPaymentNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Payment", "core"));
		addNodeConfigs( theCtxt, aPaymentNC);
		aPaymentRTNC.setNodeConfig( theCtxt, aPaymentNC);

		aPaymentNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("PaymentNCTerm"));
		aPaymentNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Payment", "core"));
		addNodeConfigs( theCtxt, aPaymentNCTerm);
		aPaymentNCTerm.setIsTerminal( theCtxt, true);

		aInvoiceLineNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("InvoiceLineNC"));
		aInvoiceLineNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "InvoiceLine", "core"));
		addNodeConfigs( theCtxt, aInvoiceLineNC);
		aInvoiceLineRTNC.setNodeConfig( theCtxt, aInvoiceLineNC);

		aInvoiceLineNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("InvoiceLineNCTerm"));
		aInvoiceLineNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "InvoiceLine", "core"));
		addNodeConfigs( theCtxt, aInvoiceLineNCTerm);
		aInvoiceLineNCTerm.setIsTerminal( theCtxt, true);

		aPurchaseOrderLineNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("PurchaseOrderLineNC"));
		aPurchaseOrderLineNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "PurchaseOrderLine", "core"));
		addNodeConfigs( theCtxt, aPurchaseOrderLineNC);
		aPurchaseOrderLineRTNC.setNodeConfig( theCtxt, aPurchaseOrderLineNC);

		aPurchaseOrderLineNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("PurchaseOrderLineNCTerm"));
		aPurchaseOrderLineNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "PurchaseOrderLine", "core"));
		addNodeConfigs( theCtxt, aPurchaseOrderLineNCTerm);
		aPurchaseOrderLineNCTerm.setIsTerminal( theCtxt, true);

		aInvoiceNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("InvoiceNC"));
		aInvoiceNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Invoice", "core"));
		addNodeConfigs( theCtxt, aInvoiceNC);
		aInvoiceRTNC.setNodeConfig( theCtxt, aInvoiceNC);

		aInvoiceNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("InvoiceNCTerm"));
		aInvoiceNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Invoice", "core"));
		addNodeConfigs( theCtxt, aInvoiceNCTerm);
		aInvoiceNCTerm.setIsTerminal( theCtxt, true);

		aPurchaseOrderNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("PurchaseOrderNC"));
		aPurchaseOrderNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "PurchaseOrder", "core"));
		addNodeConfigs( theCtxt, aPurchaseOrderNC);
		aPurchaseOrderRTNC.setNodeConfig( theCtxt, aPurchaseOrderNC);

		aPurchaseOrderNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("PurchaseOrderNCTerm"));
		aPurchaseOrderNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "PurchaseOrder", "core"));
		addNodeConfigs( theCtxt, aPurchaseOrderNCTerm);
		aPurchaseOrderNCTerm.setIsTerminal( theCtxt, true);

		aProductNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("ProductNC"));
		aProductNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Product", "core"));
		addNodeConfigs( theCtxt, aProductNC);
		aProductRTNC.setNodeConfig( theCtxt, aProductNC);

		aProductNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("ProductNCTerm"));
		aProductNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Product", "core"));
		addNodeConfigs( theCtxt, aProductNCTerm);
		aProductNCTerm.setIsTerminal( theCtxt, true);

		aCustomerNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("CustomerNC"));
		aCustomerNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Customer", "core"));
		addNodeConfigs( theCtxt, aCustomerNC);
		aCustomerRTNC.setNodeConfig( theCtxt, aCustomerNC);

		aCustomerNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("CustomerNCTerm"));
		aCustomerNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Customer", "core"));
		addNodeConfigs( theCtxt, aCustomerNCTerm);
		aCustomerNCTerm.setIsTerminal( theCtxt, true);

		aVendorNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("VendorNC"));
		aVendorNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Vendor", "core"));
		addNodeConfigs( theCtxt, aVendorNC);
		aVendorRTNC.setNodeConfig( theCtxt, aVendorNC);

		aVendorNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("VendorNCTerm"));
		aVendorNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Vendor", "core"));
		addNodeConfigs( theCtxt, aVendorNCTerm);
		aVendorNCTerm.setIsTerminal( theCtxt, true);


  }


  protected void initNodeMgrsInstantiations( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModelIfc theM3Model) throws EAIException {
    if( theCtxt == null) { return;}
  /*******************************************************
   *  Node mgrs  instantiations
   *******************************************************/
		aAddressNMgr =   (M3ReplicateNodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateNodeMgr", "replication",new EAIMMName("AddressNMgr"));
		addNodeMgrs( theCtxt, aAddressNMgr);
		aAddressNC.setMetaNodeMgr( theCtxt, aAddressNMgr);

		aAddressNCTerm.setMetaNodeMgr( theCtxt, aAddressNMgr);

		aContactNMgr =   (M3ReplicateNodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateNodeMgr", "replication",new EAIMMName("ContactNMgr"));
		addNodeMgrs( theCtxt, aContactNMgr);
		aContactNC.setMetaNodeMgr( theCtxt, aContactNMgr);

		aContactNCTerm.setMetaNodeMgr( theCtxt, aContactNMgr);

		aDeliveryServiceNMgr =   (M3ReplicateNodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateNodeMgr", "replication",new EAIMMName("DeliveryServiceNMgr"));
		addNodeMgrs( theCtxt, aDeliveryServiceNMgr);
		aDeliveryServiceNC.setMetaNodeMgr( theCtxt, aDeliveryServiceNMgr);

		aDeliveryServiceNCTerm.setMetaNodeMgr( theCtxt, aDeliveryServiceNMgr);

		aShippingNMgr =   (M3ReplicateNodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateNodeMgr", "replication",new EAIMMName("ShippingNMgr"));
		addNodeMgrs( theCtxt, aShippingNMgr);
		aShippingNC.setMetaNodeMgr( theCtxt, aShippingNMgr);

		aShippingNCTerm.setMetaNodeMgr( theCtxt, aShippingNMgr);

		aMallNMgr =   (M3ReplicateNodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateNodeMgr", "replication",new EAIMMName("MallNMgr"));
		addNodeMgrs( theCtxt, aMallNMgr);
		aMallNC.setMetaNodeMgr( theCtxt, aMallNMgr);

		aMallNCTerm.setMetaNodeMgr( theCtxt, aMallNMgr);

		aPartyNMgr =   (M3ReplicateNodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateNodeMgr", "replication",new EAIMMName("PartyNMgr"));
		addNodeMgrs( theCtxt, aPartyNMgr);
		aPartyNC.setMetaNodeMgr( theCtxt, aPartyNMgr);

		aPartyNCTerm.setMetaNodeMgr( theCtxt, aPartyNMgr);

		aPaymentNMgr =   (M3ReplicateNodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateNodeMgr", "replication",new EAIMMName("PaymentNMgr"));
		addNodeMgrs( theCtxt, aPaymentNMgr);
		aPaymentNC.setMetaNodeMgr( theCtxt, aPaymentNMgr);

		aPaymentNCTerm.setMetaNodeMgr( theCtxt, aPaymentNMgr);

		aInvoiceLineNMgr =   (M3ReplicateNodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateNodeMgr", "replication",new EAIMMName("InvoiceLineNMgr"));
		addNodeMgrs( theCtxt, aInvoiceLineNMgr);
		aInvoiceLineNC.setMetaNodeMgr( theCtxt, aInvoiceLineNMgr);

		aInvoiceLineNCTerm.setMetaNodeMgr( theCtxt, aInvoiceLineNMgr);

		aPurchaseOrderLineNMgr =   (M3ReplicateNodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateNodeMgr", "replication",new EAIMMName("PurchaseOrderLineNMgr"));
		addNodeMgrs( theCtxt, aPurchaseOrderLineNMgr);
		aPurchaseOrderLineNC.setMetaNodeMgr( theCtxt, aPurchaseOrderLineNMgr);

		aPurchaseOrderLineNCTerm.setMetaNodeMgr( theCtxt, aPurchaseOrderLineNMgr);

		aInvoiceNMgr =   (M3ReplicateNodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateNodeMgr", "replication",new EAIMMName("InvoiceNMgr"));
		addNodeMgrs( theCtxt, aInvoiceNMgr);
		aInvoiceNC.setMetaNodeMgr( theCtxt, aInvoiceNMgr);

		aInvoiceNCTerm.setMetaNodeMgr( theCtxt, aInvoiceNMgr);

		aPurchaseOrderNMgr =   (M3ReplicateNodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateNodeMgr", "replication",new EAIMMName("PurchaseOrderNMgr"));
		addNodeMgrs( theCtxt, aPurchaseOrderNMgr);
		aPurchaseOrderNC.setMetaNodeMgr( theCtxt, aPurchaseOrderNMgr);

		aPurchaseOrderNCTerm.setMetaNodeMgr( theCtxt, aPurchaseOrderNMgr);

		aProductNMgr =   (M3ReplicateNodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateNodeMgr", "replication",new EAIMMName("ProductNMgr"));
		addNodeMgrs( theCtxt, aProductNMgr);
		aProductNC.setMetaNodeMgr( theCtxt, aProductNMgr);

		aProductNCTerm.setMetaNodeMgr( theCtxt, aProductNMgr);

		aCustomerNMgr =   (M3ReplicateNodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateNodeMgr", "replication",new EAIMMName("CustomerNMgr"));
		addNodeMgrs( theCtxt, aCustomerNMgr);
		aCustomerNC.setMetaNodeMgr( theCtxt, aCustomerNMgr);

		aCustomerNCTerm.setMetaNodeMgr( theCtxt, aCustomerNMgr);

		aVendorNMgr =   (M3ReplicateNodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateNodeMgr", "replication",new EAIMMName("VendorNMgr"));
		addNodeMgrs( theCtxt, aVendorNMgr);
		aVendorNC.setMetaNodeMgr( theCtxt, aVendorNMgr);

		aVendorNCTerm.setMetaNodeMgr( theCtxt, aVendorNMgr);


  }


  protected void initBranchCfgsInstantiations( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModelIfc theM3Model) throws EAIException {
    if( theCtxt == null) { return;}
  /*******************************************************
   *  Branch configs  instantiations
   *******************************************************/
		aAddress_shippingsBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("Address_shippingsBC"));
		aAddress_shippingsBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Address", "core").findRelationshipsNamed( theCtxt, new EAIMMName("shippings")));
		aAddress_shippingsBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aAddress_shippingsBC);

		aContact_shippingsBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("Contact_shippingsBC"));
		aContact_shippingsBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Contact", "core").findRelationshipsNamed( theCtxt, new EAIMMName("shippings")));
		aContact_shippingsBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aContact_shippingsBC);

		aDeliveryService_shippingsBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("DeliveryService_shippingsBC"));
		aDeliveryService_shippingsBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "DeliveryService", "core").findRelationshipsNamed( theCtxt, new EAIMMName("shippings")));
		aDeliveryService_shippingsBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aDeliveryService_shippingsBC);

		aShipping_deliveryServiceBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("Shipping_deliveryServiceBC"));
		aShipping_deliveryServiceBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Shipping", "core").findRelationshipsNamed( theCtxt, new EAIMMName("deliveryService")));
		aShipping_deliveryServiceBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aShipping_deliveryServiceBC);

		aShipping_contactBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("Shipping_contactBC"));
		aShipping_contactBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Shipping", "core").findRelationshipsNamed( theCtxt, new EAIMMName("contact")));
		aShipping_contactBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aShipping_contactBC);

		aShipping_addressBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("Shipping_addressBC"));
		aShipping_addressBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Shipping", "core").findRelationshipsNamed( theCtxt, new EAIMMName("address")));
		aShipping_addressBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aShipping_addressBC);

		aMall_vendorsBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("Mall_vendorsBC"));
		aMall_vendorsBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Mall", "core").findRelationshipsNamed( theCtxt, new EAIMMName("vendors")));
		aMall_vendorsBC.setPhaseNumber( theCtxt, 0);
		addBranchConfigs( theCtxt, aMall_vendorsBC);

		aMall_deliveryServicesBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("Mall_deliveryServicesBC"));
		aMall_deliveryServicesBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Mall", "core").findRelationshipsNamed( theCtxt, new EAIMMName("deliveryServices")));
		aMall_deliveryServicesBC.setPhaseNumber( theCtxt, 0);
		addBranchConfigs( theCtxt, aMall_deliveryServicesBC);

		aMall_partiesBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("Mall_partiesBC"));
		aMall_partiesBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Mall", "core").findRelationshipsNamed( theCtxt, new EAIMMName("parties")));
		aMall_partiesBC.setPhaseNumber( theCtxt, 0);
		addBranchConfigs( theCtxt, aMall_partiesBC);

		aParty_customersBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("Party_customersBC"));
		aParty_customersBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Party", "core").findRelationshipsNamed( theCtxt, new EAIMMName("customers")));
		aParty_customersBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aParty_customersBC);

		aParty_contactsBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("Party_contactsBC"));
		aParty_contactsBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Party", "core").findRelationshipsNamed( theCtxt, new EAIMMName("contacts")));
		aParty_contactsBC.setPhaseNumber( theCtxt, 0);
		addBranchConfigs( theCtxt, aParty_contactsBC);

		aParty_addressesBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("Party_addressesBC"));
		aParty_addressesBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Party", "core").findRelationshipsNamed( theCtxt, new EAIMMName("addresses")));
		aParty_addressesBC.setPhaseNumber( theCtxt, 0);
		addBranchConfigs( theCtxt, aParty_addressesBC);

		aInvoiceLine_purchaseOrderLineBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("InvoiceLine_purchaseOrderLineBC"));
		aInvoiceLine_purchaseOrderLineBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "InvoiceLine", "core").findRelationshipsNamed( theCtxt, new EAIMMName("purchaseOrderLine")));
		aInvoiceLine_purchaseOrderLineBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aInvoiceLine_purchaseOrderLineBC);

		aPurchaseOrderLine_productBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("PurchaseOrderLine_productBC"));
		aPurchaseOrderLine_productBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "PurchaseOrderLine", "core").findRelationshipsNamed( theCtxt, new EAIMMName("product")));
		aPurchaseOrderLine_productBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aPurchaseOrderLine_productBC);

		aPurchaseOrderLine_invoiceLineBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("PurchaseOrderLine_invoiceLineBC"));
		aPurchaseOrderLine_invoiceLineBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "PurchaseOrderLine", "core").findRelationshipsNamed( theCtxt, new EAIMMName("invoiceLine")));
		aPurchaseOrderLine_invoiceLineBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aPurchaseOrderLine_invoiceLineBC);

		aInvoice_invoiceLinesBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("Invoice_invoiceLinesBC"));
		aInvoice_invoiceLinesBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Invoice", "core").findRelationshipsNamed( theCtxt, new EAIMMName("invoiceLines")));
		aInvoice_invoiceLinesBC.setPhaseNumber( theCtxt, 0);
		addBranchConfigs( theCtxt, aInvoice_invoiceLinesBC);

		aInvoice_purchaseOrderBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("Invoice_purchaseOrderBC"));
		aInvoice_purchaseOrderBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Invoice", "core").findRelationshipsNamed( theCtxt, new EAIMMName("purchaseOrder")));
		aInvoice_purchaseOrderBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aInvoice_purchaseOrderBC);

		aInvoice_paymentBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("Invoice_paymentBC"));
		aInvoice_paymentBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Invoice", "core").findRelationshipsNamed( theCtxt, new EAIMMName("payment")));
		aInvoice_paymentBC.setPhaseNumber( theCtxt, 0);
		addBranchConfigs( theCtxt, aInvoice_paymentBC);

		aInvoice_shippingBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("Invoice_shippingBC"));
		aInvoice_shippingBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Invoice", "core").findRelationshipsNamed( theCtxt, new EAIMMName("shipping")));
		aInvoice_shippingBC.setPhaseNumber( theCtxt, 0);
		addBranchConfigs( theCtxt, aInvoice_shippingBC);

		aPurchaseOrder_purchaseOrderLinesBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("PurchaseOrder_purchaseOrderLinesBC"));
		aPurchaseOrder_purchaseOrderLinesBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "PurchaseOrder", "core").findRelationshipsNamed( theCtxt, new EAIMMName("purchaseOrderLines")));
		aPurchaseOrder_purchaseOrderLinesBC.setPhaseNumber( theCtxt, 0);
		addBranchConfigs( theCtxt, aPurchaseOrder_purchaseOrderLinesBC);

		aPurchaseOrder_invoicesBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("PurchaseOrder_invoicesBC"));
		aPurchaseOrder_invoicesBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "PurchaseOrder", "core").findRelationshipsNamed( theCtxt, new EAIMMName("invoices")));
		aPurchaseOrder_invoicesBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aPurchaseOrder_invoicesBC);

		aProduct_purchaseOrderLinesBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("Product_purchaseOrderLinesBC"));
		aProduct_purchaseOrderLinesBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Product", "core").findRelationshipsNamed( theCtxt, new EAIMMName("purchaseOrderLines")));
		aProduct_purchaseOrderLinesBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aProduct_purchaseOrderLinesBC);

		aCustomer_purchaseOrdersBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("Customer_purchaseOrdersBC"));
		aCustomer_purchaseOrdersBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Customer", "core").findRelationshipsNamed( theCtxt, new EAIMMName("purchaseOrders")));
		aCustomer_purchaseOrdersBC.setPhaseNumber( theCtxt, 0);
		addBranchConfigs( theCtxt, aCustomer_purchaseOrdersBC);

		aCustomer_partyBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("Customer_partyBC"));
		aCustomer_partyBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Customer", "core").findRelationshipsNamed( theCtxt, new EAIMMName("party")));
		aCustomer_partyBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aCustomer_partyBC);

		aCustomer_invoicesBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("Customer_invoicesBC"));
		aCustomer_invoicesBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Customer", "core").findRelationshipsNamed( theCtxt, new EAIMMName("invoices")));
		aCustomer_invoicesBC.setPhaseNumber( theCtxt, 0);
		addBranchConfigs( theCtxt, aCustomer_invoicesBC);

		aVendor_productsBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("Vendor_productsBC"));
		aVendor_productsBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Vendor", "core").findRelationshipsNamed( theCtxt, new EAIMMName("products")));
		aVendor_productsBC.setPhaseNumber( theCtxt, 0);
		addBranchConfigs( theCtxt, aVendor_productsBC);

		aVendor_customersBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("Vendor_customersBC"));
		aVendor_customersBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Vendor", "core").findRelationshipsNamed( theCtxt, new EAIMMName("customers")));
		aVendor_customersBC.setPhaseNumber( theCtxt, 0);
		addBranchConfigs( theCtxt, aVendor_customersBC);


  }


  protected void initBranchMgrsInstantiations( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModelIfc theM3Model) throws EAIException {
    if( theCtxt == null) { return;}
  /*******************************************************
   *  Branch mgrs  instantiations
   *******************************************************/
		aAddress_shippingsBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("Address_shippingsBMgr"));
		addBranchMgrs( theCtxt, aAddress_shippingsBMgr);
		aAddress_shippingsBC.setMetaBranchMgr( theCtxt, aAddress_shippingsBMgr);

		aContact_shippingsBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("Contact_shippingsBMgr"));
		addBranchMgrs( theCtxt, aContact_shippingsBMgr);
		aContact_shippingsBC.setMetaBranchMgr( theCtxt, aContact_shippingsBMgr);

		aDeliveryService_shippingsBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("DeliveryService_shippingsBMgr"));
		addBranchMgrs( theCtxt, aDeliveryService_shippingsBMgr);
		aDeliveryService_shippingsBC.setMetaBranchMgr( theCtxt, aDeliveryService_shippingsBMgr);

		aShipping_deliveryServiceBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("Shipping_deliveryServiceBMgr"));
		addBranchMgrs( theCtxt, aShipping_deliveryServiceBMgr);
		aShipping_deliveryServiceBC.setMetaBranchMgr( theCtxt, aShipping_deliveryServiceBMgr);

		aShipping_contactBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("Shipping_contactBMgr"));
		addBranchMgrs( theCtxt, aShipping_contactBMgr);
		aShipping_contactBC.setMetaBranchMgr( theCtxt, aShipping_contactBMgr);

		aShipping_addressBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("Shipping_addressBMgr"));
		addBranchMgrs( theCtxt, aShipping_addressBMgr);
		aShipping_addressBC.setMetaBranchMgr( theCtxt, aShipping_addressBMgr);

		aMall_vendorsBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("Mall_vendorsBMgr"));
		addBranchMgrs( theCtxt, aMall_vendorsBMgr);
		aMall_vendorsBC.setMetaBranchMgr( theCtxt, aMall_vendorsBMgr);

		aMall_deliveryServicesBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("Mall_deliveryServicesBMgr"));
		addBranchMgrs( theCtxt, aMall_deliveryServicesBMgr);
		aMall_deliveryServicesBC.setMetaBranchMgr( theCtxt, aMall_deliveryServicesBMgr);

		aMall_partiesBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("Mall_partiesBMgr"));
		addBranchMgrs( theCtxt, aMall_partiesBMgr);
		aMall_partiesBC.setMetaBranchMgr( theCtxt, aMall_partiesBMgr);

		aParty_customersBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("Party_customersBMgr"));
		addBranchMgrs( theCtxt, aParty_customersBMgr);
		aParty_customersBC.setMetaBranchMgr( theCtxt, aParty_customersBMgr);

		aParty_contactsBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("Party_contactsBMgr"));
		addBranchMgrs( theCtxt, aParty_contactsBMgr);
		aParty_contactsBC.setMetaBranchMgr( theCtxt, aParty_contactsBMgr);

		aParty_addressesBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("Party_addressesBMgr"));
		addBranchMgrs( theCtxt, aParty_addressesBMgr);
		aParty_addressesBC.setMetaBranchMgr( theCtxt, aParty_addressesBMgr);

		aInvoiceLine_purchaseOrderLineBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("InvoiceLine_purchaseOrderLineBMgr"));
		addBranchMgrs( theCtxt, aInvoiceLine_purchaseOrderLineBMgr);
		aInvoiceLine_purchaseOrderLineBC.setMetaBranchMgr( theCtxt, aInvoiceLine_purchaseOrderLineBMgr);

		aPurchaseOrderLine_productBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("PurchaseOrderLine_productBMgr"));
		addBranchMgrs( theCtxt, aPurchaseOrderLine_productBMgr);
		aPurchaseOrderLine_productBC.setMetaBranchMgr( theCtxt, aPurchaseOrderLine_productBMgr);

		aPurchaseOrderLine_invoiceLineBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("PurchaseOrderLine_invoiceLineBMgr"));
		addBranchMgrs( theCtxt, aPurchaseOrderLine_invoiceLineBMgr);
		aPurchaseOrderLine_invoiceLineBC.setMetaBranchMgr( theCtxt, aPurchaseOrderLine_invoiceLineBMgr);

		aInvoice_invoiceLinesBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("Invoice_invoiceLinesBMgr"));
		addBranchMgrs( theCtxt, aInvoice_invoiceLinesBMgr);
		aInvoice_invoiceLinesBC.setMetaBranchMgr( theCtxt, aInvoice_invoiceLinesBMgr);

		aInvoice_purchaseOrderBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("Invoice_purchaseOrderBMgr"));
		addBranchMgrs( theCtxt, aInvoice_purchaseOrderBMgr);
		aInvoice_purchaseOrderBC.setMetaBranchMgr( theCtxt, aInvoice_purchaseOrderBMgr);

		aInvoice_paymentBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("Invoice_paymentBMgr"));
		addBranchMgrs( theCtxt, aInvoice_paymentBMgr);
		aInvoice_paymentBC.setMetaBranchMgr( theCtxt, aInvoice_paymentBMgr);

		aInvoice_shippingBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("Invoice_shippingBMgr"));
		addBranchMgrs( theCtxt, aInvoice_shippingBMgr);
		aInvoice_shippingBC.setMetaBranchMgr( theCtxt, aInvoice_shippingBMgr);

		aPurchaseOrder_purchaseOrderLinesBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("PurchaseOrder_purchaseOrderLinesBMgr"));
		addBranchMgrs( theCtxt, aPurchaseOrder_purchaseOrderLinesBMgr);
		aPurchaseOrder_purchaseOrderLinesBC.setMetaBranchMgr( theCtxt, aPurchaseOrder_purchaseOrderLinesBMgr);

		aPurchaseOrder_invoicesBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("PurchaseOrder_invoicesBMgr"));
		addBranchMgrs( theCtxt, aPurchaseOrder_invoicesBMgr);
		aPurchaseOrder_invoicesBC.setMetaBranchMgr( theCtxt, aPurchaseOrder_invoicesBMgr);

		aProduct_purchaseOrderLinesBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("Product_purchaseOrderLinesBMgr"));
		addBranchMgrs( theCtxt, aProduct_purchaseOrderLinesBMgr);
		aProduct_purchaseOrderLinesBC.setMetaBranchMgr( theCtxt, aProduct_purchaseOrderLinesBMgr);

		aCustomer_purchaseOrdersBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("Customer_purchaseOrdersBMgr"));
		addBranchMgrs( theCtxt, aCustomer_purchaseOrdersBMgr);
		aCustomer_purchaseOrdersBC.setMetaBranchMgr( theCtxt, aCustomer_purchaseOrdersBMgr);

		aCustomer_partyBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("Customer_partyBMgr"));
		addBranchMgrs( theCtxt, aCustomer_partyBMgr);
		aCustomer_partyBC.setMetaBranchMgr( theCtxt, aCustomer_partyBMgr);

		aCustomer_invoicesBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("Customer_invoicesBMgr"));
		addBranchMgrs( theCtxt, aCustomer_invoicesBMgr);
		aCustomer_invoicesBC.setMetaBranchMgr( theCtxt, aCustomer_invoicesBMgr);

		aVendor_productsBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("Vendor_productsBMgr"));
		addBranchMgrs( theCtxt, aVendor_productsBMgr);
		aVendor_productsBC.setMetaBranchMgr( theCtxt, aVendor_productsBMgr);

		aVendor_customersBMgr  =   (M3ReplicateBranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "ReplicateBranchMgr", "replication",new EAIMMName("Vendor_customersBMgr"));
		addBranchMgrs( theCtxt, aVendor_customersBMgr);
		aVendor_customersBC.setMetaBranchMgr( theCtxt, aVendor_customersBMgr);


  }


  protected void initRelatedTypeNodeCfgsInstantiations( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModelIfc theM3Model) throws EAIException {
    if( theCtxt == null) { return;}
  /*******************************************************
   *  Related type node configs  instantiations
   *******************************************************/
		aAddress_shippings_ShippingRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Address_shippings_ShippingRelTNC"));
		aAddress_shippings_ShippingRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Shipping", "core"));
		aAddress_shippings_ShippingRelTNC.setNodeConfig( theCtxt, aShippingNCTerm);

		aContact_shippings_ShippingRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Contact_shippings_ShippingRelTNC"));
		aContact_shippings_ShippingRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Shipping", "core"));
		aContact_shippings_ShippingRelTNC.setNodeConfig( theCtxt, aShippingNCTerm);

		aDeliveryService_shippings_ShippingRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("DeliveryService_shippings_ShippingRelTNC"));
		aDeliveryService_shippings_ShippingRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Shipping", "core"));
		aDeliveryService_shippings_ShippingRelTNC.setNodeConfig( theCtxt, aShippingNCTerm);

		aShipping_deliveryService_DeliveryServiceRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Shipping_deliveryService_DeliveryServiceRelTNC"));
		aShipping_deliveryService_DeliveryServiceRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "DeliveryService", "core"));
		aShipping_deliveryService_DeliveryServiceRelTNC.setNodeConfig( theCtxt, aDeliveryServiceNCTerm);

		aShipping_contact_ContactRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Shipping_contact_ContactRelTNC"));
		aShipping_contact_ContactRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Contact", "core"));
		aShipping_contact_ContactRelTNC.setNodeConfig( theCtxt, aContactNCTerm);

		aShipping_address_AddressRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Shipping_address_AddressRelTNC"));
		aShipping_address_AddressRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Address", "core"));
		aShipping_address_AddressRelTNC.setNodeConfig( theCtxt, aAddressNCTerm);

		aMall_vendors_VendorRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Mall_vendors_VendorRelTNC"));
		aMall_vendors_VendorRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Vendor", "core"));
		aMall_vendors_VendorRelTNC.setNodeConfig( theCtxt, aVendorNC);

		aMall_deliveryServices_DeliveryServiceRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Mall_deliveryServices_DeliveryServiceRelTNC"));
		aMall_deliveryServices_DeliveryServiceRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "DeliveryService", "core"));
		aMall_deliveryServices_DeliveryServiceRelTNC.setNodeConfig( theCtxt, aDeliveryServiceNC);

		aMall_parties_PartyRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Mall_parties_PartyRelTNC"));
		aMall_parties_PartyRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Party", "core"));
		aMall_parties_PartyRelTNC.setNodeConfig( theCtxt, aPartyNC);

		aParty_customers_CustomerRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Party_customers_CustomerRelTNC"));
		aParty_customers_CustomerRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Customer", "core"));
		aParty_customers_CustomerRelTNC.setNodeConfig( theCtxt, aCustomerNCTerm);

		aParty_contacts_ContactRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Party_contacts_ContactRelTNC"));
		aParty_contacts_ContactRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Contact", "core"));
		aParty_contacts_ContactRelTNC.setNodeConfig( theCtxt, aContactNC);

		aParty_addresses_AddressRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Party_addresses_AddressRelTNC"));
		aParty_addresses_AddressRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Address", "core"));
		aParty_addresses_AddressRelTNC.setNodeConfig( theCtxt, aAddressNC);

		aInvoiceLine_purchaseOrderLine_PurchaseOrderLineRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("InvoiceLine_purchaseOrderLine_PurchaseOrderLineRelTNC"));
		aInvoiceLine_purchaseOrderLine_PurchaseOrderLineRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "PurchaseOrderLine", "core"));
		aInvoiceLine_purchaseOrderLine_PurchaseOrderLineRelTNC.setNodeConfig( theCtxt, aPurchaseOrderLineNCTerm);

		aPurchaseOrderLine_product_ProductRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("PurchaseOrderLine_product_ProductRelTNC"));
		aPurchaseOrderLine_product_ProductRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Product", "core"));
		aPurchaseOrderLine_product_ProductRelTNC.setNodeConfig( theCtxt, aProductNCTerm);

		aPurchaseOrderLine_invoiceLine_InvoiceLineRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("PurchaseOrderLine_invoiceLine_InvoiceLineRelTNC"));
		aPurchaseOrderLine_invoiceLine_InvoiceLineRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "InvoiceLine", "core"));
		aPurchaseOrderLine_invoiceLine_InvoiceLineRelTNC.setNodeConfig( theCtxt, aInvoiceLineNCTerm);

		aInvoice_invoiceLines_InvoiceLineRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Invoice_invoiceLines_InvoiceLineRelTNC"));
		aInvoice_invoiceLines_InvoiceLineRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "InvoiceLine", "core"));
		aInvoice_invoiceLines_InvoiceLineRelTNC.setNodeConfig( theCtxt, aInvoiceLineNC);

		aInvoice_purchaseOrder_PurchaseOrderRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Invoice_purchaseOrder_PurchaseOrderRelTNC"));
		aInvoice_purchaseOrder_PurchaseOrderRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "PurchaseOrder", "core"));
		aInvoice_purchaseOrder_PurchaseOrderRelTNC.setNodeConfig( theCtxt, aPurchaseOrderNCTerm);

		aInvoice_payment_PaymentRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Invoice_payment_PaymentRelTNC"));
		aInvoice_payment_PaymentRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Payment", "core"));
		aInvoice_payment_PaymentRelTNC.setNodeConfig( theCtxt, aPaymentNC);

		aInvoice_shipping_ShippingRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Invoice_shipping_ShippingRelTNC"));
		aInvoice_shipping_ShippingRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Shipping", "core"));
		aInvoice_shipping_ShippingRelTNC.setNodeConfig( theCtxt, aShippingNC);

		aPurchaseOrder_purchaseOrderLines_PurchaseOrderLineRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("PurchaseOrder_purchaseOrderLines_PurchaseOrderLineRelTNC"));
		aPurchaseOrder_purchaseOrderLines_PurchaseOrderLineRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "PurchaseOrderLine", "core"));
		aPurchaseOrder_purchaseOrderLines_PurchaseOrderLineRelTNC.setNodeConfig( theCtxt, aPurchaseOrderLineNC);

		aPurchaseOrder_invoices_InvoiceRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("PurchaseOrder_invoices_InvoiceRelTNC"));
		aPurchaseOrder_invoices_InvoiceRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Invoice", "core"));
		aPurchaseOrder_invoices_InvoiceRelTNC.setNodeConfig( theCtxt, aInvoiceNCTerm);

		aProduct_purchaseOrderLines_PurchaseOrderLineRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Product_purchaseOrderLines_PurchaseOrderLineRelTNC"));
		aProduct_purchaseOrderLines_PurchaseOrderLineRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "PurchaseOrderLine", "core"));
		aProduct_purchaseOrderLines_PurchaseOrderLineRelTNC.setNodeConfig( theCtxt, aPurchaseOrderLineNCTerm);

		aCustomer_purchaseOrders_PurchaseOrderRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Customer_purchaseOrders_PurchaseOrderRelTNC"));
		aCustomer_purchaseOrders_PurchaseOrderRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "PurchaseOrder", "core"));
		aCustomer_purchaseOrders_PurchaseOrderRelTNC.setNodeConfig( theCtxt, aPurchaseOrderNC);

		aCustomer_party_PartyRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Customer_party_PartyRelTNC"));
		aCustomer_party_PartyRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Party", "core"));
		aCustomer_party_PartyRelTNC.setNodeConfig( theCtxt, aPartyNCTerm);

		aCustomer_invoices_InvoiceRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Customer_invoices_InvoiceRelTNC"));
		aCustomer_invoices_InvoiceRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Invoice", "core"));
		aCustomer_invoices_InvoiceRelTNC.setNodeConfig( theCtxt, aInvoiceNC);

		aVendor_products_ProductRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Vendor_products_ProductRelTNC"));
		aVendor_products_ProductRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Product", "core"));
		aVendor_products_ProductRelTNC.setNodeConfig( theCtxt, aProductNC);

		aVendor_customers_CustomerRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Vendor_customers_CustomerRelTNC"));
		aVendor_customers_CustomerRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Customer", "core"));
		aVendor_customers_CustomerRelTNC.setNodeConfig( theCtxt, aCustomerNC);


  }


  protected void initAttributeCfgsInstantiations( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModelIfc theM3Model) throws EAIException {
    if( theCtxt == null) { return;}
  /*******************************************************
   *  Attribute configs  instantiations
   *******************************************************/

  }


  protected void initFieldMgrsInstantiations( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModelIfc theM3Model) throws EAIException  {
    if( theCtxt == null) { return;}
  /*******************************************************
   *  Field mgrs  instantiations
   *******************************************************/

  }


  protected void initNodeCfgsInitializations( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModelIfc theM3Model) throws EAIException {
    if( theCtxt == null) { return;}
  /*******************************************************
   *  Node configs
   *******************************************************/
		aAddressNC.addBranchConfigs( theCtxt, aAddress_shippingsBC);

		aContactNC.addBranchConfigs( theCtxt, aContact_shippingsBC);

		aDeliveryServiceNC.addBranchConfigs( theCtxt, aDeliveryService_shippingsBC);

		aShippingNC.addBranchConfigs( theCtxt, aShipping_addressBC);
		aShippingNC.addBranchConfigs( theCtxt, aShipping_contactBC);
		aShippingNC.addBranchConfigs( theCtxt, aShipping_deliveryServiceBC);

		aMallNC.addBranchConfigs( theCtxt, aMall_deliveryServicesBC);
		aMallNC.addBranchConfigs( theCtxt, aMall_partiesBC);
		aMallNC.addBranchConfigs( theCtxt, aMall_vendorsBC);

		aPartyNC.addBranchConfigs( theCtxt, aParty_addressesBC);
		aPartyNC.addBranchConfigs( theCtxt, aParty_contactsBC);
		aPartyNC.addBranchConfigs( theCtxt, aParty_customersBC);


		aInvoiceLineNC.addBranchConfigs( theCtxt, aInvoiceLine_purchaseOrderLineBC);

		aPurchaseOrderLineNC.addBranchConfigs( theCtxt, aPurchaseOrderLine_invoiceLineBC);
		aPurchaseOrderLineNC.addBranchConfigs( theCtxt, aPurchaseOrderLine_productBC);

		aInvoiceNC.addBranchConfigs( theCtxt, aInvoice_invoiceLinesBC);
		aInvoiceNC.addBranchConfigs( theCtxt, aInvoice_paymentBC);
		aInvoiceNC.addBranchConfigs( theCtxt, aInvoice_purchaseOrderBC);
		aInvoiceNC.addBranchConfigs( theCtxt, aInvoice_shippingBC);

		aPurchaseOrderNC.addBranchConfigs( theCtxt, aPurchaseOrder_invoicesBC);
		aPurchaseOrderNC.addBranchConfigs( theCtxt, aPurchaseOrder_purchaseOrderLinesBC);

		aProductNC.addBranchConfigs( theCtxt, aProduct_purchaseOrderLinesBC);

		aCustomerNC.addBranchConfigs( theCtxt, aCustomer_invoicesBC);
		aCustomerNC.addBranchConfigs( theCtxt, aCustomer_partyBC);
		aCustomerNC.addBranchConfigs( theCtxt, aCustomer_purchaseOrdersBC);

		aVendorNC.addBranchConfigs( theCtxt, aVendor_customersBC);
		aVendorNC.addBranchConfigs( theCtxt, aVendor_productsBC);


  }


  protected void initBranchCfgsInitializations( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModelIfc theM3Model)  throws EAIException  {
    if( theCtxt == null) { return;}
  /*******************************************************
   *  Branch configs
   *******************************************************/
		aAddress_shippingsBC.addTypeNodeConfigs( theCtxt, aAddress_shippings_ShippingRelTNC);

		aContact_shippingsBC.addTypeNodeConfigs( theCtxt, aContact_shippings_ShippingRelTNC);

		aDeliveryService_shippingsBC.addTypeNodeConfigs( theCtxt, aDeliveryService_shippings_ShippingRelTNC);

		aShipping_deliveryServiceBC.addTypeNodeConfigs( theCtxt, aShipping_deliveryService_DeliveryServiceRelTNC);

		aShipping_contactBC.addTypeNodeConfigs( theCtxt, aShipping_contact_ContactRelTNC);

		aShipping_addressBC.addTypeNodeConfigs( theCtxt, aShipping_address_AddressRelTNC);

		aMall_vendorsBC.addTypeNodeConfigs( theCtxt, aMall_vendors_VendorRelTNC);

		aMall_deliveryServicesBC.addTypeNodeConfigs( theCtxt, aMall_deliveryServices_DeliveryServiceRelTNC);

		aMall_partiesBC.addTypeNodeConfigs( theCtxt, aMall_parties_PartyRelTNC);

		aParty_customersBC.addTypeNodeConfigs( theCtxt, aParty_customers_CustomerRelTNC);

		aParty_contactsBC.addTypeNodeConfigs( theCtxt, aParty_contacts_ContactRelTNC);

		aParty_addressesBC.addTypeNodeConfigs( theCtxt, aParty_addresses_AddressRelTNC);

		aInvoiceLine_purchaseOrderLineBC.addTypeNodeConfigs( theCtxt, aInvoiceLine_purchaseOrderLine_PurchaseOrderLineRelTNC);

		aPurchaseOrderLine_productBC.addTypeNodeConfigs( theCtxt, aPurchaseOrderLine_product_ProductRelTNC);

		aPurchaseOrderLine_invoiceLineBC.addTypeNodeConfigs( theCtxt, aPurchaseOrderLine_invoiceLine_InvoiceLineRelTNC);

		aInvoice_invoiceLinesBC.addTypeNodeConfigs( theCtxt, aInvoice_invoiceLines_InvoiceLineRelTNC);

		aInvoice_purchaseOrderBC.addTypeNodeConfigs( theCtxt, aInvoice_purchaseOrder_PurchaseOrderRelTNC);

		aInvoice_paymentBC.addTypeNodeConfigs( theCtxt, aInvoice_payment_PaymentRelTNC);

		aInvoice_shippingBC.addTypeNodeConfigs( theCtxt, aInvoice_shipping_ShippingRelTNC);

		aPurchaseOrder_purchaseOrderLinesBC.addTypeNodeConfigs( theCtxt, aPurchaseOrder_purchaseOrderLines_PurchaseOrderLineRelTNC);

		aPurchaseOrder_invoicesBC.addTypeNodeConfigs( theCtxt, aPurchaseOrder_invoices_InvoiceRelTNC);

		aProduct_purchaseOrderLinesBC.addTypeNodeConfigs( theCtxt, aProduct_purchaseOrderLines_PurchaseOrderLineRelTNC);

		aCustomer_purchaseOrdersBC.addTypeNodeConfigs( theCtxt, aCustomer_purchaseOrders_PurchaseOrderRelTNC);

		aCustomer_partyBC.addTypeNodeConfigs( theCtxt, aCustomer_party_PartyRelTNC);

		aCustomer_invoicesBC.addTypeNodeConfigs( theCtxt, aCustomer_invoices_InvoiceRelTNC);

		aVendor_productsBC.addTypeNodeConfigs( theCtxt, aVendor_products_ProductRelTNC);

		aVendor_customersBC.addTypeNodeConfigs( theCtxt, aVendor_customers_CustomerRelTNC);


  }



}


