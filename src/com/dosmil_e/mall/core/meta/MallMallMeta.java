package com.dosmil_e.mall.core.meta;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import java.lang.reflect.Field;

public  class MallMallMeta {

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
	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelVendors;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelDeliveryServices;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelParties;





/****************************************************************************
 *  Initializer of metainformation the EAIProject metamodel element
 *    phase 1 : init all metainfo, except links to metainfo of other metamodel elements
 *    will be invoked from the model's metamodel root
 ****************************************************************************/
  public static void initM3TypePhase1( EAIMMCtxtIfc theCtxt) throws EAIException {
		 vm3Type = (com.dosmil_e.m3.core.ifc.M3TypeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Type", "core",new EAIMMName("Mall"));
		 vm3Type.setIsEnumeration( theCtxt, false);
		 vm3Type.setIsPrimitive( theCtxt, false);
		 vm3Type.setIsAbstract( theCtxt, false);





		vm3RelVendors = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("vendors"));
		vm3Type.addRelationships( theCtxt, vm3RelVendors);
		vm3RelVendors.setKind( theCtxt, "Aggregates");
		vm3RelVendors.setMinMult( theCtxt, "0");
		vm3RelVendors.setMaxMult( theCtxt, "*");
		vm3RelVendors.setIsDerived( theCtxt, false);
		vm3RelVendors.setIsDummy( theCtxt, false);

		vm3RelDeliveryServices = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("deliveryServices"));
		vm3Type.addRelationships( theCtxt, vm3RelDeliveryServices);
		vm3RelDeliveryServices.setKind( theCtxt, "Aggregates");
		vm3RelDeliveryServices.setMinMult( theCtxt, "0");
		vm3RelDeliveryServices.setMaxMult( theCtxt, "*");
		vm3RelDeliveryServices.setIsDerived( theCtxt, false);
		vm3RelDeliveryServices.setIsDummy( theCtxt, false);

		vm3RelParties = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("parties"));
		vm3Type.addRelationships( theCtxt, vm3RelParties);
		vm3RelParties.setKind( theCtxt, "Aggregates");
		vm3RelParties.setMinMult( theCtxt, "0");
		vm3RelParties.setMaxMult( theCtxt, "*");
		vm3RelParties.setIsDerived( theCtxt, false);
		vm3RelParties.setIsDummy( theCtxt, false);


  }


/****************************************************************************
 *  Initializer of metainformation the EAIProject metamodel element
 *    phase 2 : init links to metainfo of other metamodel elements
 *    will be invoked from the model's metamodel root
 ****************************************************************************/
  public static void initM3TypePhase2( EAIMMCtxtIfc theCtxt)  throws EAIException {




		vm3RelVendors.setInverse( theCtxt, com.dosmil_e.mall.core.meta.MallVendorMeta.vm3RelMall);
		vm3RelVendors.setRelatedType( theCtxt, com.dosmil_e.mall.core.meta.MallVendorMeta.vm3Type);

		vm3RelDeliveryServices.setInverse( theCtxt, com.dosmil_e.mall.core.meta.MallDeliveryServiceMeta.vm3RelMall);
		vm3RelDeliveryServices.setRelatedType( theCtxt, com.dosmil_e.mall.core.meta.MallDeliveryServiceMeta.vm3Type);

		vm3RelParties.setInverse( theCtxt, com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelMall);
		vm3RelParties.setRelatedType( theCtxt, com.dosmil_e.mall.core.meta.MallPartyMeta.vm3Type);


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

