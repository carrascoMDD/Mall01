package com.dosmil_e.mall.core.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface MallPurchaseOrderIfc
   extends com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc  {


/****************************************************************************
 *  Declaration of accessors to attributes of MallPurchaseOrder
 ****************************************************************************/






/****************************************************************************
 *  Declaration of accessors to relationships of MallPurchaseOrder
 ****************************************************************************/




/****************************************************************************
 *  Implementation of public interface for relationship PurchaseOrderLines
 ****************************************************************************/


    /* Public Read accessor for role PurchaseOrderLines
     * Returns a copy of the collection, to avoid external changes to the relationship
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.mall.core.ifc.MallPurchaseOrderLineIfc[] getPurchaseOrderLines( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Public PurchaseOrderLines finder by name
     */
  public com.dosmil_e.mall.core.ifc.MallPurchaseOrderLineIfc findPurchaseOrderLinesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public PurchaseOrderLines finder predicate by name
     */
  public boolean hasPurchaseOrderLinesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public PurchaseOrderLines is related predicate
     */
  public boolean hasPurchaseOrderLines( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallPurchaseOrderLineIfc thePurchaseOrderLines) throws EAIException;


    /* Public PurchaseOrderLines read accessor by index
     */
  public com.dosmil_e.mall.core.ifc.MallPurchaseOrderLineIfc getPurchaseOrderLinesAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public PurchaseOrderLines number access
     */
  public int numPurchaseOrderLines( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public PurchaseOrderLines index access
     */
  public int indexOfPurchaseOrderLines( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallPurchaseOrderLineIfc thePurchaseOrderLines) throws EAIException;


    /* Public Write accessor for role PurchaseOrderLines
     * Double change propagation
     */
  public void addPurchaseOrderLines( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallPurchaseOrderLineIfc thePurchaseOrderLines) throws EAIException;



    /* Public Write accessor for role PurchaseOrderLines
     */
  public void removePurchaseOrderLines( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallPurchaseOrderLineIfc thePurchaseOrderLines) throws EAIException;



    /* Public ordered Write accessor for role PurchaseOrderLines
     */
  public void addPurchaseOrderLinesBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallPurchaseOrderLineIfc thePurchaseOrderLines, com.dosmil_e.mall.core.ifc.MallPurchaseOrderLineIfc theRelativePurchaseOrderLines) throws EAIException;

    /* Public ordered Write accessor for role PurchaseOrderLines
     */
  public void movePurchaseOrderLinesBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallPurchaseOrderLineIfc thePurchaseOrderLines, com.dosmil_e.mall.core.ifc.MallPurchaseOrderLineIfc theRelativePurchaseOrderLines) throws EAIException;

    /* Public move to last Write accessor for role PurchaseOrderLines
     */
  public void movePurchaseOrderLinesToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallPurchaseOrderLineIfc thePurchaseOrderLines) throws EAIException;


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
 *  Implementation of public interface for relationship Invoices
 ****************************************************************************/


    /* Public Read accessor for role Invoices
     * Returns a copy of the collection, to avoid external changes to the relationship
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.mall.core.ifc.MallInvoiceIfc[] getInvoices( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Public Invoices finder by name
     */
  public com.dosmil_e.mall.core.ifc.MallInvoiceIfc findInvoicesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public Invoices finder predicate by name
     */
  public boolean hasInvoicesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public Invoices is related predicate
     */
  public boolean hasInvoices( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallInvoiceIfc theInvoices) throws EAIException;


    /* Public Invoices read accessor by index
     */
  public com.dosmil_e.mall.core.ifc.MallInvoiceIfc getInvoicesAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public Invoices number access
     */
  public int numInvoices( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public Invoices index access
     */
  public int indexOfInvoices( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallInvoiceIfc theInvoices) throws EAIException;


    /* Public Write accessor for role Invoices
     * Double change propagation
     */
  public void addInvoices( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallInvoiceIfc theInvoices) throws EAIException;



    /* Public Write accessor for role Invoices
     */
  public void removeInvoices( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallInvoiceIfc theInvoices) throws EAIException;



    /* Public ordered Write accessor for role Invoices
     */
  public void addInvoicesBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallInvoiceIfc theInvoices, com.dosmil_e.mall.core.ifc.MallInvoiceIfc theRelativeInvoices) throws EAIException;

    /* Public ordered Write accessor for role Invoices
     */
  public void moveInvoicesBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallInvoiceIfc theInvoices, com.dosmil_e.mall.core.ifc.MallInvoiceIfc theRelativeInvoices) throws EAIException;

    /* Public move to last Write accessor for role Invoices
     */
  public void moveInvoicesToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallInvoiceIfc theInvoices) throws EAIException;




}
