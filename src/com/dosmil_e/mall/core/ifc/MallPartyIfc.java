package com.dosmil_e.mall.core.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface MallPartyIfc
   extends com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc  {


/****************************************************************************
 *  Declaration of accessors to attributes of MallParty
 ****************************************************************************/






/****************************************************************************
 *  Declaration of accessors to relationships of MallParty
 ****************************************************************************/


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
 *  Implementation of public interface for relationship Contacts
 ****************************************************************************/


    /* Public Read accessor for role Contacts
     * Returns a copy of the collection, to avoid external changes to the relationship
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.mall.core.ifc.MallContactIfc[] getContacts( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Public Contacts finder by name
     */
  public com.dosmil_e.mall.core.ifc.MallContactIfc findContactsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public Contacts finder predicate by name
     */
  public boolean hasContactsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public Contacts is related predicate
     */
  public boolean hasContacts( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallContactIfc theContacts) throws EAIException;


    /* Public Contacts read accessor by index
     */
  public com.dosmil_e.mall.core.ifc.MallContactIfc getContactsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public Contacts number access
     */
  public int numContacts( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public Contacts index access
     */
  public int indexOfContacts( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallContactIfc theContacts) throws EAIException;


    /* Public Write accessor for role Contacts
     * Double change propagation
     */
  public void addContacts( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallContactIfc theContacts) throws EAIException;



    /* Public Write accessor for role Contacts
     */
  public void removeContacts( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallContactIfc theContacts) throws EAIException;



    /* Public ordered Write accessor for role Contacts
     */
  public void addContactsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallContactIfc theContacts, com.dosmil_e.mall.core.ifc.MallContactIfc theRelativeContacts) throws EAIException;

    /* Public ordered Write accessor for role Contacts
     */
  public void moveContactsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallContactIfc theContacts, com.dosmil_e.mall.core.ifc.MallContactIfc theRelativeContacts) throws EAIException;

    /* Public move to last Write accessor for role Contacts
     */
  public void moveContactsToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallContactIfc theContacts) throws EAIException;




/****************************************************************************
 *  Implementation of public interface for relationship Addresses
 ****************************************************************************/


    /* Public Read accessor for role Addresses
     * Returns a copy of the collection, to avoid external changes to the relationship
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.mall.core.ifc.MallAddressIfc[] getAddresses( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Public Addresses finder by name
     */
  public com.dosmil_e.mall.core.ifc.MallAddressIfc findAddressesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public Addresses finder predicate by name
     */
  public boolean hasAddressesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public Addresses is related predicate
     */
  public boolean hasAddresses( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallAddressIfc theAddresses) throws EAIException;


    /* Public Addresses read accessor by index
     */
  public com.dosmil_e.mall.core.ifc.MallAddressIfc getAddressesAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public Addresses number access
     */
  public int numAddresses( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public Addresses index access
     */
  public int indexOfAddresses( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallAddressIfc theAddresses) throws EAIException;


    /* Public Write accessor for role Addresses
     * Double change propagation
     */
  public void addAddresses( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallAddressIfc theAddresses) throws EAIException;



    /* Public Write accessor for role Addresses
     */
  public void removeAddresses( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallAddressIfc theAddresses) throws EAIException;



    /* Public ordered Write accessor for role Addresses
     */
  public void addAddressesBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallAddressIfc theAddresses, com.dosmil_e.mall.core.ifc.MallAddressIfc theRelativeAddresses) throws EAIException;

    /* Public ordered Write accessor for role Addresses
     */
  public void moveAddressesBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallAddressIfc theAddresses, com.dosmil_e.mall.core.ifc.MallAddressIfc theRelativeAddresses) throws EAIException;

    /* Public move to last Write accessor for role Addresses
     */
  public void moveAddressesToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallAddressIfc theAddresses) throws EAIException;




}
