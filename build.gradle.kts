plugins {
  id("tabtps.parent")
}

repositories {
    maven {
      url = uri("https://repo.dmulloy2.net/repository/public/")
    }
}

dependencies {
    implementation("com.comphenix.protocol:ProtocolLib:4.7.0")
}

group = "xyz.jpenilla"
version = "1.3.16-SNAPSHOT"
description = "Monitor your server's performance in real time"
