# play-template

A generic, multi-module, [Play Framework](http://www.playframework.com/) Scala project template, with some basic configuration and helpers.

## General

Replace every instance of `com.example` with your company/organization's domain, and `myapp` with the name of your application.

## Modules

* `myapp-core` – A vanilla Scala/Java module. This is where most of your code should live.
* `myapp-play` – The Play Framework module. This should be a thin layer of controllers and other web server logic on-top of `myapp-core`. Making this module as light as possible should make it easier to move to a different app server in the future, should you want to.
* `myapp-test` – Testing code module that's only included in `test` scope. This isn't not where your tests should live, only testing helpers/utilities to be used and shared between the `core` and `play` modules' tests.

## Build

* `project/Build.scala` – Module configuration
* `project/BuildSettings.scala` – Generic and plugin settings for each module
* `project/Dependencies.scala` – Dependency configuration, pre-configured with some convenient dependencies

## Notes

* The `core` module defines `HttpRuntimeException`. This implementation of `RuntimeException` adds Http status code to an exception, making it explicit which status code should be returned to the client when this exception is thrown. Make your business exceptions inherit from this base exception, so you'll have meaningful exceptions with the right status codes. (see `Global` notes.)

* The `Global` object in the `play` modules allows you to intercept errors/exceptions and handle them with a custom error page. This code is commented out so you'll get the default Play error page  which is useful during development. Uncomment and create your own error page before running in production.

* `Global` also uses the aforementioned `HttpRuntimeException` to send the correct status code.

* Logging is configured in the `conf/application-logger.xml` logback config file.

* The top level `root` project aggregates all modules, so any action you run on it (`compile`, `test`, etc.) will be performed for all projects. If you want to run `play` specific tasks/commands (such as: `run`, `start`, etc.), you'll need to enter the `play` project and run it then:

```
$ cd ./play-template
$ sbt
sbt> compile                # aggregated on all projects
sbt> project myapp-play     # enter play module
sbt> run                    # play-specific command
```

 To return to the root project: `sbt> project root`.
