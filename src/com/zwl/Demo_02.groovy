package com.zwl

/**
 *
 * @author ZhaoWeiLong* @since 2021/7/14
 *
 * */
class Demo_02 {

    static void main(String[] args) {
        // todo 方法
        println(demo())
        println methodName(188, 12, 34)
        println splicing("甜心宝贝")
        println defaultParam(null, "defaultMethod")
        println noreturn()
    }

    static def demo() {
        "hello groovy"
    }

    static def noreturn() {
        println "execute noreturn method"
    }

    /**
     * 动态参数
     * @param v1
     * @param v2
     * @param v3
     * @return
     */
    static def methodName(v1, v2, v3) {
        v1 / (v2 * v3)
    }

    /**
     * 指定类型参数
     * @param suffix
     * @return
     */
    static def splicing(String suffix) {
        "hello " + suffix
    }

    /**
     * 默认参数
     * @param i
     * @param str
     * @return
     */
    static def defaultParam(Integer i = 7, String str = "qwe") {
        i + str
    }
}
