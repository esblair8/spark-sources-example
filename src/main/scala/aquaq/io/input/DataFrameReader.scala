package aquaq.io.input

import org.apache.spark.sql.{Column, DataFrame}

/**
  * Base trait for reading Data frames
  */
trait DataFrameReader {

  /**
    * Read a Data frame from the Source
    *
    * @param filters Any filters to apply to the Source
    * @param columns The columns to select from the Source
    * @return A DataFrame of the source
    */
  def read(filters: Column, columns: Seq[String]): DataFrame


  /**
    * Read a Data frame from the Source
    *
    * @param columns The columns to select from the Source
    * @return A DataFrame of the source
    */
  def read(columns: Seq[String]): DataFrame


  /**
    * Read a Data frame from the Source
    *
    * @param filters Any filters to apply to the Source
    * @return A DataFrame of the source
    */
  def read(filters: Column): DataFrame


  /**
    * Read a Data frame from the Source
    *
    * @return A DataFrame of the source
    */
  def read(): DataFrame


}
