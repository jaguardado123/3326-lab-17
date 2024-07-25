# Lab Assignment 13

In this lab you will practice working with packages.

Unlike previous labs, your class has already been created for you. 

## Let's get started!

For this lab your **main() method** is in the Main class. For this lab you must create the new classes in their packet location.

Now let's begin!

## Packages

In Java you can group files or classes into sub-directories (folders) known as packages. Packaging your classes allows you to organize your classes, especially if you have classes with the same name. 

<img src="img/packages.png" width="300px">

To create a package, simply create a new folder in your current working directory `src`. Now inside your new folder you can create as many java files as you need. Next you must include the name of the parent folder at the top starting with the keyword `package`. 

For example, let's say we created a new package `pets` and inside we created the classes `Dog.java` and `Cat.java`.

**Code Example for Dog.java:**

```java
// Name of the parent folder.
package pets;

public class Dog {
    // Members go here.
}
```

**Code Example for Cat.java:**

```java
// Name of the paretn folder.
package pets;

public class Cat {
    // Members go here.
}
```

Now, we can use use one or multiple of the classes in our `pets` package by using the `import` keyword to include the class(es) we need. We must use the following structure.

**import [package_name].[class_name]**

You have done this before, think back to when you first used the `Scanner` class from the `java.util` package.

Below is an example on how to import `Dog` and `Cat` classes into the `Owner` class in the `src` directory.

**Code Example for Owner.java:**

```java
// Import the class using [package_name].[class_name]
import pets.Dog;
import pets.Cat;

public class Owner {
    public static void main(String[] args) {
        // You can now use class.
        Dog dog1 = new Dog();
        Cat cat1 = new Cat();
    }
}
```

## Your Program

### Product & Sum Calculator

For this lab assignment you will create a program to find the sum (addition) and product (multiplication) of two real numbers using packages.

Create a new folder named `tools` inside the `src` directory. Inside `tools`, create a file `MyMath.java` with class `MyMath`. Create two `static` methods `sum` and `product` to each receive two real numbers and return a single real number.

Remember to include the `package` keyword at the top of your file along with the parent folder's name.

Inside the `Main.java` file import the `MyMath` class using the `import` keyword. Prompt the user to input two real numbers then get the **product** and **sum** of both numbers by calling the methods in a `static` manner and output the result back to the user.

Your output should look like:

```
Welcome to my Product & Sum Calculator!

Input two numbers: 3.0 5.0

Sum is 8.0
Product is 15.0
```

## Submit your assignment

To submit your lab assignment click on the source control icon (3 circles with 2 lines) on your leftside navbar. Next, click on the '+' symbol next to "Changes" to stage your changes. Lastly, add a commit message (ex: "First commit") and click "Commit" then "Push" or "Sync Changes". And you're done!
