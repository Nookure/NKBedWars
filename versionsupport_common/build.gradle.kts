plugins {
    id("buildlogic.java-conventions")
}

dependencies {
    compileOnly(project(":bedwars-api"))
    compileOnly(libs.org.spigotmc.spigot.x9)
}

description = "versionsupport_v1_20_R4"
