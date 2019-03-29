package starter.sources

import org.apache.spark.sql.types.{LongType, StringType, StructField, StructType}
import org.apache.spark.sql.{SaveMode, SparkSession}

/** Source Definition of the Output Table
  *
  * @param session
  */
class OutputSource(implicit session: SparkSession) extends DataFrameSource[SparkSession] {
  /**
    * Defines the name of the source
    */
  override def name: String = "output_table"

  /**
    * Defines the service area of the source
    */
  override def serviceArea: String = ""

  /**
    * Defines the schema of the source
    */
  override def schema: StructType = OutputSource.inputSourceSchema

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
object OutputSource {
  val someColumnName: String = "someColumnName"
  val countColumn: String = "count"

  val inputSourceSchema = StructType(List(
    StructField(someColumnName, StringType, nullable = true),
    StructField(countColumn, LongType, nullable = true)
  ))
}