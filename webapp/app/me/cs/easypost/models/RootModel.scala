package me.cs.easypost.models

import com.google.inject.Singleton

@Singleton
class RootModel {
  val TitleId = "title"
  val Title = "Easy Post"

  val WelcomeMessageId = "welcome_message"
  val WelcomeMessage = "Welcome to Easy Post"

  val TwitterTextMaxLength = 140
  val SubmitPostLabel = "Post"
}
