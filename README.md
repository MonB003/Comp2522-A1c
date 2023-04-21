# COMP 2522 Assignment A1c

> These are 2 Java programs for an address book. The first program (A1a) uses arrays to store data. The second program (A1b) uses Database and Person classes to store data. A1b is an enhanced version of A1a.

<br>

## Table of Contents
- [Technologies](#technologies)
- [Listing of File Contents of folder](#file-contents-of-folder)
- [How to run the project](#how-to-run-project)
- [Program features/options](#features)

<br>

## Technologies
* Java
* GUI: Swing

<br>

## File Contents of Folder

```
├─── A1a              # Program 1
    / GUIA1a.java
    / MainA1a.java
├─── A1b              # Program 2
    / AddressBook.java
    / ConsoleUI.java
    / Database.java
    / GUI.java
    / Main.java
    / Person.java
    / UI.java
└─── README.md
```

<br>

## <a id="how-to-run-project">How to run the project</a>
### Prerequisites:
- Have a Git and GitHub account
- Have Visual Studio Code or another coding editor

### Configuration instructions:

Cloning the repository:
- Open Command Prompt 
- `cd` into the folder you want the repository stored in
- Type: `git clone https://github.com/MonB003/Comp2522-A1c.git`


### Running the project:
1. Open Command Prompt 
2. Compile the program: type `javac *.java`
3. Run the program: 
   - A1a: type `java MainA1a`
   - A1b: type `java Main <argument>`
     - Pass 1 argument. Options (2): console or gui
4. A window (or command prompt text) will appear with 5 options. 
5. Press any number between 1-5 to use that feature.

<br>

## <a id="features">Program features/options</a>
1. Add a person
2. Delete a person (by name)
3. Search for a person (by name)
4. Display all people in the address book
5. Exit the program
