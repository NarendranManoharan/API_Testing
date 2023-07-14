package APITestingUsingHTTP;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class UsingUniRest {

	public static void main(String[] args) throws UnirestException {
		UsingUniRest usingUniRest=new UsingUniRest();
	//	usingUniRest.getmethodExample();
	//	usingUniRest.postmethodExample();
	//	usingUniRest.putmethodExample();
		usingUniRest.deletemethodExample();

	}
	
	public void getmethodExample() throws UnirestException {
		HttpResponse<JsonNode> jsonResponse=Unirest.get("https://dummy.restapiexample.com/api/v1/employee/9418").asJson();
		
		System.out.println("Response code: "+ jsonResponse.getStatus());
		System.out.println("Response msg: "+ jsonResponse.getStatusText());
		System.out.println("Response Body: "+ jsonResponse.getBody());
	}
	
	public void postmethodExample() throws UnirestException {
		HttpResponse<JsonNode> jsonResponse=Unirest.post("https://dummy.restapiexample.com/api/v1/create").body("{\"name\":\"naren\",\"salary\":\"52500\",\"age\":\"21\"}").asJson();
		
		System.out.println("Response code: "+ jsonResponse.getStatus());
		System.out.println("Response msg: "+ jsonResponse.getStatusText());
		System.out.println("Response Body: "+ jsonResponse.getBody());
	}
	
	public void putmethodExample() throws UnirestException {
		HttpResponse<JsonNode> jsonResponse=Unirest.put("https://dummy.restapiexample.com/api/v1/update/3919").body("{\"name\":\"Narendran\",\"salary\":\"9595\",\"age\":\"30\"}").asJson();
		
		System.out.println("Response code: "+ jsonResponse.getStatus());
		System.out.println("Response msg: "+ jsonResponse.getStatusText());
		System.out.println("Response Body: "+ jsonResponse.getBody());
	}
	public void deletemethodExample() throws UnirestException {
		HttpResponse<JsonNode> jsonResponse=Unirest.delete("https://dummy.restapiexample.com/api/v1/delete/3919").asJson();
		
		System.out.println("Response code: "+ jsonResponse.getStatus());
		System.out.println("Response msg: "+ jsonResponse.getStatusText());
		System.out.println("Response Body: "+ jsonResponse.getBody());
	}
	

}
