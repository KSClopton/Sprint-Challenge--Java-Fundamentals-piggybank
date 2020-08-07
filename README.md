# WEB Java Fundamentals Sprint Challenge

**Read these instructions carefully. Understand exactly what is expected _before_ starting this Sprint Challenge.**

This challenge allows you to practice the concepts and techniques learned over the past sprint and apply them in a concrete project. This sprint explored **Java Fundamentals**. During this sprint, you studied **Java Fundamentals*. In your challenge this week, you will demonstrate your mastery of these skills by creating **a Java Spring Database Application using Object Oriented Programming**.

This is an individual assessment. All work must be your own. Your challenge score is a measure of your ability to work independently using the material covered through this sprint. You need to demonstrate proficiency in the concepts and objectives introduced and practiced in preceding days.

You are not allowed to collaborate during the sprint challenge. However, you are encouraged to follow the twenty-minute rule and seek support from your TL if you need direction.

_You have **three hours** to complete this challenge. Plan your time accordingly._

## Introduction

This sprint challenge combines the knowledge from this week's Java Fundamentals lessons to create a Magical Piggy Bank using Java and the Spring Frame. We have a magical "piggy bank" (a piggy bank is the traditional name of a place to store coins, bills, money). The piggy bank is magical because it can hold unlimited amounts of money. However, you can not get the money out of it.

### Commits

Commit your code regularly and meaningfully. This helps both you (in case you ever need to return to old code for any number of reasons) and your team lead as the evaluate your solution.

## Interview Questions

Be prepared to demonstrate your understanding of this week's concepts by answering questions on the following topics. You might prepare by writing down your own answers before hand.

1. Explain how you took advantage of Java's Object Oriented approach to solve the sprint challenge.
    
   The sprint challenge had us create end points for sql data that was provided to us. The way we implemented OOP for this object was through the use of classes and objects. 
   These classes allowed us to make use of methods that combined with Spring, allowed to us to create an endpoint containing an arraylist based of the SQL data. 
   
2. Explain the three steps needed to run a Java application (using the JDK) including what each step does and how those step correlate to running a JavaScript application.

    a. Create class file from the .java files - All files must have a .class file
    b. Compile the class files into a .jar file that we can do what we want with
    c. execute the .jar file
    
    Java and Javascript are not really related at all - but every language must have steps to executing the program. In Javascript, we followed the following steps:
    
    a. Install necessary dependencies, frameworks, libraries - i.e. yarn, npm, react etc
    b. Start application (even if you have written 0 code) - this allows you to see your application running in real time
    c. Save and upload your code to the web using a site like Vercel, Netlify or another program that allows you to use a Domain address. 
    
3. Explain how Java being a strongly typed language affected you solution.

    I had to declare each data type when I created my class. These related directly to the type of data that was in my SQL file. Once set, cannot change.
    
4. Can you explain the differences between Abstract Classes and Interfaces including how they are used in your application?

    Abstract classes set the pattern for how things should be defined. And Interfaces must follow the pattern that it extends from the Abstract class.

## Instructions

### Task 1: Project Set Up

- [ ] Create a forked copy of this project
- [ ] Add your team lead as collaborator on Github
- [ ] Clone your OWN version of the repository (Not Lambda's by mistake!)
- [ ] Create a new branch: git checkout -b `<firstName-lastName>`.
- [ ] Create the proper directory structure for developing a Java Application
- [ ] Push commits: `git push origin <firstName-lastName>`
- [ ] Implement the project on your newly created `<firstName-lastName>` branch, committing changes regularly
- [ ] Push commits: git push origin `<firstName-lastName>`

### Task 2: Project Requirements

- [ ] You are creating a project from scratch! There is no initial project from where to start.
- [ ] Using the wizard in IntelliJ, create a Java Spring Application
  - [ ] Name the application piggybank
  - [ ] Steps to remember in generating the initial application
    - [ ] Set the Group and Artifact Name
    - [ ] Set that this is a Maven Project
    - [ ] Select the proper Java Version
    - [ ] Select Spring Boot Version 2.2.X
    - [ ] Add the 4 Dependencies we need for a Java Spring Database Application
    - [ ] You do not need to use services or configuration packages
    - [ ] You do need to
      - [ ] update your POM.XML so H2 will work
      - [ ] update the applications.properties configuration file
      - [ ] add the data.sql file
      - [ ] create the necessary packages (at least 3 are needed) and classes
- [ ] Create a model Coin to represent the table for the piggy bank
  - Each row in the table contains: (use the provided data.sql as a guide)
    - The number of coins in this group
    - The face value of the coins in the group
    - The name of a single coin
    - The name of more than one coin
- [ ] Create an endpoint http://localhost:2019/total that prints to console the contents of the Piggy Bank as follows and returns an HTTP Status of OK:

In your console in IntelliJ you should see:

```TEXT
    1 Quarter
    1 Dime
    5 Dollars
    3 Nickels
    7 Dimes
    1 Dollar
    10 Pennies
    The piggy bank holds 7.3
```

In Postman you should see

![Postman Image](postman.png)

Note: 7.30 = ( 1 * 0.25) + ( 1 * 0.10) + ( 5 * 1.00) + ( 3 * 0.05) + ( 7 * 0.10) + ( 1 * 1.00) + (10 * 0.10)

Note: that when you have more than 1 coin, the plural of the coin's name is printed.

### Required best practices

- [ ] Consistent naming. Examples: variables, functions, Components, and file/folder organization.
- [ ] Consistent spacing. Examples: line breaks, around arguments and before/after functions.
- [ ] Consistent quotation usage.
- [ ] Spell-check.
- [ ] Schedule time to review, refine and reassess your work.

It is better to submit a challenge that meets [MVP](https://en.wikipedia.org/wiki/Minimum_viable_product) than one that attempts too much and fails.

### Tips and Gotchas

In your solution, it is essential that you follow best practices and produce clean and professional results. You will be scored on your adherence to proper code style and good organization. Schedule time to review, refine, and assess your work and perform basic professional polishing including spell-checking and grammar-checking on your work. It is better to submit a challenge that meets MVP than one that attempts too much and does not.

### Task 3: Stretch Goals

After finishing your required elements, you can push your work further. These goals may or may not be things you have learned in this module but they build on the material you just studied. Time allowing, stretch your limits and see if you can deliver on the following optional goals:

- [ ] Add the ability to remove coins from the piggy bank
  - Prevent taking more coins than present in the piggy bank
  - Coins do not have to be removed in the same quantity that were added. For example based on the main program above, removing 3 dimes would be allowed. The Piggy Bank should adjust appropriately.
  - Just the amount to be removed should be given. The program will figure out which coins to remove.
  - You are to create an endpoint http://localhost:2019/money/{amount} that prints to the console the following (using 1.5 as the amount to remove) and returns an HTTP Status of OK

```TEXT
    $4
    7 Dimes
    $1
    10 Pennies
    The piggy bank holds $5.8
```

  - If the money cannot be removed, the following should be printed to the console and return an HTTP Status of OK

```TEXT
    Money not available
```

## Submission format

Follow these steps for completing your project.

- [ ] Submit a Pull-Request to merge <firstName-lastName> Branch into master (student's  Repo). **Please don't merge your own pull request**
- [ ] Add your team lead as a reviewer on the pull-request
- [ ] Your team lead will count the project as complete after receiving your pull-request
