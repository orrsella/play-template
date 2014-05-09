package com.example.core

import org.specs2.mutable.Specification
import org.specs2.specification.Scope

class MessagesSpec extends Specification {

  trait Context extends Scope

  "Messages" should {
    "have correct hello message" in new Context {
      Messages.hello must_== "Hello World"
    }
  }
}
