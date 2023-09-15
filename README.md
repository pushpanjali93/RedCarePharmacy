Following project is done by Pushpanjali Dokania for work assignment for RedCare Pharmacy.
The project includes Test Cases on Opening Home Page, Selecting a Random Product, Modifying Quantity & Adding to Cart.

How to Run:
Run org.example.testRunner.TestRunner.java File.

**Code Highlights:**

1. **The Base Class is designed to be multi-threaded. Driver instance is per thread and hence can be run in parallel.**

3. **Consent Popup is Handled. Consent popup was present in Shadow Root and hence needed special Handling. It is handled via ClassName as Selenium does not support By Xpath for Shadow Root.**

2. Base Class includes parameter for providing Browser Name & Driver Path via Properties file.


**Code Improvements:**
1. Some pages are taking time to load & time consuming. Need to be verified if slowness is caused by any Test Setup.

Features File: org.example.features.RedCarePharmacy.feature 

Step Definitions File: org.example.stepDefinitions.StepDefinitions
