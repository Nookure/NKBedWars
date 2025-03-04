plugins {
    id("buildlogic.java-conventions")
}

dependencies {
    api(libs.com.andrei1058.spigot.sidebar.sidebar.base.x1)
    compileOnly(libs.org.spigotmc.spigot.x2)
    compileOnly(libs.com.google.common.google.collect)
    compileOnly(libs.org.spigotmc.spigot.api)
}

description = "bedwars-api"
