$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/resources/features/buttonPage.feature");
formatter.feature({
  "name": "Button page Options tests",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Testing button elements",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanityTest"
    }
  ]
});
formatter.step({
  "name": "I am navigating into button page application",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinations.buttonPageSteps.navigatingButtonPageApplication()"
});
formatter.result({
  "error_message": "org.openqa.selenium.SessionNotCreatedException: session not created: This version of ChromeDriver only supports Chrome version 92\nCurrent browser version is 94.0.4606.54 with binary path /Applications/Google Chrome.app/Contents/MacOS/Google Chrome\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027raj.local\u0027, ip: \u0027fe80:0:0:0:14a0:5895:54a4:bde2%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.15.7\u0027, java.version: \u002714\u0027\nDriver info: driver.version: ChromeDriver\nremote stacktrace: 0   chromedriver                        0x0000000108d0f829 chromedriver + 2730025\n1   chromedriver                        0x00000001093ccf43 chromedriver + 9797443\n2   chromedriver                        0x0000000108aa1958 chromedriver + 182616\n3   chromedriver                        0x0000000108ac76a8 chromedriver + 337576\n4   chromedriver                        0x0000000108ac32e3 chromedriver + 320227\n5   chromedriver                        0x0000000108abf9f6 chromedriver + 305654\n6   chromedriver                        0x0000000108af89d2 chromedriver + 539090\n7   chromedriver                        0x0000000108af2c93 chromedriver + 515219\n8   chromedriver                        0x0000000108ac98be chromedriver + 346302\n9   chromedriver                        0x0000000108acab25 chromedriver + 351013\n10  chromedriver                        0x0000000108cd6f8f chromedriver + 2498447\n11  chromedriver                        0x0000000108ce9a61 chromedriver + 2574945\n12  chromedriver                        0x0000000108cbc76b chromedriver + 2389867\n13  chromedriver                        0x0000000108ceaeda chromedriver + 2580186\n14  chromedriver                        0x0000000108cccffc chromedriver + 2457596\n15  chromedriver                        0x0000000108d04148 chromedriver + 2683208\n16  chromedriver                        0x0000000108d042d1 chromedriver + 2683601\n17  chromedriver                        0x0000000108d14848 chromedriver + 2750536\n18  libsystem_pthread.dylib             0x00007fff6742b109 _pthread_start + 148\n19  libsystem_pthread.dylib             0x00007fff67426b8b thread_start + 15\n\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\n\tat org.openqa.selenium.remote.W3CHandshakeResponse.lambda$errorHandler$0(W3CHandshakeResponse.java:62)\n\tat org.openqa.selenium.remote.HandshakeResponse.lambda$getResponseFunction$0(HandshakeResponse.java:30)\n\tat org.openqa.selenium.remote.ProtocolHandshake.lambda$createSession$0(ProtocolHandshake.java:126)\n\tat java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:195)\n\tat java.base/java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:958)\n\tat java.base/java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:127)\n\tat java.base/java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:502)\n\tat java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:488)\n\tat java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)\n\tat java.base/java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)\n\tat java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)\n\tat java.base/java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:543)\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:128)\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:74)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:136)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:213)\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:131)\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:181)\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:168)\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:123)\n\tat base.driverFactory.lambda$static$0(driverFactory.java:21)\n\tat base.driverFactory.getDriver(driverFactory.java:41)\n\tat stepDefinations.buttonPageSteps.navigatingButtonPageApplication(buttonPageSteps.java:27)\n\tat ✽.I am navigating into button page application(file:///Volumes/RaNa/Sindhu_Traninig/SDET-Training/QAtoQE_Framework/src/main/resources/features/buttonPage.feature:6)\n",
  "status": "failed"
});
formatter.step({
  "name": "I click on button option",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinations.buttonPageSteps.iClickOnButtonOption()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click all the buttons",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinations.buttonPageSteps.iClickAllTheButtons()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I quit the button  page application",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinations.buttonPageSteps.iQuitTheButtonPageApplication()"
});
formatter.result({
  "status": "skipped"
});
});