package cn.demo.scala

import java.io.{FileNotFoundException, FileReader, IOException}

import org.yaml.snakeyaml.constructor.Tuple

import scala.util.matching.Regex

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
      var array3:List[Nothing]=List();
      //集合,以冒号结尾的都是右绑定，就是左加
      var left=List(1,2,3);
      var right=List(4,5,6)
      //以下操作等价,集合相加
      left ++ right   // List(1,2,3,4,5,6)
      left ++: right  // List(1,2,3,4,5,6)
      right.++:(left)    // List(1,2,3,4,5,6)
      right.:::(left)  // List(1,2,3,4,5,6)
      //以下操作等价，左加
      0 +: left    //List(0,1,2,3)
      left.+:(0)   //List(0,1,2,3)
      //以下操作等价,右加
      left :+ 4    //List(1,2,3,4)
      left.:+(4)   //List(1,2,3,4)
      //以下操作等价,左加
      0 :: left      //List(0,1,2,3)
      left.::(0)     //List(0,1,2,3)

      //集合的变换
      var add=(a:Int)=>a+a;
      def add2(a:Int):Int={
        a+a;
      }
      val addResult = left.map(add)//List(1,4,9)

      //Map集合
      var map:Map[String,String]=Map();
      map+=("name"->"张三");
      map+=("age"->"18");

      //元组，可以存任意类型的列表，最大长度为 22。对于更大长度你可以使用集合，或者扩展元组。
      val t1 = (1, 3.14, "Fred");
      val t2=new Tuple3(1,2.5,"老王");
      /**
        * 迭代器
        * while (it.hasNext){
        *     println(it.next())
        *  }
        */
      val iterator=map.iterator;

      //模式匹配，match--case
      def mat(a:Any):String=a match{
        case 1=>"one";
        case 2=>"two";
        case y: String => "scala.String"
        case _=>"3 ++"
      }

      //正则表达式
      def regex(a:String):Unit={
        val regex=new Regex("(S|s)cala")//首字母可以是大写或者小写s
        val str="Scala is scalable and coScalaol";
        println((regex findAllIn(str)).mkString("<-->"));//使用'<-->'连接返回结果
      }

      //异常
      def catchs(args: Array[String]) {
        try {
          val f = new FileReader("input.txt")
        } catch {
          case ex: FileNotFoundException =>{
            println("File Not Found exception")
          }
          case ex: IOException => {
            println("IO Exception")
          }
          case ex: Exception =>{
            println("Exception")
          }
        }finally {
          println("catchs finally.......")
        }
      }


}

//特征 Trait
trait Equal {
  def isEqual(x: Any): Boolean
  def isNotEqual(x: Any): Boolean = !isEqual(x)
}

class Point(xc: Int, yc: Int) extends Equal {
  var x: Int = xc
  var y: Int = yc
  def isEqual(obj: Any) = {
    obj.isInstanceOf[Point]&&
    (obj.asInstanceOf[Point].x == x);
    ;
  }
}
