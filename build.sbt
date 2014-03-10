import play.Project._

name := "eventsource-clock-java8"

version := "1.0-SNAPSHOT"

playJavaSettings

javacOptions ++= Seq("-source", "1.8", "-target", "1.8", "-Xlint")

initialize := {
  val _ = initialize.value
  if (sys.props("java.specification.version") != "1.8")
    sys.error("Java 8 is required for this project.")
}
