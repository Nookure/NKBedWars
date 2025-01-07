plugins {
    id("buildlogic.java-conventions")
}

dependencies {
    compileOnly(project(":bedwars-api"))
    compileOnly(libs.org.spigotmc.spigot.api)
    compileOnly(libs.com.grinderwolf.slimeworldmanager.api)
}

description = "resetadapter-slime"
