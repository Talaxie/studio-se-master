
/**
 * CrmServiceStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5  Built on : Apr 30, 2009 (06:07:24 EDT)
 */
        package com.microsoft.crm4.webserviceTest;

        

        /*
        *  CrmServiceStub java implementation
        */


        public class CrmServiceStub extends org.apache.axis2.client.Stub
        {
        protected org.apache.axis2.description.AxisOperation[] _operations;

        //hashmaps to keep the fault mapping
        private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
        private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
        private java.util.HashMap faultMessageMap = new java.util.HashMap();

        private static int counter = 0;

        private static synchronized java.lang.String getUniqueSuffix(){
            // reset the counter if it is greater than 99999
            if (counter > 99999){
                counter = 0;
            }
            counter = counter + 1;
            return java.lang.Long.toString(System.currentTimeMillis()) + "_" + counter;
        }


    private void populateAxisService() throws org.apache.axis2.AxisFault {

     //creating the Service with a unique name
     _service = new org.apache.axis2.description.AxisService("CrmService" + getUniqueSuffix());
     addAnonymousOperations();

        //creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[7];

                   __operation = new org.apache.axis2.description.OutInAxisOperation();


            __operation.setName(new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "fetch"));
	    _service.addOperation(__operation);




            _operations[0]=__operation;


                   __operation = new org.apache.axis2.description.OutInAxisOperation();


            __operation.setName(new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "create"));
	    _service.addOperation(__operation);




            _operations[1]=__operation;


                   __operation = new org.apache.axis2.description.OutInAxisOperation();


            __operation.setName(new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "delete"));
	    _service.addOperation(__operation);




            _operations[2]=__operation;


                   __operation = new org.apache.axis2.description.OutInAxisOperation();


            __operation.setName(new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "update"));
	    _service.addOperation(__operation);




            _operations[3]=__operation;


                   __operation = new org.apache.axis2.description.OutInAxisOperation();


            __operation.setName(new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "retrieveMultiple"));
	    _service.addOperation(__operation);




            _operations[4]=__operation;


                   __operation = new org.apache.axis2.description.OutInAxisOperation();


            __operation.setName(new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "retrieve"));
	    _service.addOperation(__operation);




            _operations[5]=__operation;


                   __operation = new org.apache.axis2.description.OutInAxisOperation();


            __operation.setName(new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "execute"));
	    _service.addOperation(__operation);




            _operations[6]=__operation;


        }

    //populates the faults
    private void populateFaults(){



    }

    /**
      *Constructor that takes in a configContext
      */

    public CrmServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
       java.lang.String targetEndpoint)
       throws org.apache.axis2.AxisFault {
         this(configurationContext,targetEndpoint,false);
   }


   /**
     * Constructor that takes in a configContext  and useseperate listner
     */
   public CrmServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
        java.lang.String targetEndpoint, boolean useSeparateListener)
        throws org.apache.axis2.AxisFault {
         //To populate AxisService
         populateAxisService();
         populateFaults();

        _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext,_service);


        _serviceClient.getOptions().setTo(new org.apache.axis2.addressing.EndpointReference(
                targetEndpoint));
        _serviceClient.getOptions().setUseSeparateListener(useSeparateListener);

            //Set the soap version
            _serviceClient.getOptions().setSoapVersionURI(org.apache.axiom.soap.SOAP12Constants.SOAP_ENVELOPE_NAMESPACE_URI);


    }

    /**
     * Default Constructor
     */
    public CrmServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext) throws org.apache.axis2.AxisFault {

                    this(configurationContext,"http://win2003/MSCrmServices/2007/CrmService.asmx" );

    }

    /**
     * Default Constructor
     */
    public CrmServiceStub() throws org.apache.axis2.AxisFault {

                    this("http://win2003/MSCrmServices/2007/CrmService.asmx" );

    }

    /**
     * Constructor taking the target endpoint
     */
    public CrmServiceStub(java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(null,targetEndpoint);
    }




                    /**
                     * Auto generated method signature
                     * Executes a query specified in the FetchXML language. The results are returned as an XML string.
                     * @see com.microsoft.crm4.webserviceTest.CrmService#fetch
                     * @param fetch18

                     * @param crmAuthenticationToken19

                     * @param callerOriginToken20

                     * @param correlationToken21

                     */



                            public  com.microsoft.schemas.crm._2007.webservices.FetchResponseDocument fetch(

                            com.microsoft.schemas.crm._2007.webservices.FetchDocument fetch18,com.microsoft.schemas.crm._2007.webservices.CrmAuthenticationTokenDocument crmAuthenticationToken19,com.microsoft.schemas.crm._2007.webservices.CallerOriginTokenDocument callerOriginToken20,com.microsoft.schemas.crm._2007.webservices.CorrelationTokenDocument correlationToken21)


                    throws java.rmi.RemoteException

                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
              _operationClient.getOptions().setAction("http://schemas.microsoft.com/crm/2007/WebServices/Fetch");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);



                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");


              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();



              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;


                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    fetch18,
                                                    optimizeContent(new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices",
                                                    "fetch")));

                                               env.build();

                                        // add the children only if the parameter is not null
                                        if (crmAuthenticationToken19!=null){

                                                    org.apache.axiom.om.OMElement omElementcrmAuthenticationToken19 = toOM(crmAuthenticationToken19, optimizeContent(new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "fetch")));
                                                    addHeader(omElementcrmAuthenticationToken19,env);

                                        }

                                        // add the children only if the parameter is not null
                                        if (callerOriginToken20!=null){

                                                    org.apache.axiom.om.OMElement omElementcallerOriginToken20 = toOM(callerOriginToken20, optimizeContent(new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "fetch")));
                                                    addHeader(omElementcallerOriginToken20,env);

                                        }

                                        // add the children only if the parameter is not null
                                        if (correlationToken21!=null){

                                                    org.apache.axiom.om.OMElement omElementcorrelationToken21 = toOM(correlationToken21, optimizeContent(new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "fetch")));
                                                    addHeader(omElementcorrelationToken21,env);

                                        }

        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);


               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.microsoft.schemas.crm._2007.webservices.FetchResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));


                                        return (com.microsoft.schemas.crm._2007.webservices.FetchResponseDocument)object;

         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});


                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }

                /**
                * Auto generated method signature for Asynchronous Invocations
                * Executes a query specified in the FetchXML language. The results are returned as an XML string.
                * @see com.microsoft.crm4.webserviceTest.CrmService#startfetch
                    * @param fetch18

                    * @param crmAuthenticationToken19

                    * @param callerOriginToken20

                    * @param correlationToken21

                */
                public  void startfetch(

                 com.microsoft.schemas.crm._2007.webservices.FetchDocument fetch18,com.microsoft.schemas.crm._2007.webservices.CrmAuthenticationTokenDocument crmAuthenticationToken19,
                    com.microsoft.schemas.crm._2007.webservices.CallerOriginTokenDocument callerOriginToken20,
                    com.microsoft.schemas.crm._2007.webservices.CorrelationTokenDocument correlationToken21,


                  final com.microsoft.crm4.webserviceTest.CrmServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
             _operationClient.getOptions().setAction("http://schemas.microsoft.com/crm/2007/WebServices/Fetch");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);



                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");



              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


                                    //Style is Doc.


                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    fetch18,
                                                    optimizeContent(new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices",
                                                    "fetch")));

                                         // add the soap_headers only if they are not null
                                        if (crmAuthenticationToken19!=null){

                                                    org.apache.axiom.om.OMElement omElementcrmAuthenticationToken19 = toOM(crmAuthenticationToken19, optimizeContent(new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "fetch")));
                                                    addHeader(omElementcrmAuthenticationToken19,env);

                                        }

                                         // add the soap_headers only if they are not null
                                        if (callerOriginToken20!=null){

                                                    org.apache.axiom.om.OMElement omElementcallerOriginToken20 = toOM(callerOriginToken20, optimizeContent(new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "fetch")));
                                                    addHeader(omElementcallerOriginToken20,env);

                                        }

                                         // add the soap_headers only if they are not null
                                        if (correlationToken21!=null){

                                                    org.apache.axiom.om.OMElement omElementcorrelationToken21 = toOM(correlationToken21, optimizeContent(new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "fetch")));
                                                    addHeader(omElementcorrelationToken21,env);

                                        }

        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);



                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.microsoft.schemas.crm._2007.webservices.FetchResponseDocument.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultfetch(
                                        (com.microsoft.schemas.crm._2007.webservices.FetchResponseDocument)object);

                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorfetch(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});


										            callback.receiveErrorfetch(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorfetch(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorfetch(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorfetch(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorfetch(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorfetch(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorfetch(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorfetch(f);
                                            }
									    } else {
										    callback.receiveErrorfetch(f);
									    }
									} else {
									    callback.receiveErrorfetch(f);
									}
								} else {
								    callback.receiveErrorfetch(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorfetch(axisFault);
                                }
                            }
                });


          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[0].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[0].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }

                    /**
                     * Auto generated method signature
                     * Creates an instance of an entity.
                     * @see com.microsoft.crm4.webserviceTest.CrmService#create
                     * @param create23

                     * @param crmAuthenticationToken24

                     * @param callerOriginToken25

                     * @param correlationToken26

                     */



                            public  com.microsoft.schemas.crm._2007.webservices.CreateResponseDocument create(

                            com.microsoft.schemas.crm._2007.webservices.CreateDocument create23,com.microsoft.schemas.crm._2007.webservices.CrmAuthenticationTokenDocument crmAuthenticationToken24,com.microsoft.schemas.crm._2007.webservices.CallerOriginTokenDocument callerOriginToken25,com.microsoft.schemas.crm._2007.webservices.CorrelationTokenDocument correlationToken26)


                    throws java.rmi.RemoteException

                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
              _operationClient.getOptions().setAction("http://schemas.microsoft.com/crm/2007/WebServices/Create");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);



                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");


              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();



              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;


                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    create23,
                                                    optimizeContent(new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices",
                                                    "create")));

                                               env.build();

                                        // add the children only if the parameter is not null
                                        if (crmAuthenticationToken24!=null){

                                                    org.apache.axiom.om.OMElement omElementcrmAuthenticationToken24 = toOM(crmAuthenticationToken24, optimizeContent(new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "create")));
                                                    addHeader(omElementcrmAuthenticationToken24,env);

                                        }

                                        // add the children only if the parameter is not null
                                        if (callerOriginToken25!=null){

                                                    org.apache.axiom.om.OMElement omElementcallerOriginToken25 = toOM(callerOriginToken25, optimizeContent(new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "create")));
                                                    addHeader(omElementcallerOriginToken25,env);

                                        }

                                        // add the children only if the parameter is not null
                                        if (correlationToken26!=null){

                                                    org.apache.axiom.om.OMElement omElementcorrelationToken26 = toOM(correlationToken26, optimizeContent(new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "create")));
                                                    addHeader(omElementcorrelationToken26,env);

                                        }

        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);


               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.microsoft.schemas.crm._2007.webservices.CreateResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));


                                        return (com.microsoft.schemas.crm._2007.webservices.CreateResponseDocument)object;

         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});


                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }

                /**
                * Auto generated method signature for Asynchronous Invocations
                * Creates an instance of an entity.
                * @see com.microsoft.crm4.webserviceTest.CrmService#startcreate
                    * @param create23

                    * @param crmAuthenticationToken24

                    * @param callerOriginToken25

                    * @param correlationToken26

                */
                public  void startcreate(

                 com.microsoft.schemas.crm._2007.webservices.CreateDocument create23,com.microsoft.schemas.crm._2007.webservices.CrmAuthenticationTokenDocument crmAuthenticationToken24,
                    com.microsoft.schemas.crm._2007.webservices.CallerOriginTokenDocument callerOriginToken25,
                    com.microsoft.schemas.crm._2007.webservices.CorrelationTokenDocument correlationToken26,


                  final com.microsoft.crm4.webserviceTest.CrmServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
             _operationClient.getOptions().setAction("http://schemas.microsoft.com/crm/2007/WebServices/Create");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);



                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");



              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


                                    //Style is Doc.


                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    create23,
                                                    optimizeContent(new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices",
                                                    "create")));

                                         // add the soap_headers only if they are not null
                                        if (crmAuthenticationToken24!=null){

                                                    org.apache.axiom.om.OMElement omElementcrmAuthenticationToken24 = toOM(crmAuthenticationToken24, optimizeContent(new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "create")));
                                                    addHeader(omElementcrmAuthenticationToken24,env);

                                        }

                                         // add the soap_headers only if they are not null
                                        if (callerOriginToken25!=null){

                                                    org.apache.axiom.om.OMElement omElementcallerOriginToken25 = toOM(callerOriginToken25, optimizeContent(new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "create")));
                                                    addHeader(omElementcallerOriginToken25,env);

                                        }

                                         // add the soap_headers only if they are not null
                                        if (correlationToken26!=null){

                                                    org.apache.axiom.om.OMElement omElementcorrelationToken26 = toOM(correlationToken26, optimizeContent(new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "create")));
                                                    addHeader(omElementcorrelationToken26,env);

                                        }

        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);



                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.microsoft.schemas.crm._2007.webservices.CreateResponseDocument.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultcreate(
                                        (com.microsoft.schemas.crm._2007.webservices.CreateResponseDocument)object);

                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorcreate(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});


										            callback.receiveErrorcreate(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcreate(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcreate(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcreate(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcreate(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcreate(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcreate(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcreate(f);
                                            }
									    } else {
										    callback.receiveErrorcreate(f);
									    }
									} else {
									    callback.receiveErrorcreate(f);
									}
								} else {
								    callback.receiveErrorcreate(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorcreate(axisFault);
                                }
                            }
                });


          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[1].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[1].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }

                    /**
                     * Auto generated method signature
                     * Deletes the instance of the specified entity.
                     * @see com.microsoft.crm4.webserviceTest.CrmService#delete
                     * @param delete28

                     * @param crmAuthenticationToken29

                     * @param callerOriginToken30

                     * @param correlationToken31

                     */



                            public  com.microsoft.schemas.crm._2007.webservices.DeleteResponseDocument delete(

                            com.microsoft.schemas.crm._2007.webservices.DeleteDocument delete28,com.microsoft.schemas.crm._2007.webservices.CrmAuthenticationTokenDocument crmAuthenticationToken29,com.microsoft.schemas.crm._2007.webservices.CallerOriginTokenDocument callerOriginToken30,com.microsoft.schemas.crm._2007.webservices.CorrelationTokenDocument correlationToken31)


                    throws java.rmi.RemoteException

                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
              _operationClient.getOptions().setAction("http://schemas.microsoft.com/crm/2007/WebServices/Delete");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);



                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");


              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();



              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;


                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    delete28,
                                                    optimizeContent(new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices",
                                                    "delete")));

                                               env.build();

                                        // add the children only if the parameter is not null
                                        if (crmAuthenticationToken29!=null){

                                                    org.apache.axiom.om.OMElement omElementcrmAuthenticationToken29 = toOM(crmAuthenticationToken29, optimizeContent(new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "delete")));
                                                    addHeader(omElementcrmAuthenticationToken29,env);

                                        }

                                        // add the children only if the parameter is not null
                                        if (callerOriginToken30!=null){

                                                    org.apache.axiom.om.OMElement omElementcallerOriginToken30 = toOM(callerOriginToken30, optimizeContent(new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "delete")));
                                                    addHeader(omElementcallerOriginToken30,env);

                                        }

                                        // add the children only if the parameter is not null
                                        if (correlationToken31!=null){

                                                    org.apache.axiom.om.OMElement omElementcorrelationToken31 = toOM(correlationToken31, optimizeContent(new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "delete")));
                                                    addHeader(omElementcorrelationToken31,env);

                                        }

        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);


               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.microsoft.schemas.crm._2007.webservices.DeleteResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));


                                        return (com.microsoft.schemas.crm._2007.webservices.DeleteResponseDocument)object;

         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});


                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }

                /**
                * Auto generated method signature for Asynchronous Invocations
                * Deletes the instance of the specified entity.
                * @see com.microsoft.crm4.webserviceTest.CrmService#startdelete
                    * @param delete28

                    * @param crmAuthenticationToken29

                    * @param callerOriginToken30

                    * @param correlationToken31

                */
                public  void startdelete(

                 com.microsoft.schemas.crm._2007.webservices.DeleteDocument delete28,com.microsoft.schemas.crm._2007.webservices.CrmAuthenticationTokenDocument crmAuthenticationToken29,
                    com.microsoft.schemas.crm._2007.webservices.CallerOriginTokenDocument callerOriginToken30,
                    com.microsoft.schemas.crm._2007.webservices.CorrelationTokenDocument correlationToken31,


                  final com.microsoft.crm4.webserviceTest.CrmServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
             _operationClient.getOptions().setAction("http://schemas.microsoft.com/crm/2007/WebServices/Delete");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);



                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");



              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


                                    //Style is Doc.


                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    delete28,
                                                    optimizeContent(new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices",
                                                    "delete")));

                                         // add the soap_headers only if they are not null
                                        if (crmAuthenticationToken29!=null){

                                                    org.apache.axiom.om.OMElement omElementcrmAuthenticationToken29 = toOM(crmAuthenticationToken29, optimizeContent(new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "delete")));
                                                    addHeader(omElementcrmAuthenticationToken29,env);

                                        }

                                         // add the soap_headers only if they are not null
                                        if (callerOriginToken30!=null){

                                                    org.apache.axiom.om.OMElement omElementcallerOriginToken30 = toOM(callerOriginToken30, optimizeContent(new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "delete")));
                                                    addHeader(omElementcallerOriginToken30,env);

                                        }

                                         // add the soap_headers only if they are not null
                                        if (correlationToken31!=null){

                                                    org.apache.axiom.om.OMElement omElementcorrelationToken31 = toOM(correlationToken31, optimizeContent(new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "delete")));
                                                    addHeader(omElementcorrelationToken31,env);

                                        }

        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);



                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.microsoft.schemas.crm._2007.webservices.DeleteResponseDocument.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultdelete(
                                        (com.microsoft.schemas.crm._2007.webservices.DeleteResponseDocument)object);

                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrordelete(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});


										            callback.receiveErrordelete(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrordelete(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrordelete(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrordelete(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrordelete(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrordelete(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrordelete(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrordelete(f);
                                            }
									    } else {
										    callback.receiveErrordelete(f);
									    }
									} else {
									    callback.receiveErrordelete(f);
									}
								} else {
								    callback.receiveErrordelete(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrordelete(axisFault);
                                }
                            }
                });


          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[2].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[2].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }

                    /**
                     * Auto generated method signature
                     * Updates the instance of the specified entity.
                     * @see com.microsoft.crm4.webserviceTest.CrmService#update
                     * @param update33

                     * @param crmAuthenticationToken34

                     * @param callerOriginToken35

                     * @param correlationToken36

                     */



                            public  com.microsoft.schemas.crm._2007.webservices.UpdateResponseDocument update(

                            com.microsoft.schemas.crm._2007.webservices.UpdateDocument update33,com.microsoft.schemas.crm._2007.webservices.CrmAuthenticationTokenDocument crmAuthenticationToken34,com.microsoft.schemas.crm._2007.webservices.CallerOriginTokenDocument callerOriginToken35,com.microsoft.schemas.crm._2007.webservices.CorrelationTokenDocument correlationToken36)


                    throws java.rmi.RemoteException

                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
              _operationClient.getOptions().setAction("http://schemas.microsoft.com/crm/2007/WebServices/Update");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);



                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");


              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();



              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;


                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    update33,
                                                    optimizeContent(new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices",
                                                    "update")));

                                               env.build();

                                        // add the children only if the parameter is not null
                                        if (crmAuthenticationToken34!=null){

                                                    org.apache.axiom.om.OMElement omElementcrmAuthenticationToken34 = toOM(crmAuthenticationToken34, optimizeContent(new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "update")));
                                                    addHeader(omElementcrmAuthenticationToken34,env);

                                        }

                                        // add the children only if the parameter is not null
                                        if (callerOriginToken35!=null){

                                                    org.apache.axiom.om.OMElement omElementcallerOriginToken35 = toOM(callerOriginToken35, optimizeContent(new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "update")));
                                                    addHeader(omElementcallerOriginToken35,env);

                                        }

                                        // add the children only if the parameter is not null
                                        if (correlationToken36!=null){

                                                    org.apache.axiom.om.OMElement omElementcorrelationToken36 = toOM(correlationToken36, optimizeContent(new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "update")));
                                                    addHeader(omElementcorrelationToken36,env);

                                        }

        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);


               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.microsoft.schemas.crm._2007.webservices.UpdateResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));


                                        return (com.microsoft.schemas.crm._2007.webservices.UpdateResponseDocument)object;

         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});


                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }

                /**
                * Auto generated method signature for Asynchronous Invocations
                * Updates the instance of the specified entity.
                * @see com.microsoft.crm4.webserviceTest.CrmService#startupdate
                    * @param update33

                    * @param crmAuthenticationToken34

                    * @param callerOriginToken35

                    * @param correlationToken36

                */
                public  void startupdate(

                 com.microsoft.schemas.crm._2007.webservices.UpdateDocument update33,com.microsoft.schemas.crm._2007.webservices.CrmAuthenticationTokenDocument crmAuthenticationToken34,
                    com.microsoft.schemas.crm._2007.webservices.CallerOriginTokenDocument callerOriginToken35,
                    com.microsoft.schemas.crm._2007.webservices.CorrelationTokenDocument correlationToken36,


                  final com.microsoft.crm4.webserviceTest.CrmServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
             _operationClient.getOptions().setAction("http://schemas.microsoft.com/crm/2007/WebServices/Update");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);



                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");



              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


                                    //Style is Doc.


                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    update33,
                                                    optimizeContent(new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices",
                                                    "update")));

                                         // add the soap_headers only if they are not null
                                        if (crmAuthenticationToken34!=null){

                                                    org.apache.axiom.om.OMElement omElementcrmAuthenticationToken34 = toOM(crmAuthenticationToken34, optimizeContent(new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "update")));
                                                    addHeader(omElementcrmAuthenticationToken34,env);

                                        }

                                         // add the soap_headers only if they are not null
                                        if (callerOriginToken35!=null){

                                                    org.apache.axiom.om.OMElement omElementcallerOriginToken35 = toOM(callerOriginToken35, optimizeContent(new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "update")));
                                                    addHeader(omElementcallerOriginToken35,env);

                                        }

                                         // add the soap_headers only if they are not null
                                        if (correlationToken36!=null){

                                                    org.apache.axiom.om.OMElement omElementcorrelationToken36 = toOM(correlationToken36, optimizeContent(new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "update")));
                                                    addHeader(omElementcorrelationToken36,env);

                                        }

        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);



                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.microsoft.schemas.crm._2007.webservices.UpdateResponseDocument.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultupdate(
                                        (com.microsoft.schemas.crm._2007.webservices.UpdateResponseDocument)object);

                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorupdate(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});


										            callback.receiveErrorupdate(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorupdate(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorupdate(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorupdate(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorupdate(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorupdate(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorupdate(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorupdate(f);
                                            }
									    } else {
										    callback.receiveErrorupdate(f);
									    }
									} else {
									    callback.receiveErrorupdate(f);
									}
								} else {
								    callback.receiveErrorupdate(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorupdate(axisFault);
                                }
                            }
                });


          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[3].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[3].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }

                    /**
                     * Auto generated method signature
                     * Retrieves a collection of entity instances of the specified type, which meet the specified conditions.
                     * @see com.microsoft.crm4.webserviceTest.CrmService#retrieveMultiple
                     * @param retrieveMultiple38

                     * @param crmAuthenticationToken39

                     * @param callerOriginToken40

                     * @param correlationToken41

                     */



                            public  com.microsoft.schemas.crm._2007.webservices.RetrieveMultipleResponseDocument retrieveMultiple(

                            com.microsoft.schemas.crm._2007.webservices.RetrieveMultipleDocument retrieveMultiple38,com.microsoft.schemas.crm._2007.webservices.CrmAuthenticationTokenDocument crmAuthenticationToken39,com.microsoft.schemas.crm._2007.webservices.CallerOriginTokenDocument callerOriginToken40,com.microsoft.schemas.crm._2007.webservices.CorrelationTokenDocument correlationToken41)


                    throws java.rmi.RemoteException

                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
              _operationClient.getOptions().setAction("http://schemas.microsoft.com/crm/2007/WebServices/RetrieveMultiple");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);



                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");


              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();



              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;


                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    retrieveMultiple38,
                                                    optimizeContent(new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices",
                                                    "retrieveMultiple")));

                                               env.build();

                                        // add the children only if the parameter is not null
                                        if (crmAuthenticationToken39!=null){

                                                    org.apache.axiom.om.OMElement omElementcrmAuthenticationToken39 = toOM(crmAuthenticationToken39, optimizeContent(new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "retrieveMultiple")));
                                                    addHeader(omElementcrmAuthenticationToken39,env);

                                        }

                                        // add the children only if the parameter is not null
                                        if (callerOriginToken40!=null){

                                                    org.apache.axiom.om.OMElement omElementcallerOriginToken40 = toOM(callerOriginToken40, optimizeContent(new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "retrieveMultiple")));
                                                    addHeader(omElementcallerOriginToken40,env);

                                        }

                                        // add the children only if the parameter is not null
                                        if (correlationToken41!=null){

                                                    org.apache.axiom.om.OMElement omElementcorrelationToken41 = toOM(correlationToken41, optimizeContent(new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "retrieveMultiple")));
                                                    addHeader(omElementcorrelationToken41,env);

                                        }

        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);


               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.microsoft.schemas.crm._2007.webservices.RetrieveMultipleResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));


                                        return (com.microsoft.schemas.crm._2007.webservices.RetrieveMultipleResponseDocument)object;

         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});


                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }

                /**
                * Auto generated method signature for Asynchronous Invocations
                * Retrieves a collection of entity instances of the specified type, which meet the specified conditions.
                * @see com.microsoft.crm4.webserviceTest.CrmService#startretrieveMultiple
                    * @param retrieveMultiple38

                    * @param crmAuthenticationToken39

                    * @param callerOriginToken40

                    * @param correlationToken41

                */
                public  void startretrieveMultiple(

                 com.microsoft.schemas.crm._2007.webservices.RetrieveMultipleDocument retrieveMultiple38,com.microsoft.schemas.crm._2007.webservices.CrmAuthenticationTokenDocument crmAuthenticationToken39,
                    com.microsoft.schemas.crm._2007.webservices.CallerOriginTokenDocument callerOriginToken40,
                    com.microsoft.schemas.crm._2007.webservices.CorrelationTokenDocument correlationToken41,


                  final com.microsoft.crm4.webserviceTest.CrmServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
             _operationClient.getOptions().setAction("http://schemas.microsoft.com/crm/2007/WebServices/RetrieveMultiple");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);



                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");



              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


                                    //Style is Doc.


                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    retrieveMultiple38,
                                                    optimizeContent(new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices",
                                                    "retrieveMultiple")));

                                         // add the soap_headers only if they are not null
                                        if (crmAuthenticationToken39!=null){

                                                    org.apache.axiom.om.OMElement omElementcrmAuthenticationToken39 = toOM(crmAuthenticationToken39, optimizeContent(new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "retrieveMultiple")));
                                                    addHeader(omElementcrmAuthenticationToken39,env);

                                        }

                                         // add the soap_headers only if they are not null
                                        if (callerOriginToken40!=null){

                                                    org.apache.axiom.om.OMElement omElementcallerOriginToken40 = toOM(callerOriginToken40, optimizeContent(new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "retrieveMultiple")));
                                                    addHeader(omElementcallerOriginToken40,env);

                                        }

                                         // add the soap_headers only if they are not null
                                        if (correlationToken41!=null){

                                                    org.apache.axiom.om.OMElement omElementcorrelationToken41 = toOM(correlationToken41, optimizeContent(new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "retrieveMultiple")));
                                                    addHeader(omElementcorrelationToken41,env);

                                        }

        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);



                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.microsoft.schemas.crm._2007.webservices.RetrieveMultipleResponseDocument.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultretrieveMultiple(
                                        (com.microsoft.schemas.crm._2007.webservices.RetrieveMultipleResponseDocument)object);

                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorretrieveMultiple(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});


										            callback.receiveErrorretrieveMultiple(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorretrieveMultiple(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorretrieveMultiple(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorretrieveMultiple(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorretrieveMultiple(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorretrieveMultiple(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorretrieveMultiple(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorretrieveMultiple(f);
                                            }
									    } else {
										    callback.receiveErrorretrieveMultiple(f);
									    }
									} else {
									    callback.receiveErrorretrieveMultiple(f);
									}
								} else {
								    callback.receiveErrorretrieveMultiple(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorretrieveMultiple(axisFault);
                                }
                            }
                });


          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[4].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[4].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }

                    /**
                     * Auto generated method signature
                     * Retrieves an instance of the specified entity.
                     * @see com.microsoft.crm4.webserviceTest.CrmService#retrieve
                     * @param retrieve43

                     * @param crmAuthenticationToken44

                     * @param callerOriginToken45

                     * @param correlationToken46

                     */



                            public  com.microsoft.schemas.crm._2007.webservices.RetrieveResponseDocument retrieve(

                            com.microsoft.schemas.crm._2007.webservices.RetrieveDocument retrieve43,com.microsoft.schemas.crm._2007.webservices.CrmAuthenticationTokenDocument crmAuthenticationToken44,com.microsoft.schemas.crm._2007.webservices.CallerOriginTokenDocument callerOriginToken45,com.microsoft.schemas.crm._2007.webservices.CorrelationTokenDocument correlationToken46)


                    throws java.rmi.RemoteException

                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
              _operationClient.getOptions().setAction("http://schemas.microsoft.com/crm/2007/WebServices/Retrieve");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);



                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");


              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();



              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;


                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    retrieve43,
                                                    optimizeContent(new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices",
                                                    "retrieve")));

                                               env.build();

                                        // add the children only if the parameter is not null
                                        if (crmAuthenticationToken44!=null){

                                                    org.apache.axiom.om.OMElement omElementcrmAuthenticationToken44 = toOM(crmAuthenticationToken44, optimizeContent(new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "retrieve")));
                                                    addHeader(omElementcrmAuthenticationToken44,env);

                                        }

                                        // add the children only if the parameter is not null
                                        if (callerOriginToken45!=null){

                                                    org.apache.axiom.om.OMElement omElementcallerOriginToken45 = toOM(callerOriginToken45, optimizeContent(new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "retrieve")));
                                                    addHeader(omElementcallerOriginToken45,env);

                                        }

                                        // add the children only if the parameter is not null
                                        if (correlationToken46!=null){

                                                    org.apache.axiom.om.OMElement omElementcorrelationToken46 = toOM(correlationToken46, optimizeContent(new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "retrieve")));
                                                    addHeader(omElementcorrelationToken46,env);

                                        }

        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);


               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.microsoft.schemas.crm._2007.webservices.RetrieveResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));


                                        return (com.microsoft.schemas.crm._2007.webservices.RetrieveResponseDocument)object;

         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});


                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }

                /**
                * Auto generated method signature for Asynchronous Invocations
                * Retrieves an instance of the specified entity.
                * @see com.microsoft.crm4.webserviceTest.CrmService#startretrieve
                    * @param retrieve43

                    * @param crmAuthenticationToken44

                    * @param callerOriginToken45

                    * @param correlationToken46

                */
                public  void startretrieve(

                 com.microsoft.schemas.crm._2007.webservices.RetrieveDocument retrieve43,com.microsoft.schemas.crm._2007.webservices.CrmAuthenticationTokenDocument crmAuthenticationToken44,
                    com.microsoft.schemas.crm._2007.webservices.CallerOriginTokenDocument callerOriginToken45,
                    com.microsoft.schemas.crm._2007.webservices.CorrelationTokenDocument correlationToken46,


                  final com.microsoft.crm4.webserviceTest.CrmServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
             _operationClient.getOptions().setAction("http://schemas.microsoft.com/crm/2007/WebServices/Retrieve");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);



                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");



              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


                                    //Style is Doc.


                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    retrieve43,
                                                    optimizeContent(new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices",
                                                    "retrieve")));

                                         // add the soap_headers only if they are not null
                                        if (crmAuthenticationToken44!=null){

                                                    org.apache.axiom.om.OMElement omElementcrmAuthenticationToken44 = toOM(crmAuthenticationToken44, optimizeContent(new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "retrieve")));
                                                    addHeader(omElementcrmAuthenticationToken44,env);

                                        }

                                         // add the soap_headers only if they are not null
                                        if (callerOriginToken45!=null){

                                                    org.apache.axiom.om.OMElement omElementcallerOriginToken45 = toOM(callerOriginToken45, optimizeContent(new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "retrieve")));
                                                    addHeader(omElementcallerOriginToken45,env);

                                        }

                                         // add the soap_headers only if they are not null
                                        if (correlationToken46!=null){

                                                    org.apache.axiom.om.OMElement omElementcorrelationToken46 = toOM(correlationToken46, optimizeContent(new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "retrieve")));
                                                    addHeader(omElementcorrelationToken46,env);

                                        }

        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);



                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.microsoft.schemas.crm._2007.webservices.RetrieveResponseDocument.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultretrieve(
                                        (com.microsoft.schemas.crm._2007.webservices.RetrieveResponseDocument)object);

                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorretrieve(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});


										            callback.receiveErrorretrieve(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorretrieve(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorretrieve(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorretrieve(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorretrieve(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorretrieve(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorretrieve(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorretrieve(f);
                                            }
									    } else {
										    callback.receiveErrorretrieve(f);
									    }
									} else {
									    callback.receiveErrorretrieve(f);
									}
								} else {
								    callback.receiveErrorretrieve(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorretrieve(axisFault);
                                }
                            }
                });


          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[5].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[5].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }

                    /**
                     * Auto generated method signature
                     * Executes business logic and special operations using a message-based approach. The Execute method takes a message request class as a parameter and returns a message response class.
                     * @see com.microsoft.crm4.webserviceTest.CrmService#execute
                     * @param execute48

                     * @param crmAuthenticationToken49

                     * @param callerOriginToken50

                     * @param correlationToken51

                     */



                            public  com.microsoft.schemas.crm._2007.webservices.ExecuteResponseDocument execute(

                            com.microsoft.schemas.crm._2007.webservices.ExecuteDocument execute48,com.microsoft.schemas.crm._2007.webservices.CrmAuthenticationTokenDocument crmAuthenticationToken49,com.microsoft.schemas.crm._2007.webservices.CallerOriginTokenDocument callerOriginToken50,com.microsoft.schemas.crm._2007.webservices.CorrelationTokenDocument correlationToken51)


                    throws java.rmi.RemoteException

                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
              _operationClient.getOptions().setAction("http://schemas.microsoft.com/crm/2007/WebServices/Execute");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);



                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");


              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();



              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;


                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    execute48,
                                                    optimizeContent(new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices",
                                                    "execute")));

                                               env.build();

                                        // add the children only if the parameter is not null
                                        if (crmAuthenticationToken49!=null){

                                                    org.apache.axiom.om.OMElement omElementcrmAuthenticationToken49 = toOM(crmAuthenticationToken49, optimizeContent(new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "execute")));
                                                    addHeader(omElementcrmAuthenticationToken49,env);

                                        }

                                        // add the children only if the parameter is not null
                                        if (callerOriginToken50!=null){

                                                    org.apache.axiom.om.OMElement omElementcallerOriginToken50 = toOM(callerOriginToken50, optimizeContent(new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "execute")));
                                                    addHeader(omElementcallerOriginToken50,env);

                                        }

                                        // add the children only if the parameter is not null
                                        if (correlationToken51!=null){

                                                    org.apache.axiom.om.OMElement omElementcorrelationToken51 = toOM(correlationToken51, optimizeContent(new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "execute")));
                                                    addHeader(omElementcorrelationToken51,env);

                                        }

        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);


               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.microsoft.schemas.crm._2007.webservices.ExecuteResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));


                                        return (com.microsoft.schemas.crm._2007.webservices.ExecuteResponseDocument)object;

         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});


                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }

                /**
                * Auto generated method signature for Asynchronous Invocations
                * Executes business logic and special operations using a message-based approach. The Execute method takes a message request class as a parameter and returns a message response class.
                * @see com.microsoft.crm4.webserviceTest.CrmService#startexecute
                    * @param execute48

                    * @param crmAuthenticationToken49

                    * @param callerOriginToken50

                    * @param correlationToken51

                */
                public  void startexecute(

                 com.microsoft.schemas.crm._2007.webservices.ExecuteDocument execute48,com.microsoft.schemas.crm._2007.webservices.CrmAuthenticationTokenDocument crmAuthenticationToken49,
                    com.microsoft.schemas.crm._2007.webservices.CallerOriginTokenDocument callerOriginToken50,
                    com.microsoft.schemas.crm._2007.webservices.CorrelationTokenDocument correlationToken51,


                  final com.microsoft.crm4.webserviceTest.CrmServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
             _operationClient.getOptions().setAction("http://schemas.microsoft.com/crm/2007/WebServices/Execute");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);



                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");



              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


                                    //Style is Doc.


                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    execute48,
                                                    optimizeContent(new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices",
                                                    "execute")));

                                         // add the soap_headers only if they are not null
                                        if (crmAuthenticationToken49!=null){

                                                    org.apache.axiom.om.OMElement omElementcrmAuthenticationToken49 = toOM(crmAuthenticationToken49, optimizeContent(new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "execute")));
                                                    addHeader(omElementcrmAuthenticationToken49,env);

                                        }

                                         // add the soap_headers only if they are not null
                                        if (callerOriginToken50!=null){

                                                    org.apache.axiom.om.OMElement omElementcallerOriginToken50 = toOM(callerOriginToken50, optimizeContent(new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "execute")));
                                                    addHeader(omElementcallerOriginToken50,env);

                                        }

                                         // add the soap_headers only if they are not null
                                        if (correlationToken51!=null){

                                                    org.apache.axiom.om.OMElement omElementcorrelationToken51 = toOM(correlationToken51, optimizeContent(new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "execute")));
                                                    addHeader(omElementcorrelationToken51,env);

                                        }

        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);



                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.microsoft.schemas.crm._2007.webservices.ExecuteResponseDocument.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultexecute(
                                        (com.microsoft.schemas.crm._2007.webservices.ExecuteResponseDocument)object);

                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorexecute(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});


										            callback.receiveErrorexecute(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorexecute(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorexecute(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorexecute(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorexecute(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorexecute(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorexecute(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorexecute(f);
                                            }
									    } else {
										    callback.receiveErrorexecute(f);
									    }
									} else {
									    callback.receiveErrorexecute(f);
									}
								} else {
								    callback.receiveErrorexecute(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorexecute(axisFault);
                                }
                            }
                });


          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[6].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[6].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }



       /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
       private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
            org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
            returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
       return returnMap;
    }



    private javax.xml.namespace.QName[] opNameArray = null;
    private boolean optimizeContent(javax.xml.namespace.QName opName) {


        if (opNameArray == null) {
            return false;
        }
        for (int i = 0; i < opNameArray.length; i++) {
            if (opName.equals(opNameArray[i])) {
                return true;
            }
        }
        return false;
    }
     //http://win2003/MSCrmServices/2007/CrmService.asmx

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.crm._2007.webservices.FetchDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{


                    return toOM(param);


            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.crm._2007.webservices.FetchDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };

                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }


            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.crm._2007.webservices.FetchResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{


                    return toOM(param);


            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.crm._2007.webservices.FetchResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };

                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }


            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.crm._2007.webservices.CrmAuthenticationTokenDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{


                    return toOM(param);


            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.crm._2007.webservices.CrmAuthenticationTokenDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };

                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }


            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.crm._2007.webservices.CallerOriginTokenDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{


                    return toOM(param);


            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.crm._2007.webservices.CallerOriginTokenDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };

                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }


            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.crm._2007.webservices.CorrelationTokenDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{


                    return toOM(param);


            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.crm._2007.webservices.CorrelationTokenDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };

                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }


            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.crm._2007.webservices.CreateDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{


                    return toOM(param);


            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.crm._2007.webservices.CreateDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };

                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }


            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.crm._2007.webservices.CreateResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{


                    return toOM(param);


            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.crm._2007.webservices.CreateResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };

                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }


            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.crm._2007.webservices.DeleteDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{


                    return toOM(param);


            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.crm._2007.webservices.DeleteDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };

                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }


            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.crm._2007.webservices.DeleteResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{


                    return toOM(param);


            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.crm._2007.webservices.DeleteResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };


                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }


            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.crm._2007.webservices.UpdateDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{


                    return toOM(param);


            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.crm._2007.webservices.UpdateDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };

                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }


            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.crm._2007.webservices.UpdateResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{


                    return toOM(param);


            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.crm._2007.webservices.UpdateResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };

                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }


            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.crm._2007.webservices.RetrieveMultipleDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{


                    return toOM(param);


            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.crm._2007.webservices.RetrieveMultipleDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };

                 return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.crm._2007.webservices.RetrieveMultipleResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.crm._2007.webservices.RetrieveMultipleResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.crm._2007.webservices.RetrieveDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.crm._2007.webservices.RetrieveDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.crm._2007.webservices.RetrieveResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.crm._2007.webservices.RetrieveResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.crm._2007.webservices.ExecuteDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.crm._2007.webservices.ExecuteDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.crm._2007.webservices.ExecuteResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.crm._2007.webservices.ExecuteResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.microsoft.schemas.crm._2007.webservices.FetchDocument param, boolean optimizeContent)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.microsoft.schemas.crm._2007.webservices.CreateDocument param, boolean optimizeContent)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.microsoft.schemas.crm._2007.webservices.DeleteDocument param, boolean optimizeContent)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.microsoft.schemas.crm._2007.webservices.UpdateDocument param, boolean optimizeContent)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.microsoft.schemas.crm._2007.webservices.RetrieveMultipleDocument param, boolean optimizeContent)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.microsoft.schemas.crm._2007.webservices.RetrieveDocument param, boolean optimizeContent)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.microsoft.schemas.crm._2007.webservices.ExecuteDocument param, boolean optimizeContent)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }

        public org.apache.xmlbeans.XmlObject fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{
        try{
        

            if (com.microsoft.schemas.crm._2007.webservices.FetchDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.microsoft.schemas.crm._2007.webservices.FetchDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.microsoft.schemas.crm._2007.webservices.FetchDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.microsoft.schemas.crm._2007.webservices.FetchResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.microsoft.schemas.crm._2007.webservices.FetchResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.microsoft.schemas.crm._2007.webservices.FetchResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.microsoft.schemas.crm._2007.webservices.CrmAuthenticationTokenDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.microsoft.schemas.crm._2007.webservices.CrmAuthenticationTokenDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.microsoft.schemas.crm._2007.webservices.CrmAuthenticationTokenDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.microsoft.schemas.crm._2007.webservices.CallerOriginTokenDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.microsoft.schemas.crm._2007.webservices.CallerOriginTokenDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.microsoft.schemas.crm._2007.webservices.CallerOriginTokenDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.microsoft.schemas.crm._2007.webservices.CorrelationTokenDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.microsoft.schemas.crm._2007.webservices.CorrelationTokenDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.microsoft.schemas.crm._2007.webservices.CorrelationTokenDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.microsoft.schemas.crm._2007.webservices.CreateDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.microsoft.schemas.crm._2007.webservices.CreateDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.microsoft.schemas.crm._2007.webservices.CreateDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.microsoft.schemas.crm._2007.webservices.CreateResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.microsoft.schemas.crm._2007.webservices.CreateResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.microsoft.schemas.crm._2007.webservices.CreateResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.microsoft.schemas.crm._2007.webservices.CrmAuthenticationTokenDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.microsoft.schemas.crm._2007.webservices.CrmAuthenticationTokenDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.microsoft.schemas.crm._2007.webservices.CrmAuthenticationTokenDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.microsoft.schemas.crm._2007.webservices.CallerOriginTokenDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.microsoft.schemas.crm._2007.webservices.CallerOriginTokenDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.microsoft.schemas.crm._2007.webservices.CallerOriginTokenDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.microsoft.schemas.crm._2007.webservices.CorrelationTokenDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.microsoft.schemas.crm._2007.webservices.CorrelationTokenDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.microsoft.schemas.crm._2007.webservices.CorrelationTokenDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.microsoft.schemas.crm._2007.webservices.DeleteDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.microsoft.schemas.crm._2007.webservices.DeleteDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.microsoft.schemas.crm._2007.webservices.DeleteDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.microsoft.schemas.crm._2007.webservices.DeleteResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.microsoft.schemas.crm._2007.webservices.DeleteResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.microsoft.schemas.crm._2007.webservices.DeleteResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.microsoft.schemas.crm._2007.webservices.CrmAuthenticationTokenDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.microsoft.schemas.crm._2007.webservices.CrmAuthenticationTokenDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.microsoft.schemas.crm._2007.webservices.CrmAuthenticationTokenDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.microsoft.schemas.crm._2007.webservices.CallerOriginTokenDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.microsoft.schemas.crm._2007.webservices.CallerOriginTokenDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.microsoft.schemas.crm._2007.webservices.CallerOriginTokenDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.microsoft.schemas.crm._2007.webservices.CorrelationTokenDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.microsoft.schemas.crm._2007.webservices.CorrelationTokenDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.microsoft.schemas.crm._2007.webservices.CorrelationTokenDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.microsoft.schemas.crm._2007.webservices.UpdateDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.microsoft.schemas.crm._2007.webservices.UpdateDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.microsoft.schemas.crm._2007.webservices.UpdateDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.microsoft.schemas.crm._2007.webservices.UpdateResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.microsoft.schemas.crm._2007.webservices.UpdateResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.microsoft.schemas.crm._2007.webservices.UpdateResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.microsoft.schemas.crm._2007.webservices.CrmAuthenticationTokenDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.microsoft.schemas.crm._2007.webservices.CrmAuthenticationTokenDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.microsoft.schemas.crm._2007.webservices.CrmAuthenticationTokenDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.microsoft.schemas.crm._2007.webservices.CallerOriginTokenDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.microsoft.schemas.crm._2007.webservices.CallerOriginTokenDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.microsoft.schemas.crm._2007.webservices.CallerOriginTokenDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.microsoft.schemas.crm._2007.webservices.CorrelationTokenDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.microsoft.schemas.crm._2007.webservices.CorrelationTokenDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.microsoft.schemas.crm._2007.webservices.CorrelationTokenDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.microsoft.schemas.crm._2007.webservices.RetrieveMultipleDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.microsoft.schemas.crm._2007.webservices.RetrieveMultipleDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.microsoft.schemas.crm._2007.webservices.RetrieveMultipleDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.microsoft.schemas.crm._2007.webservices.RetrieveMultipleResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.microsoft.schemas.crm._2007.webservices.RetrieveMultipleResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.microsoft.schemas.crm._2007.webservices.RetrieveMultipleResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.microsoft.schemas.crm._2007.webservices.CrmAuthenticationTokenDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.microsoft.schemas.crm._2007.webservices.CrmAuthenticationTokenDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.microsoft.schemas.crm._2007.webservices.CrmAuthenticationTokenDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.microsoft.schemas.crm._2007.webservices.CallerOriginTokenDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.microsoft.schemas.crm._2007.webservices.CallerOriginTokenDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.microsoft.schemas.crm._2007.webservices.CallerOriginTokenDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.microsoft.schemas.crm._2007.webservices.CorrelationTokenDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.microsoft.schemas.crm._2007.webservices.CorrelationTokenDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.microsoft.schemas.crm._2007.webservices.CorrelationTokenDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.microsoft.schemas.crm._2007.webservices.RetrieveDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.microsoft.schemas.crm._2007.webservices.RetrieveDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.microsoft.schemas.crm._2007.webservices.RetrieveDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.microsoft.schemas.crm._2007.webservices.RetrieveResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.microsoft.schemas.crm._2007.webservices.RetrieveResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.microsoft.schemas.crm._2007.webservices.RetrieveResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.microsoft.schemas.crm._2007.webservices.CrmAuthenticationTokenDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.microsoft.schemas.crm._2007.webservices.CrmAuthenticationTokenDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.microsoft.schemas.crm._2007.webservices.CrmAuthenticationTokenDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.microsoft.schemas.crm._2007.webservices.CallerOriginTokenDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.microsoft.schemas.crm._2007.webservices.CallerOriginTokenDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.microsoft.schemas.crm._2007.webservices.CallerOriginTokenDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.microsoft.schemas.crm._2007.webservices.CorrelationTokenDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.microsoft.schemas.crm._2007.webservices.CorrelationTokenDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.microsoft.schemas.crm._2007.webservices.CorrelationTokenDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.microsoft.schemas.crm._2007.webservices.ExecuteDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.microsoft.schemas.crm._2007.webservices.ExecuteDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.microsoft.schemas.crm._2007.webservices.ExecuteDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.microsoft.schemas.crm._2007.webservices.ExecuteResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.microsoft.schemas.crm._2007.webservices.ExecuteResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.microsoft.schemas.crm._2007.webservices.ExecuteResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.microsoft.schemas.crm._2007.webservices.CrmAuthenticationTokenDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.microsoft.schemas.crm._2007.webservices.CrmAuthenticationTokenDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.microsoft.schemas.crm._2007.webservices.CrmAuthenticationTokenDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.microsoft.schemas.crm._2007.webservices.CallerOriginTokenDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.microsoft.schemas.crm._2007.webservices.CallerOriginTokenDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.microsoft.schemas.crm._2007.webservices.CallerOriginTokenDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.microsoft.schemas.crm._2007.webservices.CorrelationTokenDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.microsoft.schemas.crm._2007.webservices.CorrelationTokenDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.microsoft.schemas.crm._2007.webservices.CorrelationTokenDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        
        }catch(java.lang.Exception e){
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        return null;
        }

        
        
   }
   