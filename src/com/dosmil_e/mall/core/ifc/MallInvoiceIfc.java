package com.dosmil_e.mall.core.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface MallInvoiceIfc
   extends com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc  {


/****************************************************************************
 *  Declaration of accessors to attributes of MallInvoice
 ****************************************************************************/

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
 *  Implementation of public interface for attribute Taxes
 ****************************************************************************/


    /* Public Read accessor for attribute Taxes
     */
  public double getTaxes( EAIMMCtxtIfc theCtxt) throws EAIException ;



    /* Public Write accessor for attribute Taxes
     */
  public void setTaxes( EAIMMCtxtIfc theCtxt, double theTaxes) throws EAIException;
/****************************************************************************
 *  Implementation of public interface for attribute TotalAmount
 ****************************************************************************/


    /* Public Read accessor for attribute TotalAmount
     */
  public double getTotalAmount( EAIMMCtxtIfc theCtxt) throws EAIException ;



    /* Public Write accessor for attribute TotalAmount
     */
  public void setTotalAmount( EAIMMCtxtIfc theCtxt, double theTotalAmount) throws EAIException;





/****************************************************************************
 *  Declaration of accessors to relationships of MallInvoice
 ****************************************************************************/


/****************************************************************************
 *  Implementation of public interface for relationship Customer
 ****************************************************************************/


     /* Public Read accessor for role Customer
     * May do wild things with the identity of Customer
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.mall.core.ifc.MallCustomerIfc getCustomer( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public Customer read accessor by index
     */
  public com.dosmil_e.mall.core.ifc.MallCustomerIfc getCustomerAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public Customer finder by name
     */
  public com.dosmil_e.mall.core.ifc.MallCustomerIfc findCustomerNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public Customer finder predicate by name
     */
  public boolean hasCustomerNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public Customer is related predicate
     */
  public boolean hasCustomer( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallCustomerIfc theCustomer) throws EAIException;

    /* Public Customer number access
     */
  public int numCustomer( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public Customer index access
     */
  public int indexOfCustomer( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallCustomerIfc theCustomer) throws EAIException;


    /* Public Write accessor for role Customer
     */
  public void setCustomer( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallCustomerIfc theCustomer) throws EAIException;





/****************************************************************************
 *  Implementation of public interface for relationship InvoiceLines
 ****************************************************************************/


    /* Public Read accessor for role InvoiceLines
     * Returns a copy of the collection, to avoid external changes to the relationship
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.mall.core.ifc.MallInvoiceLineIfc[] getInvoiceLines( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Public InvoiceLines finder by name
     */
  public com.dosmil_e.mall.core.ifc.MallInvoiceLineIfc findInvoiceLinesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public InvoiceLines finder predicate by name
     */
  public boolean hasInvoiceLinesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public InvoiceLines is related predicate
     */
  public boolean hasInvoiceLines( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallInvoiceLineIfc theInvoiceLines) throws EAIException;


    /* Public InvoiceLines read accessor by index
     */
  public com.dosmil_e.mall.core.ifc.MallInvoiceLineIfc getInvoiceLinesAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public InvoiceLines number access
     */
  public int numInvoiceLines( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public InvoiceLines index access
     */
  public int indexOfInvoiceLines( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallInvoiceLineIfc theInvoiceLines) throws EAIException;


    /* Public Write accessor for role InvoiceLines
     * Double change propagation
     */
  public void addInvoiceLines( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallInvoiceLineIfc theInvoiceLines) throws EAIException;



    /* Public Write accessor for role InvoiceLines
     */
  public void removeInvoiceLines( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallInvoiceLineIfc theInvoiceLines) throws EAIException;



    /* Public ordered Write accessor for role InvoiceLines
     */
  public void addInvoiceLinesBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallInvoiceLineIfc theInvoiceLines, com.dosmil_e.mall.core.ifc.MallInvoiceLineIfc theRelativeInvoiceLines) throws EAIException;

    /* Public ordered Write accessor for role InvoiceLines
     */
  public void moveInvoiceLinesBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallInvoiceLineIfc theInvoiceLines, com.dosmil_e.mall.core.ifc.MallInvoiceLineIfc theRelativeInvoiceLines) throws EAIException;

    /* Public move to last Write accessor for role InvoiceLines
     */
  public void moveInvoiceLinesToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallInvoiceLineIfc theInvoiceLines) throws EAIException;


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
 *  Implementation of public interface for relationship Payment
 ****************************************************************************/


    /* Public Read accessor for role Payment
     * May do wild things with the identity of Payment
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.mall.core.ifc.MallPaymentIfc getPayment( EAIMMCtxtIfc theCtxt) throws EAIException;



    /* Public Payment read accessor by index
     */
  public com.dosmil_e.mall.core.ifc.MallPaymentIfc getPaymentAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public Payment finder by name
     */
  public com.dosmil_e.mall.core.ifc.MallPaymentIfc findPaymentNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public Payment finder predicate by name
     */
  public boolean hasPaymentNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public Payment is related predicate
     */
  public boolean hasPayment( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallPaymentIfc thePayment) throws EAIException;

    /* Public Payment number access
     */
  public int numPayment( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public Payment index access
     */
  public int indexOfPayment( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallPaymentIfc thePayment) throws EAIException;


    /* Public Write accessor for role Payment
     */
  public void setPayment( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallPaymentIfc thePayment) throws EAIException;



/****************************************************************************
 *  Implementation of public interface for relationship Shipping
 ****************************************************************************/


    /* Public Read accessor for role Shipping
     * May do wild things with the identity of Shipping
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.mall.core.ifc.MallShippingIfc getShipping( EAIMMCtxtIfc theCtxt) throws EAIException;



    /* Public Shipping read accessor by index
     */
  public com.dosmil_e.mall.core.ifc.MallShippingIfc getShippingAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public Shipping finder by name
     */
  public com.dosmil_e.mall.core.ifc.MallShippingIfc findShippingNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public Shipping finder predicate by name
     */
  public boolean hasShippingNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public Shipping is related predicate
     */
  public boolean hasShipping( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallShippingIfc theShipping) throws EAIException;

    /* Public Shipping number access
     */
  public int numShipping( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public Shipping index access
     */
  public int indexOfShipping( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallShippingIfc theShipping) throws EAIException;


    /* Public Write accessor for role Shipping
     */
  public void setShipping( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallShippingIfc theShipping) throws EAIException;





}
