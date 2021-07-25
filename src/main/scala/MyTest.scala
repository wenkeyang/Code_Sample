import org.apache.spark.sql.SparkSession
import util.spark_util

object MyTest {
  def main(args: Array[String]): Unit = {
    println("Hello World")
    val spark = util.spark_util.get_spark_session

    spark.sql(""" select 1 """).show(10, false)
  }
}
