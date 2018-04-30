package com.dosmil_e.mall.core.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface MallCustomerIfc
   extends com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc  {


/****************************************************************************
 *  Declaration of accessors to attributes of MallCustomer
 ****************************************************************************/






/****************************************************************************
 *  Declaration of accessors to relationships of MallCustomer
 ****************************************************************************/


/****************************************************************************
 *  Implementation of public interface for relationship Vendor
 ****************************************************************************/


     /* Public Read accessor for role Vendor
     * May do wild things with the identity of Vendor
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.mall.core.ifc.MallVendorIfc getVendor( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public Vendor read accessor by index
     */
  public com.dosmil_e.mall.core.ifc.MallVendorIfc getVendorAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public Vendor finder by name
     */
  public com.dosmil_e.mall.core.ifc.MallVendorIfc findVendorNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public Vendor finder predicate by name
     */
  public boolean hasVendorNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public Vendor is related predicate
     */
  public boolean hasVendor( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallVendorIfc theVendor) throws EAIException;

    /* Public Vendor number access
     */
  public int numVendor( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public Vendor index access
     */
  public int indexOfVendor( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallVendorIfc theVendor) throws EAIException;


    /* Public Write accessor for role Vendor
     */
  public void setVendor( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallVendorIfc theVendor) throws EAIException;





/****************************************************************************
 *  Implementation of public interface for relationship PurchaseOrders
 ****************************************************************************/


    /* Public Read accessor for role PurchaseOrders
     * Returns a copy of the collection, to avoid external changes to the relationship
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.mall.core.ifc.MallPurchaseOrderIfc[] getPurchaseOrders( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Public PurchaseOrders finder by name
     */
  public com.dosmil_e.mall.core.ifc.MallPurchaseOrderIfc findPurchaseOrdersNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public PurchaseOrders finder predicate by name
     */
  public boolean hasPurchaseOrdersNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public PurchaseOrders is related predicate
     */
  public boolean hasPurchaseOrders( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallPurchaseOrderIfc thePurchaseOrders) throws EAIException;


    /* Public PurchaseOrders read accessor by index
     */
  public com.dosmil_e.mall.core.ifc.MallPurchaseOrderIfc getPurchaseOrdersAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public PurchaseOrders number access
     */
  public int numPurchaseOrders( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public PurchaseOrders index access
     */
  public int indexOfPurchaseOrders( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallPurchaseOrderIfc thePurchaseOrders) throws EAIException;


    /* Public Write accessor for role PurchaseOrders
     * Double change propagation
     */
  public void addPurchaseOrders( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallPurchaseOrderIfc thePurchaseOrders) throws EAIException;



    /* Public Write accessor for role PurchaseOrders
     */
  public void removePurchaseOrders( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallPurchaseOrderIfc thePurchaseOrders) throws EAIException;



    /* Public ordered Write accessor for role PurchaseOrders
     */
  public void addPurchaseOrdersBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallPurchaseOrderIfc thePurchaseOrders, com.dosmil_e.mall.core.ifc.MallPurchaseOrderIfc theRelativePurchaseOrders) throws EAIException;

    /* Public ordered Write accessor for role PurchaseOrders
     */
  public void movePurchaseOrdersBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallPurchaseOrderIfc thePurchaseOrders, com.dosmil_e.mall.core.ifc.MallPurchaseOrderIfc theRelativePurchaseOrders) throws EAIException;

    /* Public move to last Write accessor for role PurchaseOrders
     */
  public void movePurchaseOrdersToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallPurchaseOrderIfc thePurchaseOrders) throws EAIException;


/****************************************************************************
 *  Implementation of public interface for relationship Party
 ****************************************************************************/


     /* Public Read accessor for role Party
     * May do wild things with the identity of Party
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.mall.core.ifc.MallPartyIfc getParty( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public Party read accessor by index
     */
  public com.dosmil_e.mall.core.ifc.MallPartyIfc getPartyAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public Party finder by name
     */
  public com.dosmil_e.mall.core.ifc.MallPartyIfc findPartyNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public Party finder predicate by name
     */
  public boolean hasPartyNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public Party is related predicate
     */
  public boolean hasParty( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallPartyIfc theParty) throws EAIException;

    /* Public Party number access
     */
  public int numParty( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public Party index access
     */
  public int indexOfParty( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallPartyIfc theParty) throws EAIException;


    /* Public Write accessor for role Party
     */
  public void setParty( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallPartyIfc theParty) throws EAIException;





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
