package starter.io.output

import org.apache.spark.sql.{DataFrame, SparkSession}
import starter.sources.DataFrameSource

class SQLSourceWriter(source : DataFrameSource[SparkSession]) extends DataFrameWriter {

  /**
    * Persist a data frame to a source
    *
    * @param dataFrame the data frame to persist
    */
  override def write(dataFrame: DataFrame): Unit =
    dataFrame.write.mode(source.saveMode).partitionBy(
      source.partitionColumns: _*
    ).saveAsTable(s"${source.name}")
}