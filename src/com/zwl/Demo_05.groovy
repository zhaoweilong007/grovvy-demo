package com.zwl
/**
 *
 * @author ZhaoWeiLong* @since 2021/7/15
 *
 * */
class Demo_05 {

    static void main(String[] args) {
        //todo 正则表达式、特征trait，承载默认实现的接口
        def regex = ~'groovy'

        def matcher = regex.matcher("hello groovy")

        if (matcher.find()) {
            println matcher.group(0)
        }

        def student = new Student()

        student.sid = 12

        student.DisplayMarks()

        //闭包
        def clo = { param -> println(param) }
        clo.call("卡特琳娜")
    }


    trait Total {
        void DisplayMarks() {
            println "total1"
        }


    }

    trait Marks {
        void DisplayMarks() {
            println "Marks1"
        }
    }


    static class Student implements Total, Marks {

        int sid


    }
}
