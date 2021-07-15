package com.zwl

/**
 *
 * @author ZhaoWeiLong* @since 2021/7/15
 *
 * */
class Demo_04 {

    static void main(String[] args) {
        //todo 范围、列表、映射
        def range = 1..10
        def get = range.get(2)
        println range.contains(-1)
        println(get)
        println(range.getFrom())
        println(range.getTo())

        def list1 = []
        def list2 = [1, 3, 4, 5]

        list1.add("str")
        list1.add("qwe")

        list2.add(8)

        //添加
        println list1.plus(list2)


        list2.each { println it }


        //空映射
        def map = [:]

        def map2 = ['name': '张三', 'age': 16]

        println map
        println map2
        println map2['name']

        println map2.values()

        map2.entrySet().each { println it }

    }
}
