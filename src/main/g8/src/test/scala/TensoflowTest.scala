package example

import org.junit.Test
import org.junit.Assert._

import scala.scalanative.unsafe._

import org.ekrich.tensorflow.unsafe.tensorflow._

class TensorflowTest extends tfExample {

  val tfVersion = "2.11.0"

  @Test def TF_VersionTest(): Unit = {
    Zone { implicit z =>
      val reportVersion = fromCString(TF_Version())
      println(s"Tensorflow version: \${reportVersion}")
      assertTrue(
        s"Looking for version: \$tfVersion",
        reportVersion.startsWith(tfVersion)
      )
    }
  }
  @Test def TF_ExampleTest(): Unit = {
    val result = runExample
    assertTrue(s"Result: \$result", result)
  }

}
