package com.dosmil_e.mall.core.meta;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import java.lang.reflect.Field;

public  class MallContactMeta {

/****************************************************************************
 *  Static metainformation for Type of the EAIProject metamodel element
 ****************************************************************************/
  public static com.dosmil_e.m3.core.ifc.M3TypeIfc vm3Type;

         

/****************************************************************************
 *  Static metainformation for Attributes of the EAIProject metamodel element
 ****************************************************************************/
		public static com.dosmil_e.m3.core.ifc.M3AttributeIfc vm3AttrFirstName;

		public static com.dosmil_e.m3.core.ifc.M3AttributeIfc vm3AttrMiddleInitial;

		public static com.dosmil_e.m3.core.ifc.M3AttributeIfc vm3AttrLastName;

		public static com.dosmil_e.m3.core.ifc.M3AttributeIfc vm3AttrPhone;

		public static com.dosmil_e.m3.core.ifc.M3AttributeIfc vm3AttrFax;

		public static com.dosmil_e.m3.core.ifc.M3AttributeIfc vm3AttrEmail;



/****************************************************************************
 *  Static metainformation for Relationships of the EAIProject metamodel element
 ****************************************************************************/
	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelParty;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelShippings;





/****************************************************************************
 *  Initializer of metainformation the EAIProject metamodel element
 *    phase 1 : init all metainfo, except links to metainfo of other metamodel elements
 *    will be invoked from the model's metamodel root
 ****************************************************************************/
  public static void initM3TypePhase1( EAIMMCtxtIfc theCtxt) throws EAIException {
		 vm3Type = (com.dosmil_e.m3.core.ifc.M3TypeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Type", "core",new EAIMMName("Contact"));
		 vm3Type.setIsEnumeration( theCtxt, false);
		 vm3Type.setIsPrimitive( theCtxt, false);
		 vm3Type.setIsAbstract( theCtxt, false);



		vm3AttrFirstName = (com.dosmil_e.m3.core.ifc.M3AttributeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Attribute", "core",new EAIMMName("firstName"));
		vm3Type.addAttributes( theCtxt, vm3AttrFirstName);

		vm3AttrMiddleInitial = (com.dosmil_e.m3.core.ifc.M3AttributeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Attribute", "core",new EAIMMName("middleInitial"));
		vm3Type.addAttributes( theCtxt, vm3AttrMiddleInitial);

		vm3AttrLastName = (com.dosmil_e.m3.core.ifc.M3AttributeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Attribute", "core",new EAIMMName("lastName"));
		vm3Type.addAttributes( theCtxt, vm3AttrLastName);

		vm3AttrPhone = (com.dosmil_e.m3.core.ifc.M3AttributeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Attribute", "core",new EAIMMName("phone"));
		vm3Type.addAttributes( theCtxt, vm3AttrPhone);

		vm3AttrFax = (com.dosmil_e.m3.core.ifc.M3AttributeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Attribute", "core",new EAIMMName("fax"));
		vm3Type.addAttributes( theCtxt, vm3AttrFax);

		vm3AttrEmail = (com.dosmil_e.m3.core.ifc.M3AttributeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Attribute", "core",new EAIMMName("email"));
		vm3Type.addAttributes( theCtxt, vm3AttrEmail);



		vm3RelParty = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("party"));
		vm3Type.addRelationships( theCtxt, vm3RelParty);
		vm3RelParty.setKind( theCtxt, "IsPartOf");
		vm3RelParty.setMinMult( theCtxt, "1");
		vm3RelParty.setMaxMult( theCtxt, "1");
		vm3RelParty.setIsDerived( theCtxt, false);
		vm3RelParty.setIsDummy( theCtxt, false);

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




		vm3RelParty.setInverse( theCtxt, com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelContacts);
		vm3RelParty.setRelatedType( theCtxt, com.dosmil_e.mall.core.meta.MallPartyMeta.vm3Type);

		vm3RelShippings.setInverse( theCtxt, com.dosmil_e.mall.core.meta.MallShippingMeta.vm3RelContact);
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

