package com.habui

import com.google.gson.GsonBuilder

/**
 * Created by Ha Bui on 6/21/2015.
 */
object JsonUtils {
    val gsonBuilder = new GsonBuilder
    gsonBuilder.registerTypeAdapter(classOf[Option[Any]], new OptionSerializer)
    private val gson = gsonBuilder.create

    def toJson(obj:Any):String = gson.toJson(obj)
    def fromJson[T](clazz: Class[T], json: String): T = gson.fromJson[T](json, clazz)

}
