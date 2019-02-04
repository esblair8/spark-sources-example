package aquaq.input

import com.holdenkarau.spark.testing.DataFrameSuiteBase
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{BeforeAndAfter, FunSuite, Matchers}

@RunWith(classOf[JUnitRunner])
class SQLSourceReader_SparkTest extends FunSuite with DataFrameSuiteBase with Matchers with BeforeAndAfter {

  before()

  after()

  test("Rows can be read from a source")

  test("Columns can be selected from a source")

  test("rows can be filtered from a source")
}

