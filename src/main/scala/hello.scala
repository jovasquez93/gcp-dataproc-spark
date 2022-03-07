

//import org.apache.spark.SparkContext
//import org.apache.avro.generic.GenericData.StringType
import org.apache.spark.sql.{DataFrame, SparkSession}
//import org.apache.spark.sql.functions.{col, lit, when}

object hello {
  //var sc: SparkContext = null
  var nameApp = "test_local"
  var pathInput = "input/CL.csv"


  val spark: SparkSession = SparkSession.builder
    .appName(nameApp)
    .master(master = "local[*]")
    .getOrCreate()

  var dfTblInput: DataFrame = spark.emptyDataFrame


  def main(args: Array[String]) {

    println("hola mundo, leyendo tabla...")
    var dfTblInput = spark.read.options(Map("inferSchema" -> "true", "header" -> "true", "delimiter" -> ","))
      .csv(pathInput)

    dfTblInput.show()

  }
}
