package com.dosmil_e.mall.core.base;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import java.lang.reflect.Field;

public  class MallMallBase 
   extends com.dosmil_e.m3.withm3.impl.MMElementWithM3Impl
    implements com.dosmil_e.mall.core.ifc.MallMallIfc   {

/****************************************************************************
 *  Static metainformation for Type of the EAIProject metamodel element
 ****************************************************************************/
  public static com.dosmil_e.m3.core.ifc.M3TypeIfc vm3Type;


/****************************************************************************
 *  State storage for Attributes of the MallMall metamodel element
 ****************************************************************************/



/****************************************************************************
 *  State storage for the Relationships of the MallMall metamodel element
 ****************************************************************************/
	protected com.dosmil_e.mall.core.ifc.MallVendorIfc[] vrVendors = new com.dosmil_e.mall.core.ifc.MallVendorIfc[0]; 

	protected com.dosmil_e.mall.core.ifc.MallDeliveryServiceIfc[] vrDeliveryServices = new com.dosmil_e.mall.core.ifc.MallDeliveryServiceIfc[0]; 

	protected com.dosmil_e.mall.core.ifc.MallPartyIfc[] vrParties = new com.dosmil_e.mall.core.ifc.MallPartyIfc[0]; 






/****************************************************************************
 *  Constructors of the MallMall metamodel element
 ****************************************************************************/

  public MallMallBase() {
    super();
  }


  public MallMallBase( EAIMMCtxtIfc theCtxt) {
    super( theCtxt);
  }

  public MallMallBase( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theName) {
    super( theCtxt, theName);
  }


/****************************************************************************
 *  Implementation of the MallMallIfc and MallMallPriv interfaces
 ****************************************************************************/

/****************************************************************************
 *  Implementation of attributes of MallMall
 ****************************************************************************/

 




/****************************************************************************
 *  Implementation of relationships of MallMall
 ****************************************************************************/

 
/****************************************************************************
 *  Implementation of public interface for MANY relationship Vendors
 ****************************************************************************/


    /* Public Read accessor for role Vendors
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.mall.core.ifc.MallVendorIfc[] getVendors( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelVendors == null) { return null;}

    try { return (com.dosmil_e.mall.core.ifc.MallVendorIfc[])
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelVendors).
        getRelatedElements( theCtxt, this);
    }
    catch( ClassCastException anEx) { return null;}
  }





    /* Public Vendors number access
     */
  public int numVendors( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return 0;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelVendors == null) { return  0;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelVendors).
          numRelatedElements( theCtxt, this);
    } catch( ClassCastException anEx) { return 0;}
  }



    /* Public Vendors read accessor by index
     */
  public com.dosmil_e.mall.core.ifc.MallVendorIfc getVendorsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelVendors == null) { return null;}

    try { return (com.dosmil_e.mall.core.ifc.MallVendorIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelVendors).
        getRelatedElementAt( theCtxt, this, theIndex);
    }
    catch( ClassCastException anEx) { return null;}
  }




    /* Public Vendors finder by name
     */
  public com.dosmil_e.mall.core.ifc.MallVendorIfc findVendorsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelVendors == null) { return  null;}

    try {
      return (com.dosmil_e.mall.core.ifc.MallVendorIfc)
        ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelVendors).
          findRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return null;}
  }



    /* Public Vendors finder predicate by name
     */
  public boolean hasVendorsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelVendors == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelVendors).
          hasRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public Vendors is related predicate
     */
  public boolean hasVendors( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallVendorIfc theVendors) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelVendors == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelVendors).
          hasRelatedElement( theCtxt, this, theVendors);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public Vendors index access
     */
  public int indexOfVendors( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallVendorIfc theVendors) throws EAIException {
    if( theCtxt == null) { return -1;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelVendors == null) { return  -1;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelVendors).
          indexOfRelatedElement( theCtxt, this, theVendors);
    } catch( ClassCastException anEx) { return -1;}
  }




    /* Public Write accessor for role Vendors
     */
  public void addVendors( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallVendorIfc theVendors) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelVendors == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelVendors).
        addRelatedElement( theCtxt, this, theVendors);
    } catch( ClassCastException anEx) {}
  }


    /* Public ordered Write accessor for role Vendors
     */
  public void addVendorsBefore(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.mall.core.ifc.MallVendorIfc theVendors,
    com.dosmil_e.mall.core.ifc.MallVendorIfc theRelativeVendors) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelVendors == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelVendors).
        addRelatedElementBefore( theCtxt, this, theVendors, theRelativeVendors);
    } catch( ClassCastException anEx) {}
  }



    /* Public reorder accessor for role Vendors
     */
  public void moveVendorsBefore(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.mall.core.ifc.MallVendorIfc theVendors,
    com.dosmil_e.mall.core.ifc.MallVendorIfc theRelativeVendors) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelVendors == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelVendors).
        moveRelatedElementBefore( theCtxt, this, theVendors, theRelativeVendors);
    } catch( ClassCastException anEx) {}
  }



    /* Public move to last accessor for role Vendors
     */
  public void moveVendorsToLast(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.mall.core.ifc.MallVendorIfc theVendors) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelVendors == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelVendors).
        moveRelatedElementToLast( theCtxt, this, theVendors);
    } catch( ClassCastException anEx) {}
  }





    /* Public Write accessor for role Vendors
     */
  public void removeVendors( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallVendorIfc theVendors) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelVendors == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelVendors).
          removeRelatedElement( theCtxt, this, theVendors);
    } catch( ClassCastException anEx) { return;}
  }




/****************************************************************************
 *  Implementation of public interface for MANY relationship DeliveryServices
 ****************************************************************************/


    /* Public Read accessor for role DeliveryServices
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.mall.core.ifc.MallDeliveryServiceIfc[] getDeliveryServices( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelDeliveryServices == null) { return null;}

    try { return (com.dosmil_e.mall.core.ifc.MallDeliveryServiceIfc[])
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelDeliveryServices).
        getRelatedElements( theCtxt, this);
    }
    catch( ClassCastException anEx) { return null;}
  }





    /* Public DeliveryServices number access
     */
  public int numDeliveryServices( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return 0;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelDeliveryServices == null) { return  0;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelDeliveryServices).
          numRelatedElements( theCtxt, this);
    } catch( ClassCastException anEx) { return 0;}
  }



    /* Public DeliveryServices read accessor by index
     */
  public com.dosmil_e.mall.core.ifc.MallDeliveryServiceIfc getDeliveryServicesAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelDeliveryServices == null) { return null;}

    try { return (com.dosmil_e.mall.core.ifc.MallDeliveryServiceIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelDeliveryServices).
        getRelatedElementAt( theCtxt, this, theIndex);
    }
    catch( ClassCastException anEx) { return null;}
  }




    /* Public DeliveryServices finder by name
     */
  public com.dosmil_e.mall.core.ifc.MallDeliveryServiceIfc findDeliveryServicesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelDeliveryServices == null) { return  null;}

    try {
      return (com.dosmil_e.mall.core.ifc.MallDeliveryServiceIfc)
        ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelDeliveryServices).
          findRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return null;}
  }



    /* Public DeliveryServices finder predicate by name
     */
  public boolean hasDeliveryServicesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelDeliveryServices == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelDeliveryServices).
          hasRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public DeliveryServices is related predicate
     */
  public boolean hasDeliveryServices( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallDeliveryServiceIfc theDeliveryServices) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelDeliveryServices == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelDeliveryServices).
          hasRelatedElement( theCtxt, this, theDeliveryServices);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public DeliveryServices index access
     */
  public int indexOfDeliveryServices( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallDeliveryServiceIfc theDeliveryServices) throws EAIException {
    if( theCtxt == null) { return -1;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelDeliveryServices == null) { return  -1;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelDeliveryServices).
          indexOfRelatedElement( theCtxt, this, theDeliveryServices);
    } catch( ClassCastException anEx) { return -1;}
  }




    /* Public Write accessor for role DeliveryServices
     */
  public void addDeliveryServices( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallDeliveryServiceIfc theDeliveryServices) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelDeliveryServices == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelDeliveryServices).
        addRelatedElement( theCtxt, this, theDeliveryServices);
    } catch( ClassCastException anEx) {}
  }


    /* Public ordered Write accessor for role DeliveryServices
     */
  public void addDeliveryServicesBefore(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.mall.core.ifc.MallDeliveryServiceIfc theDeliveryServices,
    com.dosmil_e.mall.core.ifc.MallDeliveryServiceIfc theRelativeDeliveryServices) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelDeliveryServices == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelDeliveryServices).
        addRelatedElementBefore( theCtxt, this, theDeliveryServices, theRelativeDeliveryServices);
    } catch( ClassCastException anEx) {}
  }



    /* Public reorder accessor for role DeliveryServices
     */
  public void moveDeliveryServicesBefore(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.mall.core.ifc.MallDeliveryServiceIfc theDeliveryServices,
    com.dosmil_e.mall.core.ifc.MallDeliveryServiceIfc theRelativeDeliveryServices) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelDeliveryServices == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelDeliveryServices).
        moveRelatedElementBefore( theCtxt, this, theDeliveryServices, theRelativeDeliveryServices);
    } catch( ClassCastException anEx) {}
  }



    /* Public move to last accessor for role DeliveryServices
     */
  public void moveDeliveryServicesToLast(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.mall.core.ifc.MallDeliveryServiceIfc theDeliveryServices) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelDeliveryServices == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelDeliveryServices).
        moveRelatedElementToLast( theCtxt, this, theDeliveryServices);
    } catch( ClassCastException anEx) {}
  }





    /* Public Write accessor for role DeliveryServices
     */
  public void removeDeliveryServices( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallDeliveryServiceIfc theDeliveryServices) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelDeliveryServices == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelDeliveryServices).
          removeRelatedElement( theCtxt, this, theDeliveryServices);
    } catch( ClassCastException anEx) { return;}
  }




/****************************************************************************
 *  Implementation of public interface for MANY relationship Parties
 ****************************************************************************/


    /* Public Read accessor for role Parties
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.mall.core.ifc.MallPartyIfc[] getParties( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelParties == null) { return null;}

    try { return (com.dosmil_e.mall.core.ifc.MallPartyIfc[])
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelParties).
        getRelatedElements( theCtxt, this);
    }
    catch( ClassCastException anEx) { return null;}
  }





    /* Public Parties number access
     */
  public int numParties( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return 0;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelParties == null) { return  0;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelParties).
          numRelatedElements( theCtxt, this);
    } catch( ClassCastException anEx) { return 0;}
  }



    /* Public Parties read accessor by index
     */
  public com.dosmil_e.mall.core.ifc.MallPartyIfc getPartiesAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelParties == null) { return null;}

    try { return (com.dosmil_e.mall.core.ifc.MallPartyIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelParties).
        getRelatedElementAt( theCtxt, this, theIndex);
    }
    catch( ClassCastException anEx) { return null;}
  }




    /* Public Parties finder by name
     */
  public com.dosmil_e.mall.core.ifc.MallPartyIfc findPartiesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelParties == null) { return  null;}

    try {
      return (com.dosmil_e.mall.core.ifc.MallPartyIfc)
        ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelParties).
          findRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return null;}
  }



    /* Public Parties finder predicate by name
     */
  public boolean hasPartiesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelParties == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelParties).
          hasRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public Parties is related predicate
     */
  public boolean hasParties( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallPartyIfc theParties) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelParties == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelParties).
          hasRelatedElement( theCtxt, this, theParties);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public Parties index access
     */
  public int indexOfParties( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallPartyIfc theParties) throws EAIException {
    if( theCtxt == null) { return -1;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelParties == null) { return  -1;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelParties).
          indexOfRelatedElement( theCtxt, this, theParties);
    } catch( ClassCastException anEx) { return -1;}
  }




    /* Public Write accessor for role Parties
     */
  public void addParties( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallPartyIfc theParties) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelParties == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelParties).
        addRelatedElement( theCtxt, this, theParties);
    } catch( ClassCastException anEx) {}
  }


    /* Public ordered Write accessor for role Parties
     */
  public void addPartiesBefore(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.mall.core.ifc.MallPartyIfc theParties,
    com.dosmil_e.mall.core.ifc.MallPartyIfc theRelativeParties) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelParties == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelParties).
        addRelatedElementBefore( theCtxt, this, theParties, theRelativeParties);
    } catch( ClassCastException anEx) {}
  }



    /* Public reorder accessor for role Parties
     */
  public void movePartiesBefore(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.mall.core.ifc.MallPartyIfc theParties,
    com.dosmil_e.mall.core.ifc.MallPartyIfc theRelativeParties) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelParties == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelParties).
        moveRelatedElementBefore( theCtxt, this, theParties, theRelativeParties);
    } catch( ClassCastException anEx) {}
  }



    /* Public move to last accessor for role Parties
     */
  public void movePartiesToLast(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.mall.core.ifc.MallPartyIfc theParties) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelParties == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelParties).
        moveRelatedElementToLast( theCtxt, this, theParties);
    } catch( ClassCastException anEx) {}
  }





    /* Public Write accessor for role Parties
     */
  public void removeParties( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallPartyIfc theParties) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelParties == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallMallMeta.vm3RelParties).
          removeRelatedElement( theCtxt, this, theParties);
    } catch( ClassCastException anEx) { return;}
  }








/****************************************************************************
 *  Implementation of destructor of MallMall
 ****************************************************************************/
  public void delete( EAIMMCtxtIfc theCtxt)  throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( vm3Type == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3TypePub) vm3Type).
          deleteElement( theCtxt, this);
    } catch( ClassCastException anEx) { return;}
  }



/****************************************************************************
 *  Support
 ****************************************************************************/



/****************************************************************************
 *  Access and initialization of metainformation the metamodel element
 *    for initialization, delegates on the model's metamodel root, that will
 *    invoke metainfo initializers (phase1, phase2) on all the metamodel elements
 ****************************************************************************/
  public static com.dosmil_e.m3.core.ifc.M3TypeIfc getStaticM3Type( EAIMMCtxtIfc theCtxt) {
    if( vm3Type == null) {
      vm3Type = com.dosmil_e.mall.core.meta.MallMallMeta.getStaticM3Type( theCtxt);
    }
    return vm3Type;
  }


/****************************************************************************
 *  Access to metainformation for Type of the metamodel element
 ****************************************************************************/
  public com.dosmil_e.m3.core.ifc.M3TypeIfc getM3Type( EAIMMCtxtIfc theCtxt) {
    return getStaticM3Type( theCtxt);
  }



/****************************************************************************
 *  Implementation of restoreValue method (such that it has access to protected fields)
 ****************************************************************************/
    // Restore a value on this metamodel element
  protected boolean restoreValue(
    EAIMMCtxtIfc    theCtxt,
    Object          theValueToRestore,
    String          theFieldName) {

    if( theCtxt == null)        { return true;}
    if( theFieldName == null)   { return true;}

    if( EAIFlatTransactionMgrIfc.sLogTransactionBoundaries) {

      String aSourceName = new String("null");
      String aSourceClassName = new String();
      EAIMMNameIfc aName = null;
      try { aName = getName();} catch( EAIException anEx) {}
      if( aName != null) {
        aSourceName = aName.getString();
      }
      aSourceClassName = getClass().getName();

      System.out.println("--- Restoring field : " + theFieldName + " in element named " + aSourceName + " class " + aSourceClassName);
    }

    if( theFieldName.equals( sExistencePropertyName)) { return true;}

    Field aField = getField( theFieldName);
    if( aField == null) { return false;}

    Class aFieldType = aField.getType();
    if( aFieldType == null) { return false;}

    if( !aFieldType.isPrimitive()) {
      try { aField.set( this, theValueToRestore);}
      catch( IllegalArgumentException anException) { return false;}
      catch( IllegalAccessException anException) { return false;}
    }
    else {
      String aFieldTypeName = aFieldType.getName();

      if( aFieldTypeName.equals( int.class.getName())) {
        Integer aValueObject = null;
        try { aValueObject = (Integer) theValueToRestore;} catch( ClassCastException anException) {}
        if( aValueObject == null) { return false;}
        int aValue = aValueObject.intValue();
        try { aField.setInt( this, aValue);}
        catch( IllegalArgumentException anException) { return false;}
        catch( IllegalAccessException anException) { return false;}
      }
      else {
      if( aFieldTypeName.equals( boolean.class.getName())) {
        Boolean aValueObject = null;
        try { aValueObject = (Boolean) theValueToRestore;} catch( ClassCastException anException) {}
        if( aValueObject == null) { return false;}
        boolean aValue = aValueObject.booleanValue();

        try { aField.setBoolean( this, aValue);}
        catch( IllegalArgumentException anException) { return false;}
        catch( IllegalAccessException anException) { return false;}
      }
      else {
      if( aFieldTypeName.equals( float.class.getName())) {
        Float aValueObject = null;
        try { aValueObject = (Float) theValueToRestore;} catch( ClassCastException anException) {}
        if( aValueObject == null) { return false;}
        float aValue = aValueObject.floatValue();

        try { aField.setFloat( this, aValue);}
        catch( IllegalArgumentException anException) { return false;}
        catch( IllegalAccessException anException) { return false;}
      }
      else {
      if( aFieldTypeName.equals( double.class.getName())) {
        Double aValueObject = null;
        try { aValueObject = (Double) theValueToRestore;} catch( ClassCastException anException) {}
        if( aValueObject == null) { return false;}
        double aValue = aValueObject.doubleValue();
        try { aField.setDouble( this, aValue);}
        catch( IllegalArgumentException anException) { return false;}
        catch( IllegalAccessException anException) { return false;}
      }
      else {
        return false;
      }}}}
    }

    return true;
  }






/****************************************************************************
 *  Implementations of getFieldValue method (such that it has access to protected fields)
 ****************************************************************************/

    // Get a value from a field of this  metamodel element
  public Object getFieldValue(
    EAIMMCtxtIfc    theCtxt,
    Field           theField) throws EAIException {

    if( theCtxt == null)        { return null;}
    if( theField == null)       { return null;}

    Object aValue = null;
    try { aValue = theField.get( this);}
    catch( IllegalArgumentException anException) { return null;}
    catch( IllegalAccessException anException) { return null;}
    catch( NullPointerException anException) { return null;}
    catch( ExceptionInInitializerError anException) { return null;}

    return aValue;
  }





/****************************************************************************
 *  Implementations of setFieldToXXX method (such that it has access to protected fields)
 ****************************************************************************/
    // Aux for log
  protected void logSetField(
    EAIMMCtxtIfc    theCtxt,
    String          theFieldKind,
    Field           theField) {

    if( !EAIFlatTransactionMgrIfc.sLogTransactionBoundaries) { return;}


    String aSourceName = new String("null");
    String aSourceClassName = new String();
    EAIMMNameIfc aName = null;
    try { aName = getName();} catch( EAIException anEx) {}
    if( aName != null) {
      aSourceName = aName.getString();
    }
    aSourceClassName = getClass().getName();

    System.out.println("--- SettingField " + theFieldKind + " field : " + theField.getName() + " in element named " + aSourceName + " class " + aSourceClassName);
  }


    // Restore a value on this metamodel element
  public boolean setFieldToNonPrimitiveValue(
    EAIMMCtxtIfc    theCtxt,
    Object          theValueToSet,
    Field           theField) throws EAIException {

    if( theCtxt == null)        { return true;}
    if( theField == null)       { return true;}

    logSetField( theCtxt, "Non Primitive", theField);

    try { theField.set( this, theValueToSet);}
    catch( IllegalArgumentException anException) { return false;}
    catch( IllegalAccessException anException) { return false;}
    return true;
  }


  public boolean setFieldToPrimitiveIntValue(
    EAIMMCtxtIfc    theCtxt,
    Object          theValueToSet,
    Field           theField) throws EAIException {

    if( theCtxt == null)        { return true;}
    if( theField == null)       { return true;}

    logSetField( theCtxt, "Primitive int", theField);

    Integer aValueObject = null;
    try { aValueObject = (Integer) theValueToSet;} catch( ClassCastException anException) {}
    if( aValueObject == null) { return false;}
    int aValue = aValueObject.intValue();

    try { theField.setInt( this, aValue);}
    catch( IllegalArgumentException anException) { return false;}
    catch( IllegalAccessException anException) { return false;}

    return true;
  }






  public boolean setFieldToPrimitiveBoolValue(
    EAIMMCtxtIfc    theCtxt,
    Object          theValueToSet,
    Field           theField) throws EAIException {

    if( theCtxt == null)        { return true;}
    if( theField == null)       { return true;}

    logSetField( theCtxt, "Primitive boolean", theField);

    Boolean aValueObject = null;
    try { aValueObject = (Boolean) theValueToSet;} catch( ClassCastException anException) {}
    if( aValueObject == null) { return false;}
    boolean aValue = aValueObject.booleanValue();

    try { theField.setBoolean( this, aValue);}
    catch( IllegalArgumentException anException) { return false;}
    catch( IllegalAccessException anException) { return false;}

    return true;
  }









  public boolean setFieldToPrimitiveFloatValue(
    EAIMMCtxtIfc    theCtxt,
    Object          theValueToSet,
    Field           theField)  throws EAIException {

    if( theCtxt == null)        { return true;}
    if( theField == null)   { return true;}


    logSetField( theCtxt, "Primitive float", theField);

    Float aValueObject = null;
    try { aValueObject = (Float) theValueToSet;} catch( ClassCastException anException) {}
    if( aValueObject == null) { return false;}
    float aValue = aValueObject.floatValue();

    try { theField.setFloat( this, aValue);}
    catch( IllegalArgumentException anException) { return false;}
    catch( IllegalAccessException anException) { return false;}

    return true;
  }






  public boolean setFieldToPrimitiveDoubleValue(
    EAIMMCtxtIfc    theCtxt,
    Object          theValueToSet,
    Field           theField)  throws EAIException {

    if( theCtxt == null)        { return true;}
    if( theField == null)   { return true;}


    logSetField( theCtxt, "Primitive double", theField);

    Double aValueObject = null;
    try { aValueObject = (Double) theValueToSet;} catch( ClassCastException anException) {}
    if( aValueObject == null) { return false;}
    double aValue = aValueObject.doubleValue();

    try { theField.setDouble( this, aValue);}
    catch( IllegalArgumentException anException) { return false;}
    catch( IllegalAccessException anException) { return false;}

    return true;
  }





/****************************************************************************
 *  Serialization support
 ****************************************************************************/

  private static final long serialVersionUID = -3331123645200000003L;


}

