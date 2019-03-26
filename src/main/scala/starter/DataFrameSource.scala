package starter

import org.apache.spark.sql.SaveMode
import org.apache.spark.sql.types.StructType

/**
  * Base trait for describing data sources
  *
  * @tparam T The type of the context
  */
trait DataFrameSource[T] extends SourceSession[T] {

  /**
    * Defines the name of the source
    */
  def name: String

  /**
    * Defines the service area of the source
    */
  def serviceArea: String

  /**
    * Defines the schema of the source
    */
  def schema: StructType

  /**
    * Defines the columns on a source
    */
  def columns: SourceColumnDefinitions

  /**
    * Defines the columns a source is partitioned on
    */
  def partitionColumns: Seq[String]

  /**
    * defines the default save mode for a source
    */
  def saveMode: SaveMode

}