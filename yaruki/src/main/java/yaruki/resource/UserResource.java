package yaruki.resource;

import java.util.ArrayList;

import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import yaruki.model.User;


public class UserResource {

	//Create a user
	@POST
	public Response createUser(@FormParam("name") String name,
							   @FormParam("type") int type,
							   @FormParam("email") String email) {
		return Response.noContent().build();
	}
	//Get user profile
	@GET
	public User getUser(@QueryParam("id") int id) {
		return new User();
	}
	
	//Get all registered users
	@GET
	public ArrayList<User> getAllUsers(@QueryParam("start") int start,
									   @QueryParam("size") int size) {
		return new ArrayList<User>();
	}
	
	//Delete user
	@DELETE
	public Response deleteUser(@QueryParam("id") int id) {
		
		return Response.noContent().build();
	}
	
}
