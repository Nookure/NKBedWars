plugins {
    id("buildlogic.java-conventions")
    alias(libs.plugins.shadowJar)
}

dependencies {
    api(libs.io.papermc.paperlib)
    api(libs.org.bstats.bstats.bukkit)
    api(project(":bedwars-api"))
    api(project(":resetadapter-slime"))
    api(project(":versionsupport_v1_20_R4"))
    api(project(":versionsupport-common"))
    api(libs.com.andrei1058.vipfeatures.vipfeatures.api)
    api(libs.com.zaxxer.hikaricp)
    api(libs.org.slf4j.slf4j.simple)
    api(libs.com.andrei1058.spigot.sidebar.sidebar.base)
    api(libs.com.andrei1058.spigot.sidebar.sidebar.v1.v20.r4)
    api(project(":resetadapter-slimepaper"))
    api(project(":resetadapter-aswm"))
    compileOnly(libs.de.simonsator.party.and.friends.mysql.edition.spigot.api)
    compileOnly(libs.de.simonsator.spigot.party.api.redisbungee)
    compileOnly(libs.de.simonsator.developmentpafspigot)
    compileOnly(libs.com.alessiodp.parties.parties.api)
    compileOnly(libs.net.citizensnpcs.citizens.main)
    compileOnly(libs.net.milkbowl.vault.vaultapi)
    compileOnly(libs.org.spigotmc.spigot.x1)
    compileOnly(libs.me.clip.placeholderapi)
}

description = "bedwars-plugin"
