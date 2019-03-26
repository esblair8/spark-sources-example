package starter.input

import com.github.mrpowers.spark.fast.tests.DataFrameComparer
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{BeforeAndAfter, FunSuite, Matchers}

@RunWith(classOf[JUnitRunner])
class SQLSourceReader_SparkTest extends FunSuite with DataFrameComparer with Matchers with BeforeAndAfter {

  before()

  after()

  test("Rows can be read from a source") {}

  test("Columns can be selected from a source") {}

  test("rows can be filtered from a source") {}
}

