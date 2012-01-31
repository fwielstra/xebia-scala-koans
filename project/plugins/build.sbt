resolvers += "sbt-idea-repo" at "http://mpeltonen.github.com/maven/"

libraryDependencies += "com.github.mpeltonen" %% "sbt-idea" % "0.10.0"

libraryDependencies <<= (libraryDependencies, sbtVersion) { (deps, version) =>
    deps :+ ("com.typesafe.sbteclipse" %% "sbteclipse" % "1.3-RC1" extra("sbtversion" -> version))
}
