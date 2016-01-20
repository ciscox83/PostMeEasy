package com.sky.sns.innovation.heatmap

import me.cs.easypost.models.RootModel
import org.junit.runner._
import org.specs2.mutable._
import org.specs2.runner._
import play.api.test._

@RunWith(classOf[JUnitRunner])
class IntegrationSpec extends Specification {
  val indexPageModel = new RootModel

  "Application" should {

    "work from within a browser" in new WithBrowser {

      browser.goTo("http://localhost:" + port)

      browser.pageSource must contain(indexPageModel.Title)
    }
  }
}
