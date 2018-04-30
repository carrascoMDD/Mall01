package com.dosmil_e.mall.core.meta;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import java.lang.reflect.Field;

public  class MallInvoiceLineMeta {

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
	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelPurchaseOrderLine;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelInvoice;





/****************************************************************************
 *  Initializer of metainformation the EAIProject metamodel element
 *    phase 1 : init all metainfo, except links to metainfo of other metamodel elements
 *    will be invoked from the model's metamodel root
 ****************************************************************************/
  public static void initM3TypePhase1( EAIMMCtxtIfc theCtxt) throws EAIException {
		 vm3Type = (com.dosmil_e.m3.core.ifc.M3TypeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Type", "core",new EAIMMName("InvoiceLine"));
		 vm3Type.setIsEnumeration( theCtxt, false);
		 vm3Type.setIsPrimitive( theCtxt, false);
		 vm3Type.setIsAbstract( theCtxt, false);





		vm3RelPurchaseOrderLine = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("purchaseOrderLine"));
		vm3Type.addRelationships( theCtxt, vm3RelPurchaseOrderLine);
		vm3RelPurchaseOrderLine.setKind( theCtxt, "References");
		vm3RelPurchaseOrderLine.setMinMult( theCtxt, "1");
		vm3RelPurchaseOrderLine.setMaxMult( theCtxt, "1");
		vm3RelPurchaseOrderLine.setIsDerived( theCtxt, false);
		vm3RelPurchaseOrderLine.setIsDummy( theCtxt, false);

		vm3RelInvoice = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("invoice"));
		vm3Type.addRelationships( theCtxt, vm3RelInvoice);
		vm3RelInvoice.setKind( theCtxt, "IsPartOf");
		vm3RelInvoice.setMinMult( theCtxt, "1");
		vm3RelInvoice.setMaxMult( theCtxt, "1");
		vm3RelInvoice.setIsDerived( theCtxt, false);
		vm3RelInvoice.setIsDummy( theCtxt, false);


  }


/****************************************************************************
 *  Initializer of metainformation the EAIProject metamodel element
 *    phase 2 : init links to metainfo of other metamodel elements
 *    will be invoked from the model's metamodel root
 ****************************************************************************/
  public static void initM3TypePhase2( EAIMMCtxtIfc theCtxt)  throws EAIException {




		vm3RelPurchaseOrderLine.setInverse( theCtxt, com.dosmil_e.mall.core.meta.MallPurchaseOrderLineMeta.vm3RelInvoiceLine);
		vm3RelPurchaseOrderLine.setRelatedType( theCtxt, com.dosmil_e.mall.core.meta.MallPurchaseOrderLineMeta.vm3Type);

		vm3RelInvoice.setInverse( theCtxt, com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelInvoiceLines);
		vm3RelInvoice.setRelatedType( theCtxt, com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3Type);


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

