package cn.demo.scala

class Demo {
  def main(args: Array[String]): Unit = {

    System.out.println(closure(2));
  }

  //加法， //返回值Unit==void
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
  //闭包
  var fator=3;//自由变量
  val closure=(a:Int)=> a*fator;

  //数组
  var ayyay1:Array[String]=new Array[String](2);
  var array2=Array("张三","李四","王老五");

}
