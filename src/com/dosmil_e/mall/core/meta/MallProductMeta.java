package com.dosmil_e.mall.core.meta;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import java.lang.reflect.Field;

public  class MallProductMeta {

/****************************************************************************
 *  Static metainformation for Type of the EAIProject metamodel element
 ****************************************************************************/
  public static com.dosmil_e.m3.core.ifc.M3TypeIfc vm3Type;

         

/****************************************************************************
 *  Static metainformation for Attributes of the EAIProject metamodel element
 ****************************************************************************/
		public static com.dosmil_e.m3.core.ifc.M3AttributeIfc vm3AttrUnitPrice;



/****************************************************************************
 *  Static metainformation for Relationships of the EAIProject metamodel element
 ****************************************************************************/
	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelVendor;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelPurchaseOrderLines;





/****************************************************************************
 *  Initializer of metainformation the EAIProject metamodel element
 *    phase 1 : init all metainfo, except links to metainfo of other metamodel elements
 *    will be invoked from the model's metamodel root
 ****************************************************************************/
  public static void initM3TypePhase1( EAIMMCtxtIfc theCtxt) throws EAIException {
		 vm3Type = (com.dosmil_e.m3.core.ifc.M3TypeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Type", "core",new EAIMMName("Product"));
		 vm3Type.setIsEnumeration( theCtxt, false);
		 vm3Type.setIsPrimitive( theCtxt, false);
		 vm3Type.setIsAbstract( theCtxt, false);



		vm3AttrUnitPrice = (com.dosmil_e.m3.core.ifc.M3AttributeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Attribute", "core",new EAIMMName("unitPrice"));
		vm3Type.addAttributes( theCtxt, vm3AttrUnitPrice);



		vm3RelVendor = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("vendor"));
		vm3Type.addRelationships( theCtxt, vm3RelVendor);
		vm3RelVendor.setKind( theCtxt, "IsPartOf");
		vm3RelVendor.setMinMult( theCtxt, "1");
		vm3RelVendor.setMaxMult( theCtxt, "1");
		vm3RelVendor.setIsDerived( theCtxt, false);
		vm3RelVendor.setIsDummy( theCtxt, false);

		vm3RelPurchaseOrderLines = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("purchaseOrderLines"));
		vm3Type.addRelationships( theCtxt, vm3RelPurchaseOrderLines);
		vm3RelPurchaseOrderLines.setKind( theCtxt, "Many");
		vm3RelPurchaseOrderLines.setMinMult( theCtxt, "0");
		vm3RelPurchaseOrderLines.setMaxMult( theCtxt, "*");
		vm3RelPurchaseOrderLines.setIsDerived( theCtxt, false);
		vm3RelPurchaseOrderLines.setIsDummy( theCtxt, false);


  }


/****************************************************************************
 *  Initializer of metainformation the EAIProject metamodel element
 *    phase 2 : init links to metainfo of other metamodel elements
 *    will be invoked from the model's metamodel root
 ****************************************************************************/
  public static void initM3TypePhase2( EAIMMCtxtIfc theCtxt)  throws EAIException {




		vm3RelVendor.setInverse( theCtxt, com.dosmil_e.mall.core.meta.MallVendorMeta.vm3RelProducts);
		vm3RelVendor.setRelatedType( theCtxt, com.dosmil_e.mall.core.meta.MallVendorMeta.vm3Type);

		vm3RelPurchaseOrderLines.setInverse( theCtxt, com.dosmil_e.mall.core.meta.MallPurchaseOrderLineMeta.vm3RelProduct);
		vm3RelPurchaseOrderLines.setRelatedType( theCtxt, com.dosmil_e.mall.core.meta.MallPurchaseOrderLineMeta.vm3Type);


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

