package starter.io.input

import org.apache.spark.sql.functions._
import org.apache.spark.sql.{Column, DataFrame, SQLContext}
import starter.sources.DataFrameSource

class SQLSourceReader[T <: SQLContext](
                                        val source: DataFrameSource[T]
                                      ) extends DataFrameReader {
  /**
    * Read a Data frame from the Source
    *
    * @param filters Any filters to apply to the Source
    * @param columns The columns to select from the Source
    * @return A DataFrame of the source
    */
  override def read(filters: Column, columns: Seq[String]): DataFrame = {
    val tableName = s"${source.serviceArea}.${source.name}"
    source.sourceSession.table(tableName)
      .filter(filters)
      .select(columns.map(col): _*)
  }

  /**
    * Read a Data frame from the Source
    *
    * @param columns The columns to select from the Source
    * @return A DataFrame of the source
    */
  override def read(columns: Seq[String]): DataFrame = {
    val tableName = s"${source.serviceArea}.${source.name}"
    source.sourceSession.table(tableName)
      .select(columns.map(col): _*)
  }

  /**
    * Read a Data frame from the Source
    *
    * @param filters Any filters to apply to the Source
    * @return A DataFrame of the source
    */
  override def read(filters: Column): DataFrame = {
    val tableName = s"${source.serviceArea}.${source.name}"
    source.sourceSession.table(tableName)
      .filter(filters)
  }

  /**
    * Read a Dataframe from the Source
    *
    * @return A DataFrame of the source
    */
  override def read(): DataFrame = {
    val tableName = s"${source.serviceArea}.${source.name}"
    source.sourceSession.table(tableName)
  }
}
