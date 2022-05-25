### steps in exercise 5
#### create a new branch logging
```
with git branch -Switch to the logging branch via git checkout
```
#### dependencies added to the pom.xml
```
<dependencies>
  <dependency>
    <groupId>org.apache.logging.log4j</groupId>
    <artifactId>log4j-api</artifactId>
    <version>2.17.2</version>
  </dependency>
  <dependency>
    <groupId>org.apache.logging.log4j</groupId>
    <artifactId>log4j-core</artifactId>
    <version>2.17.2</version>
  </dependency>
</dependencies>

```
#### create Maven project with Log4j2 dependency
```
 


-Obtain a Logger -Use INFO and ERROR levels to log 
-by default Log4j assigns the root logger to Level.ERROR
those logs will be printed on the standard console.
-ALL < TRACE < DEBUG < INFO < WARN < ERROR < FATAL 
Since the default level is set to ERROR, error and fatal will be logged.
```