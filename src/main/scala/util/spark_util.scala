package util

import org.apache.spark.sql.SparkSession

object spark_util {

  def get_spark_session: SparkSession = {
    val spark = SparkSession
      .builder()
      .appName(getClass.getName)
      .master("local[*]")
      .getOrCreate()
    spark.sparkContext.setLogLevel("ERROR")
    spark
  }

}
