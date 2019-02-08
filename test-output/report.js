$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/FARUK/IdeaProjects/ecommerce/src/main/java/com/qa/features/login.feature");
formatter.feature({
  "line": 1,
  "name": "www.amazon.com Applications Test",
  "description": "",
  "id": "www.amazon.com-applications-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 13073837415,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Validate to user on www.amazon.com Home Page Test",
  "description": "",
  "id": "www.amazon.com-applications-test;validate-to-user-on-www.amazon.com-home-page-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is already on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "go to the login page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters username and password and click button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user is on home page",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageSteps.user_already_home_page()"
});
formatter.result({
  "duration": 78554398,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.go_to_login_page_is_sign_in()"
});
formatter.result({
  "duration": 3540734822,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_enters_username_and_password_and_click_button()"
});
formatter.result({
  "duration": 4434577422,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_is_login_home_page()"
});
formatter.result({
  "duration": 13394081,
  "status": "passed"
});
formatter.after({
  "duration": 959628077,
  "status": "passed"
});
});