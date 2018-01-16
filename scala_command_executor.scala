import sys.process._

val stdout = new StringBuilder
val stderr = new StringBuilder
val status = "ls -al FRED" ! ProcessLogger(stdout append _, stderr append _)
// ! 方法接收一个 ProcessLogger 对象作为参数
// ProcessLogger初始化参数可以是 一个 字符接收器(输出，错误 混用) 或者 两个字符接收器 (输出，错误)，或者一个可写文件对象
// stdout append _ 代表 stdout.append 方法
// stderr append _ 代表 stderr.append 方法
println(status)
println("stdout: " + stdout)
println("stderr: " + stderr)
