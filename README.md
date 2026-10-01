# Spring Framework Learning Project

A comprehensive Spring Framework educational project demonstrating core concepts including dependency injection, bean management, and Spring configuration patterns. This project uses Spring Boot 4.1.1 with Java 21.

## 📋 Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
- [Project Structure](#project-structure)
- [Usage Examples](#usage-examples)
- [Building & Running](#building--running)
- [Technologies](#technologies)
- [Learning Resources](#learning-resources)
- [License](#license)

## 🎯 Overview

This project demonstrates essential Spring Framework patterns and best practices through practical examples:

- **Dependency Injection**: Learn how Spring manages object dependencies
- **Bean Configuration**: Understand bean lifecycle and configuration patterns
- **Application Context**: Explore Spring's application context and bean resolution
- **XML Configuration**: Experience Spring's XML-based configuration approach

The project includes multiple examples showcasing different dependency injection scenarios and Spring Bean relationships.

## ✨ Features

- ✅ Spring Boot 4.1.1 with Java 21
- ✅ Dependency Injection (Constructor and Setter Injection)
- ✅ XML-based Spring Configuration
- ✅ Bean Lifecycle Management
- ✅ Application Context Usage
- ✅ Real-world Example Scenarios
- ✅ Lombok Integration for Reduced Boilerplate
- ✅ Spring DevTools for Enhanced Development
- ✅ Comprehensive Test Suite with JUnit 5

## 📦 Prerequisites

Before you begin, ensure you have the following installed:

- **Java 21**: Download from [Oracle JDK](https://www.oracle.com/java/technologies/downloads/) or use [OpenJDK](https://openjdk.java.net/)
- **Gradle 8.0+**: Included via Gradle Wrapper (gradlew.bat for Windows, ./gradlew for Unix)
- **Git**: For cloning and version control
- **IDE** (Optional): IntelliJ IDEA, Eclipse, or VS Code with Java Extensions

### Verify Installation

```bash
java -version
gradle --version
```

## 🚀 Getting Started

### 1. Clone the Repository

```bash
git clone <repository-url>
cd "Spring Framework"
```

### 2. Build the Project

```bash
# Windows
gradlew.bat clean build

# Linux/Mac
./gradlew clean build
```

### 3. Run the Application

```bash
# Windows
gradlew.bat bootRun

# Linux/Mac
./gradlew bootRun
```

### 4. Expected Output

The application will initialize the Spring Application Context and execute dependency injection examples:

```
ClassRoom initialized with Speaker dependency
Sound being produced...
```

## 📁 Project Structure

```
Spring Framework/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/rc/
│   │   │       ├── dto/springframework/
│   │   │       │   ├── SpringFrameworkApplication.java    # Entry point
│   │   │       │   └── Employee.java                       # Example DTO
│   │   │       ├── ex2/
│   │   │       │   ├── Human.java                          # Constructor injection example
│   │   │       │   └── Heart.java                          # Dependency
│   │   │       └── ex3/
│   │   │           ├── ClassRoom.java                      # Setter injection example
│   │   │           └── Speaker.java                        # Dependency
│   │   └── resources/
│   │       └── class.xml                                   # Spring bean configuration
│   └── test/
│       └── java/                                           # Unit tests
├── build.gradle                                            # Gradle build configuration
├── settings.gradle                                         # Gradle settings
├── gradlew                                                 # Gradle Wrapper (Linux/Mac)
├── gradlew.bat                                             # Gradle Wrapper (Windows)
└── README.md                                               # This file
```

## 💡 Usage Examples

### Example 1: Constructor Injection (ex2)

The `Human` class demonstrates constructor injection:

```java
public class Human {
    private Heart heart;

    public Human(Heart heart) {
        this.heart = heart;
    }
    
    public Heart getHeart() {
        return heart;
    }
}
```

**Configuration** (in class.xml):
```xml
<bean id="heart" class="com.rc.ex2.Heart"/>
<bean id="human" class="com.rc.ex2.Human">
    <constructor-arg ref="heart"/>
</bean>
```

### Example 2: Setter Injection (ex3)

The `ClassRoom` class demonstrates setter injection:

```java
public class ClassRoom {
    private Speaker speaker;

    public void setSpeaker(@Autowired Speaker speaker) {
        this.speaker = speaker;
    }
    
    public Speaker getSpeaker() {
        return speaker;
    }
}
```

**Configuration** (in class.xml):
```xml
<bean id="speaker" class="com.rc.ex3.Speaker"/>
<bean id="classroom" class="com.rc.ex3.ClassRoom">
    <property name="speaker" ref="speaker"/>
</bean>
```

### Running the Application

```java
ApplicationContext context = 
    new ClassPathXmlApplicationContext("class.xml");

ClassRoom classRoom = 
    context.getBean("classroom", ClassRoom.class);

classRoom.getSpeaker().sound();  // Output: Sound being produced...
```

## 🔨 Building & Running

### Clean Build

```bash
gradlew.bat clean build
```

### Run Tests

```bash
gradlew.bat test
```

### Run Application with DevTools

```bash
gradlew.bat bootRun
```

The Spring Boot DevTools will enable:
- Fast restart on file changes
- Configuration reloading
- Enhanced development experience

### Generate Gradle Build Scan

```bash
gradlew.bat build --scan
```

View insights at [Gradle Scans](https://scans.gradle.com)

## 🛠 Technologies

| Technology | Version | Purpose |
|-----------|---------|---------|
| Spring Boot | 4.1.1 | Application Framework |
| Java | 21 | Programming Language |
| Gradle | 8.0+ | Build Tool |
| JUnit 5 | Latest | Testing Framework |
| Lombok | Latest | Reduce Boilerplate |
| Spring DevTools | Latest | Development Tools |

## 📚 Learning Resources

### Official Spring Documentation

- [Spring Framework Guide](https://spring.io/guides)
- [Spring Boot Documentation](https://docs.spring.io/spring-boot/4.1.1/reference/)
- [Spring Dependency Injection](https://docs.spring.io/spring-framework/reference/core/beans.html)
- [Spring Configuration Processor](https://docs.spring.io/spring-boot/4.1.1/specification/configuration-metadata/annotation-processor.html)

### Related Topics

- [Gradle Documentation](https://docs.gradle.org)
- [Java 21 Features](https://docs.oracle.com/en/java/javase/21/)
- [Lombok Documentation](https://projectlombok.org/)

### Topics Covered

- Dependency Injection Patterns
- Bean Lifecycle and Scopes
- XML vs. Annotation Configuration
- Application Context Usage
- Spring Best Practices

## 🔍 Troubleshooting

### Build Fails with Java Version Error

**Solution**: Ensure Java 21 is installed and set as the default:

```bash
java -version
# Output should show Java 21
```

### "class.xml not found" Error

**Solution**: Ensure `class.xml` is in `src/main/resources/`:

```bash
# Windows
dir src\main\resources\

# Linux/Mac
ls src/main/resources/
```

### Gradle Wrapper Issues

**Solution**: Use the included Gradle Wrapper:

```bash
# Windows
gradlew.bat clean build

# Linux/Mac
chmod +x gradlew
./gradlew clean build
```

## 🤝 Contributing

To contribute to this learning project:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/new-example`)
3. Commit your changes (`git commit -m 'Add new Spring example'`)
4. Push to the branch (`git push origin feature/new-example`)
5. Open a Pull Request

## 📝 License

This project is provided as an educational resource. Feel free to use, modify, and distribute for learning purposes.

---

**Last Updated**: October 2024

**Maintained By**: Spring Framework Learning Community

For questions or suggestions, please open an issue or contact the project maintainers.

Happy Learning! 🎓
