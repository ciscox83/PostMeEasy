package functional

import me.cs.easypost.Common
import me.cs.easypost.models.RootModel
import org.junit.runner.RunWith
import org.specs2.runner.JUnitRunner
import play.api.test.{PlaySpecification, WithBrowser}

@RunWith(classOf[JUnitRunner])
class NotFoundPageTest extends PlaySpecification {
  val rootModel = new RootModel

  "Application" should {

    "Display Action Not Found on a bad request" in new WithBrowser {
      browser.goTo("/boum")
      browser.$(rootModel.TitleId).getTexts().get(0) must equalTo(Common.text.ActionNotFound)
    }
  }
}
