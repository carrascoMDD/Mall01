package com.dosmil_e.mall.core.meta;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import java.lang.reflect.Field;

public  class MallPurchaseOrderLineMeta {

/****************************************************************************
 *  Static metainformation for Type of the EAIProject metamodel element
 ****************************************************************************/
  public static com.dosmil_e.m3.core.ifc.M3TypeIfc vm3Type;

         

/****************************************************************************
 *  Static metainformation for Attributes of the EAIProject metamodel element
 ****************************************************************************/
		public static com.dosmil_e.m3.core.ifc.M3AttributeIfc vm3AttrQuantity;

		public static com.dosmil_e.m3.core.ifc.M3AttributeIfc vm3AttrUnitPrice;

		public static com.dosmil_e.m3.core.ifc.M3AttributeIfc vm3AttrAmount;



/****************************************************************************
 *  Static metainformation for Relationships of the EAIProject metamodel element
 ****************************************************************************/
	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelPurchaseOrder;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelProduct;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelInvoiceLine;





/****************************************************************************
 *  Initializer of metainformation the EAIProject metamodel element
 *    phase 1 : init all metainfo, except links to metainfo of other metamodel elements
 *    will be invoked from the model's metamodel root
 ****************************************************************************/
  public static void initM3TypePhase1( EAIMMCtxtIfc theCtxt) throws EAIException {
		 vm3Type = (com.dosmil_e.m3.core.ifc.M3TypeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Type", "core",new EAIMMName("PurchaseOrderLine"));
		 vm3Type.setIsEnumeration( theCtxt, false);
		 vm3Type.setIsPrimitive( theCtxt, false);
		 vm3Type.setIsAbstract( theCtxt, false);



		vm3AttrQuantity = (com.dosmil_e.m3.core.ifc.M3AttributeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Attribute", "core",new EAIMMName("quantity"));
		vm3Type.addAttributes( theCtxt, vm3AttrQuantity);

		vm3AttrUnitPrice = (com.dosmil_e.m3.core.ifc.M3AttributeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Attribute", "core",new EAIMMName("unitPrice"));
		vm3Type.addAttributes( theCtxt, vm3AttrUnitPrice);

		vm3AttrAmount = (com.dosmil_e.m3.core.ifc.M3AttributeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Attribute", "core",new EAIMMName("amount"));
		vm3Type.addAttributes( theCtxt, vm3AttrAmount);



		vm3RelPurchaseOrder = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("purchaseOrder"));
		vm3Type.addRelationships( theCtxt, vm3RelPurchaseOrder);
		vm3RelPurchaseOrder.setKind( theCtxt, "IsPartOf");
		vm3RelPurchaseOrder.setMinMult( theCtxt, "1");
		vm3RelPurchaseOrder.setMaxMult( theCtxt, "1");
		vm3RelPurchaseOrder.setIsDerived( theCtxt, false);
		vm3RelPurchaseOrder.setIsDummy( theCtxt, false);

		vm3RelProduct = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("product"));
		vm3Type.addRelationships( theCtxt, vm3RelProduct);
		vm3RelProduct.setKind( theCtxt, "References");
		vm3RelProduct.setMinMult( theCtxt, "1");
		vm3RelProduct.setMaxMult( theCtxt, "1");
		vm3RelProduct.setIsDerived( theCtxt, false);
		vm3RelProduct.setIsDummy( theCtxt, false);

		vm3RelInvoiceLine = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("invoiceLine"));
		vm3Type.addRelationships( theCtxt, vm3RelInvoiceLine);
		vm3RelInvoiceLine.setKind( theCtxt, "References");
		vm3RelInvoiceLine.setMinMult( theCtxt, "1");
		vm3RelInvoiceLine.setMaxMult( theCtxt, "1");
		vm3RelInvoiceLine.setIsDerived( theCtxt, false);
		vm3RelInvoiceLine.setIsDummy( theCtxt, false);


  }


/****************************************************************************
 *  Initializer of metainformation the EAIProject metamodel element
 *    phase 2 : init links to metainfo of other metamodel elements
 *    will be invoked from the model's metamodel root
 ****************************************************************************/
  public static void initM3TypePhase2( EAIMMCtxtIfc theCtxt)  throws EAIException {




		vm3RelPurchaseOrder.setInverse( theCtxt, com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.vm3RelPurchaseOrderLines);
		vm3RelPurchaseOrder.setRelatedType( theCtxt, com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.vm3Type);

		vm3RelProduct.setInverse( theCtxt, com.dosmil_e.mall.core.meta.MallProductMeta.vm3RelPurchaseOrderLines);
		vm3RelProduct.setRelatedType( theCtxt, com.dosmil_e.mall.core.meta.MallProductMeta.vm3Type);

		vm3RelInvoiceLine.setInverse( theCtxt, com.dosmil_e.mall.core.meta.MallInvoiceLineMeta.vm3RelPurchaseOrderLine);
		vm3RelInvoiceLine.setRelatedType( theCtxt, com.dosmil_e.mall.core.meta.MallInvoiceLineMeta.vm3Type);


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

