package starter.sources

import org.apache.spark.sql.types.{StringType, StructField, StructType}
import org.apache.spark.sql.{SaveMode, SparkSession}

class InputSource(implicit session: SparkSession) extends DataFrameSource[SparkSession] {
  /**
    * Defines the name of the source
    */
  override def name: String = "input_table"

  /**
    * Defines the service area of the source
    */
  override def serviceArea: String = ""

  /**
    * Defines the schema of the source
    */
  override def schema: StructType = InputSource.inputSourceSchema

  /**
    * Defines the columns a source is partitioned on
    */
  override def partitionColumns: Seq[String] = Seq.empty

  /**
    * defines the default save mode for a source
    */
  override def saveMode: SaveMode = SaveMode.Overwrite

  /**
    * Get the source context
    */
  override def sourceSession: SparkSession = session
}

/**
  * Companion object containing column names and schema
  */
object InputSource {
  val someColumnName: String = "someColumnName"
  val otherColumn: String = "otherColumn"

  val inputSourceSchema = StructType(List(
    StructField(someColumnName, StringType, nullable = true),
    StructField(otherColumn, StringType, nullable = true)
  ))
}