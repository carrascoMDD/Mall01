package com.dosmil_e.mall.core.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface MallMallIfc
   extends com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc  {


/****************************************************************************
 *  Declaration of accessors to attributes of MallMall
 ****************************************************************************/






/****************************************************************************
 *  Declaration of accessors to relationships of MallMall
 ****************************************************************************/




/****************************************************************************
 *  Implementation of public interface for relationship Vendors
 ****************************************************************************/


    /* Public Read accessor for role Vendors
     * Returns a copy of the collection, to avoid external changes to the relationship
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.mall.core.ifc.MallVendorIfc[] getVendors( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Public Vendors finder by name
     */
  public com.dosmil_e.mall.core.ifc.MallVendorIfc findVendorsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public Vendors finder predicate by name
     */
  public boolean hasVendorsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public Vendors is related predicate
     */
  public boolean hasVendors( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallVendorIfc theVendors) throws EAIException;


    /* Public Vendors read accessor by index
     */
  public com.dosmil_e.mall.core.ifc.MallVendorIfc getVendorsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public Vendors number access
     */
  public int numVendors( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public Vendors index access
     */
  public int indexOfVendors( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallVendorIfc theVendors) throws EAIException;


    /* Public Write accessor for role Vendors
     * Double change propagation
     */
  public void addVendors( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallVendorIfc theVendors) throws EAIException;



    /* Public Write accessor for role Vendors
     */
  public void removeVendors( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallVendorIfc theVendors) throws EAIException;



    /* Public ordered Write accessor for role Vendors
     */
  public void addVendorsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallVendorIfc theVendors, com.dosmil_e.mall.core.ifc.MallVendorIfc theRelativeVendors) throws EAIException;

    /* Public ordered Write accessor for role Vendors
     */
  public void moveVendorsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallVendorIfc theVendors, com.dosmil_e.mall.core.ifc.MallVendorIfc theRelativeVendors) throws EAIException;

    /* Public move to last Write accessor for role Vendors
     */
  public void moveVendorsToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallVendorIfc theVendors) throws EAIException;




/****************************************************************************
 *  Implementation of public interface for relationship DeliveryServices
 ****************************************************************************/


    /* Public Read accessor for role DeliveryServices
     * Returns a copy of the collection, to avoid external changes to the relationship
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.mall.core.ifc.MallDeliveryServiceIfc[] getDeliveryServices( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Public DeliveryServices finder by name
     */
  public com.dosmil_e.mall.core.ifc.MallDeliveryServiceIfc findDeliveryServicesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public DeliveryServices finder predicate by name
     */
  public boolean hasDeliveryServicesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public DeliveryServices is related predicate
     */
  public boolean hasDeliveryServices( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallDeliveryServiceIfc theDeliveryServices) throws EAIException;


    /* Public DeliveryServices read accessor by index
     */
  public com.dosmil_e.mall.core.ifc.MallDeliveryServiceIfc getDeliveryServicesAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public DeliveryServices number access
     */
  public int numDeliveryServices( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public DeliveryServices index access
     */
  public int indexOfDeliveryServices( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallDeliveryServiceIfc theDeliveryServices) throws EAIException;


    /* Public Write accessor for role DeliveryServices
     * Double change propagation
     */
  public void addDeliveryServices( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallDeliveryServiceIfc theDeliveryServices) throws EAIException;



    /* Public Write accessor for role DeliveryServices
     */
  public void removeDeliveryServices( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallDeliveryServiceIfc theDeliveryServices) throws EAIException;



    /* Public ordered Write accessor for role DeliveryServices
     */
  public void addDeliveryServicesBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallDeliveryServiceIfc theDeliveryServices, com.dosmil_e.mall.core.ifc.MallDeliveryServiceIfc theRelativeDeliveryServices) throws EAIException;

    /* Public ordered Write accessor for role DeliveryServices
     */
  public void moveDeliveryServicesBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallDeliveryServiceIfc theDeliveryServices, com.dosmil_e.mall.core.ifc.MallDeliveryServiceIfc theRelativeDeliveryServices) throws EAIException;

    /* Public move to last Write accessor for role DeliveryServices
     */
  public void moveDeliveryServicesToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallDeliveryServiceIfc theDeliveryServices) throws EAIException;




/****************************************************************************
 *  Implementation of public interface for relationship Parties
 ****************************************************************************/


    /* Public Read accessor for role Parties
     * Returns a copy of the collection, to avoid external changes to the relationship
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.mall.core.ifc.MallPartyIfc[] getParties( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Public Parties finder by name
     */
  public com.dosmil_e.mall.core.ifc.MallPartyIfc findPartiesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public Parties finder predicate by name
     */
  public boolean hasPartiesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public Parties is related predicate
     */
  public boolean hasParties( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallPartyIfc theParties) throws EAIException;


    /* Public Parties read accessor by index
     */
  public com.dosmil_e.mall.core.ifc.MallPartyIfc getPartiesAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public Parties number access
     */
  public int numParties( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public Parties index access
     */
  public int indexOfParties( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallPartyIfc theParties) throws EAIException;


    /* Public Write accessor for role Parties
     * Double change propagation
     */
  public void addParties( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallPartyIfc theParties) throws EAIException;



    /* Public Write accessor for role Parties
     */
  public void removeParties( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallPartyIfc theParties) throws EAIException;



    /* Public ordered Write accessor for role Parties
     */
  public void addPartiesBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallPartyIfc theParties, com.dosmil_e.mall.core.ifc.MallPartyIfc theRelativeParties) throws EAIException;

    /* Public ordered Write accessor for role Parties
     */
  public void movePartiesBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallPartyIfc theParties, com.dosmil_e.mall.core.ifc.MallPartyIfc theRelativeParties) throws EAIException;

    /* Public move to last Write accessor for role Parties
     */
  public void movePartiesToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallPartyIfc theParties) throws EAIException;




}
