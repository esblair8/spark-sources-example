package starter.io.output

import org.apache.spark.sql.DataFrame

/**
  * Base trait for writing data frames
  */
trait DataFrameWriter {

  /**
    * Persist a data frame
    *
    * @param dataFrame the data frame to persist
    */
  def write(dataFrame: DataFrame): Unit

}