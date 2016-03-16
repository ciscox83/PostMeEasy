//package me.cs.easypost
//
//import akka.util.Timeout
//import me.cs.easypost.models.RootModel
//import net.ruippeixotog.scalascraper.browser.Browser
//import org.jsoup.nodes.Document
//import org.junit.runner._
//import org.specs2.mutable._
//import org.specs2.runner._
//import play.api.test.Helpers._
//import play.api.test._
//
//import scala.concurrent.duration._
//
//@RunWith(classOf[JUnitRunner])
//class ApplicationSpec extends Specification with DefaultAwaitTimeout {
//  val browser = new Browser
//  val indexPageModel = new RootModel
//
//  override implicit def defaultAwaitTimeout: Timeout = 5.seconds
//
//  "Application" should {
//
//    "send 404 on a bad request" in new WithApplication {
//      route(FakeRequest(GET, "/boum")) must beSome.which(status(_) == NOT_FOUND)
//    }
//
//    "render the index page" in new WithApplication {
//      val result = route(FakeRequest(GET, "/")).get
//      status(result) must equalTo(OK)
//      contentType(result) must beSome.which(_ == "text/html")
//      val body: Document = browser.parseString(contentAsString(result))
//      val welcomeMessage = body.getElementById(indexPageModel.WelcomeMessageId).text()
//      assert(welcomeMessage === indexPageModel.WelcomeMessage)
//    }
//  }
//}
