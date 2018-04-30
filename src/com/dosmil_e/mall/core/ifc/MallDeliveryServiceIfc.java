package com.dosmil_e.mall.core.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface MallDeliveryServiceIfc
   extends com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc  {


/****************************************************************************
 *  Declaration of accessors to attributes of MallDeliveryService
 ****************************************************************************/






/****************************************************************************
 *  Declaration of accessors to relationships of MallDeliveryService
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
