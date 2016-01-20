package me.cs.easypost.controllers

import com.google.inject.Inject
import me.cs.easypost.models.RootModel
import me.cs.easypost.views._
import play.api.mvc._

class Application extends Controller {
  @Inject
  val rootModel: RootModel = null

  def index = Action {
    Ok(html.index(rootModel))
  }

}