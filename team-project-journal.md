# Fictional Character API Proj. Journal #

|Week|who|detail|
|------|------|-------|
|Week 9|team|collaborated on proj. plan, repo creation, timeline, problem statement, and takeaways.|
|Week 10|Walker|added dependencies to pom.xml|
|Week 10|Team|created Enitity, GenericDao, shell of servlet, sql for character table| 
|week 10|Tim|Added GetByCharacterName and ServiceRequests classes for rest functionality. Added hibernate config files. Wired up GetCharacterByName to use jackson to return Character objects as JSON|
|week 10|Walker|Got the getByName service to work with a param although only with id, not name yet|
|week 10|Tim|Addressed error with GenericDao, restructured packages to all belong to one root package, added LOG4J, refactored the class handling the actual API requests. |
|week 10|Walker|Got most of the code to test the dao although there are a lot of errors, need others input|
|week 10|Zane|Added a dump.sql for basic DB creation for some default data to use. Also updated the pom to add the right dependencies|
|week 11|Chris|Got GenericDaoTest to work|
|week 11|Zane|Created the post for inserting a character into the DB using PathParams|
|week 11|Walker|Added basic documentation, host will need to be changed to AWS instance address|
|week 11|Walker|This video helped for the post: https://www.youtube.com/watch?v=6HWUrp6buqQ&t=70s Could not get the post to work until I put it in the same class as the get, the CharacterRequest is the only class in service package that I have been able to get a response from in SOAP|
|week 11|Zane|Added functionality for all columns to be searched in the DB with the same method CharacterRequests.processRequest() I also moved the updated insert method Walker made into the InsertNewCharacter class and updated the url to have better naming|
|week 12|Zane|Deployed to AWS successfully at the url: http://3.142.182.83:8080/ I also updated the documentation examples to use the url instead of localhost|
|week 12|Tim|Refactored CharacterRequests and restructured to allow for multi-param requests. Performed general code cleanup. Added documentation where missing. Attempted to fix failing tests but was unable to. |week 12|Tim|Refactored CharacterRequests and restructured to allow for multi-param requests. Performed general code cleanup. Added documentation where missing. Attempted to fix failing tests but was unable to. Created Powerpoint to use as visual presentation aid.|
|week 12|Chris|Updated API documentation to reflect AWS, and modified some contents. Updated the getByProperty test for GenericDao. Added search.jsp to include basic links to some GET api. Added styles sheet to add some basic features to API doc.|