# SBT basics

Usually, and also in this course, sbt is used for building, testing, running and submitting assignments. This tutorial explains some sbt commands that you can use. 

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


### Installing

A step by step series of examples that tell you how to get a development env running

Say what the step will be

```
Give the example
```

And repeat

```
until finished
```

End with an example of getting some data out of the system or using it for a little demo

## Running the tests

Explain how to run the automated tests for this system

### Break down into end to end tests

Explain what these tests test and why

```
Give an example
```

### And coding style tests

Explain what these tests test and why

```
Give an example
```

## Deployment

Add additional notes about how to deploy this on a live system

## Built With

* [Dropwizard](http://www.dropwizard.io/1.0.2/docs/) - The web framework used
* [Maven](https://maven.apache.org/) - Dependency Management
* [ROME](https://rometools.github.io/rome/) - Used to generate RSS Feeds

## Contributing

Please read [CONTRIBUTING.md](https://gist.github.com/PurpleBooth/b24679402957c63ec426) for details on our code of conduct, and the process for submitting pull requests to us.

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/your/project/tags). 

## Authors

* **Billie Thompson** - *Initial work* - [PurpleBooth](https://github.com/PurpleBooth)

See also the list of [contributors](https://github.com/your/project/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Hat tip to anyone whose code was used
* Inspiration
* etc
