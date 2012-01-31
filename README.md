EPIC INSTRUCTIONS
=================

    $ git clone git@github.com:fwielstra/xebia-scala-koans.git
    $ cd xebia-scala-koans
    $ chmod +x ./sbt
    $ ./sbt
    > ~test-only org.functionalkoans.forscala.Koans

Then do what it says.

GENERATING ECLIPSE PROJECT FILES
================================

Added the Eclipse plugin. Use the 'eclipse' command within SBT to generate Eclipse project files.
Also install the [Scala IDE](http://scala-ide.org/) for Eclipse separately.

  $ ./sbt
  $ eclipse

GENERATING INTELLIJ PROJECT FILES
=================================

I added the intellij plugin; use SBT to generate intellij project files
and install the sbt plugin in intellij itself. Then open the project.

  $ ./sbt
  > gen-idea no-classifiers no-sbt-classifiers
