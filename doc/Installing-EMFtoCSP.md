How to install EMFToCSP
=======================

You can install EMFToCSP in a number of ways, but in this document
we will show you how to do it using the update site archive available in the downloads section.

Prerequisites
=============

To use EMFToCSP you will need:

 * JRE6 or above
 * EMF 2.6.0 or above
 * Eclipse OCL 3.0.0 or above
 * The ECLiPSe Constraint Programming System version 6.0 or 6.1
   http://eclipseclp.org/
 * The Graph Visualization Package Graphviz
   http://www.graphviz.org/

Installation
============

1.- Get the update site archive "fr.inria.atlanmod.emftocsp.updatesiteDD-MM-YY.zip" from the "updateSite" folder in the [EMFtoCSP Github repository](https://github.com/atlanmod/EMFtoCSP).

NOTE: In the images that follow, this file has been renamed as "fr.inria.atlanmod.emftocsp.updatesite.zip"

2.- Open the Eclipse IDE and click on Help-->Install New Software... to open the following window

![](https://github.com/atlanmod/EMFtoCSP/blob/master/wikiImages/HowToInstall/AvailableSoftware.jpg)

3.- Click on the "Add..." button to open the following window

![](https://github.com/atlanmod/EMFtoCSP/blob/master/wikiImages/HowToInstall/AddRepository1.jpg)

4.- Click on the "Archive..." button and select the update site archive you downloaded before. The "Location" textbox should look like the one in the following image.

![](https://github.com/atlanmod/EMFtoCSP/blob/master/wikiImages/HowToInstall/AddRepository2.jpg)

5.- After clicking on the OK button, you should see something like 

![](https://github.com/atlanmod/EMFtoCSP/blob/master/wikiImages/HowToInstall/Install1.jpg)

*Update:* If after loading the update site archive, its contents do not appear in the list, then uncheck the checkbox "Group items by category". That should fix the problem.

6.- Check the verification mark next to "EMFToCSP" and click "Next"

![](https://github.com/atlanmod/EMFtoCSP/blob/master/wikiImages/HowToInstall/Install2.jpg)

7.- Click on "Next" and accept the terms of the license agreement

![](https://github.com/atlanmod/EMFtoCSP/blob/master/wikiImages/HowToInstall/Install3.jpg)

8.- Click on "Finish" to install EMFToCSP

9.- Click on "OK" in the security warning message

![](https://github.com/atlanmod/EMFtoCSP/blob/master/wikiImages/HowToInstall/Install4.jpg)

10.- To finish, restart Eclipse

You can check if everything went OK by clicking on the "Installation Details" button of the Help-->About Eclipse window. You should see something like

![](https://github.com/atlanmod/EMFtoCSP/blob/master/wikiImages/HowToInstall/Install5.jpg)