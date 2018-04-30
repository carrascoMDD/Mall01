package com.dosmil_e.mall.core.base;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import java.lang.reflect.Field;

public  class MallPurchaseOrderLineBase 
   extends com.dosmil_e.m3.withm3.impl.MMElementWithM3Impl
    implements com.dosmil_e.mall.core.ifc.MallPurchaseOrderLineIfc   {

/****************************************************************************
 *  Static metainformation for Type of the EAIProject metamodel element
 ****************************************************************************/
  public static com.dosmil_e.m3.core.ifc.M3TypeIfc vm3Type;


/****************************************************************************
 *  State storage for Attributes of the MallPurchaseOrderLine metamodel element
 ****************************************************************************/
	protected double vaQuantity;

	protected double vaUnitPrice;

	protected double vaAmount;




/****************************************************************************
 *  State storage for the Relationships of the MallPurchaseOrderLine metamodel element
 ****************************************************************************/
	protected com.dosmil_e.mall.core.ifc.MallPurchaseOrderIfc vrPurchaseOrder; 

	protected com.dosmil_e.mall.core.ifc.MallProductIfc vrProduct; 

	protected com.dosmil_e.mall.core.ifc.MallInvoiceLineIfc vrInvoiceLine; 






/****************************************************************************
 *  Constructors of the MallPurchaseOrderLine metamodel element
 ****************************************************************************/

  public MallPurchaseOrderLineBase() {
    super();
  }


  public MallPurchaseOrderLineBase( EAIMMCtxtIfc theCtxt) {
    super( theCtxt);
  }

  public MallPurchaseOrderLineBase( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theName) {
    super( theCtxt, theName);
  }


/****************************************************************************
 *  Implementation of the MallPurchaseOrderLineIfc and MallPurchaseOrderLinePriv interfaces
 ****************************************************************************/

/****************************************************************************
 *  Implementation of attributes of MallPurchaseOrderLine
 ****************************************************************************/

 
/****************************************************************************
 *  Implementation of public interface for attribute Quantity
 ****************************************************************************/


    /* Public Read accessor for attribute Quantity
     */

    /* Public Read accessor for attribute MinMultiplicity
     */
  public double getQuantity( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return 0.0;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPurchaseOrderLineMeta.vm3AttrQuantity == null) { return 0.0;}

    try {
      return (double)
        toDouble(((com.dosmil_e.m3.core.pub.M3AttributePub)
          com.dosmil_e.mall.core.meta.MallPurchaseOrderLineMeta.vm3AttrQuantity).getAttributeValue( theCtxt, this));
    }
    catch( ClassCastException anEx) { return 0.0;}
  }



    /* Public Write accessor for attribute MinMultiplicity
     */
  public void setQuantity( EAIMMCtxtIfc theCtxt, double theQuantity) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPurchaseOrderLineMeta.vm3AttrQuantity == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3AttributePub) com.dosmil_e.mall.core.meta.MallPurchaseOrderLineMeta.vm3AttrQuantity).
        setAttributeValue( theCtxt, this, toObject( theQuantity));
    }
    catch( ClassCastException anEx) { return;}
  }





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
    if( com.dosmil_e.mall.core.meta.MallPurchaseOrderLineMeta.vm3AttrUnitPrice == null) { return 0.0;}

    try {
      return (double)
        toDouble(((com.dosmil_e.m3.core.pub.M3AttributePub)
          com.dosmil_e.mall.core.meta.MallPurchaseOrderLineMeta.vm3AttrUnitPrice).getAttributeValue( theCtxt, this));
    }
    catch( ClassCastException anEx) { return 0.0;}
  }



    /* Public Write accessor for attribute MinMultiplicity
     */
  public void setUnitPrice( EAIMMCtxtIfc theCtxt, double theUnitPrice) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPurchaseOrderLineMeta.vm3AttrUnitPrice == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3AttributePub) com.dosmil_e.mall.core.meta.MallPurchaseOrderLineMeta.vm3AttrUnitPrice).
        setAttributeValue( theCtxt, this, toObject( theUnitPrice));
    }
    catch( ClassCastException anEx) { return;}
  }





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
    if( com.dosmil_e.mall.core.meta.MallPurchaseOrderLineMeta.vm3AttrAmount == null) { return 0.0;}

    try {
      return (double)
        toDouble(((com.dosmil_e.m3.core.pub.M3AttributePub)
          com.dosmil_e.mall.core.meta.MallPurchaseOrderLineMeta.vm3AttrAmount).getAttributeValue( theCtxt, this));
    }
    catch( ClassCastException anEx) { return 0.0;}
  }



    /* Public Write accessor for attribute MinMultiplicity
     */
  public void setAmount( EAIMMCtxtIfc theCtxt, double theAmount) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPurchaseOrderLineMeta.vm3AttrAmount == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3AttributePub) com.dosmil_e.mall.core.meta.MallPurchaseOrderLineMeta.vm3AttrAmount).
        setAttributeValue( theCtxt, this, toObject( theAmount));
    }
    catch( ClassCastException anEx) { return;}
  }









/****************************************************************************
 *  Implementation of relationships of MallPurchaseOrderLine
 ****************************************************************************/

 

/****************************************************************************
 *  Implementation of public interface for ONE relationship PurchaseOrder
 ****************************************************************************/


    /* Public Read accessor for role PurchaseOrder
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.mall.core.ifc.MallPurchaseOrderIfc getPurchaseOrder( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPurchaseOrderLineMeta.vm3RelPurchaseOrder == null) { return null;}

    try { return (com.dosmil_e.mall.core.ifc.MallPurchaseOrderIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPurchaseOrderLineMeta.vm3RelPurchaseOrder).
        getRelatedElement( theCtxt, this);
    }
    catch( ClassCastException anEx) { return null;}
  }



    /* Public PurchaseOrder number access
     */
  public int numPurchaseOrder( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return 0;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPurchaseOrderLineMeta.vm3RelPurchaseOrder == null) { return  0;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPurchaseOrderLineMeta.vm3RelPurchaseOrder).
          numRelatedElements( theCtxt, this);
    } catch( ClassCastException anEx) { return 0;}
  }



    /* Public PurchaseOrder read accessor by index
     */
  public com.dosmil_e.mall.core.ifc.MallPurchaseOrderIfc getPurchaseOrderAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPurchaseOrderLineMeta.vm3RelPurchaseOrder == null) { return null;}

    try { return (com.dosmil_e.mall.core.ifc.MallPurchaseOrderIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPurchaseOrderLineMeta.vm3RelPurchaseOrder).
        getRelatedElementAt( theCtxt, this, theIndex);
    }
    catch( ClassCastException anEx) { return null;}
  }




    /* Public PurchaseOrder finder by name
     */
  public com.dosmil_e.mall.core.ifc.MallPurchaseOrderIfc findPurchaseOrderNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPurchaseOrderLineMeta.vm3RelPurchaseOrder == null) { return  null;}

    try {
      return (com.dosmil_e.mall.core.ifc.MallPurchaseOrderIfc)
        ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPurchaseOrderLineMeta.vm3RelPurchaseOrder).
          findRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return null;}
  }



    /* Public PurchaseOrder finder predicate by name
     */
  public boolean hasPurchaseOrderNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPurchaseOrderLineMeta.vm3RelPurchaseOrder == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPurchaseOrderLineMeta.vm3RelPurchaseOrder).
          hasRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public PurchaseOrder is related predicate
     */
  public boolean hasPurchaseOrder( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallPurchaseOrderIfc thePurchaseOrder) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPurchaseOrderLineMeta.vm3RelPurchaseOrder == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPurchaseOrderLineMeta.vm3RelPurchaseOrder).
          hasRelatedElement( theCtxt, this, thePurchaseOrder);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public PurchaseOrder index access
     */
  public int indexOfPurchaseOrder( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallPurchaseOrderIfc thePurchaseOrder) throws EAIException {
    if( theCtxt == null) { return -1;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPurchaseOrderLineMeta.vm3RelPurchaseOrder == null) { return  -1;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPurchaseOrderLineMeta.vm3RelPurchaseOrder).
          indexOfRelatedElement( theCtxt, this, thePurchaseOrder);
    } catch( ClassCastException anEx) { return -1;}
  }




    /* Public Write accessor for role PurchaseOrder
     */
  public void setPurchaseOrder( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallPurchaseOrderIfc thePurchaseOrder) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPurchaseOrderLineMeta.vm3RelPurchaseOrder == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPurchaseOrderLineMeta.vm3RelPurchaseOrder).
        setRelatedElement( theCtxt, this, thePurchaseOrder);
    } catch( ClassCastException anEx) {}
  }








/****************************************************************************
 *  Implementation of public interface for ONE relationship Product
 ****************************************************************************/


    /* Public Read accessor for role Product
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.mall.core.ifc.MallProductIfc getProduct( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPurchaseOrderLineMeta.vm3RelProduct == null) { return null;}

    try { return (com.dosmil_e.mall.core.ifc.MallProductIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPurchaseOrderLineMeta.vm3RelProduct).
        getRelatedElement( theCtxt, this);
    }
    catch( ClassCastException anEx) { return null;}
  }



    /* Public Product number access
     */
  public int numProduct( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return 0;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPurchaseOrderLineMeta.vm3RelProduct == null) { return  0;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPurchaseOrderLineMeta.vm3RelProduct).
          numRelatedElements( theCtxt, this);
    } catch( ClassCastException anEx) { return 0;}
  }



    /* Public Product read accessor by index
     */
  public com.dosmil_e.mall.core.ifc.MallProductIfc getProductAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPurchaseOrderLineMeta.vm3RelProduct == null) { return null;}

    try { return (com.dosmil_e.mall.core.ifc.MallProductIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPurchaseOrderLineMeta.vm3RelProduct).
        getRelatedElementAt( theCtxt, this, theIndex);
    }
    catch( ClassCastException anEx) { return null;}
  }




    /* Public Product finder by name
     */
  public com.dosmil_e.mall.core.ifc.MallProductIfc findProductNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPurchaseOrderLineMeta.vm3RelProduct == null) { return  null;}

    try {
      return (com.dosmil_e.mall.core.ifc.MallProductIfc)
        ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPurchaseOrderLineMeta.vm3RelProduct).
          findRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return null;}
  }



    /* Public Product finder predicate by name
     */
  public boolean hasProductNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPurchaseOrderLineMeta.vm3RelProduct == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPurchaseOrderLineMeta.vm3RelProduct).
          hasRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public Product is related predicate
     */
  public boolean hasProduct( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallProductIfc theProduct) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPurchaseOrderLineMeta.vm3RelProduct == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPurchaseOrderLineMeta.vm3RelProduct).
          hasRelatedElement( theCtxt, this, theProduct);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public Product index access
     */
  public int indexOfProduct( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallProductIfc theProduct) throws EAIException {
    if( theCtxt == null) { return -1;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPurchaseOrderLineMeta.vm3RelProduct == null) { return  -1;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPurchaseOrderLineMeta.vm3RelProduct).
          indexOfRelatedElement( theCtxt, this, theProduct);
    } catch( ClassCastException anEx) { return -1;}
  }




    /* Public Write accessor for role Product
     */
  public void setProduct( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallProductIfc theProduct) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPurchaseOrderLineMeta.vm3RelProduct == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPurchaseOrderLineMeta.vm3RelProduct).
        setRelatedElement( theCtxt, this, theProduct);
    } catch( ClassCastException anEx) {}
  }








/****************************************************************************
 *  Implementation of public interface for ONE relationship InvoiceLine
 ****************************************************************************/


    /* Public Read accessor for role InvoiceLine
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.mall.core.ifc.MallInvoiceLineIfc getInvoiceLine( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPurchaseOrderLineMeta.vm3RelInvoiceLine == null) { return null;}

    try { return (com.dosmil_e.mall.core.ifc.MallInvoiceLineIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPurchaseOrderLineMeta.vm3RelInvoiceLine).
        getRelatedElement( theCtxt, this);
    }
    catch( ClassCastException anEx) { return null;}
  }



    /* Public InvoiceLine number access
     */
  public int numInvoiceLine( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return 0;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPurchaseOrderLineMeta.vm3RelInvoiceLine == null) { return  0;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPurchaseOrderLineMeta.vm3RelInvoiceLine).
          numRelatedElements( theCtxt, this);
    } catch( ClassCastException anEx) { return 0;}
  }



    /* Public InvoiceLine read accessor by index
     */
  public com.dosmil_e.mall.core.ifc.MallInvoiceLineIfc getInvoiceLineAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPurchaseOrderLineMeta.vm3RelInvoiceLine == null) { return null;}

    try { return (com.dosmil_e.mall.core.ifc.MallInvoiceLineIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPurchaseOrderLineMeta.vm3RelInvoiceLine).
        getRelatedElementAt( theCtxt, this, theIndex);
    }
    catch( ClassCastException anEx) { return null;}
  }




    /* Public InvoiceLine finder by name
     */
  public com.dosmil_e.mall.core.ifc.MallInvoiceLineIfc findInvoiceLineNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPurchaseOrderLineMeta.vm3RelInvoiceLine == null) { return  null;}

    try {
      return (com.dosmil_e.mall.core.ifc.MallInvoiceLineIfc)
        ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPurchaseOrderLineMeta.vm3RelInvoiceLine).
          findRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return null;}
  }



    /* Public InvoiceLine finder predicate by name
     */
  public boolean hasInvoiceLineNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPurchaseOrderLineMeta.vm3RelInvoiceLine == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPurchaseOrderLineMeta.vm3RelInvoiceLine).
          hasRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public InvoiceLine is related predicate
     */
  public boolean hasInvoiceLine( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallInvoiceLineIfc theInvoiceLine) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPurchaseOrderLineMeta.vm3RelInvoiceLine == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPurchaseOrderLineMeta.vm3RelInvoiceLine).
          hasRelatedElement( theCtxt, this, theInvoiceLine);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public InvoiceLine index access
     */
  public int indexOfInvoiceLine( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallInvoiceLineIfc theInvoiceLine) throws EAIException {
    if( theCtxt == null) { return -1;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPurchaseOrderLineMeta.vm3RelInvoiceLine == null) { return  -1;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPurchaseOrderLineMeta.vm3RelInvoiceLine).
          indexOfRelatedElement( theCtxt, this, theInvoiceLine);
    } catch( ClassCastException anEx) { return -1;}
  }




    /* Public Write accessor for role InvoiceLine
     */
  public void setInvoiceLine( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallInvoiceLineIfc theInvoiceLine) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.mall.core.meta.MallPurchaseOrderLineMeta.vm3RelInvoiceLine == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.mall.core.meta.MallPurchaseOrderLineMeta.vm3RelInvoiceLine).
        setRelatedElement( theCtxt, this, theInvoiceLine);
    } catch( ClassCastException anEx) {}
  }












/****************************************************************************
 *  Implementation of destructor of MallPurchaseOrderLine
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
      vm3Type = com.dosmil_e.mall.core.meta.MallPurchaseOrderLineMeta.getStaticM3Type( theCtxt);
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

