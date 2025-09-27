package example

import org.junit.Test
import org.junit.Assert._

import scala.scalanative.unsafe._

import org.ekrich.tensorflow.unsafe.tensorflow._

class TensorflowTest extends tfExample {

  @Test def TF_VersionTest(): Unit = {
    Zone { implicit z =>
      val swVersion = version(tfVersion)
      val minVersion = version(tfMinVersion)

      println(s"Tensorflow version: \${tfVersion}")
      assertTrue(
        s"Version: \$minVersion, not <=  \$swVersion",
        minVersion <= swVersion
      )
    }
  }

  @Test def TF_ExampleTest(): Unit = {
    val result = runExample
    assertTrue(s"Result: \$result", result)
  }

}
