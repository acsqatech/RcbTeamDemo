Open word documentation file: RCB Team Project.docx which contains the ECLIPSE project hierarchy of files

Step 1#: Create Maven project in ECLIPSE.
	Add dependencies to the POM file: TestNG, RestAssured, jackson for JSON serialization/deserialization etc, as shown below:
	
		<dependency>
			<groupId>org.testng</groupId>
			<artifactId>testng</artifactId>
			<version>${testng.version}</version>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>io.rest-assured</groupId>
			<artifactId>rest-assured</artifactId>
			<version>4.3.0</version>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>com.fasterxml.jackson.core</groupId>
			<artifactId>jackson-databind</artifactId>
			<version>2.11.3</version>
		</dependency>
		
Step 2#
	Add files to the project as shown in the below path
		C:\EclipseWorkSpace\pracs\src\test\java\testng\
			Player.java -- plain POJO
			Team.java   -- plain POJO 			
			RcbTeamUtil.java -- UTIL class to perform API Testing
			TeamRcbTest.java  -- Test NG test class, to perform the 
			
		C:\EclipseWorkSpace\pracs\src\test\resources\
			TeamRCB.json -- API Call RESPONSE as JSON text
			
		C:\EclipseWorkSpace\pracs\src\test\java\testng.xml  -- TestNG Config file			
			
Step 3#: Run the Testcases 	TeamRcbTest.java as TestNG application

Step 4#: The generated result is shown in 
		C:\EclipseWorkSpace\pracs\test-output\emailable-report.html
