# Java: Testing with JUnit
This is the repository for the LinkedIn Learning course Java: Testing with JUnit. The full course is available from [LinkedIn Learning][lil-course-url].

![Java: Testing with JUnit][lil-thumbnail-url] 

Unit testing is of crucial importance in developing stable applications. Java developers need to write unit tests, and JUnit is the main unit testing framework for Java. In this course, trainer and developer Maaike van Putten helps you learn to test your Java code effectively. Maaike explains what unit testing is and the advantages that it offers. She covers JUnit and shows you how to set it up and run your first test. Maaike steps through the process of writing a basic test, including useful tools like JUnit Annotations, JUnit Write, JUnit DisplayName, and more. She goes over more advanced uses of JUnit, such as dependency injection, parameterized tests, and timeouts, to name a few. Maaike finishes up with a quick peek at next steps you can take, like how to make code ready for unit testing, best practices, and a brief overview of Mockito.

## Instructions
This repository has branches for each of the videos in the course. You can use the branch pop up menu in github to switch to a specific branch and take a look at the course at that stage, or you can add `/tree/BRANCH_NAME` to the URL to go to the branch you want to access.

## Branches
The branches are structured to correspond to the videos in the course. The naming convention is `CHAPTER#_MOVIE#`. As an example, the branch named `02_03` corresponds to the second chapter and the third video in that chapter. 
Some branches will have a beginning and an end state. These are marked with the letters `b` for "beginning" and `e` for "end". The `b` branch contains the code as it is at the beginning of the movie. The `e` branch contains the code as it is at the end of the movie. The `main` branch holds the final state of the code when in the course.

When switching from one exercise files branch to the next after making changes to the files, you may get a message like this:

    error: Your local changes to the following files would be overwritten by checkout:        [files]
    Please commit your changes or stash them before you switch branches.
    Aborting

To resolve this issue:
	
    Add changes to git using this command: git add .
	Commit changes using this command: git commit -m "some message"

## Installing
1. To use these exercise files, you must have the following installed:
	- Java SDK
	- Java IDE (Such as IntelliJ, Eclipse or VS Code)
2. Clone this repository into your local machine using the terminal (Mac), CMD (Windows), or a GUI tool like SourceTree.
3. After that, you can open the project in your IDE. (It is often also possible to clone using your IDE.)


### Instructor

Maaike van Putten 
                            


                            

Check out my other courses on [LinkedIn Learning](https://www.linkedin.com/learning/instructors/maaike-van-putten).

[lil-course-url]: https://www.linkedin.com/learning/java-testing-with-junit-14267963
[lil-thumbnail-url]: https://cdn.lynda.com/course/2424511/2424511-1632245790271-16x9.jpg
