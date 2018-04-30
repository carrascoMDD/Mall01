package com.dosmil_e.mall.core.base;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import java.lang.reflect.Field;

public  class MallCustomerBase 
   extends com.dosmil_e.m3.withm3.impl.MMElementWithM3Impl
    implements com.dosmil_e.mall.core.ifc.MallCustomerIfc   {

/****************************************************************************
 *  Static metainformation for Type of the EAIProject metamodel element
 ****************************************************************************/
  public static com.dosmil_e.m3.core.ifc.M3TypeIfc vm3Type;


/****************************************************************************
 *  State storage for Attributes of the MallCustomer metamodel element
 ****************************************************************************/



/****************************************************************************
 *  State storage for the Relationships of the MallCustomer metamodel element
 ****************************************************************************/
	protected com.dosmil_e.mall.core.ifc.MallVendorIfc vrVendor; 

	protected com.dosmil_e.mall.core.ifc.MallPurchaseOrderIfc[] vrPurchaseOrders = new com.dosmil_e.mall.core.ifc.MallPurchaseOrderIfc[0]; 

	protected com.dosmil_e.mall.core.ifc.MallPartyIfc vrParty; 

	protected com.dosmil_e.mall.core.ifc.MallInvoiceIfc[] vrInvoices = new com.dosmil_e.mall.core.ifc.MallInvoiceIfc[0]; 






/****************************************************************************
 *  Constructors of the MallCustomer metamodel element
 ****************************************************************************/

  public MallCustomerBase() {
    super();
  }


  public MallCustomerBase( EAIMMCtxtIfc theCtxt) {
    super( theCtxt);
  }

  public MallCustomerBase( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theName) {
    super( theCtxt, theName);
  }


/****************************************************************************
 *  Implementation of the MallCustomerIfc and MallCustomerPriv interfaces
 ****************************************************************************/

/****************************************************************************
 *  Implementation of attributes of MallCustomer
 ****************************************************************************/

 




/****************************************************************************
 *  Implementation of relationships of MallCustomer
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
    if( com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelVendor == null) { return null;}

    try { return (com.dosmil_e.mall.core.ifc.MallVendorIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelVendor).
        getRelatedElement( theCtxt, this);
    }
    catch( ClassCastException anEx) { return null;}
  }



    /* Public Vendor number access
     */
  public int numVendor( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return 0;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelVendor == null) { return  0;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelVendor).
          numRelatedElements( theCtxt, this);
    } catch( ClassCastException anEx) { return 0;}
  }



    /* Public Vendor read accessor by index
     */
  public com.dosmil_e.mall.core.ifc.MallVendorIfc getVendorAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelVendor == null) { return null;}

    try { return (com.dosmil_e.mall.core.ifc.MallVendorIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelVendor).
        getRelatedElementAt( theCtxt, this, theIndex);
    }
    catch( ClassCastException anEx) { return null;}
  }




    /* Public Vendor finder by name
     */
  public com.dosmil_e.mall.core.ifc.MallVendorIfc findVendorNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelVendor == null) { return  null;}

    try {
      return (com.dosmil_e.mall.core.ifc.MallVendorIfc)
        ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelVendor).
          findRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return null;}
  }



    /* Public Vendor finder predicate by name
     */
  public boolean hasVendorNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelVendor == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelVendor).
          hasRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public Vendor is related predicate
     */
  public boolean hasVendor( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallVendorIfc theVendor) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelVendor == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelVendor).
          hasRelatedElement( theCtxt, this, theVendor);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public Vendor index access
     */
  public int indexOfVendor( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallVendorIfc theVendor) throws EAIException {
    if( theCtxt == null) { return -1;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelVendor == null) { return  -1;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelVendor).
          indexOfRelatedElement( theCtxt, this, theVendor);
    } catch( ClassCastException anEx) { return -1;}
  }




    /* Public Write accessor for role Vendor
     */
  public void setVendor( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallVendorIfc theVendor) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelVendor == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelVendor).
        setRelatedElement( theCtxt, this, theVendor);
    } catch( ClassCastException anEx) {}
  }







/****************************************************************************
 *  Implementation of public interface for MANY relationship PurchaseOrders
 ****************************************************************************/


    /* Public Read accessor for role PurchaseOrders
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.mall.core.ifc.MallPurchaseOrderIfc[] getPurchaseOrders( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelPurchaseOrders == null) { return null;}

    try { return (com.dosmil_e.mall.core.ifc.MallPurchaseOrderIfc[])
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelPurchaseOrders).
        getRelatedElements( theCtxt, this);
    }
    catch( ClassCastException anEx) { return null;}
  }





    /* Public PurchaseOrders number access
     */
  public int numPurchaseOrders( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return 0;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelPurchaseOrders == null) { return  0;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelPurchaseOrders).
          numRelatedElements( theCtxt, this);
    } catch( ClassCastException anEx) { return 0;}
  }



    /* Public PurchaseOrders read accessor by index
     */
  public com.dosmil_e.mall.core.ifc.MallPurchaseOrderIfc getPurchaseOrdersAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelPurchaseOrders == null) { return null;}

    try { return (com.dosmil_e.mall.core.ifc.MallPurchaseOrderIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelPurchaseOrders).
        getRelatedElementAt( theCtxt, this, theIndex);
    }
    catch( ClassCastException anEx) { return null;}
  }




    /* Public PurchaseOrders finder by name
     */
  public com.dosmil_e.mall.core.ifc.MallPurchaseOrderIfc findPurchaseOrdersNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelPurchaseOrders == null) { return  null;}

    try {
      return (com.dosmil_e.mall.core.ifc.MallPurchaseOrderIfc)
        ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelPurchaseOrders).
          findRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return null;}
  }



    /* Public PurchaseOrders finder predicate by name
     */
  public boolean hasPurchaseOrdersNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelPurchaseOrders == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelPurchaseOrders).
          hasRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public PurchaseOrders is related predicate
     */
  public boolean hasPurchaseOrders( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallPurchaseOrderIfc thePurchaseOrders) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelPurchaseOrders == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelPurchaseOrders).
          hasRelatedElement( theCtxt, this, thePurchaseOrders);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public PurchaseOrders index access
     */
  public int indexOfPurchaseOrders( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallPurchaseOrderIfc thePurchaseOrders) throws EAIException {
    if( theCtxt == null) { return -1;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelPurchaseOrders == null) { return  -1;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelPurchaseOrders).
          indexOfRelatedElement( theCtxt, this, thePurchaseOrders);
    } catch( ClassCastException anEx) { return -1;}
  }




    /* Public Write accessor for role PurchaseOrders
     */
  public void addPurchaseOrders( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallPurchaseOrderIfc thePurchaseOrders) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelPurchaseOrders == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelPurchaseOrders).
        addRelatedElement( theCtxt, this, thePurchaseOrders);
    } catch( ClassCastException anEx) {}
  }


    /* Public ordered Write accessor for role PurchaseOrders
     */
  public void addPurchaseOrdersBefore(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.mall.core.ifc.MallPurchaseOrderIfc thePurchaseOrders,
    com.dosmil_e.mall.core.ifc.MallPurchaseOrderIfc theRelativePurchaseOrders) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelPurchaseOrders == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelPurchaseOrders).
        addRelatedElementBefore( theCtxt, this, thePurchaseOrders, theRelativePurchaseOrders);
    } catch( ClassCastException anEx) {}
  }



    /* Public reorder accessor for role PurchaseOrders
     */
  public void movePurchaseOrdersBefore(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.mall.core.ifc.MallPurchaseOrderIfc thePurchaseOrders,
    com.dosmil_e.mall.core.ifc.MallPurchaseOrderIfc theRelativePurchaseOrders) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelPurchaseOrders == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelPurchaseOrders).
        moveRelatedElementBefore( theCtxt, this, thePurchaseOrders, theRelativePurchaseOrders);
    } catch( ClassCastException anEx) {}
  }



    /* Public move to last accessor for role PurchaseOrders
     */
  public void movePurchaseOrdersToLast(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.mall.core.ifc.MallPurchaseOrderIfc thePurchaseOrders) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelPurchaseOrders == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelPurchaseOrders).
        moveRelatedElementToLast( theCtxt, this, thePurchaseOrders);
    } catch( ClassCastException anEx) {}
  }





    /* Public Write accessor for role PurchaseOrders
     */
  public void removePurchaseOrders( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallPurchaseOrderIfc thePurchaseOrders) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelPurchaseOrders == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelPurchaseOrders).
          removeRelatedElement( theCtxt, this, thePurchaseOrders);
    } catch( ClassCastException anEx) { return;}
  }





/****************************************************************************
 *  Implementation of public interface for ONE relationship Party
 ****************************************************************************/


    /* Public Read accessor for role Party
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.mall.core.ifc.MallPartyIfc getParty( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelParty == null) { return null;}

    try { return (com.dosmil_e.mall.core.ifc.MallPartyIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelParty).
        getRelatedElement( theCtxt, this);
    }
    catch( ClassCastException anEx) { return null;}
  }



    /* Public Party number access
     */
  public int numParty( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return 0;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelParty == null) { return  0;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelParty).
          numRelatedElements( theCtxt, this);
    } catch( ClassCastException anEx) { return 0;}
  }



    /* Public Party read accessor by index
     */
  public com.dosmil_e.mall.core.ifc.MallPartyIfc getPartyAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelParty == null) { return null;}

    try { return (com.dosmil_e.mall.core.ifc.MallPartyIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelParty).
        getRelatedElementAt( theCtxt, this, theIndex);
    }
    catch( ClassCastException anEx) { return null;}
  }




    /* Public Party finder by name
     */
  public com.dosmil_e.mall.core.ifc.MallPartyIfc findPartyNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelParty == null) { return  null;}

    try {
      return (com.dosmil_e.mall.core.ifc.MallPartyIfc)
        ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelParty).
          findRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return null;}
  }



    /* Public Party finder predicate by name
     */
  public boolean hasPartyNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelParty == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelParty).
          hasRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public Party is related predicate
     */
  public boolean hasParty( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallPartyIfc theParty) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelParty == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelParty).
          hasRelatedElement( theCtxt, this, theParty);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public Party index access
     */
  public int indexOfParty( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallPartyIfc theParty) throws EAIException {
    if( theCtxt == null) { return -1;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelParty == null) { return  -1;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelParty).
          indexOfRelatedElement( theCtxt, this, theParty);
    } catch( ClassCastException anEx) { return -1;}
  }




    /* Public Write accessor for role Party
     */
  public void setParty( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallPartyIfc theParty) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelParty == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelParty).
        setRelatedElement( theCtxt, this, theParty);
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
    if( com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelInvoices == null) { return null;}

    try { return (com.dosmil_e.mall.core.ifc.MallInvoiceIfc[])
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelInvoices).
        getRelatedElements( theCtxt, this);
    }
    catch( ClassCastException anEx) { return null;}
  }





    /* Public Invoices number access
     */
  public int numInvoices( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return 0;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelInvoices == null) { return  0;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelInvoices).
          numRelatedElements( theCtxt, this);
    } catch( ClassCastException anEx) { return 0;}
  }



    /* Public Invoices read accessor by index
     */
  public com.dosmil_e.mall.core.ifc.MallInvoiceIfc getInvoicesAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelInvoices == null) { return null;}

    try { return (com.dosmil_e.mall.core.ifc.MallInvoiceIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelInvoices).
        getRelatedElementAt( theCtxt, this, theIndex);
    }
    catch( ClassCastException anEx) { return null;}
  }




    /* Public Invoices finder by name
     */
  public com.dosmil_e.mall.core.ifc.MallInvoiceIfc findInvoicesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelInvoices == null) { return  null;}

    try {
      return (com.dosmil_e.mall.core.ifc.MallInvoiceIfc)
        ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelInvoices).
          findRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return null;}
  }



    /* Public Invoices finder predicate by name
     */
  public boolean hasInvoicesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelInvoices == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelInvoices).
          hasRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public Invoices is related predicate
     */
  public boolean hasInvoices( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallInvoiceIfc theInvoices) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelInvoices == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelInvoices).
          hasRelatedElement( theCtxt, this, theInvoices);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public Invoices index access
     */
  public int indexOfInvoices( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallInvoiceIfc theInvoices) throws EAIException {
    if( theCtxt == null) { return -1;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelInvoices == null) { return  -1;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelInvoices).
          indexOfRelatedElement( theCtxt, this, theInvoices);
    } catch( ClassCastException anEx) { return -1;}
  }




    /* Public Write accessor for role Invoices
     */
  public void addInvoices( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallInvoiceIfc theInvoices) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelInvoices == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelInvoices).
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
    if( com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelInvoices == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelInvoices).
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
    if( com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelInvoices == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelInvoices).
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
    if( com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelInvoices == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelInvoices).
        moveRelatedElementToLast( theCtxt, this, theInvoices);
    } catch( ClassCastException anEx) {}
  }





    /* Public Write accessor for role Invoices
     */
  public void removeInvoices( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallInvoiceIfc theInvoices) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelInvoices == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3RelInvoices).
          removeRelatedElement( theCtxt, this, theInvoices);
    } catch( ClassCastException anEx) { return;}
  }








/****************************************************************************
 *  Implementation of destructor of MallCustomer
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
      vm3Type = com.dosmil_e.mall.core.meta.MallCustomerMeta.getStaticM3Type( theCtxt);
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

