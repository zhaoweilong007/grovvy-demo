package com.zwl

import groovy.json.JsonOutput
import groovy.json.JsonParserType
import groovy.json.JsonSlurper
import org.apache.groovy.json.internal.JsonParserCharArray
import sun.nio.ch.IOUtil

/**
 *
 * @author ZhaoWeiLong* @since 2021/7/15
 *
 * */
class Demo_06 {

    static void main(String[] args) {
        //todo json

        //允许json包含注解
        def slurper = new JsonSlurper().setType(JsonParserType.LAX)

        String json = '{\n' +
                '//注释\n' +
                '"name":"张三",\n' +
                '"age":18\n' +
                '}'
        def object = slurper.parseText(json)

        println object.name
        println object.age
        String json2 = '{\n' +
                '\n' +
                '"name":"张三",\n' +
                '"age":18\n' +
                '}'
        def parserCharArray = new JsonParserCharArray()

        def parse = parserCharArray.parse(json2)

        println parse['name']

        def str = JsonOutput.toJson(parse)

        println("to json:$str")


    }
}
