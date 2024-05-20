#! /bin/sh
# java -Dlog4j.configurationFile=log4j2.xml -jar bin/initial-page-tests.jar suites/initialPageTests.xml
mvn test "-Dsuite=suites/testng.xml" "-Dlog4j.configurationFile=log4j2.xml"

