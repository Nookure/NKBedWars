plugins {
  `java-library`
  `maven-publish`
}

repositories {
  mavenLocal()
  mavenCentral()

  maven("https://jitpack.io")
  maven("https://repo.titanvale.net/releases/")
  maven("https://oss.sonatype.org/content/repositories/snapshots")
  maven("https://repo.codemc.io/repository/nms/")
  maven("https://repo.maven.apache.org/maven2/")
  maven("https://simonsator.de/repo/")
  maven("https://maven.citizensnpcs.co/repo")
  maven("https://repo.extendedclip.com/content/repositories/placeholderapi/")
  maven("https://repo.codemc.io/repository/maven-public/")
  maven("https://repo.codemc.io/repository/maven-releases/")
  maven("https://repo.codemc.io/repository/maven-snapshots/")
  maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
  maven("https://repo.alessiodp.com/releases/")
  maven("https://repo.andrei1058.dev/releases/")
  maven("https://repo.papermc.io/repository/maven-public/")
  maven("https://repo.fusesource.com/nexus/content/repositories/releases-3rd-party/")
  maven("https://repo.andrei1058.dev/releases")
  maven("https://repo.glaremasters.me/repository/concuncan/")
  maven("https://repo.rapture.pw/repository/maven-snapshots/")
  maven("https://repo.infernalsuite.com/repository/maven-snapshots/")
}

dependencies {
  compileOnly("net.md-5:bungeecord-chat:1.8-SNAPSHOT")
  compileOnly("commons-io:commons-io:2.13.0")
  compileOnly("org.jetbrains:annotations:24.0.1")
}

group = "com.andrei1058.bedwars"
version = "23.12.1-SNAPSHOT"

java.sourceCompatibility = JavaVersion.VERSION_21

java {
  toolchain.languageVersion.set(JavaLanguageVersion.of(21))
}

publishing {
  publications.create<MavenPublication>("maven") {
    from(components["java"])
  }
}

tasks.withType<JavaCompile>() {
  options.encoding = "UTF-8"
}

tasks.withType<Javadoc>() {
  options.encoding = "UTF-8"
}