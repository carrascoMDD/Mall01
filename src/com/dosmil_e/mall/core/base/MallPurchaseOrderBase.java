package com.dosmil_e.mall.core.base;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import java.lang.reflect.Field;

public  class MallPurchaseOrderBase 
   extends com.dosmil_e.m3.withm3.impl.MMElementWithM3Impl
    implements com.dosmil_e.mall.core.ifc.MallPurchaseOrderIfc   {

/****************************************************************************
 *  Static metainformation for Type of the EAIProject metamodel element
 ****************************************************************************/
  public static com.dosmil_e.m3.core.ifc.M3TypeIfc vm3Type;


/****************************************************************************
 *  State storage for Attributes of the MallPurchaseOrder metamodel element
 ****************************************************************************/



/****************************************************************************
 *  State storage for the Relationships of the MallPurchaseOrder metamodel element
 ****************************************************************************/
	protected com.dosmil_e.mall.core.ifc.MallPurchaseOrderLineIfc[] vrPurchaseOrderLines = new com.dosmil_e.mall.core.ifc.MallPurchaseOrderLineIfc[0]; 

	protected com.dosmil_e.mall.core.ifc.MallCustomerIfc vrCustomer; 

	protected com.dosmil_e.mall.core.ifc.MallInvoiceIfc[] vrInvoices = new com.dosmil_e.mall.core.ifc.MallInvoiceIfc[0]; 






/****************************************************************************
 *  Constructors of the MallPurchaseOrder metamodel element
 ****************************************************************************/

  public MallPurchaseOrderBase() {
    super();
  }


  public MallPurchaseOrderBase( EAIMMCtxtIfc theCtxt) {
    super( theCtxt);
  }

  public MallPurchaseOrderBase( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theName) {
    super( theCtxt, theName);
  }


/****************************************************************************
 *  Implementation of the MallPurchaseOrderIfc and MallPurchaseOrderPriv interfaces
 ****************************************************************************/

/****************************************************************************
 *  Implementation of attributes of MallPurchaseOrder
 ****************************************************************************/

 




/****************************************************************************
 *  Implementation of relationships of MallPurchaseOrder
 ****************************************************************************/

 
/****************************************************************************
 *  Implementation of public interface for MANY relationship PurchaseOrderLines
 ****************************************************************************/


    /* Public Read accessor for role PurchaseOrderLines
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.mall.core.ifc.MallPurchaseOrderLineIfc[] getPurchaseOrderLines( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.vm3RelPurchaseOrderLines == null) { return null;}

    try { return (com.dosmil_e.mall.core.ifc.MallPurchaseOrderLineIfc[])
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.vm3RelPurchaseOrderLines).
        getRelatedElements( theCtxt, this);
    }
    catch( ClassCastException anEx) { return null;}
  }





    /* Public PurchaseOrderLines number access
     */
  public int numPurchaseOrderLines( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return 0;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.vm3RelPurchaseOrderLines == null) { return  0;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.vm3RelPurchaseOrderLines).
          numRelatedElements( theCtxt, this);
    } catch( ClassCastException anEx) { return 0;}
  }



    /* Public PurchaseOrderLines read accessor by index
     */
  public com.dosmil_e.mall.core.ifc.MallPurchaseOrderLineIfc getPurchaseOrderLinesAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.vm3RelPurchaseOrderLines == null) { return null;}

    try { return (com.dosmil_e.mall.core.ifc.MallPurchaseOrderLineIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.vm3RelPurchaseOrderLines).
        getRelatedElementAt( theCtxt, this, theIndex);
    }
    catch( ClassCastException anEx) { return null;}
  }




    /* Public PurchaseOrderLines finder by name
     */
  public com.dosmil_e.mall.core.ifc.MallPurchaseOrderLineIfc findPurchaseOrderLinesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.vm3RelPurchaseOrderLines == null) { return  null;}

    try {
      return (com.dosmil_e.mall.core.ifc.MallPurchaseOrderLineIfc)
        ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.vm3RelPurchaseOrderLines).
          findRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return null;}
  }



    /* Public PurchaseOrderLines finder predicate by name
     */
  public boolean hasPurchaseOrderLinesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.vm3RelPurchaseOrderLines == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.vm3RelPurchaseOrderLines).
          hasRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public PurchaseOrderLines is related predicate
     */
  public boolean hasPurchaseOrderLines( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallPurchaseOrderLineIfc thePurchaseOrderLines) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.vm3RelPurchaseOrderLines == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.vm3RelPurchaseOrderLines).
          hasRelatedElement( theCtxt, this, thePurchaseOrderLines);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public PurchaseOrderLines index access
     */
  public int indexOfPurchaseOrderLines( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallPurchaseOrderLineIfc thePurchaseOrderLines) throws EAIException {
    if( theCtxt == null) { return -1;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.vm3RelPurchaseOrderLines == null) { return  -1;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.vm3RelPurchaseOrderLines).
          indexOfRelatedElement( theCtxt, this, thePurchaseOrderLines);
    } catch( ClassCastException anEx) { return -1;}
  }




    /* Public Write accessor for role PurchaseOrderLines
     */
  public void addPurchaseOrderLines( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallPurchaseOrderLineIfc thePurchaseOrderLines) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.vm3RelPurchaseOrderLines == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.vm3RelPurchaseOrderLines).
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
    if( com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.vm3RelPurchaseOrderLines == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.vm3RelPurchaseOrderLines).
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
    if( com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.vm3RelPurchaseOrderLines == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.vm3RelPurchaseOrderLines).
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
    if( com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.vm3RelPurchaseOrderLines == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.vm3RelPurchaseOrderLines).
        moveRelatedElementToLast( theCtxt, this, thePurchaseOrderLines);
    } catch( ClassCastException anEx) {}
  }





    /* Public Write accessor for role PurchaseOrderLines
     */
  public void removePurchaseOrderLines( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallPurchaseOrderLineIfc thePurchaseOrderLines) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.vm3RelPurchaseOrderLines == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.vm3RelPurchaseOrderLines).
          removeRelatedElement( theCtxt, this, thePurchaseOrderLines);
    } catch( ClassCastException anEx) { return;}
  }





/****************************************************************************
 *  Implementation of public interface for ONE relationship Customer
 ****************************************************************************/


    /* Public Read accessor for role Customer
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.mall.core.ifc.MallCustomerIfc getCustomer( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.vm3RelCustomer == null) { return null;}

    try { return (com.dosmil_e.mall.core.ifc.MallCustomerIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.vm3RelCustomer).
        getRelatedElement( theCtxt, this);
    }
    catch( ClassCastException anEx) { return null;}
  }



    /* Public Customer number access
     */
  public int numCustomer( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return 0;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.vm3RelCustomer == null) { return  0;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.vm3RelCustomer).
          numRelatedElements( theCtxt, this);
    } catch( ClassCastException anEx) { return 0;}
  }



    /* Public Customer read accessor by index
     */
  public com.dosmil_e.mall.core.ifc.MallCustomerIfc getCustomerAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.vm3RelCustomer == null) { return null;}

    try { return (com.dosmil_e.mall.core.ifc.MallCustomerIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.vm3RelCustomer).
        getRelatedElementAt( theCtxt, this, theIndex);
    }
    catch( ClassCastException anEx) { return null;}
  }




    /* Public Customer finder by name
     */
  public com.dosmil_e.mall.core.ifc.MallCustomerIfc findCustomerNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.vm3RelCustomer == null) { return  null;}

    try {
      return (com.dosmil_e.mall.core.ifc.MallCustomerIfc)
        ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.vm3RelCustomer).
          findRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return null;}
  }



    /* Public Customer finder predicate by name
     */
  public boolean hasCustomerNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.vm3RelCustomer == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.vm3RelCustomer).
          hasRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public Customer is related predicate
     */
  public boolean hasCustomer( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallCustomerIfc theCustomer) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.vm3RelCustomer == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.vm3RelCustomer).
          hasRelatedElement( theCtxt, this, theCustomer);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public Customer index access
     */
  public int indexOfCustomer( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallCustomerIfc theCustomer) throws EAIException {
    if( theCtxt == null) { return -1;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.vm3RelCustomer == null) { return  -1;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.vm3RelCustomer).
          indexOfRelatedElement( theCtxt, this, theCustomer);
    } catch( ClassCastException anEx) { return -1;}
  }




    /* Public Write accessor for role Customer
     */
  public void setCustomer( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallCustomerIfc theCustomer) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.vm3RelCustomer == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.vm3RelCustomer).
        setRelatedElement( theCtxt, this, theCustomer);
    } catch( ClassCastException anEx) {}
  }







/****************************************************************************
 *  Implementation of public interface for MANY relationship Invoices
 ****************************************************************************/


    /* Public Read accessor for role Invoices
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.mall.core.ifc.MallInvoiceIfc[] getInvoices( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.vm3RelInvoices == null) { return null;}

    try { return (com.dosmil_e.mall.core.ifc.MallInvoiceIfc[])
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.vm3RelInvoices).
        getRelatedElements( theCtxt, this);
    }
    catch( ClassCastException anEx) { return null;}
  }





    /* Public Invoices number access
     */
  public int numInvoices( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return 0;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.vm3RelInvoices == null) { return  0;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.vm3RelInvoices).
          numRelatedElements( theCtxt, this);
    } catch( ClassCastException anEx) { return 0;}
  }



    /* Public Invoices read accessor by index
     */
  public com.dosmil_e.mall.core.ifc.MallInvoiceIfc getInvoicesAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.vm3RelInvoices == null) { return null;}

    try { return (com.dosmil_e.mall.core.ifc.MallInvoiceIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.vm3RelInvoices).
        getRelatedElementAt( theCtxt, this, theIndex);
    }
    catch( ClassCastException anEx) { return null;}
  }




    /* Public Invoices finder by name
     */
  public com.dosmil_e.mall.core.ifc.MallInvoiceIfc findInvoicesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.vm3RelInvoices == null) { return  null;}

    try {
      return (com.dosmil_e.mall.core.ifc.MallInvoiceIfc)
        ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.vm3RelInvoices).
          findRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return null;}
  }



    /* Public Invoices finder predicate by name
     */
  public boolean hasInvoicesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.vm3RelInvoices == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.vm3RelInvoices).
          hasRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public Invoices is related predicate
     */
  public boolean hasInvoices( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallInvoiceIfc theInvoices) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.vm3RelInvoices == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.vm3RelInvoices).
          hasRelatedElement( theCtxt, this, theInvoices);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public Invoices index access
     */
  public int indexOfInvoices( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallInvoiceIfc theInvoices) throws EAIException {
    if( theCtxt == null) { return -1;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.vm3RelInvoices == null) { return  -1;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.vm3RelInvoices).
          indexOfRelatedElement( theCtxt, this, theInvoices);
    } catch( ClassCastException anEx) { return -1;}
  }




    /* Public Write accessor for role Invoices
     */
  public void addInvoices( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallInvoiceIfc theInvoices) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.vm3RelInvoices == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.vm3RelInvoices).
        addRelatedElement( theCtxt, this, theInvoices);
    } catch( ClassCastException anEx) {}
  }


    /* Public ordered Write accessor for role Invoices
     */
  public void addInvoicesBefore(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.mall.core.ifc.MallInvoiceIfc theInvoices,
    com.dosmil_e.mall.core.ifc.MallInvoiceIfc theRelativeInvoices) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.vm3RelInvoices == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.vm3RelInvoices).
        addRelatedElementBefore( theCtxt, this, theInvoices, theRelativeInvoices);
    } catch( ClassCastException anEx) {}
  }



    /* Public reorder accessor for role Invoices
     */
  public void moveInvoicesBefore(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.mall.core.ifc.MallInvoiceIfc theInvoices,
    com.dosmil_e.mall.core.ifc.MallInvoiceIfc theRelativeInvoices) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.vm3RelInvoices == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.vm3RelInvoices).
        moveRelatedElementBefore( theCtxt, this, theInvoices, theRelativeInvoices);
    } catch( ClassCastException anEx) {}
  }



    /* Public move to last accessor for role Invoices
     */
  public void moveInvoicesToLast(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.mall.core.ifc.MallInvoiceIfc theInvoices) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.vm3RelInvoices == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.vm3RelInvoices).
        moveRelatedElementToLast( theCtxt, this, theInvoices);
    } catch( ClassCastException anEx) {}
  }





    /* Public Write accessor for role Invoices
     */
  public void removeInvoices( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallInvoiceIfc theInvoices) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.vm3RelInvoices == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.vm3RelInvoices).
          removeRelatedElement( theCtxt, this, theInvoices);
    } catch( ClassCastException anEx) { return;}
  }








/****************************************************************************
 *  Implementation of destructor of MallPurchaseOrder
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
      vm3Type = com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.getStaticM3Type( theCtxt);
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

