package com.dosmil_e.mall.core.base;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import java.lang.reflect.Field;

public  class MallPartyBase 
   extends com.dosmil_e.m3.withm3.impl.MMElementWithM3Impl
    implements com.dosmil_e.mall.core.ifc.MallPartyIfc   {

/****************************************************************************
 *  Static metainformation for Type of the EAIProject metamodel element
 ****************************************************************************/
  public static com.dosmil_e.m3.core.ifc.M3TypeIfc vm3Type;


/****************************************************************************
 *  State storage for Attributes of the MallParty metamodel element
 ****************************************************************************/



/****************************************************************************
 *  State storage for the Relationships of the MallParty metamodel element
 ****************************************************************************/
	protected com.dosmil_e.mall.core.ifc.MallMallIfc vrMall; 

	protected com.dosmil_e.mall.core.ifc.MallCustomerIfc[] vrCustomers = new com.dosmil_e.mall.core.ifc.MallCustomerIfc[0]; 

	protected com.dosmil_e.mall.core.ifc.MallContactIfc[] vrContacts = new com.dosmil_e.mall.core.ifc.MallContactIfc[0]; 

	protected com.dosmil_e.mall.core.ifc.MallAddressIfc[] vrAddresses = new com.dosmil_e.mall.core.ifc.MallAddressIfc[0]; 






/****************************************************************************
 *  Constructors of the MallParty metamodel element
 ****************************************************************************/

  public MallPartyBase() {
    super();
  }


  public MallPartyBase( EAIMMCtxtIfc theCtxt) {
    super( theCtxt);
  }

  public MallPartyBase( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theName) {
    super( theCtxt, theName);
  }


/****************************************************************************
 *  Implementation of the MallPartyIfc and MallPartyPriv interfaces
 ****************************************************************************/

/****************************************************************************
 *  Implementation of attributes of MallParty
 ****************************************************************************/

 




/****************************************************************************
 *  Implementation of relationships of MallParty
 ****************************************************************************/

 

/****************************************************************************
 *  Implementation of public interface for ONE relationship Mall
 ****************************************************************************/


    /* Public Read accessor for role Mall
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.mall.core.ifc.MallMallIfc getMall( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelMall == null) { return null;}

    try { return (com.dosmil_e.mall.core.ifc.MallMallIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelMall).
        getRelatedElement( theCtxt, this);
    }
    catch( ClassCastException anEx) { return null;}
  }



    /* Public Mall number access
     */
  public int numMall( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return 0;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelMall == null) { return  0;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelMall).
          numRelatedElements( theCtxt, this);
    } catch( ClassCastException anEx) { return 0;}
  }



    /* Public Mall read accessor by index
     */
  public com.dosmil_e.mall.core.ifc.MallMallIfc getMallAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelMall == null) { return null;}

    try { return (com.dosmil_e.mall.core.ifc.MallMallIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelMall).
        getRelatedElementAt( theCtxt, this, theIndex);
    }
    catch( ClassCastException anEx) { return null;}
  }




    /* Public Mall finder by name
     */
  public com.dosmil_e.mall.core.ifc.MallMallIfc findMallNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelMall == null) { return  null;}

    try {
      return (com.dosmil_e.mall.core.ifc.MallMallIfc)
        ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelMall).
          findRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return null;}
  }



    /* Public Mall finder predicate by name
     */
  public boolean hasMallNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelMall == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelMall).
          hasRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public Mall is related predicate
     */
  public boolean hasMall( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallMallIfc theMall) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelMall == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelMall).
          hasRelatedElement( theCtxt, this, theMall);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public Mall index access
     */
  public int indexOfMall( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallMallIfc theMall) throws EAIException {
    if( theCtxt == null) { return -1;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelMall == null) { return  -1;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelMall).
          indexOfRelatedElement( theCtxt, this, theMall);
    } catch( ClassCastException anEx) { return -1;}
  }




    /* Public Write accessor for role Mall
     */
  public void setMall( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallMallIfc theMall) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelMall == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelMall).
        setRelatedElement( theCtxt, this, theMall);
    } catch( ClassCastException anEx) {}
  }







/****************************************************************************
 *  Implementation of public interface for MANY relationship Customers
 ****************************************************************************/


    /* Public Read accessor for role Customers
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.mall.core.ifc.MallCustomerIfc[] getCustomers( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelCustomers == null) { return null;}

    try { return (com.dosmil_e.mall.core.ifc.MallCustomerIfc[])
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelCustomers).
        getRelatedElements( theCtxt, this);
    }
    catch( ClassCastException anEx) { return null;}
  }





    /* Public Customers number access
     */
  public int numCustomers( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return 0;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelCustomers == null) { return  0;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelCustomers).
          numRelatedElements( theCtxt, this);
    } catch( ClassCastException anEx) { return 0;}
  }



    /* Public Customers read accessor by index
     */
  public com.dosmil_e.mall.core.ifc.MallCustomerIfc getCustomersAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelCustomers == null) { return null;}

    try { return (com.dosmil_e.mall.core.ifc.MallCustomerIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelCustomers).
        getRelatedElementAt( theCtxt, this, theIndex);
    }
    catch( ClassCastException anEx) { return null;}
  }




    /* Public Customers finder by name
     */
  public com.dosmil_e.mall.core.ifc.MallCustomerIfc findCustomersNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelCustomers == null) { return  null;}

    try {
      return (com.dosmil_e.mall.core.ifc.MallCustomerIfc)
        ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelCustomers).
          findRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return null;}
  }



    /* Public Customers finder predicate by name
     */
  public boolean hasCustomersNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelCustomers == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelCustomers).
          hasRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public Customers is related predicate
     */
  public boolean hasCustomers( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallCustomerIfc theCustomers) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelCustomers == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelCustomers).
          hasRelatedElement( theCtxt, this, theCustomers);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public Customers index access
     */
  public int indexOfCustomers( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallCustomerIfc theCustomers) throws EAIException {
    if( theCtxt == null) { return -1;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelCustomers == null) { return  -1;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelCustomers).
          indexOfRelatedElement( theCtxt, this, theCustomers);
    } catch( ClassCastException anEx) { return -1;}
  }




    /* Public Write accessor for role Customers
     */
  public void addCustomers( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallCustomerIfc theCustomers) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelCustomers == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelCustomers).
        addRelatedElement( theCtxt, this, theCustomers);
    } catch( ClassCastException anEx) {}
  }


    /* Public ordered Write accessor for role Customers
     */
  public void addCustomersBefore(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.mall.core.ifc.MallCustomerIfc theCustomers,
    com.dosmil_e.mall.core.ifc.MallCustomerIfc theRelativeCustomers) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelCustomers == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelCustomers).
        addRelatedElementBefore( theCtxt, this, theCustomers, theRelativeCustomers);
    } catch( ClassCastException anEx) {}
  }



    /* Public reorder accessor for role Customers
     */
  public void moveCustomersBefore(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.mall.core.ifc.MallCustomerIfc theCustomers,
    com.dosmil_e.mall.core.ifc.MallCustomerIfc theRelativeCustomers) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelCustomers == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelCustomers).
        moveRelatedElementBefore( theCtxt, this, theCustomers, theRelativeCustomers);
    } catch( ClassCastException anEx) {}
  }



    /* Public move to last accessor for role Customers
     */
  public void moveCustomersToLast(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.mall.core.ifc.MallCustomerIfc theCustomers) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelCustomers == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelCustomers).
        moveRelatedElementToLast( theCtxt, this, theCustomers);
    } catch( ClassCastException anEx) {}
  }





    /* Public Write accessor for role Customers
     */
  public void removeCustomers( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallCustomerIfc theCustomers) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelCustomers == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelCustomers).
          removeRelatedElement( theCtxt, this, theCustomers);
    } catch( ClassCastException anEx) { return;}
  }




/****************************************************************************
 *  Implementation of public interface for MANY relationship Contacts
 ****************************************************************************/


    /* Public Read accessor for role Contacts
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.mall.core.ifc.MallContactIfc[] getContacts( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelContacts == null) { return null;}

    try { return (com.dosmil_e.mall.core.ifc.MallContactIfc[])
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelContacts).
        getRelatedElements( theCtxt, this);
    }
    catch( ClassCastException anEx) { return null;}
  }





    /* Public Contacts number access
     */
  public int numContacts( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return 0;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelContacts == null) { return  0;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelContacts).
          numRelatedElements( theCtxt, this);
    } catch( ClassCastException anEx) { return 0;}
  }



    /* Public Contacts read accessor by index
     */
  public com.dosmil_e.mall.core.ifc.MallContactIfc getContactsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelContacts == null) { return null;}

    try { return (com.dosmil_e.mall.core.ifc.MallContactIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelContacts).
        getRelatedElementAt( theCtxt, this, theIndex);
    }
    catch( ClassCastException anEx) { return null;}
  }




    /* Public Contacts finder by name
     */
  public com.dosmil_e.mall.core.ifc.MallContactIfc findContactsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelContacts == null) { return  null;}

    try {
      return (com.dosmil_e.mall.core.ifc.MallContactIfc)
        ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelContacts).
          findRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return null;}
  }



    /* Public Contacts finder predicate by name
     */
  public boolean hasContactsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelContacts == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelContacts).
          hasRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public Contacts is related predicate
     */
  public boolean hasContacts( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallContactIfc theContacts) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelContacts == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelContacts).
          hasRelatedElement( theCtxt, this, theContacts);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public Contacts index access
     */
  public int indexOfContacts( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallContactIfc theContacts) throws EAIException {
    if( theCtxt == null) { return -1;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelContacts == null) { return  -1;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelContacts).
          indexOfRelatedElement( theCtxt, this, theContacts);
    } catch( ClassCastException anEx) { return -1;}
  }




    /* Public Write accessor for role Contacts
     */
  public void addContacts( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallContactIfc theContacts) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelContacts == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelContacts).
        addRelatedElement( theCtxt, this, theContacts);
    } catch( ClassCastException anEx) {}
  }


    /* Public ordered Write accessor for role Contacts
     */
  public void addContactsBefore(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.mall.core.ifc.MallContactIfc theContacts,
    com.dosmil_e.mall.core.ifc.MallContactIfc theRelativeContacts) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelContacts == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelContacts).
        addRelatedElementBefore( theCtxt, this, theContacts, theRelativeContacts);
    } catch( ClassCastException anEx) {}
  }



    /* Public reorder accessor for role Contacts
     */
  public void moveContactsBefore(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.mall.core.ifc.MallContactIfc theContacts,
    com.dosmil_e.mall.core.ifc.MallContactIfc theRelativeContacts) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelContacts == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelContacts).
        moveRelatedElementBefore( theCtxt, this, theContacts, theRelativeContacts);
    } catch( ClassCastException anEx) {}
  }



    /* Public move to last accessor for role Contacts
     */
  public void moveContactsToLast(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.mall.core.ifc.MallContactIfc theContacts) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelContacts == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelContacts).
        moveRelatedElementToLast( theCtxt, this, theContacts);
    } catch( ClassCastException anEx) {}
  }





    /* Public Write accessor for role Contacts
     */
  public void removeContacts( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallContactIfc theContacts) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelContacts == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelContacts).
          removeRelatedElement( theCtxt, this, theContacts);
    } catch( ClassCastException anEx) { return;}
  }




/****************************************************************************
 *  Implementation of public interface for MANY relationship Addresses
 ****************************************************************************/


    /* Public Read accessor for role Addresses
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.mall.core.ifc.MallAddressIfc[] getAddresses( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelAddresses == null) { return null;}

    try { return (com.dosmil_e.mall.core.ifc.MallAddressIfc[])
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelAddresses).
        getRelatedElements( theCtxt, this);
    }
    catch( ClassCastException anEx) { return null;}
  }





    /* Public Addresses number access
     */
  public int numAddresses( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return 0;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelAddresses == null) { return  0;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelAddresses).
          numRelatedElements( theCtxt, this);
    } catch( ClassCastException anEx) { return 0;}
  }



    /* Public Addresses read accessor by index
     */
  public com.dosmil_e.mall.core.ifc.MallAddressIfc getAddressesAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelAddresses == null) { return null;}

    try { return (com.dosmil_e.mall.core.ifc.MallAddressIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelAddresses).
        getRelatedElementAt( theCtxt, this, theIndex);
    }
    catch( ClassCastException anEx) { return null;}
  }




    /* Public Addresses finder by name
     */
  public com.dosmil_e.mall.core.ifc.MallAddressIfc findAddressesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelAddresses == null) { return  null;}

    try {
      return (com.dosmil_e.mall.core.ifc.MallAddressIfc)
        ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelAddresses).
          findRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return null;}
  }



    /* Public Addresses finder predicate by name
     */
  public boolean hasAddressesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelAddresses == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelAddresses).
          hasRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public Addresses is related predicate
     */
  public boolean hasAddresses( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallAddressIfc theAddresses) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelAddresses == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelAddresses).
          hasRelatedElement( theCtxt, this, theAddresses);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public Addresses index access
     */
  public int indexOfAddresses( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallAddressIfc theAddresses) throws EAIException {
    if( theCtxt == null) { return -1;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelAddresses == null) { return  -1;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelAddresses).
          indexOfRelatedElement( theCtxt, this, theAddresses);
    } catch( ClassCastException anEx) { return -1;}
  }




    /* Public Write accessor for role Addresses
     */
  public void addAddresses( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallAddressIfc theAddresses) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelAddresses == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelAddresses).
        addRelatedElement( theCtxt, this, theAddresses);
    } catch( ClassCastException anEx) {}
  }


    /* Public ordered Write accessor for role Addresses
     */
  public void addAddressesBefore(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.mall.core.ifc.MallAddressIfc theAddresses,
    com.dosmil_e.mall.core.ifc.MallAddressIfc theRelativeAddresses) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelAddresses == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelAddresses).
        addRelatedElementBefore( theCtxt, this, theAddresses, theRelativeAddresses);
    } catch( ClassCastException anEx) {}
  }



    /* Public reorder accessor for role Addresses
     */
  public void moveAddressesBefore(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.mall.core.ifc.MallAddressIfc theAddresses,
    com.dosmil_e.mall.core.ifc.MallAddressIfc theRelativeAddresses) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelAddresses == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelAddresses).
        moveRelatedElementBefore( theCtxt, this, theAddresses, theRelativeAddresses);
    } catch( ClassCastException anEx) {}
  }



    /* Public move to last accessor for role Addresses
     */
  public void moveAddressesToLast(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.mall.core.ifc.MallAddressIfc theAddresses) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelAddresses == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelAddresses).
        moveRelatedElementToLast( theCtxt, this, theAddresses);
    } catch( ClassCastException anEx) {}
  }





    /* Public Write accessor for role Addresses
     */
  public void removeAddresses( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallAddressIfc theAddresses) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelAddresses == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPartyMeta.vm3RelAddresses).
          removeRelatedElement( theCtxt, this, theAddresses);
    } catch( ClassCastException anEx) { return;}
  }








/****************************************************************************
 *  Implementation of destructor of MallParty
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
      vm3Type = com.dosmil_e.mall.core.meta.MallPartyMeta.getStaticM3Type( theCtxt);
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

