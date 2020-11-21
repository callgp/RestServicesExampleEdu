package co.edureka;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("edureka")
public class EdurekaServices {

	//public static String main(String[] args) {
		// TODO Auto-generated method stub

		@GET
		//@Path("/local")
		@Produces("text/html")
		public String localService(){
			return "<h2>local customer service center</h2>";
		}
		
		@GET
		@Path("/nri")
		@Produces("text/html")
		public String nriService(){
			return "<h2>nri customer service center</h2>";
		}
		
		
		@GET
		@Path("{name}/{course}")
		@Produces("text/html")
		public String enquiry(@PathParam("name") String name,@PathParam("course") String course){
			return " customer name" +name+ "course is" +course;
		}
		
//	}

}
