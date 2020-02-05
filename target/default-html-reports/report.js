$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AccountTypes.feature");
formatter.feature({
  "name": "Account types",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Driver",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user logged in as a \"driver\"",
  "keyword": "Given "
});
formatter.match({
  "location": "NavigationMenuStepDefs.the_user_logged_in_as_a(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user navigates to \"Activities\" \"Calendar Events\"",
  "keyword": "When "
});
formatter.match({
  "location": "NavigationMenuStepDefs.the_user_navigates_to(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the title should contain \"Calendar Events - Activities\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefs.the_title_should_contain(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Sales Manager",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user logged in as a \"sales manager\"",
  "keyword": "Given "
});
formatter.match({
  "location": "NavigationMenuStepDefs.the_user_logged_in_as_a(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user navigates to \"Customers\" \"Accounts\"",
  "keyword": "When "
});
formatter.match({
  "location": "NavigationMenuStepDefs.the_user_navigates_to(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the title should contain \"Accounts - Customers\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefs.the_title_should_contain(String)"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[Accounts - Customers]\u003e but was:\u003c[Dashboard]\u003e\n\tat org.junit.Assert.assertEquals(Assert.java:115)\n\tat org.junit.Assert.assertEquals(Assert.java:144)\n\tat com.vytrack.step_definitions.LoginStepDefs.the_title_should_contain(LoginStepDefs.java:63)\n\tat ✽.the title should contain \"Accounts - Customers\"(file:src/test/resources/features/AccountTypes.feature:11)\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Store Manager",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user logged in as a \"store manager\"",
  "keyword": "Given "
});
formatter.match({
  "location": "NavigationMenuStepDefs.the_user_logged_in_as_a(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user navigates to \"Marketing\" \"Campaigns\"",
  "keyword": "When "
});
formatter.match({
  "location": "NavigationMenuStepDefs.the_user_navigates_to(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the title should contain \"All - Campaigns - Marketing\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefs.the_title_should_contain(String)"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[All - Campaigns - Marketing]\u003e but was:\u003c[Dashboard]\u003e\n\tat org.junit.Assert.assertEquals(Assert.java:115)\n\tat org.junit.Assert.assertEquals(Assert.java:144)\n\tat com.vytrack.step_definitions.LoginStepDefs.the_title_should_contain(LoginStepDefs.java:63)\n\tat ✽.the title should contain \"All - Campaigns - Marketing\"(file:src/test/resources/features/AccountTypes.feature:16)\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded1.png", null);
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Users should be able to login",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefs.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login as a driver",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@driver"
    },
    {
      "name": "@VYT-123"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "the user enter the driver information",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefs.the_user_enter_the_driver_information()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefs.the_user_should_be_able_to_login()"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[Dashboard]\u003e but was:\u003c[Loading...]\u003e\n\tat org.junit.Assert.assertEquals(Assert.java:115)\n\tat org.junit.Assert.assertEquals(Assert.java:144)\n\tat com.vytrack.step_definitions.LoginStepDefs.the_user_should_be_able_to_login(LoginStepDefs.java:34)\n\tat ✽.the user should be able to login(file:src/test/resources/features/Login.feature:10)\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded2.png", null);
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefs.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login as a sales manager",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@sales_manager"
    },
    {
      "name": "@VYT-123"
    },
    {
      "name": "@db"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "the user enter the sales manager information",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefs.the_user_enter_the_sales_manager_information()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefs.the_user_should_be_able_to_login()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefs.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login as a store manager",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@store_manager"
    },
    {
      "name": "@db"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "the user enter the store manager information",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefs.the_user_enter_the_store_manager_information()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefs.the_user_should_be_able_to_login()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});