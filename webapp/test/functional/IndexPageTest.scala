package me.cs.easypost

import me.cs.easypost.models.RootModel
import org.junit.runner.RunWith
import org.specs2.runner.JUnitRunner
import play.api.test.{PlaySpecification, WithBrowser}

@RunWith(classOf[JUnitRunner])
class IndexPageTest extends PlaySpecification {
  val rootModel = new RootModel

  "Application" should {

    "display correctly the index page" in new WithBrowser {
      browser.goTo("/")
      browser.$(rootModel.TitleId).getTexts().get(0) must equalTo(rootModel.Title)
    }
  }
}
