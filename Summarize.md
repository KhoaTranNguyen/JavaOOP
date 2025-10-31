Perfect! 🧠 We’ll reformat your notes into a **study-guide / cheatsheet style** — concise, example-driven, with highlighted key points and code snippets.

Here’s the polished Markdown version of your notes:

---

# Java Study Guide (Cheatsheet Style)

---

## Chapter 1: Introduction to Java

### 1. What is Java?

* One of the most popular **software development languages**
* **High-level**, **Object-Oriented Programming (OOP)**
* Key principle: **WORA (Write Once, Run Anywhere)**

---

### 2. History

| Year | Event                                                                                                                     |
| ---- | ------------------------------------------------------------------------------------------------------------------------- |
| 1991 | Java called **Greentalk** by James Gosling (`.gt`) <br> Part of Green Project, C/C++ style, for portable devices → failed |
| 1995 | Sun renamed it **Java** <br> Targeted **Web development** <br> Free runtimes for popular platforms                        |
| 2009 | Oracle acquired Sun Microsystems → Java, MySQL, Solaris                                                                   |

---

### 3. Java Programming Environment

```text
.java -> javac compiler -> .class (bytecode) -> JVM (JRE) -> Executes program
```

* **JDK (Java Development Kit)**: Superset of JRE, contains compiler (`javac`) and tools
* **JRE (Java Runtime Environment)**: JVM + Java Class Library
* **JVM (Java Virtual Machine)**:

  * Loads, verifies, executes code
  * Provides runtime environment

---

### 4. Object-Oriented Programming (OOP)

#### Object

* Instance of a class
* Contains **state** (variables) + **behavior** (methods) + **identity**
* Example:

```java
ClassName obj = new ClassName();
```

#### Class

* Blueprint/template for objects
* Syntax:

```java
class MyClass {
    // fields (state)
    int x;
    // methods (behavior)
    void doSomething() { ... }
}
```

---

### 5. OOP vs Procedural

| Feature         | C (Procedural)              | Java (OOP)                        |
| --------------- | --------------------------- | --------------------------------- |
| Code focus      | Functions operating on data | Objects containing data + methods |
| Maintainability | Harder for large projects   | Easier                            |
| Reusability     | Limited                     | High (inheritance, polymorphism)  |

---

### 6. Key OOP Principles

#### 6.1 Abstraction

* Shows only essential attributes, hides details
* Reduces complexity

#### 6.2 Encapsulation

* **Bind code + data** together
* Protect sensitive data using `private` fields + `get/set` methods

#### 6.3 Inheritance

* Acquire attributes/methods from another class
* Syntax:

```java
class Child extends Parent { ... }
```

#### 6.4 Polymorphism

* “One interface, multiple methods”
* Example:

```java
class Animal {
    void sound() { System.out.println("Animal sound"); }
}
class Pig extends Animal {
    void sound() { System.out.println("Pig says wee wee"); }
}

Animal a = new Animal();
Animal p = new Pig();

a.sound(); // Animal sound
p.sound(); // Pig says wee wee
```

---

### 7. Features of Java

* Interpreted, multithreaded, dynamic
* Portable, architecture-neutral
* High performance, robust, secure, distributed
* Simple, familiar syntax, OOP-based

---

### 8. Java Application Types

* Desktop GUI, Mobile, Embedded systems
* Web apps, Web servers, Enterprise apps
* Scientific, Big Data, Business applications

---

## Chapter 2: Basic Java Concepts

### 1. Output

```java
System.out.print("Hello");    // cursor stays
System.out.println("Hello");  // adds newline
```

* `System`: final class in `java.lang`
* `out`: static PrintStream member

---

### 2. Case Sensitivity

* `Main` ≠ `main`
* File name = class name

---

### 3. Identifiers

* Valid: letters, digits, `_`, `$`
* Cannot start with digit
* Cannot be a keyword, `true`, `false`, `null`

```java
_validVar;
$money;
variableTest;
```

---

### 4. Variables & Data Types

#### Primitive Types

| Type    | Size  | Range/Description              |
| ------- | ----- | ------------------------------ |
| byte    | 1B    | -128 → 127                     |
| short   | 2B    | -32,768 → 32,767               |
| int     | 4B    | -2,147,483,648 → 2,147,483,647 |
| long    | 8B    | ±9×10^18                       |
| float   | 4B    | 6-7 decimal digits             |
| double  | 8B    | 15 decimal digits              |
| boolean | 1 bit | true / false                   |
| char    | 2B    | single character               |

#### Non-Primitive

* `String`, `Array`, `Classes`

---

### 5. Character Literals

* Escape sequences:

| Escape | Meaning         |
| ------ | --------------- |
| `\n`   | New line        |
| `\t`   | Tab             |
| `\\`   | Backslash       |
| `\'`   | Single quote    |
| `\"`   | Double quote    |
| `\r`   | Carriage return |
| `\f`   | Form feed       |
| `\b`   | Backspace       |

```java
System.out.println("Hello\nWorld");
System.out.println("Tab\tSpace");
```

---

### 6. Type Conversion & Casting

#### Automatic Conversion

* Compatible types, source smaller than target

```java
int i;
byte b = 21;
i = b;  // byte → int
```

#### Casting (Explicit Conversion)

```java
double d = 323.142;
int i = (int) d; // 323
byte b = (byte) d; // 67
```

#### Incompatible types → use parsing methods

```java
int n = Integer.parseInt("123");
double d = Double.valueOf("3.14");
```

---

### 7. Input

```java
import java.util.Scanner;
Scanner sc = new Scanner(System.in);

int i = sc.nextInt();
double d = sc.nextDouble();
String s = sc.nextLine();
sc.close();
```

---

### 8. Operators

#### Arithmetic

`+ - * / % ++ -- += -= *= /= %=`

#### Relational

`== != > < >= <=` → boolean

#### Logical

| Operator | Meaning                      |              |                    |
| -------- | ---------------------------- | ------------ | ------------------ |
| `&&`     | AND (short-circuit)          |              |                    |
| `        |                              | `            | OR (short-circuit) |
| `!`      | NOT                          |              |                    |
| `&`      | AND (bitwise)                |              |                    |
| `        | `                            | OR (bitwise) |                    |
| `^`      | XOR (bitwise)                |              |                    |
| `?:`     | Ternary `exp1 ? exp2 : exp3` |              |                    |

#### Assignment

* Chain assignment allowed: `x = y = z = 100;`

#### Operator Precedence (Top → Bottom)

1. `[]`, `()`, `.`
2. Postfix `++ --`
3. Prefix `++ -- ~ ! (type)`
4. `* / %`
5. `+ -`
6. `>> >>> <<`
7. `> >= < <= instanceof`
8. `== !=`
9. `&`
10. `^`
11. `|`
12. `&&`
13. `||`
14. `?:`
15. `=, op=`

---

## Chapter 3: Control Statements

### 1. Selection Statements

#### If-Else

```java
if(condition) { ... }
else if(condition) { ... }
else { ... }
```

#### Switch

```java
switch(val) {
  case 1: ...
    break;
  case 2: ...
    break;
  default: ...
}
```

---

### 2. Loops

#### While

```java
while(condition) { ... }
```

#### Do-While

```java
do { ... } while(condition);
```

#### For

```java
for(init; condition; iteration) { ... }
```

#### For-each

```java
for(int x : nums) { ... }
```

#### Multi-dimensional arrays

```java
int arr[][] = new int[4][];
arr[0] = new int[1];
...
```

---

### 3. Jump Statements

* **break**: exits loop or labeled block
* **continue**: skips current iteration
* **return**: exits method

```java
outer: for(int i=0;i<10;i++){
  for(int j=0;j<10;j++){
    if(j>i) continue outer;
  }
}
```

---

### 4. Strings

```java
String str = "Hello World";
str.charAt(0);      // 'H'
str.concat("!!!");   // "Hello World!!!"
str.contains("lo");  // true
str.indexOf("W");    // 6
str.isEmpty();       // false
str.length();        // 11
str.replace("World","Java"); // "Hello Java"
str.toLowerCase();   // "hello world"
str.toUpperCase();   // "HELLO WORLD"
str.trim();          // removes whitespace
str.substring(0,5);  // "Hello"
```