package com.dosmil_e.mall.core.meta;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import java.lang.reflect.Field;

public  class MallCustomerMeta {

/****************************************************************************
 *  Static metainformation for Type of the EAIProject metamodel element
 ****************************************************************************/
  public static com.dosmil_e.m3.core.ifc.M3TypeIfc vm3Type;

         

/****************************************************************************
 *  Static metainformation for Attributes of the EAIProject metamodel element
 ****************************************************************************/


/****************************************************************************
 *  Static metainformation for Relationships of the EAIProject metamodel element
 ****************************************************************************/
	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelVendor;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelPurchaseOrders;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelParty;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelInvoices;





/****************************************************************************
 *  Initializer of metainformation the EAIProject metamodel element
 *    phase 1 : init all metainfo, except links to metainfo of other metamodel elements
 *    will be invoked from the model's metamodel root
 ****************************************************************************/
  public static void initM3TypePhase1( EAIMMCtxtIfc theCtxt) throws EAIException {
		 vm3Type = (com.dosmil_e.m3.core.ifc.M3TypeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Type", "core",new EAIMMName("Customer"));
		 vm3Type.setIsEnumeration( theCtxt, false);
		 vm3Type.setIsPrimitive( theCtxt, false);
		 vm3Type.setIsAbstract( theCtxt, false);





		vm3RelVendor = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("vendor"));
		vm3Type.addRelationships( theCtxt, vm3RelVendor);
		vm3RelVendor.setKind( theCtxt, "IsPartOf");
		vm3RelVendor.setMinMult( theCtxt, "1");
		vm3RelVendor.setMaxMult( theCtxt, "1");
		vm3RelVendor.setIsDerived( theCtxt, false);
		vm3RelVendor.setIsDummy( theCtxt, false);

		vm3RelPurchaseOrders = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("purchaseOrders"));
		vm3Type.addRelationships( theCtxt, vm3RelPurchaseOrders);
		vm3RelPurchaseOrders.setKind( theCtxt, "Aggregates");
		vm3RelPurchaseOrders.setMinMult( theCtxt, "0");
		vm3RelPurchaseOrders.setMaxMult( theCtxt, "*");
		vm3RelPurchaseOrders.setIsDerived( theCtxt, false);
		vm3RelPurchaseOrders.setIsDummy( theCtxt, false);

		vm3RelParty = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("party"));
		vm3Type.addRelationships( theCtxt, vm3RelParty);
		vm3RelParty.setKind( theCtxt, "References");
		vm3RelParty.setMinMult( theCtxt, "1");
		vm3RelParty.setMaxMult( theCtxt, "1");
		vm3RelParty.setIsDerived( theCtxt, false);
		vm3RelParty.setIsDummy( theCtxt, false);

		vm3RelInvoices = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("invoices"));
		vm3Type.addRelationships( theCtxt, vm3RelInvoices);
		vm3RelInvoices.setKind( theCtxt, "Aggregates");
		vm3RelInvoices.setMinMult( theCtxt, "0");
		vm3RelInvoices.setMaxMult( theCtxt, "*");
		vm3RelInvoices.setIsDerived( theCtxt, false);
		vm3RelInvoices.setIsDummy( theCtxt, false);


  }


/****************************************************************************
 *  Initializer of metainformation the EAIProject metamodel element
 *    phase 2 : init links to metainfo of other metamodel elements
 *    will be invoked from the model's metamodel root
 ****************************************************************************/
  public static void initM3TypePhase2( EAIMMCtxtIfc theCtxt)  throws EAIException {




		vm3RelVendor.setInverse( theCtxt, com.dosmil_e.mall.core.meta.MallVendorMeta.vm3RelCustomers);
		vm3RelVendor.setRelatedType( theCtxt, com.dosmil_e.mall.core.meta.MallVendorMeta.vm3Type);

		vm3RelPurchaseOrders.setInverse( theCtxt, com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.vm3RelCustomer);
		vm3RelPurchaseOrders.setRelatedType( theCtxt, com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.vm3Type);

		vm3RelParty.setInverse( theCtxt, com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelCustomers);
		vm3RelParty.setRelatedType( theCtxt, com.dosmil_e.mall.core.meta.MallPartyMeta.vm3Type);

		vm3RelInvoices.setInverse( theCtxt, com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelCustomer);
		vm3RelInvoices.setRelatedType( theCtxt, com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3Type);


  }




/****************************************************************************
 *  Access and initialization of metainformation the metamodel element
 *    for initialization, delegates on the model's metamodel root, that will
 *    invoke metainfo initializers (phase1, phase2) on all the metamodel elements
 ****************************************************************************/
  public static com.dosmil_e.m3.core.ifc.M3TypeIfc getStaticM3Type( EAIMMCtxtIfc theCtxt) {
    if( vm3Type != null) { return vm3Type;}
    com.dosmil_e.mall.meta.Mall01.initM3( theCtxt);
    return vm3Type;
  }




/****************************************************************************
 *  Serialization support
 ****************************************************************************/

  private static final long serialVersionUID = -3331123645200000003L;


}

