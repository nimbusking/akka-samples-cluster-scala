package sample.cluster.transformation

import kamon.Kamon

object TransformationApp extends App {
  Kamon.init()
//  Kamon.runWithSpan(Kamon.spanBuilder("Level 3").start(), finishSpan = true) {
//
//  }
  // starting 2 frontend nodes and 3 backend nodes
  TransformationFrontend.main(Seq("2551").toArray)
  TransformationBackend.main(Seq("2552").toArray)
  TransformationBackend.main(Array.empty)
  TransformationBackend.main(Array.empty)
  TransformationFrontend.main(Array.empty)

}