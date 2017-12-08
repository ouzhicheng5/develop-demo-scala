package cn.demo.scala

class testScala {
  def main(args: Array[String]): Unit = {
    println("Hello Scala World:"+demo(5,4));
    print("我是打印函数");
    println("5阶乘："+factorial(4))
    timePrint(time());
    println("可变参数加法测试："+params(1,4,5))
    println("可变参数加法测试："+params(1,4))

    stringMethod("hello world");
    stringMethod("中国共产党万岁");
  }
  //加法
  def add(a:Int,b:Int):Int={
    a+b;
  }
  //减法
  def delete(a:Int,b:Int):Int={
    a-b;
  }
  //函数测试
  var demo=(a:Int,b:Int)=>if (a>b){a*b}else{a-b};
  var print=(a:String)=>println(a);

  //递归计算阶乘
  def factorial(a:BigInt):BigInt={
    if (a<=1)
      1
    else
      a*factorial(a-1);
  }

  //函数传名调用,==>前必须有空格
  def time()={
    System.nanoTime();
  }
  def timePrint( a: =>Long )={
    println("时间毫秒："+a)
  }
  //可变参数,加法
  def params(a:Int*) ={
    var i:Int=0;
    for(item <- a){
      i=i+item;
    }
    i
  }
  //String方法
  def stringMethod(s:String)={
    println("第2个字符是："+s.charAt(1))
  }
}
