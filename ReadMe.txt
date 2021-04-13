*Created a Maven project named Ryanair Test.

*A pom.xml file is there for Maven projects.
 Here we can add the dependencies ,which we are going to use in our project and it automatically downloads the respective jar files.

*Under the project,created different packages like base,testcases,config,util etc.

*Implemented Page object Model framework which includes the following:
  1.Page layers like LoginPage ,Home Page classes consists there respective Object repository elements as well as Actions(Functions).
  2.Base layer like TestBase class which contains the browser initialisation functions.
  3.Common utility layer named as TestUtil,which contains the common Implicit wait time and PageLoadTimeout .
  4.Configproperties layer called ConfigProperties, which contains the url,username and password and browser name.
  3.Testcase layer like HomePageTest,LoginPageTest for writing the testcases.

*Testcases :
  1.Validating Login page title.
  2.Login function
  2.Login into Ryanair account and booking a flight.

*Test runs locally.

*TestNg tool is used for the testing the project.

*Test report can be obtained by copying the filepath of the'test-output' file in the chrome.