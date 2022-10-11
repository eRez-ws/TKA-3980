// Sample build.sbt.
// Note:
//   Blank lines need to separate the statements.
//   := means you are setting the value for that key
//   += means you are adding to the values for that key

name := "MyProject"

version := "0.1"

organization := "MyMegaCorp"

scalaVersion := "2.9.2"

sbtVersion := "0.13"

// The dependencies are in Maven format, with % separating the parts.  
// Notice the extra bit "test" on the end of JUnit and ScalaTest, which will 
// mean it is only a test dependency.
//
// The %% means that it will automatically add the specific Scala version to the dependency name.  
// For instance, this will actually download scalatest_2.9.2

libraryDependencies += "org.scala-lang" % "scala-swing" % "2.9.2"

libraryDependencies += "org.scalatest" %% "scalatest" % "1.9.1" % "test"

libraryDependencies += "org.bitcoin-s" % "bitcoin-s-secp256k1jni" % "1.9.4"

libraryDependencies += "junit" % "junit" % "4.8.1" % "test"

// Initial commands to be run in your REPL.  I like to import various project-specific things here.

initialCommands := """
    import myproject.stuff._;
    import myproject.other.stuff._;
  """
