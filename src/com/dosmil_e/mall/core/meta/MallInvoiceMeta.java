package com.dosmil_e.mall.core.meta;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import java.lang.reflect.Field;

public  class MallInvoiceMeta {

/****************************************************************************
 *  Static metainformation for Type of the EAIProject metamodel element
 ****************************************************************************/
  public static com.dosmil_e.m3.core.ifc.M3TypeIfc vm3Type;

         

/****************************************************************************
 *  Static metainformation for Attributes of the EAIProject metamodel element
 ****************************************************************************/
		public static com.dosmil_e.m3.core.ifc.M3AttributeIfc vm3AttrAmount;

		public static com.dosmil_e.m3.core.ifc.M3AttributeIfc vm3AttrTaxes;

		public static com.dosmil_e.m3.core.ifc.M3AttributeIfc vm3AttrTotalAmount;



/****************************************************************************
 *  Static metainformation for Relationships of the EAIProject metamodel element
 ****************************************************************************/
	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelCustomer;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelInvoiceLines;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelPurchaseOrder;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelPayment;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelShipping;





/****************************************************************************
 *  Initializer of metainformation the EAIProject metamodel element
 *    phase 1 : init all metainfo, except links to metainfo of other metamodel elements
 *    will be invoked from the model's metamodel root
 ****************************************************************************/
  public static void initM3TypePhase1( EAIMMCtxtIfc theCtxt) throws EAIException {
		 vm3Type = (com.dosmil_e.m3.core.ifc.M3TypeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Type", "core",new EAIMMName("Invoice"));
		 vm3Type.setIsEnumeration( theCtxt, false);
		 vm3Type.setIsPrimitive( theCtxt, false);
		 vm3Type.setIsAbstract( theCtxt, false);



		vm3AttrAmount = (com.dosmil_e.m3.core.ifc.M3AttributeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Attribute", "core",new EAIMMName("amount"));
		vm3Type.addAttributes( theCtxt, vm3AttrAmount);

		vm3AttrTaxes = (com.dosmil_e.m3.core.ifc.M3AttributeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Attribute", "core",new EAIMMName("taxes"));
		vm3Type.addAttributes( theCtxt, vm3AttrTaxes);

		vm3AttrTotalAmount = (com.dosmil_e.m3.core.ifc.M3AttributeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Attribute", "core",new EAIMMName("totalAmount"));
		vm3Type.addAttributes( theCtxt, vm3AttrTotalAmount);



		vm3RelCustomer = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("customer"));
		vm3Type.addRelationships( theCtxt, vm3RelCustomer);
		vm3RelCustomer.setKind( theCtxt, "IsPartOf");
		vm3RelCustomer.setMinMult( theCtxt, "1");
		vm3RelCustomer.setMaxMult( theCtxt, "1");
		vm3RelCustomer.setIsDerived( theCtxt, false);
		vm3RelCustomer.setIsDummy( theCtxt, false);

		vm3RelInvoiceLines = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("invoiceLines"));
		vm3Type.addRelationships( theCtxt, vm3RelInvoiceLines);
		vm3RelInvoiceLines.setKind( theCtxt, "Aggregates");
		vm3RelInvoiceLines.setMinMult( theCtxt, "0");
		vm3RelInvoiceLines.setMaxMult( theCtxt, "*");
		vm3RelInvoiceLines.setIsDerived( theCtxt, false);
		vm3RelInvoiceLines.setIsDummy( theCtxt, false);

		vm3RelPurchaseOrder = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("purchaseOrder"));
		vm3Type.addRelationships( theCtxt, vm3RelPurchaseOrder);
		vm3RelPurchaseOrder.setKind( theCtxt, "References");
		vm3RelPurchaseOrder.setMinMult( theCtxt, "1");
		vm3RelPurchaseOrder.setMaxMult( theCtxt, "1");
		vm3RelPurchaseOrder.setIsDerived( theCtxt, false);
		vm3RelPurchaseOrder.setIsDummy( theCtxt, false);

		vm3RelPayment = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("payment"));
		vm3Type.addRelationships( theCtxt, vm3RelPayment);
		vm3RelPayment.setKind( theCtxt, "Aggregates");
		vm3RelPayment.setMinMult( theCtxt, "1");
		vm3RelPayment.setMaxMult( theCtxt, "1");
		vm3RelPayment.setIsDerived( theCtxt, false);
		vm3RelPayment.setIsDummy( theCtxt, false);

		vm3RelShipping = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("shipping"));
		vm3Type.addRelationships( theCtxt, vm3RelShipping);
		vm3RelShipping.setKind( theCtxt, "Aggregates");
		vm3RelShipping.setMinMult( theCtxt, "0");
		vm3RelShipping.setMaxMult( theCtxt, "1");
		vm3RelShipping.setIsDerived( theCtxt, false);
		vm3RelShipping.setIsDummy( theCtxt, false);


  }


/****************************************************************************
 *  Initializer of metainformation the EAIProject metamodel element
 *    phase 2 : init links to metainfo of other metamodel elements
 *    will be invoked from the model's metamodel root
 ****************************************************************************/
  public static void initM3TypePhase2( EAIMMCtxtIfc theCtxt)  throws EAIException {




		vm3RelCustomer.setInverse( theCtxt, com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelInvoices);
		vm3RelCustomer.setRelatedType( theCtxt, com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3Type);

		vm3RelInvoiceLines.setInverse( theCtxt, com.dosmil_e.mall.core.meta.MallInvoiceLineMeta.vm3RelInvoice);
		vm3RelInvoiceLines.setRelatedType( theCtxt, com.dosmil_e.mall.core.meta.MallInvoiceLineMeta.vm3Type);

		vm3RelPurchaseOrder.setInverse( theCtxt, com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.vm3RelInvoices);
		vm3RelPurchaseOrder.setRelatedType( theCtxt, com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.vm3Type);

		vm3RelPayment.setInverse( theCtxt, com.dosmil_e.mall.core.meta.MallPaymentMeta.vm3RelInvoice);
		vm3RelPayment.setRelatedType( theCtxt, com.dosmil_e.mall.core.meta.MallPaymentMeta.vm3Type);

		vm3RelShipping.setInverse( theCtxt, com.dosmil_e.mall.core.meta.MallShippingMeta.vm3RelInvoice);
		vm3RelShipping.setRelatedType( theCtxt, com.dosmil_e.mall.core.meta.MallShippingMeta.vm3Type);


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

