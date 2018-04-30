package com.dosmil_e.mall.core.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface MallContactIfc
   extends com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc  {


/****************************************************************************
 *  Declaration of accessors to attributes of MallContact
 ****************************************************************************/

/****************************************************************************
 *  Implementation of public interface for attribute FirstName
 ****************************************************************************/


    /* Public Read accessor for attribute FirstName
     */
  public java.lang.String getFirstName( EAIMMCtxtIfc theCtxt) throws EAIException ;



    /* Public Write accessor for attribute FirstName
     */
  public void setFirstName( EAIMMCtxtIfc theCtxt, java.lang.String theFirstName) throws EAIException;
/****************************************************************************
 *  Implementation of public interface for attribute MiddleInitial
 ****************************************************************************/


    /* Public Read accessor for attribute MiddleInitial
     */
  public java.lang.String getMiddleInitial( EAIMMCtxtIfc theCtxt) throws EAIException ;



    /* Public Write accessor for attribute MiddleInitial
     */
  public void setMiddleInitial( EAIMMCtxtIfc theCtxt, java.lang.String theMiddleInitial) throws EAIException;
/****************************************************************************
 *  Implementation of public interface for attribute LastName
 ****************************************************************************/


    /* Public Read accessor for attribute LastName
     */
  public java.lang.String getLastName( EAIMMCtxtIfc theCtxt) throws EAIException ;



    /* Public Write accessor for attribute LastName
     */
  public void setLastName( EAIMMCtxtIfc theCtxt, java.lang.String theLastName) throws EAIException;
/****************************************************************************
 *  Implementation of public interface for attribute Phone
 ****************************************************************************/


    /* Public Read accessor for attribute Phone
     */
  public java.lang.String getPhone( EAIMMCtxtIfc theCtxt) throws EAIException ;



    /* Public Write accessor for attribute Phone
     */
  public void setPhone( EAIMMCtxtIfc theCtxt, java.lang.String thePhone) throws EAIException;
/****************************************************************************
 *  Implementation of public interface for attribute Fax
 ****************************************************************************/


    /* Public Read accessor for attribute Fax
     */
  public java.lang.String getFax( EAIMMCtxtIfc theCtxt) throws EAIException ;



    /* Public Write accessor for attribute Fax
     */
  public void setFax( EAIMMCtxtIfc theCtxt, java.lang.String theFax) throws EAIException;
/****************************************************************************
 *  Implementation of public interface for attribute Email
 ****************************************************************************/


    /* Public Read accessor for attribute Email
     */
  public java.lang.String getEmail( EAIMMCtxtIfc theCtxt) throws EAIException ;



    /* Public Write accessor for attribute Email
     */
  public void setEmail( EAIMMCtxtIfc theCtxt, java.lang.String theEmail) throws EAIException;





/****************************************************************************
 *  Declaration of accessors to relationships of MallContact
 ****************************************************************************/


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
 *  Implementation of public interface for relationship Shippings
 ****************************************************************************/


    /* Public Read accessor for role Shippings
     * Returns a copy of the collection, to avoid external changes to the relationship
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.mall.core.ifc.MallShippingIfc[] getShippings( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Public Shippings finder by name
     */
  public com.dosmil_e.mall.core.ifc.MallShippingIfc findShippingsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public Shippings finder predicate by name
     */
  public boolean hasShippingsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public Shippings is related predicate
     */
  public boolean hasShippings( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallShippingIfc theShippings) throws EAIException;


    /* Public Shippings read accessor by index
     */
  public com.dosmil_e.mall.core.ifc.MallShippingIfc getShippingsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public Shippings number access
     */
  public int numShippings( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public Shippings index access
     */
  public int indexOfShippings( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallShippingIfc theShippings) throws EAIException;


    /* Public Write accessor for role Shippings
     * Double change propagation
     */
  public void addShippings( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallShippingIfc theShippings) throws EAIException;



    /* Public Write accessor for role Shippings
     */
  public void removeShippings( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallShippingIfc theShippings) throws EAIException;



    /* Public ordered Write accessor for role Shippings
     */
  public void addShippingsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallShippingIfc theShippings, com.dosmil_e.mall.core.ifc.MallShippingIfc theRelativeShippings) throws EAIException;

    /* Public ordered Write accessor for role Shippings
     */
  public void moveShippingsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallShippingIfc theShippings, com.dosmil_e.mall.core.ifc.MallShippingIfc theRelativeShippings) throws EAIException;

    /* Public move to last Write accessor for role Shippings
     */
  public void moveShippingsToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.mall.core.ifc.MallShippingIfc theShippings) throws EAIException;




}
