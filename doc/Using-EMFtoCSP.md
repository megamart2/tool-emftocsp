How to use EMFToCSP
===================

1.- EMFToCSP Configuration

Before start using EMFToCSP you have to configure the tool by filling the fields in the EMFToCSP preference page.

Click on Windows-->Preferences, select "EMFToCSP" on the left pane, and provide provide the ECLiPSe constraint solver and GraphViz paths, needed to run EMToCSP. Once you have done that, click on "OK" to close the window.

![](https://github.com/megamart2/tool-emftocsp/blob/master/doc/images/HowToUse/Usage1.jpg)

2.- Now that EMFToCSP has been configured, it's time to start using it

Launching EMFToCSP is pretty straightforward. Open the "Package Explorer" window and right click on the model you want to validate. By choosing the option "Validate model..." from the popup menu, you will launch EMFToCSP.

![](https://github.com/megamart2/tool-emftocsp/blob/master/doc/images/HowToUse/Usage2.jpg)

3.- Setting OCL constraints

In this window you can select an .ocl file with the model OCL constraints. If you don't want to provide an external OCL file or the OCL constraints are embedded in the model, you can skip this step by clicking on the "Skip selection" verification mark. Once you've finished, click "Next"

![](https://github.com/megamart2/tool-emftocsp/blob/master/doc/images/HowToUse/Usage3.jpg)

4.- Setting domains and cardinalities

Once you have finished with the OCL settings, you must provide the domains and cardinalities for the model's elements. This way, you will set the boundaries of the search space where the solver will try to find a valid instance of the selected model. Once you've finished, click "Next"

![](https://github.com/megamart2/tool-emftocsp/blob/master/doc/images/HowToUse/Usage4.jpg)

5.- Selection of the properties you want to check

Once the search space has been defined, you must select the properties you wish to validate among the ones offered by the tool. Once you've finished, click "Next"

![](https://github.com/megamart2/tool-emftocsp/blob/master/doc/images/HowToUse/Usage5.jpg)

6.- Setting where to store the validation's results 

The last step before launching the validation process is to select where the results will be stored. You have to choose a folder and then  click "Finish"

![](https://github.com/megamart2/tool-emftocsp/blob/master/doc/images/HowToUse/Usage6.jpg)

The verification process will take place after clicking on the "Finish" button. If the verification process finds an instance of the model that satisfies all the restrictions (a valid instance), the tool will show the following message

![](https://github.com/megamart2/tool-emftocsp/blob/master/doc/images/HowToUse/Usage7.jpg)

You will find an image with the description of the instance along with the generated ECL code file used by the solver in the result location

![](https://github.com/megamart2/tool-emftocsp/blob/master/doc/images/HowToUse/Usage8.jpg)

If the verification process yields no results, then the tool will show the following message

![](https://github.com/megamart2/tool-emftocsp/blob/master/doc/images/HowToUse/Usage9.jpg)

and it will store the generated ECL code file used by the solver in the result location.

You can see EMFtoCSP in action in [here](http://youtu.be/slKodyCs4wU)