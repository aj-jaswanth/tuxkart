TuxKart Project
===============

OpenSource E-commerce project!

1. To build the project :  `./gradlew application:clean application:build`
2. To run the application: `./gradlew application:bootRun`

After the project is build, the following commands need to be build
1. Setup the URL to be tested using environment variable "TUXKART_URI": `export TUXKART_URI="http://localhost:8080`
2. To build the functional-tests: `./gradlew functional-tests:clean functional-tests:build`
3. To start functional-tests: `java -jar functional-tests/build/libs/functional-tests-0.0.1-SNAPSHOT.jar functionalTests`
