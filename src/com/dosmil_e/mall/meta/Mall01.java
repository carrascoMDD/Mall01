package com.dosmil_e.mall.meta;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;


public class Mall01 {


/****************************************************************************
 *  Static metainformation for all the metamodel elements in the M3 model
 ****************************************************************************/
  protected static com.dosmil_e.m3.core.ifc.M3ModelIfc vm3Model;


/****************************************************************************
 *  Static metainformation for the root module in the M3 model
 ****************************************************************************/
  public static com.dosmil_e.m3.core.ifc.M3ModuleIfc vm3RootModule;

  
/****************************************************************************
 *  Static metainformation for all the modules in the M3 model
 ****************************************************************************/
	public static com.dosmil_e.m3.core.ifc.M3ModuleIfc vm3ModuleMall01Core;

	public static com.dosmil_e.m3.core.ifc.M3ModuleIfc vm3ModuleCom;

	public static com.dosmil_e.m3.core.ifc.M3ModuleIfc vm3ModuleDosmil_e;

	public static com.dosmil_e.m3.core.ifc.M3ModuleIfc vm3ModuleMall;





/****************************************************************************
 *  Access and initialization of metainformation for all the metamodel elements
 ****************************************************************************/
  public static com.dosmil_e.m3.core.ifc.M3ModelIfc getM3Model( EAIMMCtxtIfc theCtxt) {
    if( vm3Model != null) { return vm3Model;}
    initM3( theCtxt);
    return vm3Model;
  }



/****************************************************************************
 *  Initialization of metainformation for all the metamodel elements
 *    Invokes metainfo initializers (phase1, phase2) on all the metamodel elements
 ****************************************************************************/
  public static void initM3(  EAIMMCtxtIfc theCtxt) {
   try {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        theCtxt.getFlatTrxMgr().setMustPropagateChanges( false);
        initM3Internal( theCtxt);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }
   } catch( EAIException anEx) {}
  }




  protected static void initM3Internal(  EAIMMCtxtIfc theCtxt) {
   try {
		 vm3Model = (com.dosmil_e.m3.core.ifc.M3ModelIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Model", "core",new EAIMMName("Mall01"));
		 vm3Model.setTypePrefix( theCtxt, "Mall");
		 vm3Model.setRelationshipVariablePrefix( theCtxt, "vr");
		 vm3Model.setAttributeVariablePrefix( theCtxt, "va");
		 vm3Model.setEnumVariablePrefix( theCtxt, "");
		 vm3Model.setMetaVariablePrefix( theCtxt, "vm3");
		 vm3Model.setMetaPackageName( theCtxt, "com.dosmil_e.m3.core");
		 vm3Model.setFrameworkPackageName( theCtxt, "com.dosmil_e.modelbase");
		 vm3Model.setFromSpecificationFileNamed( theCtxt, "Q:\\BXS\\EAI\\Studio\\Mall01\\docs\\Mall01.cdl");
		 vm3Model.setPackageName( theCtxt, "com.dosmil_e.mall");
		 vm3Model.setTemplatesDirectoryName( theCtxt, "Q:\\BXS\\EAI\\Studio\\EAIModelBase01\\templatesdynamicreducedACTIONS");
		 vm3Model.setProjectName( theCtxt, "Mall01GenKK.jpr");
		 vm3Model.setProjectDirectoryName( theCtxt, "Q:\\BXS\\EAI\\Studio\\Mall01\\");
		 vm3Model.setOutputDirectoryName( theCtxt, "Q:\\BXS\\EAI\\Studio\\Mall01\\mySrc");
		 vm3Model.setSerialVersionUIDPrefix( theCtxt, "33311236452");
		 vm3Model.setSkipTypes( theCtxt,  new String[] { "MMElement" } );
		 vm3Model.setSkipModules( theCtxt,  new String[] {  } );
		 vm3Model.setDefaultSuperTypeFullBaseClassName( theCtxt, "com.dosmil_e.m3.withm3.base.MMElementWithM3Base");
		 vm3Model.setDefaultSuperTypeFullIfcClassName( theCtxt, "com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc");
		 vm3Model.setDefaultSuperTypeFullPrivClassName( theCtxt, "com.dosmil_e.m3.withm3.priv.MMElementWithM3Priv");
		 vm3Model.setDefaultSuperTypeFullPubClassName( theCtxt, "com.dosmil_e.m3.withm3.pub.MMElementWithM3Pub");
		 vm3Model.setDefaultSuperTypeFullTrxClassName( theCtxt, "com.dosmil_e.m3.withm3.trx.MMElementWithM3Trx");




		com.dosmil_e.mall.core.meta.MallAddressMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.mall.core.meta.MallContactMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.mall.core.meta.MallDeliveryServiceMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.mall.core.meta.MallShippingMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.mall.core.meta.MallMallMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.mall.core.meta.MallPartyMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.mall.core.meta.MallPaymentMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.mall.core.meta.MallInvoiceLineMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.mall.core.meta.MallPurchaseOrderLineMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.mall.core.meta.MallInvoiceMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.mall.core.meta.MallProductMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.mall.core.meta.MallCustomerMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.mall.core.meta.MallVendorMeta.initM3TypePhase1( theCtxt);






		com.dosmil_e.mall.core.meta.MallAddressMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.mall.core.meta.MallContactMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.mall.core.meta.MallDeliveryServiceMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.mall.core.meta.MallShippingMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.mall.core.meta.MallMallMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.mall.core.meta.MallPartyMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.mall.core.meta.MallPaymentMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.mall.core.meta.MallInvoiceLineMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.mall.core.meta.MallPurchaseOrderLineMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.mall.core.meta.MallInvoiceMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.mall.core.meta.MallProductMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.mall.core.meta.MallCustomerMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.mall.core.meta.MallVendorMeta.initM3TypePhase2( theCtxt);







		vm3ModuleCom = (com.dosmil_e.m3.core.ifc.M3ModuleIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Module", "core",new EAIMMName("com"));
		vm3RootModule = vm3ModuleCom;
		vm3Model.addSubModules( theCtxt, vm3ModuleCom);
		vm3ModuleDosmil_e = (com.dosmil_e.m3.core.ifc.M3ModuleIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Module", "core",new EAIMMName("dosmil_e"));
		vm3ModuleCom.addSubModules( theCtxt, vm3ModuleDosmil_e);
		vm3ModuleMall = (com.dosmil_e.m3.core.ifc.M3ModuleIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Module", "core",new EAIMMName("mall"));
		vm3ModuleDosmil_e.addSubModules( theCtxt, vm3ModuleMall);


		vm3ModuleMall01Core = (com.dosmil_e.m3.core.ifc.M3ModuleIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Module", "core",new EAIMMName("core"));
		vm3ModuleMall.addSubModules( theCtxt, vm3ModuleMall01Core);
		vm3ModuleMall01Core.addTypes( theCtxt,com.dosmil_e.mall.core.meta.MallAddressMeta.vm3Type);
		vm3ModuleMall01Core.addTypes( theCtxt,com.dosmil_e.mall.core.meta.MallContactMeta.vm3Type);
		vm3ModuleMall01Core.addTypes( theCtxt,com.dosmil_e.mall.core.meta.MallDeliveryServiceMeta.vm3Type);
		vm3ModuleMall01Core.addTypes( theCtxt,com.dosmil_e.mall.core.meta.MallShippingMeta.vm3Type);
		vm3ModuleMall01Core.addTypes( theCtxt,com.dosmil_e.mall.core.meta.MallMallMeta.vm3Type);
		vm3ModuleMall01Core.addTypes( theCtxt,com.dosmil_e.mall.core.meta.MallPartyMeta.vm3Type);
		vm3ModuleMall01Core.addTypes( theCtxt,com.dosmil_e.mall.core.meta.MallPaymentMeta.vm3Type);
		vm3ModuleMall01Core.addTypes( theCtxt,com.dosmil_e.mall.core.meta.MallInvoiceLineMeta.vm3Type);
		vm3ModuleMall01Core.addTypes( theCtxt,com.dosmil_e.mall.core.meta.MallPurchaseOrderLineMeta.vm3Type);
		vm3ModuleMall01Core.addTypes( theCtxt,com.dosmil_e.mall.core.meta.MallInvoiceMeta.vm3Type);
		vm3ModuleMall01Core.addTypes( theCtxt,com.dosmil_e.mall.core.meta.MallPurchaseOrderMeta.vm3Type);
		vm3ModuleMall01Core.addTypes( theCtxt,com.dosmil_e.mall.core.meta.MallProductMeta.vm3Type);
		vm3ModuleMall01Core.addTypes( theCtxt,com.dosmil_e.mall.core.meta.MallCustomerMeta.vm3Type);
		vm3ModuleMall01Core.addTypes( theCtxt,com.dosmil_e.mall.core.meta.MallVendorMeta.vm3Type);





		com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc aTraversalConfig = 
			new com.dosmil_e.mall.meta.MallTraversalConfig( theCtxt, 
			new EAIMMName( com.dosmil_e.mall.meta.MallTraversalConfig.gTraversalConfigName), vm3Model);
		vm3Model.addTraversalConfigs( theCtxt, aTraversalConfig);

		com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc aReplicationConfig = 
			new com.dosmil_e.mall.meta.MallReplicationConfig( theCtxt, 
			new EAIMMName( com.dosmil_e.mall.meta.MallReplicationConfig.gTraversalConfigName), vm3Model);
		vm3Model.addTraversalConfigs( theCtxt, aReplicationConfig);



   } catch( EAIException anEx) {}
  }



}
