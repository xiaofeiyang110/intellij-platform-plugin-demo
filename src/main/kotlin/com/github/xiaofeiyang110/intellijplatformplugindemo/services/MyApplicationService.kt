package com.github.xiaofeiyang110.intellijplatformplugindemo.services

import com.github.xiaofeiyang110.intellijplatformplugindemo.MyBundle

class MyApplicationService {

    init {
        println(MyBundle.message("applicationService"))

        System.getenv("CI")
            ?: TODO("Don't forget to remove all non-needed sample code files with their corresponding registration entries in `plugin.xml`.")
    }
}
