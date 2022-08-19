# RcbTeamDemo
RCB Team Demo project


Open word documentation file: RCB Team Project.docx which contains the ECLIPSE project hierarchy of files

Step 1#:create a new EClipse Maven project with the given dependancies.


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



Step 2# Add files to the project as shown in the below path

		C:\EclipseWorkSpace\pracs\src\test\java\testng\
			Player.java -- plain POJO
			Team.java   -- plain POJO 
			TeamRCB.json -- API Call RESPONSE as JSON text
			RcbTeamUtil.java -- UTIL class to perform API Testing
			TeamRcbTest.java  -- Test NG test class, to perform the 
			testng.xml
