package com.dosmil_e.mall.core.meta;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import java.lang.reflect.Field;

public  class MallPurchaseOrderMeta {

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
	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelPurchaseOrderLines;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelCustomer;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelInvoices;





/****************************************************************************
 *  Initializer of metainformation the EAIProject metamodel element
 *    phase 1 : init all metainfo, except links to metainfo of other metamodel elements
 *    will be invoked from the model's metamodel root
 ****************************************************************************/
  public static void initM3TypePhase1( EAIMMCtxtIfc theCtxt) throws EAIException {
		 vm3Type = (com.dosmil_e.m3.core.ifc.M3TypeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Type", "core",new EAIMMName("PurchaseOrder"));
		 vm3Type.setIsEnumeration( theCtxt, false);
		 vm3Type.setIsPrimitive( theCtxt, false);
		 vm3Type.setIsAbstract( theCtxt, false);





		vm3RelPurchaseOrderLines = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("purchaseOrderLines"));
		vm3Type.addRelationships( theCtxt, vm3RelPurchaseOrderLines);
		vm3RelPurchaseOrderLines.setKind( theCtxt, "Aggregates");
		vm3RelPurchaseOrderLines.setMinMult( theCtxt, "0");
		vm3RelPurchaseOrderLines.setMaxMult( theCtxt, "*");
		vm3RelPurchaseOrderLines.setIsDerived( theCtxt, false);
		vm3RelPurchaseOrderLines.setIsDummy( theCtxt, false);

		vm3RelCustomer = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("customer"));
		vm3Type.addRelationships( theCtxt, vm3RelCustomer);
		vm3RelCustomer.setKind( theCtxt, "IsPartOf");
		vm3RelCustomer.setMinMult( theCtxt, "1");
		vm3RelCustomer.setMaxMult( theCtxt, "1");
		vm3RelCustomer.setIsDerived( theCtxt, false);
		vm3RelCustomer.setIsDummy( theCtxt, false);

		vm3RelInvoices = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("invoices"));
		vm3Type.addRelationships( theCtxt, vm3RelInvoices);
		vm3RelInvoices.setKind( theCtxt, "Many");
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




		vm3RelPurchaseOrderLines.setInverse( theCtxt, com.dosmil_e.mall.core.meta.MallPurchaseOrderLineMeta.vm3RelPurchaseOrder);
		vm3RelPurchaseOrderLines.setRelatedType( theCtxt, com.dosmil_e.mall.core.meta.MallPurchaseOrderLineMeta.vm3Type);

		vm3RelCustomer.setInverse( theCtxt, com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelPurchaseOrders);
		vm3RelCustomer.setRelatedType( theCtxt, com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3Type);

		vm3RelInvoices.setInverse( theCtxt, com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelPurchaseOrder);
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

