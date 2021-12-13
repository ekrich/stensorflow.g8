scalaVersion := "2.13.7"

// Set to false or remove if you want to show stubs as linking errors
nativeLinkStubs := true

enablePlugins(ScalaNativePlugin)

libraryDependencies += "org.ekrich" %%% "stensorflow" % "0.2.0"
