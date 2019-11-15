## Java Gradle Project Template

```
# Note: install Java and Gradle

$: gradle wrapper
$: ./gradlew init  # ->
# Select type of project to generate:
  #   3: library
  # Select implementation language:
  #   3: Java
  # Select build script DSL:
  #   1: Groovy
  # Select test framework:
  #   4: JUnit Jupiter
  # Project name (default: Java-Gradle-Project-Template): java-project-template
  # Source package (default: java.project.template): template
```

```
$: ./gradlew tasks  # list tasks
$: ./gradlew properties  # list properties
```

```
$: java -DjarCli="Run-Value" -jar build/libs/java-project-template-0.1.0-all.jar  # run-time config
```

### build

```
$: ./gradlew clean
$: ./gradlew build  # compile, test, jar and javadoc all at once
```

```
$: ./gradlew build --scan  # create build scan
  # Do you accept these terms? yes
  # Publishing build scan...
# Note: if you want to view the scan you have to give your email
```

#### docs

```
$: ./gradlew javadoc
```

```
# Note: see Javadocs in `build/docs/javadoc/index.html`
```

#### libs

```
$: ./gradlew jar  # build-time config in build.gradle
```
```
$: jar xf build/libs/java-project-template-0.1.0.jar META-INF/MANIFEST.MF  # extract MANIFEST.MF into META-INF
```

#### reports and test-results

```
$: ./gradlew test

# Note: see the HTML test reports in `build/reports/tests/test/index.html`
# Note: see the XML test reports in `build/reports/test-results/test/TEST-**.xml`
```

```
$: ./gradlew jacocoTestReport

# Note: see the test coverage reports in `build/reports/jacoco/test/html/index.html`
```

### gradle

Home to the Gradle wrapper.  

### src

```
$: ./gradlew run  # runs app { mainClassName } in build.gradle
```

#### main/resources

Change configuration.  

### build.gradle

For project configuration:
* define and apply plugins
* repositories
* dependencies
* tests
* packaging
* executing

### gradlew and gradlew.bat

Gradle wrapper runners.  

### settings.gradle

For build configuration:
* root project
