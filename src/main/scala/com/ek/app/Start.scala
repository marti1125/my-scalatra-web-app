package com.ek.app

import org.scalatra._
import scalate.ScalateSupport

class Start extends MyScalatraWebAppStack {

  get("/") {
    <html>
      <body>
        <h1>Hello, world!</h1>
        Say <a href="hello-scalate">hello to Scalate</a>.
      </body>
    </html>
  }

  get("/about") {
    <html>
      <body>
        <h1>github</h1>
        <a href="https://github.com/marti1125/my-scalatra-web-app">repo example</a>
      </body>
    </html>
  }
  
}
