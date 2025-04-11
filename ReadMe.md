**Introduction** - Basic Git repository to demonstrate usage of Cucumber with TestNG to test UI application using Selenium and carryout the execution in parallel mode

**Commands**:
- mvn dependency:purge-local-repository - To purge the maven repository in cases changes are made to pom.xml

- mvn clean test - To execute the tests

- allure serve - To check the Allure report once the execution is completed

**Note** : This repository has some code related to healenium for checking self healing capability. However since it is not working it is commented in pom.xml as well as DriverFactory.java
<br>
**Issue** : With healenium dependency added the mvn clean test command was considering JUnitPlatformProvider for test execution instead of TestNGProvider and was not considering the testng.xml, so no test was getting executed.
