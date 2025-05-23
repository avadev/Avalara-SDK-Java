lazy val root = (project in file(".")).
  settings(
    organization := "Avalara.SDK",
    name := "Avalara.SDK",
    version := "24.12.10",
    scalaVersion := "2.11.4",
    scalacOptions ++= Seq("-feature"),
    javacOptions in compile ++= Seq("-Xlint:deprecation"),
    publishArtifact in (Compile, packageDoc) := false,
    resolvers += Resolver.mavenLocal,
    libraryDependencies ++= Seq(
      "io.swagger" % "swagger-annotations" % "1.6.5",
      "com.squareup.okhttp3" % "okhttp" % "4.12.0",
      "com.squareup.okhttp3" % "logging-interceptor" % "4.12.0",
      "com.google.code.gson" % "gson" % "2.9.1",
      "com.nimbusds" % "oauth2-oidc-sdk" % "9.43.3",
      "org.apache.commons" % "commons-lang3" % "3.12.0",
      "javax.ws.rs" % "jsr311-api" % "1.1.1",
      "javax.ws.rs" % "javax.ws.rs-api" % "2.1.1",
      "org.openapitools" % "jackson-databind-nullable" % "0.2.6",
      "org.threeten" % "threetenbp" % "1.4.3" % "compile",
      "io.gsonfire" % "gson-fire" % "1.8.5" % "compile",
      "jakarta.annotation" % "jakarta.annotation-api" % "1.3.5" % "compile",
      "com.google.code.findbugs" % "jsr305" % "3.0.2" % "compile",
      "jakarta.annotation" % "jakarta.annotation-api" % "1.3.5" % "compile",
      "javax.ws.rs" % "javax.ws.rs-api" % "2.1.1" % "compile",
      "junit" % "junit" % "4.13.1" % "test",
      "com.novocode" % "junit-interface" % "0.10" % "test",
      "io.github.cdimascio" % "dotenv-java" % "3.0.0" % "test"
    )
  )
