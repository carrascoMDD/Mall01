package com.dosmil_e.mall.core.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface MallVendorIfc
   extends com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc  {


/****************************************************************************
 *  Declaration of accessors to attributes of MallVendor
 ****************************************************************************/






/****************************************************************************
 *  Declaration of accessors to relationships of MallVendor
 ****************************************************************************/




/****************************************************************************
 *  Implementation of public interface for relationship Products
 ****************************************************************************/


    /* Public Read accessor for role Products
     * Returns a copy of the collection, to avoid external changes to the relationship
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.mall.core.ifc.MallProductIfc[] getProducts( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Public Products finder by name
     */
  public com.dosmil_e.mall.core.ifc.MallProductIfc findProductsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public Products finder predicate by name
     */
  public boolean hasProductsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public Products is related predicate
     */
  public boolean hasProducts( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallProductIfc theProducts) throws EAIException;


    /* Public Products read accessor by index
     */
  public com.dosmil_e.mall.core.ifc.MallProductIfc getProductsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public Products number access
     */
  public int numProducts( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public Products index access
     */
  public int indexOfProducts( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallProductIfc theProducts) throws EAIException;


    /* Public Write accessor for role Products
     * Double change propagation
     */
  public void addProducts( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallProductIfc theProducts) throws EAIException;



    /* Public Write accessor for role Products
     */
  public void removeProducts( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallProductIfc theProducts) throws EAIException;



    /* Public ordered Write accessor for role Products
     */
  public void addProductsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallProductIfc theProducts, com.dosmil_e.mall.core.ifc.MallProductIfc theRelativeProducts) throws EAIException;

    /* Public ordered Write accessor for role Products
     */
  public void moveProductsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallProductIfc theProducts, com.dosmil_e.mall.core.ifc.MallProductIfc theRelativeProducts) throws EAIException;

    /* Public move to last Write accessor for role Products
     */
  public void moveProductsToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallProductIfc theProducts) throws EAIException;




/****************************************************************************
 *  Implementation of public interface for relationship Customers
 ****************************************************************************/


    /* Public Read accessor for role Customers
     * Returns a copy of the collection, to avoid external changes to the relationship
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.mall.core.ifc.MallCustomerIfc[] getCustomers( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Public Customers finder by name
     */
  public com.dosmil_e.mall.core.ifc.MallCustomerIfc findCustomersNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public Customers finder predicate by name
     */
  public boolean hasCustomersNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public Customers is related predicate
     */
  public boolean hasCustomers( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallCustomerIfc theCustomers) throws EAIException;


    /* Public Customers read accessor by index
     */
  public com.dosmil_e.mall.core.ifc.MallCustomerIfc getCustomersAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public Customers number access
     */
  public int numCustomers( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public Customers index access
     */
  public int indexOfCustomers( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallCustomerIfc theCustomers) throws EAIException;


    /* Public Write accessor for role Customers
     * Double change propagation
     */
  public void addCustomers( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallCustomerIfc theCustomers) throws EAIException;



    /* Public Write accessor for role Customers
     */
  public void removeCustomers( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallCustomerIfc theCustomers) throws EAIException;



    /* Public ordered Write accessor for role Customers
     */
  public void addCustomersBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallCustomerIfc theCustomers, com.dosmil_e.mall.core.ifc.MallCustomerIfc theRelativeCustomers) throws EAIException;

    /* Public ordered Write accessor for role Customers
     */
  public void moveCustomersBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallCustomerIfc theCustomers, com.dosmil_e.mall.core.ifc.MallCustomerIfc theRelativeCustomers) throws EAIException;

    /* Public move to last Write accessor for role Customers
     */
  public void moveCustomersToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallCustomerIfc theCustomers) throws EAIException;


/****************************************************************************
 *  Implementation of public interface for relationship Mall
 ****************************************************************************/


     /* Public Read accessor for role Mall
     * May do wild things with the identity of Mall
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.mall.core.ifc.MallMallIfc getMall( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public Mall read accessor by index
     */
  public com.dosmil_e.mall.core.ifc.MallMallIfc getMallAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public Mall finder by name
     */
  public com.dosmil_e.mall.core.ifc.MallMallIfc findMallNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public Mall finder predicate by name
     */
  public boolean hasMallNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public Mall is related predicate
     */
  public boolean hasMall( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallMallIfc theMall) throws EAIException;

    /* Public Mall number access
     */
  public int numMall( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public Mall index access
     */
  public int indexOfMall( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallMallIfc theMall) throws EAIException;


    /* Public Write accessor for role Mall
     */
  public void setMall( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallMallIfc theMall) throws EAIException;





}
