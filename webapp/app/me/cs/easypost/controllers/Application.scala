package me.cs.easypost.controllers

import me.cs.easypost.models.RootModel
import me.cs.easypost.views._

import play.api.mvc._

class Application extends Controller {

  def index = Action {
    Ok(html.index(new RootModel()))
  }

}