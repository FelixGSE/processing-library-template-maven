# Processing Library Template Maven

This is a small template to develop and build Processing libraries with Apache Maven. 
The official [processing library template](https://github.com/processing/processing-library-template) 
uses Ant and is quite painful to set up and use. The goal for this template is to make the development and set up process 
easy and convenient.  

# DISCLAIMER

I am not a Java developer, and I don't have a lot of experience with Maven. If you find something in this repository 
that looks bad then it probably is. I am happy for any kind of feedback in case you find things which can be improved. 
This project is WIP and probably does not yet do all the things that the official library template is doing. 
I only tested building libraries on a Mac, other platforms might not work.

# Configuration and usage

When developing a Processing library you should have Processing installed on your computer. It seems that Processing is 
not maintained anymore on Maven Central (see related [issue on Github](https://github.com/processing/processing4/issues/262)). 
Therefore, for local development the Processing core jar from the installed Processing distribution is used. 

You should edit the following properties in the `pom.xml` file to configure the project: 

```xml

<project>
    
    ...

    <groupId>org.example</groupId>
    <artifactId>processing-library-template</artifactId>
    <version>1.0</version>

    <properties>
        ...
        <sketchbook.location>${user.home}/Documents/Processing</sketchbook.location>
        <processing.core.jar.location>/Applications/Processing.app/Contents/Java/core/library/core.jar
        </processing.core.jar.location>
        ...
    </properties>
    
    ...
    
</project>
```

To build the library simply run the following command:

```shell
mvn clean package
```