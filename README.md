# Axiom Telecom Lab Automation Tests

This repository contains Test Automation written in Java + Rest Assured + Maven + Testng

## Known Issues

- Getting frequent too many request error

## Automation Approach

- created class APIHelper to store the definite location of all resources. 
- Store data file name from json file and pass the to test cases at runtime
- DataReader class to read the json file into map to pass that to test methods
- FileReader class to read file, and store each line into string array
- ResponseComparator class – this has all logic to do comparison of json, it has one recursive method to compare expected vs actual.
- Response validator class to have the assertion and print the logs
- RestUtil class to get rest assured response using url.

## Prerequisite
- Maven is setup in your system
- Either eclipse or IntelliJ is configured 
- Java 8 or above is installed 

## Setting up

* Clone project from github (https://github.com/alishahzad89/dkatalislabs)
* Import as maven project to Ide(Eclipse/IntelliJs) from cloned repository
* wait for Maven to download all external dependency

## Running tests

### Using terminal / CMD

       Open project folder path in CMD (windows) / terminal (mac) 
       Run  maven command – 'mvn clean install test'
       All report will be shown on console ouput
       
### Using TestRunner.xml
        Right click on TestRunner.xml and click on run button.


### Output

Test output can be seen on terminal while running from cmd/terminal
If running from Ide tests output can be seen on ide console.

### Existing execution report

Please open screenshot 'SampleExecutionScreenshot' file available at project folder


## Author
Shahzad Ali
QA Automation Expert