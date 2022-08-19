package testng;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;

import java.util.Iterator;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TeamRcbTest {
	Team team = null;
	List<Player> playerList = null;

	@BeforeSuite
	public void beforeSuite() {

		/*
		// Actual API service call....For now using STUB instead of API call
		given()
			.get("https://reqres.in/api/users?page=2")  // ACTUAL API Service URL 
		.then()
			.statusCode(200)  // VALIDATION 
			.body("data.id[0]", equalTo(7));  //
			 
		OR

		RestAssured restAssured = null;//RestAssured
		  
		Response response = RestAssured.get("https://reqres.in/api/users?page=2");
		response.statusCode()
		response.asString()
		response.getBody().asString()
		response.statusLine()
		int statusCode = response.getStatusCode()
		Assert.assertEquals(statusCode, 200);
		*/

		String filePath = "src/test/resources/TeamRCB.json";
		
		// responseJson = response.getBody().asString();
		String responseJson = RcbTeamUtil.getStubbedData(filePath);

		// convert json string into JSON object
		ObjectMapper mapper = new ObjectMapper();
		try {
			team = mapper.readValue(responseJson, Team.class);
			Assert.assertNotNull(team); 
			
			playerList = team.getPlayer();
			Assert.assertNotNull(playerList); 
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		//System.out.println("TEAM: "+ team);
	}


	
	// Write a test that validates that the team has only 4 foreign players
	@Test
	public void testcaseRcbTeamWithForeignPlayerCount4() {
		
		// Assert.assertNotNull(playerList); // Already validated in beforeSuite() 
		int expectedForeignNationalCount = 4;
		int foreignNationalCounter = 0;
		for (Iterator iterator = playerList.iterator(); iterator.hasNext();) {
			Player player = (Player) iterator.next();
			if (!player.getCountry().equalsIgnoreCase("INDIA")) {
				foreignNationalCounter++;
			}
		}
		Assert.assertEquals(expectedForeignNationalCount, foreignNationalCounter);
	}

	
	// Write a test that validates that there is at least one wicket keeper
	@Test
	public void testcaseRcbTeamWithAtleastOneWicketKeeper() {
		 
		int wicketKeeperCounter = 1;
		// Assert.assertNotNull(playerList); // Already validated in beforeSuite() 
		int expectedMinimumWicketKeeperCount = 1;
		for (Iterator iterator = playerList.iterator(); iterator.hasNext();) {
			Player player = (Player) iterator.next();
			if ( player.getRole().equalsIgnoreCase("Wicket-keeper")) {
				wicketKeeperCounter++;
			}
		}
		assertThat("timestamp", wicketKeeperCounter, greaterThan(expectedMinimumWicketKeeperCount-1));

	}
	
}
