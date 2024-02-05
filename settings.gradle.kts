pluginManagement {
    repositories {
        // NOTE: 注释该部分内容
        // mavenCentral() -> 对应https://maven.aliyun.com/repository/central
        // google() -> 对应https://maven.aliyun.com/repository/google
        // gradlePluginPortal() -> https://maven.aliyun.com/repository/gradle-plugin

        // NOTE: 设置国内阿里云Maven仓库镜像
        maven {
            setUrl("https://maven.aliyun.com/repository/central")
        }
        maven {
            setUrl("https://maven.aliyun.com/repository/google")
        }
        maven {
            setUrl("https://maven.aliyun.com/repository/gradle-plugin")
        }
        // NOTE: 简写
        maven("https://maven.aliyun.com/repository/jcenter")
        maven {
            setUrl("https://maven.aliyun.com/repository/public")
        }
    }
}

rootProject.name = "PluginDemo"