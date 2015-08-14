# spray-sse

Server-sent events implementation for Spray and full duplex over SSE.

## How to use

Scala projects using [SBT](http://www.scala-sbt.org/) can start using this library in two simple steps:

Add this to your `project/plugins.sbt`:

```
resolvers += "TNM" at "https://nexus.thenewmotion.com/content/groups/public"
```

and add a library dependency in your `build.sbt`:

```
libraryDependencies += "com.thenewmotion" %% "spray-sse" % "0.4"
```


## History

This repository started its life as [spray\_sse](https://github.com/siriux/spray\_sse) by [siriux](https://github.com/siriux). At The New Motion we have renamed it to spray-sse to better fit the convention of the Spray project and our own libraries.

We have turned it into a ready-to-use library and make releases of it to our own public repository.

