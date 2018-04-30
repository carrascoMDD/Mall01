package com.dosmil_e.mall.core.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface MallPaymentIfc
   extends com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc  {


/****************************************************************************
 *  Declaration of accessors to attributes of MallPayment
 ****************************************************************************/

/****************************************************************************
 *  Implementation of public interface for attribute Amount
 ****************************************************************************/


    /* Public Read accessor for attribute Amount
     */
  public java.lang.String getAmount( EAIMMCtxtIfc theCtxt) throws EAIException ;



    /* Public Write accessor for attribute Amount
     */
  public void setAmount( EAIMMCtxtIfc theCtxt, java.lang.String theAmount) throws EAIException;





/****************************************************************************
 *  Declaration of accessors to relationships of MallPayment
 ****************************************************************************/


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
