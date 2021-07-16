package com.zwl

import groovy.json.JsonOutput

/**
 * 元数据编程
 * @author ZhaoWeiLong* @since 2021/7/15
 *
 * */
class Demo_08 {

    static void main(String[] args) {
        //todo 元对象编程或MOP可以用于动态调用方法，并且可以即时创建类和方法。
        Person person = new Person()
        person.name = "张三"
        person.age = 23

        println person.displayMarks()

        println(person.name)
        println(person.age)

        def car = Car.newInstance()

        car.type = '三轮车'
        car.size = 2
        car.weight = 30

        println(JsonOutput.toJson(car))


        car.metaClass.setAttribute(car, 'weight', 50)

        println car.weight

    }


    static class Car {
        String type
        Integer size
        Integer weight
    }


    static class Person implements GroovyInterceptable {


        protected dynamicProps = [:]

        @Override
        Object invokeMethod(String name, Object args) {

//            println("执行invokeMethod name: $name agrs $args")

            return "displayMarks $name $args"
        }

        @Override
        Object getProperty(String propertyName) {
            return dynamicProps[propertyName]
        }

        @Override
        void setProperty(String propertyName, Object newValue) {
            dynamicProps[propertyName] = newValue
        }

        @Override
        MetaClass getMetaClass() {
            return super.getMetaClass()
        }

        @Override
        void setMetaClass(MetaClass metaClass) {
            super.setMetaClass(metaClass)
        }


    }

}
