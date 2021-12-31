# Android-Study-Jams

### Registration App
 
 
This application is made using Kotlin in Android Studio where the user can register by giving his/her personal details like Name ,Email id, Contact No ,Password  and the account will be created. 

### Functionality :
 
- The App opens up like a normal registration portal where the user is required to enter all the details asked to create a account.

- After filling all the details the applications moves to another Summary Activity where all the Account details will be shown except the password.

### Concepts Used :
 
 In Activity Main XML and Activity Summary XML File  
  
  -  ScrollView will help the user to move the front page of the application up & down.
  
  -  Linear Layout is used and a padding of 36dp is given with vertical orientation.
 
  -  TextView , EditText widget is used  also text color , text size is  made accordingly to improve the User Interface of the app.
 
  -  Spinner widget will help the user to select his Mr/Mrs/Dr etc.. from the dropdown item provided.
  
  -  layout width , height , marginTop etc  is used.
   
  -  passwordTogledEnabled is used to view the password.

  -  Android material button  will help the user to create the account.
  
 In Main Activity and Summary Actvity File 
  
  -  setOnClickListener will link the Main Activity to the Create Account Button in XML File.
  
  -  setUpSpinner and setUpButton method is used.

  -  Intent and startActivity is used to move from one Activity to Another.

  -  displayuser method name  in Summary Activity will display all the details from Main Activity File.

  -  In Resource Manager > Import drawable some background images for both the Summary Activity & Main Activity is added for better User Interface.

  -   Array Adapter is used for the list of spinner drop down items.



![WhatsApp Image 2021-12-31 at 1 16 00 AM](https://user-images.githubusercontent.com/87956374/147783543-f296e50d-1e01-4b3f-aa1e-fa6fb2fd77f0.jpeg)


https://drive.google.com/file/d/11ccOXOzsUO3cQOWor62Ea1NkdUj0YQ-9/view?usp=sharing
