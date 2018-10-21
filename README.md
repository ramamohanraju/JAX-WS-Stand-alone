# JAX-WS-Stand-alone
JAX WS (SOAP) webservice server and client example for stand alone execution.

Java version used: Java 8
Import the project into eclipse.

Server:
----------------------------------------------------
Run VihaanPublisher class with 'Run as Java application'.

Java contains an embedded lightweight server which would be used for deploying the service and the service is now available.

Check following URL in browser to check it is running or not:
http://localhost:9091/Vihaan?wsdl

Client:
----------------------------------------------------
**Using SOAP UI:** Import SOAP project from wsdl and provide the above wsdl url and send the request to receive response from server.

**Using direct client:**(where server implementation available directly) Run VihaanClient class with 'Run as Java application'.

**Using clinet:** TODO