package com.zwl

import groovy.json.JsonOutput

/**
 *
 * @author ZhaoWeiLong* @since 2021/7/15
 *
 * */
class Demo_07 {
    static void main(String[] args) {
        //todo DSLS
        // Groovy允许在顶层语句的方法调用的参数周围省略括号。这被称为“命令链”功能。
        // 这个扩展的工作原理是允许一个人链接这种无括号的方法调用，在参数周围不需要括号，也不需要链接调用之间的点。

        println "hello"
        println sayHello("groovy")

        def make = EmailDsl.make {
            to "Nirav Assar"
            from "Barack Obama"
            body "How are things? We are doing well. Take care"
        }
        println JsonOutput.toJson(make)
    }

    static def sayHello(msg) {
        "hello $msg"
    }


    static class EmailDsl {
        String toText
        String fromText
        String body

        static def make(closure) {
            def emailDsl = new EmailDsl()
            closure.delegate = emailDsl
            closure()
        }

        def to(String toText) {
            this.toText = toText
        }

        def from(String fromText) {
            this.fromText = fromText
        }

        def body(String body) {
            this.body = body
        }
    }


}
