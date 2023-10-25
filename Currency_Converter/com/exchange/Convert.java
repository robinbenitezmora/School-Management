package com.exchange;

import java.io.*;
import java.net.*;
import java.util.*;
import java.io.InputStream;
import java.net.URL;
import javax.jws.WebParam;
import java.io.PrintWriter;

class Recv {
    private String lhs;
    private String rhs;
    private String error;
    private String icc;

    public Recv() {
    }

    public String getLhs() {
        return lhs;
    }

    public String getRhs() {
        return rhs;
    }

    public String getError() {
        return error;
    }

    public String getIcc() {
        return icc;
    }
}

public class Convert extends HttpServlet {

    protected void processRequest(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {
        String query = "";
        String amount = "";
        String curTo = "";
        String curFrom = "";
        String submit = "";

        PrintWriter out;
        try {
            query = "http://www.google.com/ig/calculator?hl=en&q=" + amount + curFrom + "=?" + curTo;
            URL url = new URL(query);
            InputStreamReader stream = new InputStreamReader(url.openStream());
            BufferedReader in = new BufferedReader(stream);
            String str = "";
            String temp = "";
            while ((temp = in.readLine()) != null) {
                str = str + temp;
            }

            Gson gson = new Gson();
            Recv recv = gson.fromJson(str, Recv.class);
            PrintWriter writer = resp.getWriter();
            writer.println(recv.getRhs());
            writer.close();

        } catch (NumberFormatException e) {
            out.println("Please enter a valid number");
        } catch (Exception e) {
            out.println("Please enter a valid number");
        } finally {
            out.close();
        }
    }
}
