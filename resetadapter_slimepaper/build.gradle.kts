
plugins {
    id("buildlogic.java-conventions")
}

dependencies {
    api(libs.com.flowpowered.flow.nbt)
    compileOnly(project(":bedwars-api"))
    compileOnly(libs.org.spigotmc.spigot.api)
    compileOnly(libs.com.infernalsuite.aswm.api)
}

description = "resetadapter-slimepaper"
