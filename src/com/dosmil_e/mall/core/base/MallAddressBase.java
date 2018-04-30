package com.dosmil_e.mall.core.base;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import java.lang.reflect.Field;

public  class MallAddressBase 
   extends com.dosmil_e.m3.withm3.impl.MMElementWithM3Impl
    implements com.dosmil_e.mall.core.ifc.MallAddressIfc   {

/****************************************************************************
 *  Static metainformation for Type of the EAIProject metamodel element
 ****************************************************************************/
  public static com.dosmil_e.m3.core.ifc.M3TypeIfc vm3Type;


/****************************************************************************
 *  State storage for Attributes of the MallAddress metamodel element
 ****************************************************************************/
	protected java.lang.String vaStreetAddress;

	protected java.lang.String vaCity;

	protected java.lang.String vaPostalCode;

	protected java.lang.String vaState;




/****************************************************************************
 *  State storage for the Relationships of the MallAddress metamodel element
 ****************************************************************************/
	protected com.dosmil_e.mall.core.ifc.MallPartyIfc vrParty; 

	protected com.dosmil_e.mall.core.ifc.MallShippingIfc[] vrShippings = new com.dosmil_e.mall.core.ifc.MallShippingIfc[0]; 






/****************************************************************************
 *  Constructors of the MallAddress metamodel element
 ****************************************************************************/

  public MallAddressBase() {
    super();
  }


  public MallAddressBase( EAIMMCtxtIfc theCtxt) {
    super( theCtxt);
  }

  public MallAddressBase( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theName) {
    super( theCtxt, theName);
  }


/****************************************************************************
 *  Implementation of the MallAddressIfc and MallAddressPriv interfaces
 ****************************************************************************/

/****************************************************************************
 *  Implementation of attributes of MallAddress
 ****************************************************************************/

 
/****************************************************************************
 *  Implementation of public interface for attribute StreetAddress
 ****************************************************************************/


    /* Public Read accessor for attribute StreetAddress
     */

    /* Public Read accessor for attribute MinMultiplicity
     */
  public java.lang.String getStreetAddress( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallAddressMeta.vm3AttrStreetAddress == null) { return null;}

    try {
      return (java.lang.String)
        toObject(((com.dosmil_e.m3.core.pub.M3AttributePub)
          com.dosmil_e.mall.core.meta.MallAddressMeta.vm3AttrStreetAddress).getAttributeValue( theCtxt, this));
    }
    catch( ClassCastException anEx) { return null;}
  }



    /* Public Write accessor for attribute MinMultiplicity
     */
  public void setStreetAddress( EAIMMCtxtIfc theCtxt, java.lang.String theStreetAddress) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallAddressMeta.vm3AttrStreetAddress == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3AttributePub) com.dosmil_e.mall.core.meta.MallAddressMeta.vm3AttrStreetAddress).
        setAttributeValue( theCtxt, this, toObject( theStreetAddress));
    }
    catch( ClassCastException anEx) { return;}
  }





/****************************************************************************
 *  Implementation of public interface for attribute City
 ****************************************************************************/


    /* Public Read accessor for attribute City
     */

    /* Public Read accessor for attribute MinMultiplicity
     */
  public java.lang.String getCity( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallAddressMeta.vm3AttrCity == null) { return null;}

    try {
      return (java.lang.String)
        toObject(((com.dosmil_e.m3.core.pub.M3AttributePub)
          com.dosmil_e.mall.core.meta.MallAddressMeta.vm3AttrCity).getAttributeValue( theCtxt, this));
    }
    catch( ClassCastException anEx) { return null;}
  }



    /* Public Write accessor for attribute MinMultiplicity
     */
  public void setCity( EAIMMCtxtIfc theCtxt, java.lang.String theCity) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallAddressMeta.vm3AttrCity == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3AttributePub) com.dosmil_e.mall.core.meta.MallAddressMeta.vm3AttrCity).
        setAttributeValue( theCtxt, this, toObject( theCity));
    }
    catch( ClassCastException anEx) { return;}
  }





/****************************************************************************
 *  Implementation of public interface for attribute PostalCode
 ****************************************************************************/


    /* Public Read accessor for attribute PostalCode
     */

    /* Public Read accessor for attribute MinMultiplicity
     */
  public java.lang.String getPostalCode( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallAddressMeta.vm3AttrPostalCode == null) { return null;}

    try {
      return (java.lang.String)
        toObject(((com.dosmil_e.m3.core.pub.M3AttributePub)
          com.dosmil_e.mall.core.meta.MallAddressMeta.vm3AttrPostalCode).getAttributeValue( theCtxt, this));
    }
    catch( ClassCastException anEx) { return null;}
  }



    /* Public Write accessor for attribute MinMultiplicity
     */
  public void setPostalCode( EAIMMCtxtIfc theCtxt, java.lang.String thePostalCode) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallAddressMeta.vm3AttrPostalCode == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3AttributePub) com.dosmil_e.mall.core.meta.MallAddressMeta.vm3AttrPostalCode).
        setAttributeValue( theCtxt, this, toObject( thePostalCode));
    }
    catch( ClassCastException anEx) { return;}
  }





/****************************************************************************
 *  Implementation of public interface for attribute State
 ****************************************************************************/


    /* Public Read accessor for attribute State
     */

    /* Public Read accessor for attribute MinMultiplicity
     */
  public java.lang.String getState( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallAddressMeta.vm3AttrState == null) { return null;}

    try {
      return (java.lang.String)
        toObject(((com.dosmil_e.m3.core.pub.M3AttributePub)
          com.dosmil_e.mall.core.meta.MallAddressMeta.vm3AttrState).getAttributeValue( theCtxt, this));
    }
    catch( ClassCastException anEx) { return null;}
  }



    /* Public Write accessor for attribute MinMultiplicity
     */
  public void setState( EAIMMCtxtIfc theCtxt, java.lang.String theState) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallAddressMeta.vm3AttrState == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3AttributePub) com.dosmil_e.mall.core.meta.MallAddressMeta.vm3AttrState).
        setAttributeValue( theCtxt, this, toObject( theState));
    }
    catch( ClassCastException anEx) { return;}
  }









/****************************************************************************
 *  Implementation of relationships of MallAddress
 ****************************************************************************/

 

/****************************************************************************
 *  Implementation of public interface for ONE relationship Party
 ****************************************************************************/


    /* Public Read accessor for role Party
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.mall.core.ifc.MallPartyIfc getParty( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallAddressMeta.vm3RelParty == null) { return null;}

    try { return (com.dosmil_e.mall.core.ifc.MallPartyIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallAddressMeta.vm3RelParty).
        getRelatedElement( theCtxt, this);
    }
    catch( ClassCastException anEx) { return null;}
  }



    /* Public Party number access
     */
  public int numParty( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return 0;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallAddressMeta.vm3RelParty == null) { return  0;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallAddressMeta.vm3RelParty).
          numRelatedElements( theCtxt, this);
    } catch( ClassCastException anEx) { return 0;}
  }



    /* Public Party read accessor by index
     */
  public com.dosmil_e.mall.core.ifc.MallPartyIfc getPartyAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallAddressMeta.vm3RelParty == null) { return null;}

    try { return (com.dosmil_e.mall.core.ifc.MallPartyIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallAddressMeta.vm3RelParty).
        getRelatedElementAt( theCtxt, this, theIndex);
    }
    catch( ClassCastException anEx) { return null;}
  }




    /* Public Party finder by name
     */
  public com.dosmil_e.mall.core.ifc.MallPartyIfc findPartyNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallAddressMeta.vm3RelParty == null) { return  null;}

    try {
      return (com.dosmil_e.mall.core.ifc.MallPartyIfc)
        ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallAddressMeta.vm3RelParty).
          findRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return null;}
  }



    /* Public Party finder predicate by name
     */
  public boolean hasPartyNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallAddressMeta.vm3RelParty == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallAddressMeta.vm3RelParty).
          hasRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public Party is related predicate
     */
  public boolean hasParty( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallPartyIfc theParty) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallAddressMeta.vm3RelParty == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallAddressMeta.vm3RelParty).
          hasRelatedElement( theCtxt, this, theParty);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public Party index access
     */
  public int indexOfParty( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallPartyIfc theParty) throws EAIException {
    if( theCtxt == null) { return -1;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallAddressMeta.vm3RelParty == null) { return  -1;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallAddressMeta.vm3RelParty).
          indexOfRelatedElement( theCtxt, this, theParty);
    } catch( ClassCastException anEx) { return -1;}
  }




    /* Public Write accessor for role Party
     */
  public void setParty( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallPartyIfc theParty) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallAddressMeta.vm3RelParty == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallAddressMeta.vm3RelParty).
        setRelatedElement( theCtxt, this, theParty);
    } catch( ClassCastException anEx) {}
  }







/****************************************************************************
 *  Implementation of public interface for MANY relationship Shippings
 ****************************************************************************/


    /* Public Read accessor for role Shippings
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.mall.core.ifc.MallShippingIfc[] getShippings( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallAddressMeta.vm3RelShippings == null) { return null;}

    try { return (com.dosmil_e.mall.core.ifc.MallShippingIfc[])
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallAddressMeta.vm3RelShippings).
        getRelatedElements( theCtxt, this);
    }
    catch( ClassCastException anEx) { return null;}
  }





    /* Public Shippings number access
     */
  public int numShippings( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return 0;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallAddressMeta.vm3RelShippings == null) { return  0;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallAddressMeta.vm3RelShippings).
          numRelatedElements( theCtxt, this);
    } catch( ClassCastException anEx) { return 0;}
  }



    /* Public Shippings read accessor by index
     */
  public com.dosmil_e.mall.core.ifc.MallShippingIfc getShippingsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallAddressMeta.vm3RelShippings == null) { return null;}

    try { return (com.dosmil_e.mall.core.ifc.MallShippingIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallAddressMeta.vm3RelShippings).
        getRelatedElementAt( theCtxt, this, theIndex);
    }
    catch( ClassCastException anEx) { return null;}
  }




    /* Public Shippings finder by name
     */
  public com.dosmil_e.mall.core.ifc.MallShippingIfc findShippingsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallAddressMeta.vm3RelShippings == null) { return  null;}

    try {
      return (com.dosmil_e.mall.core.ifc.MallShippingIfc)
        ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallAddressMeta.vm3RelShippings).
          findRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return null;}
  }



    /* Public Shippings finder predicate by name
     */
  public boolean hasShippingsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallAddressMeta.vm3RelShippings == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallAddressMeta.vm3RelShippings).
          hasRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public Shippings is related predicate
     */
  public boolean hasShippings( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallShippingIfc theShippings) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallAddressMeta.vm3RelShippings == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallAddressMeta.vm3RelShippings).
          hasRelatedElement( theCtxt, this, theShippings);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public Shippings index access
     */
  public int indexOfShippings( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallShippingIfc theShippings) throws EAIException {
    if( theCtxt == null) { return -1;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallAddressMeta.vm3RelShippings == null) { return  -1;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallAddressMeta.vm3RelShippings).
          indexOfRelatedElement( theCtxt, this, theShippings);
    } catch( ClassCastException anEx) { return -1;}
  }




    /* Public Write accessor for role Shippings
     */
  public void addShippings( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallShippingIfc theShippings) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallAddressMeta.vm3RelShippings == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallAddressMeta.vm3RelShippings).
        addRelatedElement( theCtxt, this, theShippings);
    } catch( ClassCastException anEx) {}
  }


    /* Public ordered Write accessor for role Shippings
     */
  public void addShippingsBefore(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.mall.core.ifc.MallShippingIfc theShippings,
    com.dosmil_e.mall.core.ifc.MallShippingIfc theRelativeShippings) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallAddressMeta.vm3RelShippings == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallAddressMeta.vm3RelShippings).
        addRelatedElementBefore( theCtxt, this, theShippings, theRelativeShippings);
    } catch( ClassCastException anEx) {}
  }



    /* Public reorder accessor for role Shippings
     */
  public void moveShippingsBefore(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.mall.core.ifc.MallShippingIfc theShippings,
    com.dosmil_e.mall.core.ifc.MallShippingIfc theRelativeShippings) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallAddressMeta.vm3RelShippings == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallAddressMeta.vm3RelShippings).
        moveRelatedElementBefore( theCtxt, this, theShippings, theRelativeShippings);
    } catch( ClassCastException anEx) {}
  }



    /* Public move to last accessor for role Shippings
     */
  public void moveShippingsToLast(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.mall.core.ifc.MallShippingIfc theShippings) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallAddressMeta.vm3RelShippings == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallAddressMeta.vm3RelShippings).
        moveRelatedElementToLast( theCtxt, this, theShippings);
    } catch( ClassCastException anEx) {}
  }





    /* Public Write accessor for role Shippings
     */
  public void removeShippings( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallShippingIfc theShippings) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallAddressMeta.vm3RelShippings == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallAddressMeta.vm3RelShippings).
          removeRelatedElement( theCtxt, this, theShippings);
    } catch( ClassCastException anEx) { return;}
  }








/****************************************************************************
 *  Implementation of destructor of MallAddress
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
      vm3Type = com.dosmil_e.mall.core.meta.MallAddressMeta.getStaticM3Type( theCtxt);
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

