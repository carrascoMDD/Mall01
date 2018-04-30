package com.dosmil_e.mall.core.meta;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import java.lang.reflect.Field;

public  class MallDeliveryServiceMeta {

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
	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelMall;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelShippings;





/****************************************************************************
 *  Initializer of metainformation the EAIProject metamodel element
 *    phase 1 : init all metainfo, except links to metainfo of other metamodel elements
 *    will be invoked from the model's metamodel root
 ****************************************************************************/
  public static void initM3TypePhase1( EAIMMCtxtIfc theCtxt) throws EAIException {
		 vm3Type = (com.dosmil_e.m3.core.ifc.M3TypeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Type", "core",new EAIMMName("DeliveryService"));
		 vm3Type.setIsEnumeration( theCtxt, false);
		 vm3Type.setIsPrimitive( theCtxt, false);
		 vm3Type.setIsAbstract( theCtxt, false);





		vm3RelMall = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("mall"));
		vm3Type.addRelationships( theCtxt, vm3RelMall);
		vm3RelMall.setKind( theCtxt, "IsPartOf");
		vm3RelMall.setMinMult( theCtxt, "1");
		vm3RelMall.setMaxMult( theCtxt, "1");
		vm3RelMall.setIsDerived( theCtxt, false);
		vm3RelMall.setIsDummy( theCtxt, false);

		vm3RelShippings = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("shippings"));
		vm3Type.addRelationships( theCtxt, vm3RelShippings);
		vm3RelShippings.setKind( theCtxt, "Many");
		vm3RelShippings.setMinMult( theCtxt, "0");
		vm3RelShippings.setMaxMult( theCtxt, "*");
		vm3RelShippings.setIsDerived( theCtxt, false);
		vm3RelShippings.setIsDummy( theCtxt, false);


  }


/****************************************************************************
 *  Initializer of metainformation the EAIProject metamodel element
 *    phase 2 : init links to metainfo of other metamodel elements
 *    will be invoked from the model's metamodel root
 ****************************************************************************/
  public static void initM3TypePhase2( EAIMMCtxtIfc theCtxt)  throws EAIException {




		vm3RelMall.setInverse( theCtxt, com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelDeliveryServices);
		vm3RelMall.setRelatedType( theCtxt, com.dosmil_e.mall.core.meta.MallMallMeta.vm3Type);

		vm3RelShippings.setInverse( theCtxt, com.dosmil_e.mall.core.meta.MallShippingMeta.vm3RelDeliveryService);
		vm3RelShippings.setRelatedType( theCtxt, com.dosmil_e.mall.core.meta.MallShippingMeta.vm3Type);


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

