# SBT basics

Usually, and also in this course, sbt is used for **building**, **testing**, **running** and **submitting assignments**. This tutorial explains some sbt commands that you can use. 

## What SBT is?

SBT is the de facto build tool in the Scala community. If you are used to other build tools, you will be familiar with the commands: 
* **clean**: deletes files produced by the build (e.g. generated sources, compiled classes and task caches)
* **compile**: compiles sources
* **test**: executes all test
* **package**: produces the main artifact, such as a binary JAR. 
* **help**: shows the help menu
* **console**: starts the Scala interpreter with the project classes on the classpath

Then we have some extra commands, such as: 
* **run**: runs a main class, passing along arguments provided on the command line
* **tasks**: list the tasks defined for the current project
* **reload**: (Re)loads the current project or changes to plugin project 

### The basics

In sbt's terminology, the _base_ or _project's root directory_ is the directory containing the project. So if you go into any SBT project, you'll see a _build.sbt_ declared in the top-level directory that is, the _base_ directory. 


SBT uses the same directory structure as _Maven_ for source files by default (all paths are relative to the base directory):

```
	src/
		main/
			resources/
				<files to include in the main jar>
			scala/
				<main Scala sources>
			java
				<main Java sources>
		test/
			resources/
				<files to include in the test jar>
			scala/
				<main Scala sources>
			java
				<main Java sources>
```

Other directories in _src/_ will be ignored. 

### SBT build definition 

We already mentioned the _build.sbt_ file. There are ther sbt files in a project subdirectory. 

The _project_ folder can contain _.scala_ files, which are combined with _.sbt_ files to form the complete build definition. 

## SBT tasks

### Starting up sbt

In order to start _sbt_, open a terminal and navigate tot the directory of the project you are working on (where the _build.sbt_ file is). Typing _sbt_ will open the sbt command prompt. 

```
$ cd /project-path
$ sbt
# This is the sbt shell
>
```

If you are using some IDEs, such as IntelliJ IDEA, you maybe already have a _sbt_ shell already opened.

### Running the Scala interpreter inside SBT

The Scala interpreter is different than the SBT command line.

However, you can start the Scala interpreter inside sbt using the _console_ task. The interpreter (also called **REPL**, for _read-eval-print loop_) is useful for trying out snippets of Scala code. When the REPL is executed from SBT, all your code in the SBT project will also be loaded and you will be able to access it from the interpreter. That's why the Scala REPL can only start up if there are no compilation errors in your code. 

```
> console
[info] Starting scala interpreter...
Welcome to Scala version 2.11.5 (Java HotSpot(TM) 64-Bit Server VM, Java 1.7.0_04-ea).
Type in expressions to have them evaluated.
Type :help for more information.

scala> println("Hello World")                                          # This is the Scala REPL, type some Scala code
Hello World
```

### Compiling your Code

The compile task will compile the source code of an assingment which is located in the directory _src/main/scala_. 

```
> compile
[info] Compiling 4 Scala sources to /Users/aleksandar/example/target/scala-2.11/classes...
[success] Total time: 1 s, completed Mar 21, 2013 11:04:46 PM
> 
```

If the source code contains errors, the error messages from the compiler will be displayed. 

### Testing your code
The directory _src/test/scala_ contains unit tests for the project. In order to run these tests in sbt, you can use the test command.

```
> test
[info] ListsSuite:
[info] - one plus one is two
[info] - sum of a few numbers *** FAILED ***
[info]   3 did not equal 2 (ListsSuite.scala:23)
[info] - max of a few numbers
[error] Failed: : Total 3, Failed 1, Errors 0, Passed 2, Skipped 0
[error] Failed tests:
[error]   example.ListsSuite
[error] {file:/Users/luc/example/}assignment/test:test: Tests unsuccessful
[error] Total time: 5 s, completed Aug 10, 2012 10:19:53 PM
> 
```

### Running your code
If your project has an object with a main method (or an object extending the trait App), then you can run the code in _sbt_ easily by typing _run_. In case sbt finds multiple main methods, it will ask you which one you'd like to execute. 

```
> run
Multiple main classes detected, select one to run:

 [1] example.Lists
 [2] example.M2

Enter number: 1

[info] Running example.Lists 
main method!
[success] Total time: 33 s, completed Aug 10, 2012 10:25:06 PM
>
```

