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

    //List集合
    println("集合相加:"+String.valueOf((testDemo.left++(testDemo.right))));
    println("集合的map变换："+testDemo.left.map(testDemo.add));
    println("空集合增加："+String.valueOf(testDemo.array3:+(1,2),(5)));
    //Map集合
    println("Map集合："+testDemo.map)
    println("Map集合key："+testDemo.map.keys)
    println("Map集合value："+testDemo.map.values)
    println("Map集合取值："+testDemo.map("name"))
    println("迭代器："+testDemo.iterator.next())
    //特征
    val p1 = new Point(2, 3)
    val p2 = new Point(2, 4)
    val p3 = new Point(3, 3)
    println(p1.isNotEqual(p2))
    println(p1.isNotEqual(p3))
    println(p1.isNotEqual(2))
    //模式匹配
    println(testDemo.mat(2))
    println(testDemo.mat(3))
    //正则表达式
    testDemo.regex(".....");
    testDemo.catchs(array);
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
