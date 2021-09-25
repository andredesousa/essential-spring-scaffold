# Essential Spring Scaffold

The [Spring Framework](https://spring.io/) is an application framework and inversion of control container for the **Java platform**.
This project was generated with [Spring Initializr](https://start.spring.io/).
It has a complete **RESTful API** configured, including build, test, and deploy scripts as examples.

## Table of Contents

- [Project structure](#project-structure)
- [Running unit tests](#running-unit-tests)
- [Running integration tests](#running-integration-tests)
- [Debugging](#debugging)
- [Commit messages convention](#commit-messages-convention)
- [Reference documentation](#reference-documentation)

## Project structure

When working in a large team with many developers that are responsible for the same codebase, having a common understanding of how the application should be structured is vital.
Based on best practices from the community, Spring, other github projects and developer experience, your project should look like this:

```html
├── ci
|  ├── build
|  └── deploy
├── gradle
├── src
|  ├── integrationTest
|  ├── main
|  |  ├── java
|  |  |  └── app
|  |  |    ├── AppApplication.java
|  |  |    ├── AppController.java
|  |  |    └── AppService.java
|  |  └── resources
|  |    ├── application-prod.properties
|  |    └── application.properties
|  └── test
├── .editorconfig
├── .gitignore
├── .prettierrc.json
├── CHANGELOG.md
├── changelog.mustache
├── build.gradle
├── gradlew
├── gradlew.bat
├── LICENSE
├── README.md
└── settings.gradle
```

All of the app's code goes in a folder named `src/main`.
The unit tests and integration test are in the `src/test` and `src/integrationTest` folders.
Static files are placed in `src/main/resources` folder.

## Running unit tests

Use `./gradlew test` to execute the unit tests via [JUnit 5](https://junit.org/junit5/) and [Mockito](https://site.mockito.org/).
Use `./gradlew test -t` to keep executing unit tests in real time while watching for file changes in the background.
You can see the HTML report opening the [index.html](build/reports/tests/test/index.html) file in your web browser.

It's a common requirement to run subsets of a test suite, such as when you're fixing a bug or developing a new test case.
Gradle provides different mechanisms.
For example, the following command lines run either all or exactly one of the tests in the `SomeTestClass` test case:

```bash
./gradlew test --tests SomeTestClass
```

For more details, you can see the [Test filtering](https://docs.gradle.org/current/userguide/java_testing.html#test_filtering) section of the Gradle documentation.

This project uses [JaCoCo](https://www.eclemma.org/jacoco/) which provides code coverage metrics for Java.
The minimum code coverage is set to 80%.
You can see the HTML coverage report opening the [index.html](build/reports/jacoco/test/html/index.html) file in your web browser.

## Running integration tests

Use `./gradlew integrationTest` to execute the integration tests via [JUnit 5](https://junit.org/junit5/).
Use `./gradlew integrationTest -t` to keep executing your tests while watching for file changes in the background.
You can see the HTML report opening the [index.html](build/reports/tests/integration/index.html) file in your web browser.

Like unit tests, you can also run subsets of a test suite.
See the [Test filtering](https://docs.gradle.org/current/userguide/java_testing.html#test_filtering) section of the Gradle documentation.

## Debugging

You can debug the source code, add breakpoints, inspect variables and view the application's call stack.
Also, you can use the IDE for debugging the source code, unit and integration tests.
These functionalities are provided natively or using **Spring Boot DevTools**.

You can customize the [log verbosity](https://docs.gradle.org/current/userguide/logging.html#logging) of gradle tasks using the `-i` or `--info` flag.

## Commit messages convention

In order to have a consistent git history every commit must follow a specific template. Here's the template:

```bash
<type>(<ITEM ID>?): <subject>
```

### Type

Must be one of the following:

- **build**: Changes that affect the build system or external dependencies (example scopes: Gradle, Maven)
- **ci**: Changes to our CI configuration files and scripts (example scopes: Jenkins, Travis, Circle, SauceLabs)
- **chore**: Changes to the build process or auxiliary tools and libraries such as documentation generation
- **docs**: Documentation only changes
- **feat**: A new feature
- **fix**: A bug fix
- **perf**: A code change that improves performance
- **refactor**: A code change that neither fixes a bug nor adds a feature
- **revert**: A commit that reverts a previous one
- **style**: Changes that do not affect the meaning of the code (white-space, formatting, missing semi-colons, etc.)
- **test**: Adding missing tests or correcting existing tests

### ITEM ID

The related **issue** or **user story** or even **defect**.

- For **user stories**, you shoud use `US-` as prefix. Example: `feat(US-4321): ...`
- For **no related issues** or **defects** you should leave it blank. Example: `feat: ...`

### Subject

The subject contains a succinct description of the change.

## Reference Documentation

For further reference, please consider the following sections:

- [Official Gradle documentation](https://docs.gradle.org)
- [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.5.5/gradle-plugin/reference/html/)
- [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.5.5/gradle-plugin/reference/html/#build-image)
- [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.5.5/reference/htmlsingle/#using-boot-devtools)
- [Spring Web](https://docs.spring.io/spring-boot/docs/2.5.5/reference/htmlsingle/#boot-features-developing-web-applications)
- [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
- [Rest Repositories](https://docs.spring.io/spring-boot/docs/2.5.4/reference/htmlsingle/#howto-use-exposing-spring-data-repositories-rest-endpoint)
- [Accessing JPA Data with REST](https://spring.io/guides/gs/accessing-data-rest/)
