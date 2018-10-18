# JAX-WS-Stand-alone
JAX WS (SOAP) webservice server and client example for stand alone execution.


Server:
----------------------------------------------------

Navigate to JAX-WS-Stand-alone\src\com\ram\jaxws\vihaan\server folder and execute following commands in command prompt (For Java 8).

Compilation:
1) javac -d . Vihaan.java
2) javac -d . VihaanImpl.java
3) javac -d . VihaanPublisher.java

Execution: 

1) java com.ram.jaxws.vihaan.server.VihaanPublisher

Java contains an embedded lightweight server which would be used for deploying the service and the service is now available.

Check following URL in browser to check it is running or not:
http://localhost:9091/Vihaan?wsdl


Client:
----------------------------------------------------
You can use SOAP UI for testing.

Java implementation will be coming soon.