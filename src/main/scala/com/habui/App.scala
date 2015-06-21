package com.habui

/**
 * Hello world!
 *
 */
object App extends Application {
    println("Hello World!")
    val opt = Some("Hello")
    val opt2 = None

    var json = JsonUtils.toJson(opt)

    println(json)
    json = JsonUtils.toJson(opt2)
    println(json)


}
