package com.dosmil_e.mall.core.meta;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import java.lang.reflect.Field;

public  class MallShippingMeta {

/****************************************************************************
 *  Static metainformation for Type of the EAIProject metamodel element
 ****************************************************************************/
  public static com.dosmil_e.m3.core.ifc.M3TypeIfc vm3Type;

         

/****************************************************************************
 *  Static metainformation for Attributes of the EAIProject metamodel element
 ****************************************************************************/
		public static com.dosmil_e.m3.core.ifc.M3AttributeIfc vm3AttrAmount;



/****************************************************************************
 *  Static metainformation for Relationships of the EAIProject metamodel element
 ****************************************************************************/
	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelDeliveryService;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelContact;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelAddress;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelInvoice;





/****************************************************************************
 *  Initializer of metainformation the EAIProject metamodel element
 *    phase 1 : init all metainfo, except links to metainfo of other metamodel elements
 *    will be invoked from the model's metamodel root
 ****************************************************************************/
  public static void initM3TypePhase1( EAIMMCtxtIfc theCtxt) throws EAIException {
		 vm3Type = (com.dosmil_e.m3.core.ifc.M3TypeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Type", "core",new EAIMMName("Shipping"));
		 vm3Type.setIsEnumeration( theCtxt, false);
		 vm3Type.setIsPrimitive( theCtxt, false);
		 vm3Type.setIsAbstract( theCtxt, false);



		vm3AttrAmount = (com.dosmil_e.m3.core.ifc.M3AttributeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Attribute", "core",new EAIMMName("amount"));
		vm3Type.addAttributes( theCtxt, vm3AttrAmount);



		vm3RelDeliveryService = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("deliveryService"));
		vm3Type.addRelationships( theCtxt, vm3RelDeliveryService);
		vm3RelDeliveryService.setKind( theCtxt, "References");
		vm3RelDeliveryService.setMinMult( theCtxt, "1");
		vm3RelDeliveryService.setMaxMult( theCtxt, "1");
		vm3RelDeliveryService.setIsDerived( theCtxt, false);
		vm3RelDeliveryService.setIsDummy( theCtxt, false);

		vm3RelContact = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("contact"));
		vm3Type.addRelationships( theCtxt, vm3RelContact);
		vm3RelContact.setKind( theCtxt, "References");
		vm3RelContact.setMinMult( theCtxt, "1");
		vm3RelContact.setMaxMult( theCtxt, "1");
		vm3RelContact.setIsDerived( theCtxt, false);
		vm3RelContact.setIsDummy( theCtxt, false);

		vm3RelAddress = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("address"));
		vm3Type.addRelationships( theCtxt, vm3RelAddress);
		vm3RelAddress.setKind( theCtxt, "References");
		vm3RelAddress.setMinMult( theCtxt, "1");
		vm3RelAddress.setMaxMult( theCtxt, "1");
		vm3RelAddress.setIsDerived( theCtxt, false);
		vm3RelAddress.setIsDummy( theCtxt, false);

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




		vm3RelDeliveryService.setInverse( theCtxt, com.dosmil_e.mall.core.meta.MallDeliveryServiceMeta.vm3RelShippings);
		vm3RelDeliveryService.setRelatedType( theCtxt, com.dosmil_e.mall.core.meta.MallDeliveryServiceMeta.vm3Type);

		vm3RelContact.setInverse( theCtxt, com.dosmil_e.mall.core.meta.MallContactMeta.vm3RelShippings);
		vm3RelContact.setRelatedType( theCtxt, com.dosmil_e.mall.core.meta.MallContactMeta.vm3Type);

		vm3RelAddress.setInverse( theCtxt, com.dosmil_e.mall.core.meta.MallAddressMeta.vm3RelShippings);
		vm3RelAddress.setRelatedType( theCtxt, com.dosmil_e.mall.core.meta.MallAddressMeta.vm3Type);

		vm3RelInvoice.setInverse( theCtxt, com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelShipping);
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

