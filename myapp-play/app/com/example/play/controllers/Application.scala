package com.example.play.controllers

import com.example.core.Messages
import com.example.play.views.html
import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(html.index("Your new application is ready – " + Messages.hello))
  }
}
