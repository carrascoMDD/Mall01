package com.dosmil_e.mall.core.base;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import java.lang.reflect.Field;

public  class MallProductBase 
   extends com.dosmil_e.m3.withm3.impl.MMElementWithM3Impl
    implements com.dosmil_e.mall.core.ifc.MallProductIfc   {

/****************************************************************************
 *  Static metainformation for Type of the EAIProject metamodel element
 ****************************************************************************/
  public static com.dosmil_e.m3.core.ifc.M3TypeIfc vm3Type;


/****************************************************************************
 *  State storage for Attributes of the MallProduct metamodel element
 ****************************************************************************/
	protected double vaUnitPrice;




/****************************************************************************
 *  State storage for the Relationships of the MallProduct metamodel element
 ****************************************************************************/
	protected com.dosmil_e.mall.core.ifc.MallVendorIfc vrVendor; 

	protected com.dosmil_e.mall.core.ifc.MallPurchaseOrderLineIfc[] vrPurchaseOrderLines = new com.dosmil_e.mall.core.ifc.MallPurchaseOrderLineIfc[0]; 






/****************************************************************************
 *  Constructors of the MallProduct metamodel element
 ****************************************************************************/

  public MallProductBase() {
    super();
  }


  public MallProductBase( EAIMMCtxtIfc theCtxt) {
    super( theCtxt);
  }

  public MallProductBase( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theName) {
    super( theCtxt, theName);
  }


/****************************************************************************
 *  Implementation of the MallProductIfc and MallProductPriv interfaces
 ****************************************************************************/

/****************************************************************************
 *  Implementation of attributes of MallProduct
 ****************************************************************************/

 
/****************************************************************************
 *  Implementation of public interface for attribute UnitPrice
 ****************************************************************************/


    /* Public Read accessor for attribute UnitPrice
     */

    /* Public Read accessor for attribute MinMultiplicity
     */
  public double getUnitPrice( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return 0.0;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallProductMeta.vm3AttrUnitPrice == null) { return 0.0;}

    try {
      return (double)
        toDouble(((com.dosmil_e.m3.core.pub.M3AttributePub)
          com.dosmil_e.mall.core.meta.MallProductMeta.vm3AttrUnitPrice).getAttributeValue( theCtxt, this));
    }
    catch( ClassCastException anEx) { return 0.0;}
  }



    /* Public Write accessor for attribute MinMultiplicity
     */
  public void setUnitPrice( EAIMMCtxtIfc theCtxt, double theUnitPrice) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallProductMeta.vm3AttrUnitPrice == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3AttributePub) com.dosmil_e.mall.core.meta.MallProductMeta.vm3AttrUnitPrice).
        setAttributeValue( theCtxt, this, toObject( theUnitPrice));
    }
    catch( ClassCastException anEx) { return;}
  }









/****************************************************************************
 *  Implementation of relationships of MallProduct
 ****************************************************************************/

 

/****************************************************************************
 *  Implementation of public interface for ONE relationship Vendor
 ****************************************************************************/


    /* Public Read accessor for role Vendor
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.mall.core.ifc.MallVendorIfc getVendor( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallProductMeta.vm3RelVendor == null) { return null;}

    try { return (com.dosmil_e.mall.core.ifc.MallVendorIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallProductMeta.vm3RelVendor).
        getRelatedElement( theCtxt, this);
    }
    catch( ClassCastException anEx) { return null;}
  }



    /* Public Vendor number access
     */
  public int numVendor( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return 0;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallProductMeta.vm3RelVendor == null) { return  0;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallProductMeta.vm3RelVendor).
          numRelatedElements( theCtxt, this);
    } catch( ClassCastException anEx) { return 0;}
  }



    /* Public Vendor read accessor by index
     */
  public com.dosmil_e.mall.core.ifc.MallVendorIfc getVendorAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallProductMeta.vm3RelVendor == null) { return null;}

    try { return (com.dosmil_e.mall.core.ifc.MallVendorIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallProductMeta.vm3RelVendor).
        getRelatedElementAt( theCtxt, this, theIndex);
    }
    catch( ClassCastException anEx) { return null;}
  }




    /* Public Vendor finder by name
     */
  public com.dosmil_e.mall.core.ifc.MallVendorIfc findVendorNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallProductMeta.vm3RelVendor == null) { return  null;}

    try {
      return (com.dosmil_e.mall.core.ifc.MallVendorIfc)
        ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallProductMeta.vm3RelVendor).
          findRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return null;}
  }



    /* Public Vendor finder predicate by name
     */
  public boolean hasVendorNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallProductMeta.vm3RelVendor == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallProductMeta.vm3RelVendor).
          hasRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public Vendor is related predicate
     */
  public boolean hasVendor( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallVendorIfc theVendor) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallProductMeta.vm3RelVendor == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallProductMeta.vm3RelVendor).
          hasRelatedElement( theCtxt, this, theVendor);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public Vendor index access
     */
  public int indexOfVendor( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallVendorIfc theVendor) throws EAIException {
    if( theCtxt == null) { return -1;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallProductMeta.vm3RelVendor == null) { return  -1;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallProductMeta.vm3RelVendor).
          indexOfRelatedElement( theCtxt, this, theVendor);
    } catch( ClassCastException anEx) { return -1;}
  }




    /* Public Write accessor for role Vendor
     */
  public void setVendor( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallVendorIfc theVendor) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallProductMeta.vm3RelVendor == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallProductMeta.vm3RelVendor).
        setRelatedElement( theCtxt, this, theVendor);
    } catch( ClassCastException anEx) {}
  }







/****************************************************************************
 *  Implementation of public interface for MANY relationship PurchaseOrderLines
 ****************************************************************************/


    /* Public Read accessor for role PurchaseOrderLines
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.mall.core.ifc.MallPurchaseOrderLineIfc[] getPurchaseOrderLines( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallProductMeta.vm3RelPurchaseOrderLines == null) { return null;}

    try { return (com.dosmil_e.mall.core.ifc.MallPurchaseOrderLineIfc[])
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallProductMeta.vm3RelPurchaseOrderLines).
        getRelatedElements( theCtxt, this);
    }
    catch( ClassCastException anEx) { return null;}
  }





    /* Public PurchaseOrderLines number access
     */
  public int numPurchaseOrderLines( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return 0;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallProductMeta.vm3RelPurchaseOrderLines == null) { return  0;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallProductMeta.vm3RelPurchaseOrderLines).
          numRelatedElements( theCtxt, this);
    } catch( ClassCastException anEx) { return 0;}
  }



    /* Public PurchaseOrderLines read accessor by index
     */
  public com.dosmil_e.mall.core.ifc.MallPurchaseOrderLineIfc getPurchaseOrderLinesAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallProductMeta.vm3RelPurchaseOrderLines == null) { return null;}

    try { return (com.dosmil_e.mall.core.ifc.MallPurchaseOrderLineIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallProductMeta.vm3RelPurchaseOrderLines).
        getRelatedElementAt( theCtxt, this, theIndex);
    }
    catch( ClassCastException anEx) { return null;}
  }




    /* Public PurchaseOrderLines finder by name
     */
  public com.dosmil_e.mall.core.ifc.MallPurchaseOrderLineIfc findPurchaseOrderLinesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallProductMeta.vm3RelPurchaseOrderLines == null) { return  null;}

    try {
      return (com.dosmil_e.mall.core.ifc.MallPurchaseOrderLineIfc)
        ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallProductMeta.vm3RelPurchaseOrderLines).
          findRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return null;}
  }



    /* Public PurchaseOrderLines finder predicate by name
     */
  public boolean hasPurchaseOrderLinesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallProductMeta.vm3RelPurchaseOrderLines == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallProductMeta.vm3RelPurchaseOrderLines).
          hasRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public PurchaseOrderLines is related predicate
     */
  public boolean hasPurchaseOrderLines( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallPurchaseOrderLineIfc thePurchaseOrderLines) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallProductMeta.vm3RelPurchaseOrderLines == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallProductMeta.vm3RelPurchaseOrderLines).
          hasRelatedElement( theCtxt, this, thePurchaseOrderLines);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public PurchaseOrderLines index access
     */
  public int indexOfPurchaseOrderLines( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallPurchaseOrderLineIfc thePurchaseOrderLines) throws EAIException {
    if( theCtxt == null) { return -1;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallProductMeta.vm3RelPurchaseOrderLines == null) { return  -1;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallProductMeta.vm3RelPurchaseOrderLines).
          indexOfRelatedElement( theCtxt, this, thePurchaseOrderLines);
    } catch( ClassCastException anEx) { return -1;}
  }




    /* Public Write accessor for role PurchaseOrderLines
     */
  public void addPurchaseOrderLines( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallPurchaseOrderLineIfc thePurchaseOrderLines) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallProductMeta.vm3RelPurchaseOrderLines == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallProductMeta.vm3RelPurchaseOrderLines).
        addRelatedElement( theCtxt, this, thePurchaseOrderLines);
    } catch( ClassCastException anEx) {}
  }


    /* Public ordered Write accessor for role PurchaseOrderLines
     */
  public void addPurchaseOrderLinesBefore(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.mall.core.ifc.MallPurchaseOrderLineIfc thePurchaseOrderLines,
    com.dosmil_e.mall.core.ifc.MallPurchaseOrderLineIfc theRelativePurchaseOrderLines) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallProductMeta.vm3RelPurchaseOrderLines == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallProductMeta.vm3RelPurchaseOrderLines).
        addRelatedElementBefore( theCtxt, this, thePurchaseOrderLines, theRelativePurchaseOrderLines);
    } catch( ClassCastException anEx) {}
  }



    /* Public reorder accessor for role PurchaseOrderLines
     */
  public void movePurchaseOrderLinesBefore(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.mall.core.ifc.MallPurchaseOrderLineIfc thePurchaseOrderLines,
    com.dosmil_e.mall.core.ifc.MallPurchaseOrderLineIfc theRelativePurchaseOrderLines) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallProductMeta.vm3RelPurchaseOrderLines == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallProductMeta.vm3RelPurchaseOrderLines).
        moveRelatedElementBefore( theCtxt, this, thePurchaseOrderLines, theRelativePurchaseOrderLines);
    } catch( ClassCastException anEx) {}
  }



    /* Public move to last accessor for role PurchaseOrderLines
     */
  public void movePurchaseOrderLinesToLast(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.mall.core.ifc.MallPurchaseOrderLineIfc thePurchaseOrderLines) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallProductMeta.vm3RelPurchaseOrderLines == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallProductMeta.vm3RelPurchaseOrderLines).
        moveRelatedElementToLast( theCtxt, this, thePurchaseOrderLines);
    } catch( ClassCastException anEx) {}
  }





    /* Public Write accessor for role PurchaseOrderLines
     */
  public void removePurchaseOrderLines( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallPurchaseOrderLineIfc thePurchaseOrderLines) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallProductMeta.vm3RelPurchaseOrderLines == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallProductMeta.vm3RelPurchaseOrderLines).
          removeRelatedElement( theCtxt, this, thePurchaseOrderLines);
    } catch( ClassCastException anEx) { return;}
  }








/****************************************************************************
 *  Implementation of destructor of MallProduct
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
      vm3Type = com.dosmil_e.mall.core.meta.MallProductMeta.getStaticM3Type( theCtxt);
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

