package com.dosmil_e.mall.core.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface MallPurchaseOrderLineIfc
   extends com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc  {


/****************************************************************************
 *  Declaration of accessors to attributes of MallPurchaseOrderLine
 ****************************************************************************/

/****************************************************************************
 *  Implementation of public interface for attribute Quantity
 ****************************************************************************/


    /* Public Read accessor for attribute Quantity
     */
  public double getQuantity( EAIMMCtxtIfc theCtxt) throws EAIException ;



    /* Public Write accessor for attribute Quantity
     */
  public void setQuantity( EAIMMCtxtIfc theCtxt, double theQuantity) throws EAIException;
/****************************************************************************
 *  Implementation of public interface for attribute UnitPrice
 ****************************************************************************/


    /* Public Read accessor for attribute UnitPrice
     */
  public double getUnitPrice( EAIMMCtxtIfc theCtxt) throws EAIException ;



    /* Public Write accessor for attribute UnitPrice
     */
  public void setUnitPrice( EAIMMCtxtIfc theCtxt, double theUnitPrice) throws EAIException;
/****************************************************************************
 *  Implementation of public interface for attribute Amount
 ****************************************************************************/


    /* Public Read accessor for attribute Amount
     */
  public double getAmount( EAIMMCtxtIfc theCtxt) throws EAIException ;



    /* Public Write accessor for attribute Amount
     */
  public void setAmount( EAIMMCtxtIfc theCtxt, double theAmount) throws EAIException;





/****************************************************************************
 *  Declaration of accessors to relationships of MallPurchaseOrderLine
 ****************************************************************************/


/****************************************************************************
 *  Implementation of public interface for relationship PurchaseOrder
 ****************************************************************************/


     /* Public Read accessor for role PurchaseOrder
     * May do wild things with the identity of PurchaseOrder
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.mall.core.ifc.MallPurchaseOrderIfc getPurchaseOrder( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public PurchaseOrder read accessor by index
     */
  public com.dosmil_e.mall.core.ifc.MallPurchaseOrderIfc getPurchaseOrderAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public PurchaseOrder finder by name
     */
  public com.dosmil_e.mall.core.ifc.MallPurchaseOrderIfc findPurchaseOrderNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public PurchaseOrder finder predicate by name
     */
  public boolean hasPurchaseOrderNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public PurchaseOrder is related predicate
     */
  public boolean hasPurchaseOrder( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallPurchaseOrderIfc thePurchaseOrder) throws EAIException;

    /* Public PurchaseOrder number access
     */
  public int numPurchaseOrder( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public PurchaseOrder index access
     */
  public int indexOfPurchaseOrder( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallPurchaseOrderIfc thePurchaseOrder) throws EAIException;


    /* Public Write accessor for role PurchaseOrder
     */
  public void setPurchaseOrder( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallPurchaseOrderIfc thePurchaseOrder) throws EAIException;



/****************************************************************************
 *  Implementation of public interface for relationship Product
 ****************************************************************************/


     /* Public Read accessor for role Product
     * May do wild things with the identity of Product
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.mall.core.ifc.MallProductIfc getProduct( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public Product read accessor by index
     */
  public com.dosmil_e.mall.core.ifc.MallProductIfc getProductAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public Product finder by name
     */
  public com.dosmil_e.mall.core.ifc.MallProductIfc findProductNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public Product finder predicate by name
     */
  public boolean hasProductNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public Product is related predicate
     */
  public boolean hasProduct( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallProductIfc theProduct) throws EAIException;

    /* Public Product number access
     */
  public int numProduct( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public Product index access
     */
  public int indexOfProduct( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallProductIfc theProduct) throws EAIException;


    /* Public Write accessor for role Product
     */
  public void setProduct( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallProductIfc theProduct) throws EAIException;



/****************************************************************************
 *  Implementation of public interface for relationship InvoiceLine
 ****************************************************************************/


    /* Public Read accessor for role InvoiceLine
     * May do wild things with the identity of InvoiceLine
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.mall.core.ifc.MallInvoiceLineIfc getInvoiceLine( EAIMMCtxtIfc theCtxt) throws EAIException;



    /* Public InvoiceLine read accessor by index
     */
  public com.dosmil_e.mall.core.ifc.MallInvoiceLineIfc getInvoiceLineAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public InvoiceLine finder by name
     */
  public com.dosmil_e.mall.core.ifc.MallInvoiceLineIfc findInvoiceLineNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public InvoiceLine finder predicate by name
     */
  public boolean hasInvoiceLineNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public InvoiceLine is related predicate
     */
  public boolean hasInvoiceLine( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallInvoiceLineIfc theInvoiceLine) throws EAIException;

    /* Public InvoiceLine number access
     */
  public int numInvoiceLine( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public InvoiceLine index access
     */
  public int indexOfInvoiceLine( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallInvoiceLineIfc theInvoiceLine) throws EAIException;


    /* Public Write accessor for role InvoiceLine
     */
  public void setInvoiceLine( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallInvoiceLineIfc theInvoiceLine) throws EAIException;





}
