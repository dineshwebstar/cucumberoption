$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/login.feature");
formatter.feature({
  "name": "validating login function of fb",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "validating login function correct password and correct user name",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user enter on fb login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefi.user_enter_on_fb_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter username and password",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefi.user_enter_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefi.user_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should login validate page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefi.user_should_login_validate_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});