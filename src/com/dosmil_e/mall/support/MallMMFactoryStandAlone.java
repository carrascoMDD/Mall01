package com.dosmil_e.mall.support;

import com.dosmil_e.modelbase.support.EAIMMFactory;
import com.dosmil_e.modelbase.support.EAIMMFactoryIfc;
import com.dosmil_e.modelbase.support.EAIMMCtxtIfc;

import com.dosmil_e.modelbase.flattrx.EAIFlatTransactionMgrIfc;
import com.dosmil_e.modelbase.flattrx.EAIFlatTransactionMgr;

public class MallMMFactoryStandAlone extends EAIMMFactory {


  public MallMMFactoryStandAlone() {
    super();
  }

  public MallMMFactoryStandAlone( EAIMMFactoryIfc theOverridenFactory) {
    super(theOverridenFactory);
  }


  protected void initName() {
    vName = new String("Mall");
  }

  public String getClassNamePrefixForType( EAIMMCtxtIfc theCtxt, String theTypeName) {
    return "Mall";
  }



  public String getLastPackageNameForType( EAIMMCtxtIfc theCtxt, String theTypeName) {
    return "impl";
  }

  public String getStartPackageNameForType( EAIMMCtxtIfc theCtxt, String theTypeName) {
    return "com.dosmil_e.mall";
  }

  public String getClassNamePostfixForType( EAIMMCtxtIfc theCtxt, String theTypeName) {
    return "Impl";
  }


  public String getFullyQualifiedIfcPackageNameForType( EAIMMCtxtIfc theCtxt, String theTypeName) {
    return "com.dosmil_e.mall.core.ifc";
  }

  public String getIfcNamePostfixForType( EAIMMCtxtIfc theCtxt, String theTypeName) {
    return "Ifc";
  }


  public String getFileFilterTermination( EAIMMCtxtIfc theCtxt) {
    return ".mal";
  }

  public String getFileFilterDescription( EAIMMCtxtIfc theCtxt) {
    return "Protoware Studio files (*" + getFileFilterTermination( theCtxt) + ")";
  }


  public String getRootTypeName( EAIMMCtxtIfc theCtxt) {
    return "Mall";
  }

  public String getRootTypePackageNames( EAIMMCtxtIfc theCtxt) {
    return "core";
  }

}
