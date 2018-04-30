package com.dosmil_e.mall.core.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface MallShippingIfc
   extends com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc  {


/****************************************************************************
 *  Declaration of accessors to attributes of MallShipping
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
 *  Declaration of accessors to relationships of MallShipping
 ****************************************************************************/


/****************************************************************************
 *  Implementation of public interface for relationship DeliveryService
 ****************************************************************************/


     /* Public Read accessor for role DeliveryService
     * May do wild things with the identity of DeliveryService
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.mall.core.ifc.MallDeliveryServiceIfc getDeliveryService( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public DeliveryService read accessor by index
     */
  public com.dosmil_e.mall.core.ifc.MallDeliveryServiceIfc getDeliveryServiceAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public DeliveryService finder by name
     */
  public com.dosmil_e.mall.core.ifc.MallDeliveryServiceIfc findDeliveryServiceNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public DeliveryService finder predicate by name
     */
  public boolean hasDeliveryServiceNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public DeliveryService is related predicate
     */
  public boolean hasDeliveryService( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallDeliveryServiceIfc theDeliveryService) throws EAIException;

    /* Public DeliveryService number access
     */
  public int numDeliveryService( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public DeliveryService index access
     */
  public int indexOfDeliveryService( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallDeliveryServiceIfc theDeliveryService) throws EAIException;


    /* Public Write accessor for role DeliveryService
     */
  public void setDeliveryService( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallDeliveryServiceIfc theDeliveryService) throws EAIException;



/****************************************************************************
 *  Implementation of public interface for relationship Contact
 ****************************************************************************/


     /* Public Read accessor for role Contact
     * May do wild things with the identity of Contact
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.mall.core.ifc.MallContactIfc getContact( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public Contact read accessor by index
     */
  public com.dosmil_e.mall.core.ifc.MallContactIfc getContactAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public Contact finder by name
     */
  public com.dosmil_e.mall.core.ifc.MallContactIfc findContactNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public Contact finder predicate by name
     */
  public boolean hasContactNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public Contact is related predicate
     */
  public boolean hasContact( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallContactIfc theContact) throws EAIException;

    /* Public Contact number access
     */
  public int numContact( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public Contact index access
     */
  public int indexOfContact( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallContactIfc theContact) throws EAIException;


    /* Public Write accessor for role Contact
     */
  public void setContact( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallContactIfc theContact) throws EAIException;



/****************************************************************************
 *  Implementation of public interface for relationship Address
 ****************************************************************************/


     /* Public Read accessor for role Address
     * May do wild things with the identity of Address
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.mall.core.ifc.MallAddressIfc getAddress( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public Address read accessor by index
     */
  public com.dosmil_e.mall.core.ifc.MallAddressIfc getAddressAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public Address finder by name
     */
  public com.dosmil_e.mall.core.ifc.MallAddressIfc findAddressNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public Address finder predicate by name
     */
  public boolean hasAddressNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public Address is related predicate
     */
  public boolean hasAddress( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallAddressIfc theAddress) throws EAIException;

    /* Public Address number access
     */
  public int numAddress( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public Address index access
     */
  public int indexOfAddress( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallAddressIfc theAddress) throws EAIException;


    /* Public Write accessor for role Address
     */
  public void setAddress( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallAddressIfc theAddress) throws EAIException;



/****************************************************************************
 *  Implementation of public interface for relationship Invoice
 ****************************************************************************/


    /* Public Read accessor for role Invoice
     * May do wild things with the identity of Invoice
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.mall.core.ifc.MallInvoiceIfc getInvoice( EAIMMCtxtIfc theCtxt) throws EAIException;



    /* Public Invoice read accessor by index
     */
  public com.dosmil_e.mall.core.ifc.MallInvoiceIfc getInvoiceAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public Invoice finder by name
     */
  public com.dosmil_e.mall.core.ifc.MallInvoiceIfc findInvoiceNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public Invoice finder predicate by name
     */
  public boolean hasInvoiceNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public Invoice is related predicate
     */
  public boolean hasInvoice( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallInvoiceIfc theInvoice) throws EAIException;

    /* Public Invoice number access
     */
  public int numInvoice( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public Invoice index access
     */
  public int indexOfInvoice( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallInvoiceIfc theInvoice) throws EAIException;


    /* Public Write accessor for role Invoice
     */
  public void setInvoice( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallInvoiceIfc theInvoice) throws EAIException;





}
