# UNIVERSITY LIBRARY INFORMATION SYSTEM (ULIS)
* This project is my first project.

---
## Table of Contents
  * [Table of Contents](#table-of-contents)
  * [General Info](#general-info)
  * [Screenshots](#screenshots)
  * [Presentation Video](#presentation-video)
  * [Technologies](#technologies)
  * [Setup](#setup)
  * [Features](#features)
  * [Status](#status)
  * [Inspiration](#inspiration)
  * [Version](#version)
  * [Contributors](#contributors)
  * [Licence & Copyright](#licence--copyright)

---
## General Info
* This application has been made by **adhering to a document**.
* This project is a *concept* **library information system**.
* This project **only** works on the *console*.

---
## Screenshots
![1](https://user-images.githubusercontent.com/71559273/174436874-3e1a4487-2889-4f0d-9f18-e68333f2019a.png)

![2](https://user-images.githubusercontent.com/71559273/174436884-0e9a68a1-9329-4119-b81f-2a3427cb985c.png)

![3](https://user-images.githubusercontent.com/71559273/174436891-6ed4dadd-5d8a-4d77-876e-8c3d4f05651f.png)

![4](https://user-images.githubusercontent.com/71559273/174436895-e6f1a150-11f3-40fb-99a1-244fb7fcbfd0.png)

![5](https://user-images.githubusercontent.com/71559273/174436897-48958f27-cecf-436c-847e-8613608addf7.png)

![6](https://user-images.githubusercontent.com/71559273/174436903-ab123da8-b1e6-4d5f-b33b-74dcad2d9987.png)

![7](https://user-images.githubusercontent.com/71559273/174436920-55cdbba1-f4f5-4aed-88d1-15a46965eb13.png)

![8](https://user-images.githubusercontent.com/71559273/174436928-41526f7c-ae77-4476-93ab-6f1d567405f1.png)

![9](https://user-images.githubusercontent.com/71559273/174436930-46add5ca-8603-4b63-8da6-a3b012d782c7.png)

![10](https://user-images.githubusercontent.com/71559273/174436933-518dad66-6edc-485b-81e9-13985ca5d7b1.png)

![11](https://user-images.githubusercontent.com/71559273/174436936-2576c232-ef41-4218-a1e4-a6c188756156.png)

![12](https://user-images.githubusercontent.com/71559273/174436939-c32b077a-4f9f-42d2-b7b5-c1968c41286a.png)

![13](https://user-images.githubusercontent.com/71559273/174436941-d38bf495-ce3b-4afd-848c-7c10959c3557.png)

![14](https://user-images.githubusercontent.com/71559273/174436944-36a3b462-1e7a-49d8-b2f3-b6da1931174e.png)

---
## Presentation Video
[Here](https://www.youtube.com/watch?v=Ad5KFi0JcQg) is my presentation with my ultra-perfect high-level English :D

---
## Technologies
* java version "17.0.2" 2022-01-18 LTS
* Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
* Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

---
## Setup

#### For Windows:
If you don't have a java and javac version, download and install it from here:  
Download Java SE Development Kit from: https://www.oracle.com/java/technologies/downloads  
Open CMD (Command Prompt) and type this command:  
```
>cd (src path)
>javac -encoding ISO-8859-1 file_name.java
>java Library
```

#### For Linux:
##### To install java and javac (if you don't have):
If you don't have a java and javac version, download from here:  
Download Java from: https://www.oracle.com/java/technologies/downloads  
Download "x64 Compressed Archive" or "x64 Debian Package"  

Remove current openjdk version command is
```
~# sudo apt-get remove openjdk*
```
If you download compressed package then extract it:
```
# cd /(the location where the package was downloaded)
# tar n-xvzf (your package)
```
Move and copy jdk file to /opt folder command is
```
# mv jdk-(version of your package) /opt
```
Go to opt/jdk-(version of your package)
```
# cd /opt/jdk-(version of your package)
```
Run following commands as it is (changing your jdk version)
```
# update-alternatives --install /usr/bin/java java /opt/jdk-(version of your package)/bin/java 1
# update-alternatives --install /usr/bin/javac javac /opt/jdk-(version of your package)/bin/javac 1
# update-alternatives --set javac /opt/jdk-(version of your package)/bin/javac
```
for checking version ```# java -version```

Now your jdk is sucessfully installed.
##### If you already have a java and javac version, you can continue from this point.
For run this project:
```
# cd (src path)
# javac file_name.java
# java Library
```
#### For MacOS:
If you don't have a java and javac version, download and install it from here:  
Download Java SE Development Kit from: https://www.oracle.com/java/technologies/downloads  
Open CMD (Command Prompt) and type this command:  
```
>cd (src path)
>javac Library.java
>java Library
```

---
## Features

#### Terminate the Program

* You can **exit** the program. The program can be exited before and after entering the *password* and *ID*.

#### Start a Library Membership for a User

* It takes the *first name*, then the *last name*, and finally the *ID*. At each step, you can **cancel** the operation or **change** the data you entered.

#### End Library Subscription for a User

* It takes the *first name*, then the *last name*, and finally the *ID*. **Terminates** membership. A person who is not a member **cannot** **receive** content from the library. At each step, you can **cancel** the operation or **change** the data you entered.

#### Add New Content to the Library

* You can **add** a *content* and *its number* to the library. At each step, you can **cancel** the operation or **change** the data you entered.

#### Query ID from Username

* You can **query** the *ID* of the user using the *username*. At each step, you can **cancel** the operation or **change** the data you entered.

#### Query Username from id

* You can **query** the *username* using the *ID*. At each step, you can **cancel** the operation or **change** the data you entered.

#### Query Content

* You can find out *how many* of the *content* you want to **query** are in the system. At each step, you can **cancel** the operation or **change** the data you entered.

#### Total Number of Users and All Users

* You can **access** *all information* about *users* in the system. At each step, you can **cancel** the operation or **change** the data you entered.

#### Total Numbers of Contents and All Contents

* You can **access** *all informatio*n about the *contents* in the system. At each step, you can **cancel** the operation or **change** the data you entered.

#### Lend Content to User

* You can **lend** *content* to the *user*. In order for the library to serve everyone and work more effectively, you can lend a *maximum of 1 content*. The **loaned** user content **cannot be deleted** from the system **without returning** it to the *library*. **Borrowed** content is **reduced** by 1 from the system. At each step, you can **cancel** the operation or **change** the data you entered.

#### Return Content From User

* You can get the book **returned** from the user. The returned book is **increased** by 1 in the system. At each step, you can **cancel** the operation or **change** the data you entered.

    As seen above, the system asks you "Are you sure about the operation you want to do and this data" in all operations except exiting the system, and you always have the right to change the data you entered, confirm or cancel the operation you want to do. In addition, the program catches many errors and returns error messages accordingly. Algorithms have been created for this in the system. We will examine it in detail in the following pages.

    Ok. We've defined what you need to do. A small, tired and part-time student cannot write all of these processes on paper, can he?😔 At this point, the system we have coded comes into play. However, there is a small problem. Everything is erased when the system shuts down because this is a 1st-year first-semester final project. I will create a real one in the coming years. When I learn File I/O 😂...

    In addition, you will be given a password and id that only you can access the system:  
    **(id = 123456789 and password = qwert123)**

    The program is a system where only the administrator can access all the above operations. Its purpose is to perform the above operations.

    Let's say the user wants to borrow a book. Then the user comes to the administrator and says "Hey admin. I want to borrow a book". Admin says "Sure, I'll give it right away". The admin must first register the user in the system, then give the book the user wants to the user and save it to the system.

---
## Status
With the exception of bug fixes (if any), development of this project is complete.

---
## Inspiration
Software Engineering 115 (SE 115) Project Instructions (Izmir University of Economics, 2021, SE 115 course, Fall semester project document)
  
As a student of the Izmir University of Economics, I made this project in accordance with the SE 115 Project Instructions for the fall semester project of the SE 115 course in 2021.
  
The project conforms almost exactly to the document.
  
Since the content of the SE 115 projects that will be given in the next periods may be similar to this document, I do not share the document publicly. If you need the document, send an e-mail with the reason to the following address: <ejderaysunn@gmail.com>

---
## Version
**Version 1.0.0**  

---
## Contributors
Ejder Aysun <ejderaysunn@gmail.com>

---
## Licence & Copyright
© Ejder Aysun, University Library Information System (ULIS)  
Licensed under the [MIT Licence](https://github.com/EjderAysun/University-Library-Information-System/blob/main/LICENCE)