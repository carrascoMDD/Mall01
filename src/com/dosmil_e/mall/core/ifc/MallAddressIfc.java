package com.dosmil_e.mall.core.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface MallAddressIfc
   extends com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc  {


/****************************************************************************
 *  Declaration of accessors to attributes of MallAddress
 ****************************************************************************/

/****************************************************************************
 *  Implementation of public interface for attribute StreetAddress
 ****************************************************************************/


    /* Public Read accessor for attribute StreetAddress
     */
  public java.lang.String getStreetAddress( EAIMMCtxtIfc theCtxt) throws EAIException ;



    /* Public Write accessor for attribute StreetAddress
     */
  public void setStreetAddress( EAIMMCtxtIfc theCtxt, java.lang.String theStreetAddress) throws EAIException;
/****************************************************************************
 *  Implementation of public interface for attribute City
 ****************************************************************************/


    /* Public Read accessor for attribute City
     */
  public java.lang.String getCity( EAIMMCtxtIfc theCtxt) throws EAIException ;



    /* Public Write accessor for attribute City
     */
  public void setCity( EAIMMCtxtIfc theCtxt, java.lang.String theCity) throws EAIException;
/****************************************************************************
 *  Implementation of public interface for attribute PostalCode
 ****************************************************************************/


    /* Public Read accessor for attribute PostalCode
     */
  public java.lang.String getPostalCode( EAIMMCtxtIfc theCtxt) throws EAIException ;



    /* Public Write accessor for attribute PostalCode
     */
  public void setPostalCode( EAIMMCtxtIfc theCtxt, java.lang.String thePostalCode) throws EAIException;
/****************************************************************************
 *  Implementation of public interface for attribute State
 ****************************************************************************/


    /* Public Read accessor for attribute State
     */
  public java.lang.String getState( EAIMMCtxtIfc theCtxt) throws EAIException ;



    /* Public Write accessor for attribute State
     */
  public void setState( EAIMMCtxtIfc theCtxt, java.lang.String theState) throws EAIException;





/****************************************************************************
 *  Declaration of accessors to relationships of MallAddress
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
