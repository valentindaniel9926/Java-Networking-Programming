package com.company;

import  java.net.URL;
import java.net.*;

public class Main {

    public static void main(String[] args) {
        try {
            URI baseURI= new URI("http://username:password@mynewserver.com:5000");
            URI uri1 = new URI("/catalogue/phones?os=android#samsung");
            URI uri2 = new URI("/catalogue/tvs?manufacturer=samsung");
            URI uri3 = new URI("/stores/locations?zip=12345");

            URI resolvedUri1 = baseURI.resolve(uri1);
            URI resolvedUri2 =  baseURI.resolve(uri2);
            URI resolvedUri3 = baseURI.resolve(uri3);

            URL url1 = resolvedUri1.toURL();
            System.out.println("URL 1  = " + url1);
            URL url2 = resolvedUri1.toURL();
            System.out.println("URL 2  = " + url2);
            URL url3 = resolvedUri1.toURL();
            System.out.println("URL 3 = " + url3);

            URI  relativizedURI =  baseURI.relativize(resolvedUri2);
            System.out.println("Relative URI = " + relativizedURI);


        } catch(MalformedURLException e) {
            System.out.println("URL Malformed: " + e.getMessage());
        } catch(URISyntaxException e) {
            System.out.println("URI Bad Syntax: " + e.getMessage());
        }
    }
}
