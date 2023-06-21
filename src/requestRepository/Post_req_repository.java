package requestRepository;


import java.io.IOException;
import java.util.ArrayList;
import commonFunction.utility_Common_Function;
public class Post_req_repository {
public static String base_URI() {
String baseURI="https://reqres.in/";
return baseURI;
}
public static String post_resource() {
String resource="api/users";
return resource;
}
public static String post_request() throws IOException {
ArrayList<String> data=utility_Common_Function.readdataexcel("Post_Test_Data", "Post_TC_1");
String req_name=data.get(1);
String req_job=data.get(2);
String requestBody="{\r\n"
+ " \"name\": \""+req_name+"\",\r\n"
+ " \"job\": \""+req_job+"\"\r\n"
+ "}";
return requestBody;
}
public static String post_request1() throws IOException {
ArrayList<String> data=utility_Common_Function.readdataexcel("Post_Test_Data", "Post_TC_2");
String req_name=data.get(1);
String req_job=data.get(2);
String requestBody="{\r\n"
+ " \"name\": \""+req_name+"\",\r\n"
+ " \"job\": \""+req_job+"\"\r\n"
+ "}";
return requestBody;
}
public static String post_request2() throws IOException {
ArrayList<String> data=utility_Common_Function.readdataexcel("Post_Test_Data", "Post_TC_3");
String req_name=data.get(1);
String req_job=data.get(2);
String requestBody="{\r\n"
+ " \"name\": \""+req_name+"\",\r\n"
+ " \"job\": \""+req_job+"\"\r\n"
+ "}";
return requestBody;
	}

}
