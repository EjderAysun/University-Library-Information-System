# UNIVERSITY LIBRARY INFORMATION SYSTEM (ULIS)
* This project is my first project.

---
## Table of Contents
* [General Info](#general-info)
* [Screenshots](#screenshots)
* [Technologies](#technologies)
* [Setup](#setup)
* [Features](#features)
* [Status](#status)
* [Inspiration](#inspiration)
* [Version](#version)
* [Contributors](#contributors)
* [Licence & Copyright](#licence-and-copyright)

---
## General Info
* This application has been made by **adhering to a document**.
* This project is a *concept* **library information system**.

---
## Screenshots
![Screenshots](https://drive.google.com/file/d/1HkNW9sJqeFr-IjeLhWgmNjcf7Lv_t9Vc/view?usp=sharing)

![Screenshots](https://drive.google.com/file/d/1TRqZE8DHsV4QUlPrZvYTJRtPtcd7YMAd/view?usp=sharing)

![Screenshots](https://drive.google.com/file/d/1VeSXmLTgec8uRlYyNNMy5Ka-GL7xu7T_/view?usp=sharing)

![Screenshots](https://drive.google.com/file/d/1V5Q3EAWuuqLxYJn3o-EX_UdRBz8w453x/view?usp=sharing)

![Screenshots](https://drive.google.com/file/d/1ZWqAkX0N8jNVulfEzDPNADZy5G9DppSU/view?usp=sharing)

![Screenshots](https://drive.google.com/file/d/1F7l0waZuJzfVXSv1GK6PsmHOM25M-Z8a/view?usp=sharing)

![Screenshots](https://drive.google.com/file/d/13Oyo2ly8Z6U2HW9ZFIzeG1lz1FaUWLmD/view?usp=sharing)

![Screenshots](https://drive.google.com/file/d/19mJn-gJeuKXIJ6NvN8TlS32n_rZrq_tD/view?usp=sharing)

![Screenshots](https://drive.google.com/file/d/1CLgwibXYW364TGWaoMgXr2QVCBpjlOAR/view?usp=sharing)

![Screenshots](https://drive.google.com/file/d/1YdId36brRGEZYyUvv9tn9m_7b-h9zMXW/view?usp=sharing)

![Screenshots](https://drive.google.com/file/d/1WabXcL0bO6oBTg829y4bEkbAkz9NvQkn/view?usp=sharing)

![Screenshots](https://drive.google.com/file/d/1OyRkNNRrwlyZgYdSogWgYjwLdvisKodY/view?usp=sharing)

![Screenshots](https://drive.google.com/file/d/1LLwP_UBQoH-sy9lZ8hbyaEc-BHgXyjFo/view?usp=sharing)

![Screenshots](https://drive.google.com/file/d/1xCqe_Adddjf_AG3p5M3TWBUkzbHLNs1z/view?usp=sharing)

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

---
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
* With the exception of bug fixes (if any), development of this project is complete.
---

## Inspiration
Software Engineering 115 (SE 115) Project Instructions (Izmir University of Economics, 2021, SE 115 course, Fall semester project document)
  
As a student of the Izmir University of Economics, I made this project in accordance with the SE 115 Project Instructions for the fall semester project of the SE 115 course in 2021.
  
The project conforms almost exactly to the document.
  
Since the content of the SE 115 projects that will be given in the next periods may be similar to this document, I do not share the document publicly. If you need the document, send an e-mail with the reason to the following address: <ejdera344@gmail.com>

---

## Version
**Version 1.0.0**  
README document for the ULIS project.  
  
**Version 1.0.1**  
Some minor fixes.  
  
**Version 1.0.2**  
Some minor fixes and screenshots fixed.  
  
**Version 1.0.3**  
Some minor fixes and screenshots fixed.  

**Version 1.0.4**  
Some minor fixes and screenshots fixed.  

**Version 1.0.5**
Some minor fixes and test for screenshot.

**Version 1.0.6**
Some minor fixes and test for screenshot.

---
## Contributors
Ejder Aysun <ejdera344@gmail.com>

---
## Licence & Copyright
© Ejder Aysun, University Library Information System (ULIS)  
Licensed under the [MIT Licence](LICENSE).