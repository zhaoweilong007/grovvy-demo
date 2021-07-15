package com.zwl
/**
 *
 * @author ZhaoWeiLong* @since 2021/7/15
 *
 * */
class Demo_03 {

    static void main(String[] args) {
        //todo 文件IO
        def files = new File("C:\\Users\\37424\\Documents").listFiles(new FilenameFilter() {
            @Override
            boolean accept(File dir, String name) {
                return name.contains(".sql")
            }
        })
        files.each { it.eachLine { println "line :$it" } }

        println "==================================================="
        println files[0].text


        println("the file ${files[0].getAbsolutePath()} has ${files[0].length()} bytes")


        def src = new File("C:\\Users\\37424\\Documents\\demo.txt")

        src.withWriter("utf-8", { it.writeLine("hello world") })


        def dst = new File("C:\\Users\\37424\\Documents\\demo2.txt")

        //复制文件
        dst << src.text

        //显示所有驱动器
        def roots = new File("test").listRoots()

        roots.each {println it.absolutePath}


    }
}
