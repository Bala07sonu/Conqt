$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/conqtt.feature");
formatter.feature({
  "name": "To Validate the Performance of the Conqt Website",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To Validate the User Experience and performance of the Conqt web",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "To validate performance of main page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefnition.to_validate_performance_of_main_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To check the product page",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefnition.to_check_the_product_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To analyze user experience in AWS Cloud page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefnition.to_analyze_user_experience_in_AWS_Cloud_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To analyze user experience FAQs page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefnition.to_analyze_user_experience_FAQs_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To check Conqt University page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefnition.to_check_Conqt_University_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Quit Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefnition.quit_Browser()"
});
formatter.result({
  "status": "passed"
});
});