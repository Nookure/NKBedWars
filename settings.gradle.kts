pluginManagement {
    // Include 'plugins build' to define convention plugins.
    includeBuild("build-logic")
}

rootProject.name = "BedWars1058"
include(":resetadapter-aswm")
include(":bedwars-plugin")
include(":bedwars-api")
include(":versionsupport-common")
include(":versionsupport_v1_20_R4")
include(":resetadapter-slimepaper")
include(":resetadapter-slime")
project(":resetadapter-aswm").projectDir = file("resetadapter_aswm")
project(":versionsupport-common").projectDir = file("versionsupport_common")
project(":resetadapter-slimepaper").projectDir = file("resetadapter_slimepaper")
project(":resetadapter-slime").projectDir = file("resetadapter_slime")
