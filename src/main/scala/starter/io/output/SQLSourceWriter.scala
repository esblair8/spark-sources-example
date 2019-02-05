package starter.io.output

import org.apache.spark.sql.DataFrame
import org.apache.spark.sql.hive.HiveContext
import starter.DataFrameSource

class SQLSourceWriter(source: DataFrameSource[HiveContext]) extends DataFrameWriter {

  /**
    * Persist a data frame to a source
    *
    * @param dataFrame the data frame to persist
    */
  override def write(dataFrame: DataFrame): Unit =
    dataFrame.write.mode(source.saveMode).partitionBy(
      source.partitionColumns: _*
    ).insertInto(s"${source.serviceArea}.${source.name}")
}