package com.dosmil_e.mall.core.base;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import java.lang.reflect.Field;

public  class MallInvoiceBase 
   extends com.dosmil_e.m3.withm3.impl.MMElementWithM3Impl
    implements com.dosmil_e.mall.core.ifc.MallInvoiceIfc   {

/****************************************************************************
 *  Static metainformation for Type of the EAIProject metamodel element
 ****************************************************************************/
  public static com.dosmil_e.m3.core.ifc.M3TypeIfc vm3Type;


/****************************************************************************
 *  State storage for Attributes of the MallInvoice metamodel element
 ****************************************************************************/
	protected double vaAmount;

	protected double vaTaxes;

	protected double vaTotalAmount;




/****************************************************************************
 *  State storage for the Relationships of the MallInvoice metamodel element
 ****************************************************************************/
	protected com.dosmil_e.mall.core.ifc.MallCustomerIfc vrCustomer; 

	protected com.dosmil_e.mall.core.ifc.MallInvoiceLineIfc[] vrInvoiceLines = new com.dosmil_e.mall.core.ifc.MallInvoiceLineIfc[0]; 

	protected com.dosmil_e.mall.core.ifc.MallPurchaseOrderIfc vrPurchaseOrder; 

	protected com.dosmil_e.mall.core.ifc.MallPaymentIfc vrPayment; 

	protected com.dosmil_e.mall.core.ifc.MallShippingIfc vrShipping; 






/****************************************************************************
 *  Constructors of the MallInvoice metamodel element
 ****************************************************************************/

  public MallInvoiceBase() {
    super();
  }


  public MallInvoiceBase( EAIMMCtxtIfc theCtxt) {
    super( theCtxt);
  }

  public MallInvoiceBase( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theName) {
    super( theCtxt, theName);
  }


/****************************************************************************
 *  Implementation of the MallInvoiceIfc and MallInvoicePriv interfaces
 ****************************************************************************/

/****************************************************************************
 *  Implementation of attributes of MallInvoice
 ****************************************************************************/

 
/****************************************************************************
 *  Implementation of public interface for attribute Amount
 ****************************************************************************/


    /* Public Read accessor for attribute Amount
     */

    /* Public Read accessor for attribute MinMultiplicity
     */
  public double getAmount( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return 0.0;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3AttrAmount == null) { return 0.0;}

    try {
      return (double)
        toDouble(((com.dosmil_e.m3.core.pub.M3AttributePub)
          com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3AttrAmount).getAttributeValue( theCtxt, this));
    }
    catch( ClassCastException anEx) { return 0.0;}
  }



    /* Public Write accessor for attribute MinMultiplicity
     */
  public void setAmount( EAIMMCtxtIfc theCtxt, double theAmount) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3AttrAmount == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3AttributePub) com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3AttrAmount).
        setAttributeValue( theCtxt, this, toObject( theAmount));
    }
    catch( ClassCastException anEx) { return;}
  }





/****************************************************************************
 *  Implementation of public interface for attribute Taxes
 ****************************************************************************/


    /* Public Read accessor for attribute Taxes
     */

    /* Public Read accessor for attribute MinMultiplicity
     */
  public double getTaxes( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return 0.0;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3AttrTaxes == null) { return 0.0;}

    try {
      return (double)
        toDouble(((com.dosmil_e.m3.core.pub.M3AttributePub)
          com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3AttrTaxes).getAttributeValue( theCtxt, this));
    }
    catch( ClassCastException anEx) { return 0.0;}
  }



    /* Public Write accessor for attribute MinMultiplicity
     */
  public void setTaxes( EAIMMCtxtIfc theCtxt, double theTaxes) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3AttrTaxes == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3AttributePub) com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3AttrTaxes).
        setAttributeValue( theCtxt, this, toObject( theTaxes));
    }
    catch( ClassCastException anEx) { return;}
  }





/****************************************************************************
 *  Implementation of public interface for attribute TotalAmount
 ****************************************************************************/


    /* Public Read accessor for attribute TotalAmount
     */

    /* Public Read accessor for attribute MinMultiplicity
     */
  public double getTotalAmount( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return 0.0;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3AttrTotalAmount == null) { return 0.0;}

    try {
      return (double)
        toDouble(((com.dosmil_e.m3.core.pub.M3AttributePub)
          com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3AttrTotalAmount).getAttributeValue( theCtxt, this));
    }
    catch( ClassCastException anEx) { return 0.0;}
  }



    /* Public Write accessor for attribute MinMultiplicity
     */
  public void setTotalAmount( EAIMMCtxtIfc theCtxt, double theTotalAmount) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3AttrTotalAmount == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3AttributePub) com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3AttrTotalAmount).
        setAttributeValue( theCtxt, this, toObject( theTotalAmount));
    }
    catch( ClassCastException anEx) { return;}
  }









/****************************************************************************
 *  Implementation of relationships of MallInvoice
 ****************************************************************************/

 

/****************************************************************************
 *  Implementation of public interface for ONE relationship Customer
 ****************************************************************************/


    /* Public Read accessor for role Customer
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.mall.core.ifc.MallCustomerIfc getCustomer( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelCustomer == null) { return null;}

    try { return (com.dosmil_e.mall.core.ifc.MallCustomerIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelCustomer).
        getRelatedElement( theCtxt, this);
    }
    catch( ClassCastException anEx) { return null;}
  }



    /* Public Customer number access
     */
  public int numCustomer( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return 0;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelCustomer == null) { return  0;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelCustomer).
          numRelatedElements( theCtxt, this);
    } catch( ClassCastException anEx) { return 0;}
  }



    /* Public Customer read accessor by index
     */
  public com.dosmil_e.mall.core.ifc.MallCustomerIfc getCustomerAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelCustomer == null) { return null;}

    try { return (com.dosmil_e.mall.core.ifc.MallCustomerIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelCustomer).
        getRelatedElementAt( theCtxt, this, theIndex);
    }
    catch( ClassCastException anEx) { return null;}
  }




    /* Public Customer finder by name
     */
  public com.dosmil_e.mall.core.ifc.MallCustomerIfc findCustomerNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelCustomer == null) { return  null;}

    try {
      return (com.dosmil_e.mall.core.ifc.MallCustomerIfc)
        ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelCustomer).
          findRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return null;}
  }



    /* Public Customer finder predicate by name
     */
  public boolean hasCustomerNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelCustomer == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelCustomer).
          hasRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public Customer is related predicate
     */
  public boolean hasCustomer( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallCustomerIfc theCustomer) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelCustomer == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelCustomer).
          hasRelatedElement( theCtxt, this, theCustomer);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public Customer index access
     */
  public int indexOfCustomer( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallCustomerIfc theCustomer) throws EAIException {
    if( theCtxt == null) { return -1;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelCustomer == null) { return  -1;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelCustomer).
          indexOfRelatedElement( theCtxt, this, theCustomer);
    } catch( ClassCastException anEx) { return -1;}
  }




    /* Public Write accessor for role Customer
     */
  public void setCustomer( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallCustomerIfc theCustomer) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelCustomer == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelCustomer).
        setRelatedElement( theCtxt, this, theCustomer);
    } catch( ClassCastException anEx) {}
  }







/****************************************************************************
 *  Implementation of public interface for MANY relationship InvoiceLines
 ****************************************************************************/


    /* Public Read accessor for role InvoiceLines
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.mall.core.ifc.MallInvoiceLineIfc[] getInvoiceLines( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelInvoiceLines == null) { return null;}

    try { return (com.dosmil_e.mall.core.ifc.MallInvoiceLineIfc[])
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelInvoiceLines).
        getRelatedElements( theCtxt, this);
    }
    catch( ClassCastException anEx) { return null;}
  }





    /* Public InvoiceLines number access
     */
  public int numInvoiceLines( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return 0;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelInvoiceLines == null) { return  0;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelInvoiceLines).
          numRelatedElements( theCtxt, this);
    } catch( ClassCastException anEx) { return 0;}
  }



    /* Public InvoiceLines read accessor by index
     */
  public com.dosmil_e.mall.core.ifc.MallInvoiceLineIfc getInvoiceLinesAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelInvoiceLines == null) { return null;}

    try { return (com.dosmil_e.mall.core.ifc.MallInvoiceLineIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelInvoiceLines).
        getRelatedElementAt( theCtxt, this, theIndex);
    }
    catch( ClassCastException anEx) { return null;}
  }




    /* Public InvoiceLines finder by name
     */
  public com.dosmil_e.mall.core.ifc.MallInvoiceLineIfc findInvoiceLinesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelInvoiceLines == null) { return  null;}

    try {
      return (com.dosmil_e.mall.core.ifc.MallInvoiceLineIfc)
        ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelInvoiceLines).
          findRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return null;}
  }



    /* Public InvoiceLines finder predicate by name
     */
  public boolean hasInvoiceLinesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelInvoiceLines == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelInvoiceLines).
          hasRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public InvoiceLines is related predicate
     */
  public boolean hasInvoiceLines( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallInvoiceLineIfc theInvoiceLines) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelInvoiceLines == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelInvoiceLines).
          hasRelatedElement( theCtxt, this, theInvoiceLines);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public InvoiceLines index access
     */
  public int indexOfInvoiceLines( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallInvoiceLineIfc theInvoiceLines) throws EAIException {
    if( theCtxt == null) { return -1;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelInvoiceLines == null) { return  -1;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelInvoiceLines).
          indexOfRelatedElement( theCtxt, this, theInvoiceLines);
    } catch( ClassCastException anEx) { return -1;}
  }




    /* Public Write accessor for role InvoiceLines
     */
  public void addInvoiceLines( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallInvoiceLineIfc theInvoiceLines) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelInvoiceLines == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelInvoiceLines).
        addRelatedElement( theCtxt, this, theInvoiceLines);
    } catch( ClassCastException anEx) {}
  }


    /* Public ordered Write accessor for role InvoiceLines
     */
  public void addInvoiceLinesBefore(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.mall.core.ifc.MallInvoiceLineIfc theInvoiceLines,
    com.dosmil_e.mall.core.ifc.MallInvoiceLineIfc theRelativeInvoiceLines) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelInvoiceLines == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelInvoiceLines).
        addRelatedElementBefore( theCtxt, this, theInvoiceLines, theRelativeInvoiceLines);
    } catch( ClassCastException anEx) {}
  }



    /* Public reorder accessor for role InvoiceLines
     */
  public void moveInvoiceLinesBefore(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.mall.core.ifc.MallInvoiceLineIfc theInvoiceLines,
    com.dosmil_e.mall.core.ifc.MallInvoiceLineIfc theRelativeInvoiceLines) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelInvoiceLines == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelInvoiceLines).
        moveRelatedElementBefore( theCtxt, this, theInvoiceLines, theRelativeInvoiceLines);
    } catch( ClassCastException anEx) {}
  }



    /* Public move to last accessor for role InvoiceLines
     */
  public void moveInvoiceLinesToLast(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.mall.core.ifc.MallInvoiceLineIfc theInvoiceLines) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelInvoiceLines == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelInvoiceLines).
        moveRelatedElementToLast( theCtxt, this, theInvoiceLines);
    } catch( ClassCastException anEx) {}
  }





    /* Public Write accessor for role InvoiceLines
     */
  public void removeInvoiceLines( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallInvoiceLineIfc theInvoiceLines) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelInvoiceLines == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelInvoiceLines).
          removeRelatedElement( theCtxt, this, theInvoiceLines);
    } catch( ClassCastException anEx) { return;}
  }





/****************************************************************************
 *  Implementation of public interface for ONE relationship PurchaseOrder
 ****************************************************************************/


    /* Public Read accessor for role PurchaseOrder
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.mall.core.ifc.MallPurchaseOrderIfc getPurchaseOrder( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelPurchaseOrder == null) { return null;}

    try { return (com.dosmil_e.mall.core.ifc.MallPurchaseOrderIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelPurchaseOrder).
        getRelatedElement( theCtxt, this);
    }
    catch( ClassCastException anEx) { return null;}
  }



    /* Public PurchaseOrder number access
     */
  public int numPurchaseOrder( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return 0;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelPurchaseOrder == null) { return  0;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelPurchaseOrder).
          numRelatedElements( theCtxt, this);
    } catch( ClassCastException anEx) { return 0;}
  }



    /* Public PurchaseOrder read accessor by index
     */
  public com.dosmil_e.mall.core.ifc.MallPurchaseOrderIfc getPurchaseOrderAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelPurchaseOrder == null) { return null;}

    try { return (com.dosmil_e.mall.core.ifc.MallPurchaseOrderIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelPurchaseOrder).
        getRelatedElementAt( theCtxt, this, theIndex);
    }
    catch( ClassCastException anEx) { return null;}
  }




    /* Public PurchaseOrder finder by name
     */
  public com.dosmil_e.mall.core.ifc.MallPurchaseOrderIfc findPurchaseOrderNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelPurchaseOrder == null) { return  null;}

    try {
      return (com.dosmil_e.mall.core.ifc.MallPurchaseOrderIfc)
        ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelPurchaseOrder).
          findRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return null;}
  }



    /* Public PurchaseOrder finder predicate by name
     */
  public boolean hasPurchaseOrderNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelPurchaseOrder == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelPurchaseOrder).
          hasRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public PurchaseOrder is related predicate
     */
  public boolean hasPurchaseOrder( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallPurchaseOrderIfc thePurchaseOrder) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelPurchaseOrder == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelPurchaseOrder).
          hasRelatedElement( theCtxt, this, thePurchaseOrder);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public PurchaseOrder index access
     */
  public int indexOfPurchaseOrder( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallPurchaseOrderIfc thePurchaseOrder) throws EAIException {
    if( theCtxt == null) { return -1;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelPurchaseOrder == null) { return  -1;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelPurchaseOrder).
          indexOfRelatedElement( theCtxt, this, thePurchaseOrder);
    } catch( ClassCastException anEx) { return -1;}
  }




    /* Public Write accessor for role PurchaseOrder
     */
  public void setPurchaseOrder( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallPurchaseOrderIfc thePurchaseOrder) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelPurchaseOrder == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelPurchaseOrder).
        setRelatedElement( theCtxt, this, thePurchaseOrder);
    } catch( ClassCastException anEx) {}
  }








/****************************************************************************
 *  Implementation of public interface for ONE relationship Payment
 ****************************************************************************/


    /* Public Read accessor for role Payment
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.mall.core.ifc.MallPaymentIfc getPayment( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelPayment == null) { return null;}

    try { return (com.dosmil_e.mall.core.ifc.MallPaymentIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelPayment).
        getRelatedElement( theCtxt, this);
    }
    catch( ClassCastException anEx) { return null;}
  }



    /* Public Payment number access
     */
  public int numPayment( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return 0;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelPayment == null) { return  0;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelPayment).
          numRelatedElements( theCtxt, this);
    } catch( ClassCastException anEx) { return 0;}
  }



    /* Public Payment read accessor by index
     */
  public com.dosmil_e.mall.core.ifc.MallPaymentIfc getPaymentAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelPayment == null) { return null;}

    try { return (com.dosmil_e.mall.core.ifc.MallPaymentIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelPayment).
        getRelatedElementAt( theCtxt, this, theIndex);
    }
    catch( ClassCastException anEx) { return null;}
  }




    /* Public Payment finder by name
     */
  public com.dosmil_e.mall.core.ifc.MallPaymentIfc findPaymentNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelPayment == null) { return  null;}

    try {
      return (com.dosmil_e.mall.core.ifc.MallPaymentIfc)
        ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelPayment).
          findRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return null;}
  }



    /* Public Payment finder predicate by name
     */
  public boolean hasPaymentNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelPayment == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelPayment).
          hasRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public Payment is related predicate
     */
  public boolean hasPayment( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallPaymentIfc thePayment) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelPayment == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelPayment).
          hasRelatedElement( theCtxt, this, thePayment);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public Payment index access
     */
  public int indexOfPayment( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallPaymentIfc thePayment) throws EAIException {
    if( theCtxt == null) { return -1;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelPayment == null) { return  -1;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelPayment).
          indexOfRelatedElement( theCtxt, this, thePayment);
    } catch( ClassCastException anEx) { return -1;}
  }




    /* Public Write accessor for role Payment
     */
  public void setPayment( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallPaymentIfc thePayment) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelPayment == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelPayment).
        setRelatedElement( theCtxt, this, thePayment);
    } catch( ClassCastException anEx) {}
  }









/****************************************************************************
 *  Implementation of public interface for ONE relationship Shipping
 ****************************************************************************/


    /* Public Read accessor for role Shipping
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.mall.core.ifc.MallShippingIfc getShipping( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelShipping == null) { return null;}

    try { return (com.dosmil_e.mall.core.ifc.MallShippingIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelShipping).
        getRelatedElement( theCtxt, this);
    }
    catch( ClassCastException anEx) { return null;}
  }



    /* Public Shipping number access
     */
  public int numShipping( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return 0;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelShipping == null) { return  0;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelShipping).
          numRelatedElements( theCtxt, this);
    } catch( ClassCastException anEx) { return 0;}
  }



    /* Public Shipping read accessor by index
     */
  public com.dosmil_e.mall.core.ifc.MallShippingIfc getShippingAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelShipping == null) { return null;}

    try { return (com.dosmil_e.mall.core.ifc.MallShippingIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelShipping).
        getRelatedElementAt( theCtxt, this, theIndex);
    }
    catch( ClassCastException anEx) { return null;}
  }




    /* Public Shipping finder by name
     */
  public com.dosmil_e.mall.core.ifc.MallShippingIfc findShippingNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelShipping == null) { return  null;}

    try {
      return (com.dosmil_e.mall.core.ifc.MallShippingIfc)
        ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelShipping).
          findRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return null;}
  }



    /* Public Shipping finder predicate by name
     */
  public boolean hasShippingNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelShipping == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelShipping).
          hasRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public Shipping is related predicate
     */
  public boolean hasShipping( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallShippingIfc theShipping) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelShipping == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelShipping).
          hasRelatedElement( theCtxt, this, theShipping);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public Shipping index access
     */
  public int indexOfShipping( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallShippingIfc theShipping) throws EAIException {
    if( theCtxt == null) { return -1;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelShipping == null) { return  -1;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelShipping).
          indexOfRelatedElement( theCtxt, this, theShipping);
    } catch( ClassCastException anEx) { return -1;}
  }




    /* Public Write accessor for role Shipping
     */
  public void setShipping( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallShippingIfc theShipping) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelShipping == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3RelShipping).
        setRelatedElement( theCtxt, this, theShipping);
    } catch( ClassCastException anEx) {}
  }












/****************************************************************************
 *  Implementation of destructor of MallInvoice
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
      vm3Type = com.dosmil_e.mall.core.meta.MallInvoiceMeta.getStaticM3Type( theCtxt);
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

