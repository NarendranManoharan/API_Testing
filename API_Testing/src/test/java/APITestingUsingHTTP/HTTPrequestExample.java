package APITestingUsingHTTP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HTTPrequestExample {

	public static void main(String[] args) throws IOException {

		HTTPrequestExample httPrequestExample=new HTTPrequestExample();
		httPrequestExample.getmethodExample();
	//	httPrequestExample.postmethodExample();
	//	httPrequestExample.putmethodExample();
	//	httPrequestExample.deletemethodExample();
	}

	public void getmethodExample() throws IOException {

		URL url=new URL("https://dummy.restapiexample.com/api/v1/employee/7152");

		HttpURLConnection connection=(HttpURLConnection) url.openConnection();
		connection.setRequestMethod("GET");
		connection.connect();

		int statuscode=connection.getResponseCode();
		System.out.println("Status code: "+statuscode);

		String responsemessage=connection.getResponseMessage();
		System.out.println("Response Message: "+responsemessage);

		InputStream inputStream=connection.getInputStream();
		InputStreamReader inputStreamReader=new InputStreamReader(inputStream);
		BufferedReader bufferedreader=new BufferedReader(inputStreamReader);

		String line;
		StringBuffer buffer=new StringBuffer();
		while((line=bufferedreader.readLine())!=null) {
			buffer.append(line);
		}

		System.out.println(buffer);
	}

	public void postmethodExample() throws IOException {

		URL url=new URL("https://dummy.restapiexample.com/api/v1/create");
		HttpURLConnection connection=(HttpURLConnection) url.openConnection();
		connection.setRequestMethod("POST");
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);

		String jsonbody="{\"name\":\"naren\",\"salary\":\"52500\",\"age\":\"21\"}";
		byte[] inputjson=jsonbody.getBytes();

		OutputStream outputStream=connection.getOutputStream();
		outputStream.write(inputjson);

		int statuscode=connection.getResponseCode();
		System.out.println("Status Code: "+statuscode);

		String responsemsg=connection.getResponseMessage();
		System.out.println("Response Message "+responsemsg);

		InputStream inputStream=connection.getInputStream();
		InputStreamReader inputStreamReader=new InputStreamReader(inputStream);
		BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
         String line;
		StringBuffer buffer=new StringBuffer();
		while((line=bufferedReader.readLine())!=null) {
			buffer.append(line);
		}
		System.out.println(buffer);
	}
	
	 public void putmethodExample() throws IOException {
		URL url=new URL("https://dummy.restapiexample.com/api/v1/update/2156");
		HttpURLConnection connection=(HttpURLConnection) url.openConnection();
		connection.setRequestMethod("PUT");
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);
		
		OutputStream outputStream=connection.getOutputStream();
		String jsondata="{\"name\":\"narendran\",\"salary\":\"10000\",\"age\":\"24\"}";
		byte[] updatedData=jsondata.getBytes();
		outputStream.write(updatedData);
		
		InputStream inputStream=connection.getInputStream();
		InputStreamReader inputStreamReader=new InputStreamReader(inputStream);
		BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
         String line;
		StringBuffer buffer=new StringBuffer();
		while((line=bufferedReader.readLine())!=null) {
			buffer.append(line);
		}
		
     System.out.println(buffer);
	}
	 
	 public void deletemethodExample() throws IOException {
			URL url=new URL("https://dummy.restapiexample.com/api/v1/delete/2156");
			HttpURLConnection connection=(HttpURLConnection) url.openConnection();
			connection.setRequestMethod("DELETE");
			connection.setRequestProperty("Content-Type", "application/json");
			connection.setDoOutput(true);
		
			
			InputStream inputStream=connection.getInputStream();
			InputStreamReader inputStreamReader=new InputStreamReader(inputStream);
			BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
	         String line;
			StringBuffer buffer=new StringBuffer();
			while((line=bufferedReader.readLine())!=null) {
				buffer.append(line);
			}
			
	     System.out.println(buffer);
		}
}
