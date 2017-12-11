package cn.demo.scala

class TestScala {
  def main(args: Array[String]): Unit = {
    val testDemo=new Demo;
    println("Hello Scala World:"+testDemo.demo(5,4));
    print("我是打印函数");
    println("5阶乘："+testDemo.factorial(4))
    testDemo.timePrint(testDemo.time());
    println("可变参数加法测试："+testDemo.params(1,4,5))
    println("可变参数加法测试："+testDemo.params(1,4))

    testDemo.stringMethod("hello world");
    testDemo.stringMethod("中国共产党万岁");

    var array=testDemo.array2;
    println("数组array2："+arrayPrint(array));
    println("数组array2第2个值为："+array.apply(1));




  }
  //遍历字符串数组打印的方法
  def arrayPrint(a:Array[String]):String={
    var i:StringBuffer=new StringBuffer();
    i.append("[")
    for(b <- a) {
      i.append(b+",");
    }
    var k=i.toString;
    k=k.substring(0,k.length-1);
    k=k+("]");
    k;
  }
  /*// 创建 Breaks 对象
  val loop = new Breaks;

  // 在 breakable 中循环
  loop.breakable{
    // 循环
    for(...){
      ....
      // 循环中断
      loop.break;
    }
  }*/

}
