package com.zwl

/**
 *
 * @author ZhaoWeiLong* @since 2021/7/14
 *
 * */
class Demo_01 {
    static void main(String[] args) {
        //todo groovy基础语法 语法跟Java大相径庭

        //def可以表示任意类型
        def a, b, c
        a = "hello groovy"
        b = 18
        c = ["qwe", "asd"]

        println("a=$a")
        println("b=$b")
        println("c=$c")

        //字符串索引
        println "a index 3=${a[3]}"
        println "a index -1=${a[-1]}"
        println "a index 0 和 4=${a[0, 4]}"
        println "a index 0 到 4=${a[0..4]}"

        //str可以使用单引号、双引号、三引号表示
        String str1 = 'this is str1'
        String str2 = "this is str2"
        String str3 = """this is str3"""

        //*重复字符串
        println str1*2

        println "$str1 , $str2 , $str3"

        for (str in c) {
            println("for in $str")
        }

        def map = new HashMap<String, Object>()
        map.put("name", "卡特琳娜")
        map.put("sex", "女")
        map.put("age", 22)

        map.entrySet().forEach(entry -> println("key=${entry.getKey()}, value=${entry.getValue()}"))

    }
}
