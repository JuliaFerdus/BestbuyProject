# BestbuyProject
# How to run
mvn verify -Denv=qa -Dbrowser=ch -Dcucumber.filter.tags="@Test"

# How to run test in default env and browser
mvn verify -Dcucumber.filter.tags="@Test1"

# How to run all test by using default env and browser
mvn verify
mvn verify -Dcucumber.filter.tags="@E2ETest"
mvn verify -Dcucumber.filter.tags="@signup"
mvn verify -Dcucumber.filter.tags="@links"


