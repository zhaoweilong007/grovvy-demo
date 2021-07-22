package com.zwl
/**
 *
 * @author ZhaoWeiLong* @since 2021/7/22
 *
 * */
class Demo_09 {
    static void main(String[] args) {
        // todo 闭包和其他特性 语法定义  { [closureParameters -> ] statements }

        // 使用隐式参数的闭包  {println it} it代表隐式参数
        def funa = { println("测试 $it") }
        funa.call()

        //指定参数的闭包,有返回值
        def funb = { String a, Integer b ->
            {
                def str = a.toLowerCase() + b
                println "this str is $str"
                return str
            }
        }
        //闭包当做方法调用
        println funb("hello world", 789)

        def code = { 200 }

        println code() == 200

        //类型转换
        def a = "456"

        int b = a as int
        def c = a.asType(Integer.class)

        println(b)
        println(c instanceof Integer)

        //判断是否为真
        def lastname = null

        if (lastname) {
            println("lastname is true")
        } else {
            println "lastname is false"
        }

        def str = ""

        if (str) {
            println "str length is 0"
        } else {
            println "str length not 0"
        }

        //安全取值
        def map = [name: '张三', age: 23, info: [height: 178, weight: 130]]

        def height = map?.info?.height

        //不会报异常
        def basketball = map?.info?.hobby?.basketball

        println "身高 $height 爱好 $basketball"

        //使用with给对象复制

        def computer = new computer()

        computer.with {
            name = "暗影骑士3"
            model = "asapire vx 15"
            brand = "宏基"
        }

        println computer


    }

    static class computer {

        //名称
        def name

        //型号
        def model

        //品牌
        def brand

        boolean equals(o) {
            if (this.is(o)) return true
            if (getClass() != o.class) return false

            computer computer = (computer) o

            if (brand != computer.brand) return false
            if (model != computer.model) return false
            if (name != computer.name) return false

            return true
        }

        int hashCode() {
            int result
            result = (name != null ? name.hashCode() : 0)
            result = 31 * result + (model != null ? model.hashCode() : 0)
            result = 31 * result + (brand != null ? brand.hashCode() : 0)
            return result
        }


        @Override
        public String toString() {
            return "computer{" +
                    "name=" + name +
                    ", model=" + model +
                    ", brand=" + brand +
                    '}';
        }
    }
}
