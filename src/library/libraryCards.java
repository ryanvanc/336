package library;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sun.net.httpserver.HttpServer;
//import com.sun.jersey.api.container.httpserver.HttpServerFactory;

import java.io.*;
import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

// The Java class will be hosted at the URI path "/helloworld"
@Path("/libraryCards/{cnum}/{name}")
public class libraryCards {

    @Context
    private UriInfo context;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getLibraryCard(@PathParam("cnum") int cardNum, @PathParam("name") String lastName) throws IOException, FileNotFoundException{

        String jsonFilePath = "cards.json";
        FileReader reader = new FileReader(jsonFilePath);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        libraryCard[] array = gson.fromJson(reader, libraryCard[].class);


        for(libraryCard c : array)
        {
            if(c.getCnum() == cardNum && c.getTxtlast().equals(lastName))
            {

                return gson.toJson(c);
            }
        }

        return "nope";
    }


    public static void main(String[] args) throws IOException {

    }


}
