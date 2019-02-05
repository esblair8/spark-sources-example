package starter.io.output

import org.apache.spark.sql.{DataFrame, SaveMode}

/**
  * class for writing XML data frames
  */
class XMLSourceWriter(
                       val noOfPartitions: Int,
                       val outputFormat: String,
                       val xmlFileLocation: String
                     ) extends DataFrameWriter {

  /**
    * Persist a data frame to a source
    *
    * @param input the data frame to persist
    */
  override def write(input: DataFrame): Unit =
    input
      .repartition(noOfPartitions)
      //overwrite any existing csv file in location and escape quotes in xml string
      .write.format(outputFormat).option("quote", "\u0000").mode(SaveMode.Overwrite)
      .save(xmlFileLocation)
}
