# Java EE 8 Design Patterns and Best Practices


**Build enterprise-ready scalable applications with architectural design patterns**

## What is this book about?
Patterns are essential design tools for Java developers. Java EE Design Patterns and Best Practices helps developers attain better code quality and progress to higher levels of architectural creativity by examining the purpose of each available pattern and demonstrating its implementation with various code examples. This book will take you through a number of patterns and their Java EE-specific implementations.

This book covers the following exciting features:
Implement presentation layers, such as the front controller pattern 
Understand the business tier and implement the business delegate pattern 
Master the implementation of AOP 
Get involved with asynchronous EJB methods and REST services 
Involve key patterns in the adoption of microservices architecture 
Manage performance and scalability for enterprise-level applications 


## Instructions and Navigations
All of the code is organized into folders. For example, Chapter02.

The code will look like the following:
```
public interface Engineering {
  List<String> getDisciplines ();
}
public class BasicEngineering implements Engineering {

  @Override
  public List<String> getDisciplines() {
    return Arrays.asList("d7", "d3");
  }
}
@Electronic
public class ElectronicEngineering extends BasicEngineering {
   ...  
}
@Mechanical
public class MechanicalEngineering extends BasicEngineering {
   ...
}
```

**Following is what you need for this book:**
Java developers who are comfortable with programming in Java and now want to learn how to implement design patterns to create robust, reusable and easily maintainable apps.

With the following software and hardware list you can run all code files present in the book (Chapter 2-7 and 9).
### Software and Hardware List
|  Chapter   | Software required                   | OS required                        |
|  --------  | ------------------------------------| -----------------------------------|
| 2-7 and 9  | GlassFish 5.0                       | Windows, Mac OS X, and Linux (Any) |
| 2-7 and 9  | JDK-8                               | Windows, Mac OS X, and Linux (Any) |

We also provide a PDF file that has color images of the screenshots/diagrams used in this book. 📚 [Click here to download it]( https://www.packtpub.com/sites/default/files/downloads/JavaEE8DesignPatternsandBestPractices_ColorImages.pdf).


