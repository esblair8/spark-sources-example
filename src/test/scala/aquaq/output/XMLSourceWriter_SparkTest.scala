package aquaq.output

import com.holdenkarau.spark.testing.DataFrameSuiteBase
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{BeforeAndAfter, FunSuite, Matchers}

@RunWith(classOf[JUnitRunner])
class XMLSourceWriter_SparkTest extends FunSuite with DataFrameSuiteBase with Matchers with BeforeAndAfter {

  before()
  after()

  test("Rows can be written to a source")
}
