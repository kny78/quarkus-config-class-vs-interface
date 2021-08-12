quarkus-config-class-vs-interface Project
===========================================

Example project to trigger the configuration change between 2.1.1.Final and 2.1.2.Final

To run with 2.1.1 - No errors
-----------------------------

```
./mvnw clean install -P2.1.1
```


To run with 2.1.2 - Throws exception
------------------------------------

```
./mvnw clean install -P2.1.2
```

