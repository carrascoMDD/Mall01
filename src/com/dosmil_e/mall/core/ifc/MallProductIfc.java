package com.dosmil_e.mall.core.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface MallProductIfc
   extends com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc  {


/****************************************************************************
 *  Declaration of accessors to attributes of MallProduct
 ****************************************************************************/

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
 *  Declaration of accessors to relationships of MallProduct
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




}
