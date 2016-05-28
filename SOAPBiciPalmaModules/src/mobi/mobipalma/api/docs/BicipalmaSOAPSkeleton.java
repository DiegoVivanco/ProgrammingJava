/**
 * BicipalmaSOAPSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mobi.mobipalma.api.docs;

public class BicipalmaSOAPSkeleton implements mobi.mobipalma.api.docs.Bicipalma_PortType, org.apache.axis.wsdl.Skeleton {
    private mobi.mobipalma.api.docs.Bicipalma_PortType impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://api.mobipalma.mobi/docs/", "estadoEstacionRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://api.mobipalma.mobi/docs/", ">estadoEstacionRequest"), mobi.mobipalma.api.docs.EstadoEstacionRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("estadoEstacion", _params, new javax.xml.namespace.QName("https://api.mobipalma.mobi/docs/", "estadoEstacionResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("https://api.mobipalma.mobi/docs/", ">estadoEstacionResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "estadoEstacion"));
        _oper.setSoapAction("https://api.mobipalma.mobi/docs/estadoEstacion");
        _myOperationsList.add(_oper);
        if (_myOperations.get("estadoEstacion") == null) {
            _myOperations.put("estadoEstacion", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("estadoEstacion")).add(_oper);
    }

    public BicipalmaSOAPSkeleton() {
        this.impl = new mobi.mobipalma.api.docs.BicipalmaSOAPImpl();
    }

    public BicipalmaSOAPSkeleton(mobi.mobipalma.api.docs.Bicipalma_PortType impl) {
        this.impl = impl;
    }
    public mobi.mobipalma.api.docs.EstadoEstacionResponse estadoEstacion(mobi.mobipalma.api.docs.EstadoEstacionRequest parameters) throws java.rmi.RemoteException
    {
        mobi.mobipalma.api.docs.EstadoEstacionResponse ret = impl.estadoEstacion(parameters);
        return ret;
    }

}
