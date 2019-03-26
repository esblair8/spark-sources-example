package starter.output

import com.github.mrpowers.spark.fast.tests.DataFrameComparer
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{BeforeAndAfter, FunSuite, Matchers}

@RunWith(classOf[JUnitRunner])
class XMLSourceWriter_SparkTest extends FunSuite with DataFrameComparer with Matchers with BeforeAndAfter {

  before()
  after()

  test("Rows can be written to a source") {}
}
